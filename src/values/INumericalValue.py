from src.values.IValue import *

class INumericalValue(IValue):
    # Returns numerical value
    # NOT the JurjenLang equivalent!
    def get_value(self):
        raise NotImplementedError()
