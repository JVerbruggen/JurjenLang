class Debugger:
    def __init__(self, r_enabled: bool=True, p_enabled: bool=True):
        self.p_enabled = p_enabled
        self.r_enabled = r_enabled

    # Parameter tracer
    def p(self, msg):
        if not self.p_enabled: return
        print(msg)

    # Return tracer
    def r(self, msg):
        if not self.r_enabled: return
        print(msg)