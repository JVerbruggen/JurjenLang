from src.values.IValue import *
from src.values.JLBoolean import *

class INumericalValue(IValue):
    # Returns numerical value
    # NOT the JurjenLang equivalent!
    def get_value(self):
        raise NotImplementedError()

    def __eq__(self, other):
        if issubclass(type(other), type(INumericalValue)):
            raise TypeError(f"{type(self)} can only compare with other numerical values")
        return JLBoolean(self.get_value() == other.get_value())

    def __ne__(self, other):
        if issubclass(type(other), type(INumericalValue)):
            raise TypeError(f"{type(self)} can only compare with other numerical values")
        return JLBoolean(self.get_value() != other.get_value())

    def __lt__(self, other):
        if issubclass(type(other), type(INumericalValue)):
            raise TypeError(f"{type(self)} can only compare with other numerical values")
        return JLBoolean(self.get_value() < other.get_value())
    
    def __le__(self, other):
        if issubclass(type(other), type(INumericalValue)):
            raise TypeError(f"{type(self)} can only compare with other numerical values")
        return JLBoolean(self.get_value() <= other.get_value())
    
    def __gt__(self, other):
        if issubclass(type(other), type(INumericalValue)):
            raise TypeError(f"{type(self)} can only compare with other numerical values")
        return JLBoolean(self.get_value() > other.get_value())

    def __ge__(self, other):
        if issubclass(type(other), type(INumericalValue)):
            raise TypeError(f"{type(self)} can only compare with other numerical values")
        return JLBoolean(self.get_value() >= other.get_value())
