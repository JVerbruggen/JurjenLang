class IValue:
    def string() -> str:
        raise NotImplementedError()
        
    def negate(self) -> 'IValue':
        raise NotImplementedError()
    
    def __str__(self):
        return self.string()

    def __repr__(self):
        return f"{type(self)}: {self.string()}"