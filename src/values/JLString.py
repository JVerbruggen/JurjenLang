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

        using_val = self.value
        repeat = other.value
        if repeat < 0:
            using_val = using_val[::-1]
            repeat = -repeat
        
        res = ''.join([using_val for _ in range(repeat)])
        return JLString(res)