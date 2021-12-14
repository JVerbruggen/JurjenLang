import sys
from antlr4 import *
from antlr_python.JurjenLangLexer import JurjenLangLexer
from antlr_python.JurjenLangParser import JurjenLangParser

from src.JurjenLangCustomVisitor import JurjenLangCustomVisitor
 
def main(argv):
    input_stream = FileStream(argv[1])
    lexer = JurjenLangLexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = JurjenLangParser(stream)
    tree = parser.startRule()
    
    visitor = JurjenLangCustomVisitor()
    visitor.visit(tree)

if __name__ == '__main__':
    main(sys.argv)