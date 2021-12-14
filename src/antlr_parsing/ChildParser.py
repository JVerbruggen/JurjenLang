from antlr4 import *

class IntParser:
    def parse(child: ParserRuleContext) -> int:
        return int(str(child))
    
class StringParser:
    def parse(child: ParserRuleContext) -> str:
        return str(child)

class FloatParser:
    def parse(pre_nrs_child: ParserRuleContext = None, post_nrs_child: ParserRuleContext = None) -> float:
        res = float(0)
        if pre_nrs_child is not None:
            res += float(str(pre_nrs_child))

        if post_nrs_child is not None:
            digits_str = str(post_nrs_child)
            digits = float(digits_str)
            digits_len = len(digits_str)
            divide_by = 10**digits_len

            res += (digits/divide_by)

        return res