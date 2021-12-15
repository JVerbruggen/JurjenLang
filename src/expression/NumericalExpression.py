from src.values.JLBoolean import *

class NumericalExpression:
    def result(self, a, b):
        raise NotImplementedError()

class EqualsExpressionNumerical(NumericalExpression):
    def result(self, a, b):
        return a == b

class NotEqualsExpressionNumerical(NumericalExpression):
    def result(self, a, b):
        return a != b
    
class LessThanExpressionNumerical(NumericalExpression):
    def result(self, a, b):
        return a < b

class LessEqualsExpressionNumerical(NumericalExpression):
    def result(self, a, b):
        return a <= b

class MoreThanExpressionNumerical(NumericalExpression):
    def result(self, a, b):
        return a > b

class MoreEqualsExpressionNumerical(NumericalExpression):
    def result(self, a, b):
        return a >= b