from src.values.IValue import *

class Variable:
    def __init__(self, name: str, value: IValue):
        self.name = name
        self.value = value