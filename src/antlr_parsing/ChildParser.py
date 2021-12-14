from antlr4 import *

class IntParser:
    def parse(child: ParserRuleContext) -> int:
        return int(str(child))
    
class StringParser:
    def parse(child: ParserRuleContext) -> str:
        return str(child)