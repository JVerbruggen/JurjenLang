class Returner:
    def __init__(self, value):
        self.value = value

    def get_value(self):
        return self.value

    def is_empty(self):
        return False

    def is_returner(returner):
        return issubclass(type(returner), Returner)

    def __str__(self):
        return f"{type(self)} {self.get_value()}"

class EmptyReturner(Returner):
    def __init__(self):
        pass

    def get_value(self):
        return 0
    
    def is_empty(self):
        return True