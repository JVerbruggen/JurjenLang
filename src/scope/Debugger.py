class Debugger:
    def __init__(self, enabled: bool=True):
        self.enabled = enabled

    # Return tracer
    def r(self, msg):
        if not self.enabled: return
        print(msg)