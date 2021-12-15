from src.variable.IVariable import *

class Function(IVariable):
    def __init__(self, name: str, context):
        self.name = name
        self.context = context

    def get_name(self):
        return self.name

    def get_value(self):
        return self.context