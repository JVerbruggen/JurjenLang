from src.values.IValue import *
from src.values.JLString import *
from src.values.JLInteger import *

class JLMatrix(IValue):
    def __init__(self, width, height):
        self.width = width
        self.height = height
        self.values = [[JLInteger(0) for _ in range(height)] for _ in range(width)]

    def string(self):
        res = f"<Matrix of size {self.width}x{self.height}>\n"
        res += "\n".join([" ".join([str(i) for i in v]) for v in self.values])
        return res

    def __out_of_bounds(self,x,y):
        if x < 0 or x >= self.width or y < 0 or y >= self.height:
            raise ValueError("Matrix out of bounds")

    def get_value(self, x, y):
        self.__out_of_bounds(x,y)

        return self.values[x][y]

    def set_value(self, x, y, value):
        self.__out_of_bounds(x,y)
        
        self.values[x][y] = value

    def __add__(self, other):
        if type(other) is not JLMatrix:
            raise TypeError("JLMatrix can only add with other JLMatrix")
        return JLString("Sum of matrices:\n" + str(self) + "\n---\n" + str(other))

    def __mul__(self, other):
        if type(other) is not JLMatrix and type(other) is not JLInteger:
            raise TypeError("JLMatrix can only multiply with other JLMatrix or JLInteger")

        if type(other) is JLInteger:
            return JLString("Multiplication of matrix with integer:\n" + str(self) + "\n---\n" + str(other))

        return JLString("Multiplication of matrices:\n" + str(self) + "\n---\n" + str(other))