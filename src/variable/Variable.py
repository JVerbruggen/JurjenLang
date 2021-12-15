from src.values.IValue import *
from src.variable.IVariable import *

class Variable(IVariable):
    def __init__(self, name: str, value: IValue):
        self.name = name
        self.value = value

    def get_name(self):
        return self.name

    def get_value(self):
        return self.value