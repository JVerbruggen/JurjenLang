class IVariable:
    def get_name(self):
        raise NotImplementedError()

    def get_value(self):
        raise NotImplementedError()