class IVariable:
    def get_name(self):
        raise NotImplementedError()

    def get_value(self):
        raise NotImplementedError()

    def __str__(self):
        return f"{type(self)} {self.get_name()}:{self.get_value()}"

    def __repr__(self):
        return self.__str__()