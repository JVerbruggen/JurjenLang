from src.values.IValue import *
from src.values.INumericalValue import *
from src.values.JLBoolean import *

class JLFloat(INumericalValue):
    def __init__(self, value: float):
        self.value = value

    def string(self):
        return f"{self.value}"

    def __add__(self, other):
        if type(other) is not JLFloat:
            raise TypeError("JLFloat can only compare to other JLFloat")
        return JLFloat(self.value + other.value)
    
    def __sub__(self, other):
        if type(other) is not JLFloat:
            raise TypeError("JLFloat can only compare to other JLFloat")
        return JLFloat(self.value - other.value)

    def __mul__(self, other):
        if type(other) is not JLFloat:
            raise TypeError("JLFloat can only compare to other JLFloat")
        return JLFloat(self.value * other.value)

    def __floordiv__(self, other):
        if type(other) is not JLFloat:
            raise TypeError("JLFloat can only compare to other JLFloat")
        return JLFloat(self.value // other.value)

    def __truediv__(self, other):
        if type(other) is not JLFloat:
            raise TypeError("JLFloat can only compare to other JLFloat")
        return JLFloat(self.value / other.value)

    def __pow__(self, other):
        if type(other) is not JLFloat:
            raise TypeError("JLFloat can only compare to other JLFloat")
        return JLFloat(self.value ** other.value)

    def __eq__(self, other):
        if type(other) is not JLFloat:
            raise TypeError("JLFloat can only compare to other JLFloat")
        return JLBoolean(self.value == other.value)
        
    def factorial(self):
        res = 1
        for i in range(2, self.value+1):
            res *= i
        return JLFloat(res)
    
    def negate(self):
        return JLFloat(-self.value)