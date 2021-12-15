from src.variable.IVariable import *

class FunctionReference(IVariable):
    def __init__(self, function_ref, inscope_name=None):
        self.inscope_name = inscope_name
        self.function_ref = function_ref

    def get_name(self):
        return self.inscope_name

    def get_value(self):
        return self.function_ref

    def string(self):
        return f"{type(self)} {self.get_value()}"