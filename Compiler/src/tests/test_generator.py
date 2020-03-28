from nltk.parse.generate import generate, demo_grammar
from nltk.parse import RecursiveDescentParser
from nltk import CFG
import sys

# sys.setrecursionlimit(8000)

grammar = CFG.fromstring("""
Expr -> 'not' Expr
Expr -> Expr 'and' Expr
Expr -> Expr 'or' Expr
Expr -> Expr '=>' Expr
Expr -> Expr '<=>' Expr
Expr -> '(' Expr ')'
Expr -> 'p'
Expr -> 'q'
Expr -> 'r'
Expr -> 's'
""")
# grammar = CFG.fromstring("""
# Expr -> 'not' Expr
# Expr -> Expr 'and' Expr
# Expr -> Expr 'or' Expr
# Expr -> Expr '=>' Expr
# Expr -> Expr '<=>' Expr
# Expr -> '(' Expr ')'
# Expr -> 'p'
# Expr -> 'q'
# Expr -> 'r'
# Expr -> 'true'
# Expr -> 'false'
# """)

# print(grammar)
rd = RecursiveDescentParser(grammar)

N = 1000000
D = 4

for n, sent in enumerate(generate(grammar, n=N, depth=D), 1):
    print('verify %s' % (' '.join(sent)))    
