from antlr4 import *

class ErrorHandler:
    def error(self, ctx: ParserRuleContext, msg: str):
        line = ctx.start.line
        raise ValueError(f"JLang ERROR [at line {line}]: {msg}")