from src.values.IValue import *

class JLString(IValue):
    def __init__(self, value: str):
        self.value = value

    def string(self):
        return self.value

    def __mul__(self, other):
        if str(type(other)) != "<class 'src.values.JLInteger.JLInteger'>":
            raise ValueError("JLString can only be multiplied by a JLInteger")

        using_val = self.value
        repeat = other.value
        if repeat < 0:
            using_val = using_val[::-1]
            repeat = -repeat
        
        res = ''.join([using_val for _ in range(repeat)])
        return JLString(res)

    def __add__(self, other):
        if type(other) is not JLString and str(type(other)) != "<class 'src.values.JLInteger.JLInteger'>":
            raise ValueError("JLString can only be added to another JLString or a JLInteger")
        
        o = other.value
        if str(type(other)) == "<class 'src.values.JLInteger.JLInteger'>":
            o = str(o)

        return JLString(self.value + o)

    def __repr__(self):
        return f"\"{self.value}\""
    
    