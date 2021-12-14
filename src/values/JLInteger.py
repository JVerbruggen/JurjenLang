from src.values.IValue import *
from src.values.INumericalValue import *
from src.values.JLBoolean import *

class JLInteger(INumericalValue):
    def __init__(self, value: int):
        self.value = value

    def string(self):
        return f"{self.value}"

    def __add__(self, other):
        if type(other) is not JLInteger:
            raise TypeError("JLInteger can only compare to other JLInteger")
        return JLInteger(self.value + other.value)
    
    def __sub__(self, other):
        if type(other) is not JLInteger:
            raise TypeError("JLInteger can only compare to other JLInteger")
        return JLInteger(self.value - other.value)

    def __mul__(self, other):
        if type(other) is not JLInteger:
            raise TypeError("JLInteger can only compare to other JLInteger")
        return JLInteger(self.value * other.value)

    def __floordiv__(self, other):
        if type(other) is not JLInteger:
            raise TypeError("JLInteger can only compare to other JLInteger")
        return JLInteger(self.value // other.value)

    def __truediv__(self, other):
        if type(other) is not JLInteger:
            raise TypeError("JLInteger can only compare to other JLInteger")
        raise NotImplementedError()

    def __pow__(self, other):
        if type(other) is not JLInteger:
            raise TypeError("JLInteger can only compare to other JLInteger")
        return JLInteger(self.value ** other.value)

    def __eq__(self, other):
        if type(other) is not JLInteger:
            raise TypeError("JLInteger can only compare to other JLInteger")
        return JLBoolean(self.value == other.value)
        
    def factorial(self):
        res = 1
        for i in range(2, self.value+1):
            res *= i
        return JLInteger(res)
    
    def negate(self):
        return JLInteger(-self.value)