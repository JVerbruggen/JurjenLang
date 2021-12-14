from antlr4 import *

class IntParser:
    def parse(child: ParserRuleContext) -> int:
        return int(str(child))