from src.values.IValue import *
from src.values.INumericalValue import *
from src.values.JLBoolean import *
from src.values.JLFloat import *

class JLInteger(INumericalValue):
    def __init__(self, value: int):
        self.value = value

    def string(self):
        return f"{self.value}"

    def __add__(self, other):
        if issubclass(type(other), type(INumericalValue)):
            raise TypeError("JLInteger can only add with other numerical values")
        if type(other) is not JLInteger:
            return JLFloat(self.value + other.get_value())
        return JLInteger(self.value + other.get_value())
    
    def __sub__(self, other):
        if issubclass(type(other), type(INumericalValue)):
            raise TypeError("JLInteger can only subtract with other numerical values")
        if type(other) is not JLInteger:
            return JLFloat(self.value - other.get_value())
        return JLInteger(self.value - other.get_value())

    def __mul__(self, other):
        if issubclass(type(other), type(INumericalValue)):
            raise TypeError("JLInteger can only multiply with other numerical values")
        if type(other) is not JLInteger:
            return JLFloat(self.value * other.get_value())
        return JLInteger(self.value * other.get_value())

    def __floordiv__(self, other):
        if issubclass(type(other), type(INumericalValue)):
            raise TypeError("JLInteger can only divide with other numerical values")
        if type(other) is not JLInteger:
            return JLFloat(self.value / other.get_value())
        return JLInteger(self.value // other.get_value())

    def __truediv__(self, other):
        return self.__floordiv__(other)

    def __pow__(self, other):
        if type(other) is not JLInteger:
            raise TypeError("JLInteger can only be powered to other numerical values")
        if type(other) is not JLInteger:
            return JLFloat(self.value ** other.get_value())
        return JLInteger(self.value ** other.get_value())

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
    
    def get_value(self):
        return self.value