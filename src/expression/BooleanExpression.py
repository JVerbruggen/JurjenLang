from src.values.JLBoolean import *

class BooleanExpression:
    def result(self, a, b):
        raise NotImplementedError()

class EqualsExpressionBoolean(BooleanExpression):
    def result(self, a, b):
        return a == b

class NotEqualsExpressionBoolean(BooleanExpression):
    def result(self, a, b):
        return a != b