from src.values.IValue import *
from src.values.INumericalValue import *
from src.values.JLBoolean import *

class JLFloat(INumericalValue):
    def __init__(self, value: float):
        self.value = value

    def string(self):
        return f"{self.value}"

    def __add__(self, other):
        if issubclass(type(other), type(INumericalValue)):
            raise TypeError("JLFloat can only add with other numerical values")
        return JLFloat(self.value + other.get_value())
    
    def __sub__(self, other):
        if issubclass(type(other), type(INumericalValue)):
            raise TypeError("JLFloat can only subtract with other numerical values")
        return JLFloat(self.value - other.get_value())

    def __mul__(self, other):
        if issubclass(type(other), type(INumericalValue)):
            raise TypeError("JLFloat can only multiply with other numerical values")
        return JLFloat(self.value * other.get_value())

    def __floordiv__(self, other):
        if issubclass(type(other), type(INumericalValue)):
            raise TypeError("JLFloat can only divide with other numerical values")
        return JLFloat(self.value // other.get_value())

    def __truediv__(self, other):
        if issubclass(type(other), type(INumericalValue)):
            raise TypeError("JLFloat can only divide with other numerical values")
        return JLFloat(self.value / other.get_value())

    def __pow__(self, other):
        if issubclass(type(other), type(INumericalValue)):
            raise TypeError("JLFloat can only be powered to other numerical values")
        return JLFloat(self.value ** other.get_value())
        
    def factorial(self):
        res = 1
        for i in range(2, self.value+1):
            res *= i
        return JLFloat(res)
    
    def negate(self):
        return JLFloat(-self.value)

    def get_value(self):
        return self.value