from src.values.IValue import *

class JLBoolean(IValue):
    def __init__(self, value: bool):
        self.value = value

    def string(self):
        return "true" if self.value else "false"

    def __eq__(self, other):
        return JLBoolean(self.value == other.value)

    def __bool__(self):
        return self.value
    
    def __nonzero__(self):
        return self.__bool__()
