from src.variable.Variable import *

class Scope:
    def __init__(self, parent_scope:'Scope'=None):
        self.parent_scope = parent_scope
        self.local_variables = list[Variable]()

    def get_variable_locally(self, name: str) -> Variable:
        variable = None

        for local_variable in self.local_variables:
            local_var_name = local_variable.name
            if local_var_name == name:
                variable = local_variable

        return variable

    def get_variable(self, name: str) -> Variable:
        variable = None
        if self.parent_scope is not None:
            variable = self.parent_scope.get_variable(name)
        
        more_local_variable = self.get_variable_locally(name)
        if more_local_variable is not None:
            variable = more_local_variable
        
        return variable

    def remove_variable_locally(self, variable: Variable):
        self.local_variables.remove(variable)

    def add_local_variable(self, variable: Variable):
        already_locally_defined = self.get_variable_locally(variable.name)
        if already_locally_defined is not None:
            self.remove_variable_locally(already_locally_defined)

        self.local_variables += [variable]

    def del_all_local_variables(self):
        for var in self.local_variables:
            del var

    def __str__(self):
        local_var_str = ',\n         '.join([f"{variable.name}:{variable.value}" for variable in self.local_variables])
        return " Scope: {" + local_var_str + "}"