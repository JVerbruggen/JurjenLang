from src.variable.IVariable import *

class Function(IVariable):
    def __init__(self, name: str, parameters: list[str], context):
        self.name = name
        self.parameters = parameters
        self.context = context

    def get_name(self):
        return self.name

    def get_value(self):
        return self.context

    def get_parameter_names(self):
        return self.parameters

    def __str__(self):
        return f"{type(self)} {self.get_name()}:{self.get_value()} params:[{ ','.join(self.parameters) }]"

    def renamed_clone(self, new_name) -> 'Function':
        return Function(new_name, self.parameters, self.context)