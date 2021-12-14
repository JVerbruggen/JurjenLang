from src.values.IValue import *
from src.values.JLInteger import *

class JLString(IValue):
    def __init__(self, value: str):
        self.value = value

    def string(self):
        return self.value

    def __mul__(self, other):
        if type(other) is not JLInteger:
            raise ValueError("JLString can only be multiplied by a JLInteger")
        
        self.value = ''.join([self.value for _ in range(other.value)])
        return JLString(self.value)