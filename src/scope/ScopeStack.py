from src.scope.Scope import *

class ScopeStack:
    def __init__(self):
        self.stack = list()
    
    def push_spec(self, scope: Scope):
        self.stack += [scope]

    def push(self):
        parent_scope = self.latest()
        scope = Scope(parent_scope=parent_scope)
        self.stack += [scope]
    
    def latest(self) -> Scope:
        if len(self.stack) == 0: return None
        return self.stack[-1]

    def pop(self):
        self.stack = self.stack[:-1]

    def __str__(self):
        return " ScopeStack: "+",\n".join([str(scope) for scope in self.stack])