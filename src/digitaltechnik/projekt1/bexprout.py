

import abc

mode = "LATEX"  # SYMBOLS or LATEX or TEXT
symand = "AND" if mode == "TEXT" else ("*" if mode == "SYMBOLS" else "\\land ")
symor = "OR" if mode == "TEXT" else ("+" if mode == "SYMBOLS" else "\\lor ")
symnot = "NOT" if mode == "TEXT" else ("-" if mode == "SYMBOLS" else "\\neg ")


class BExpr(abc.ABC):
    def __init__(self, sub):
        self.sub = sub

    @abc.abstractmethod
    def __str__(self):
        pass


class BAnd(BExpr):
    def __str__(self):
        return '(' + symand.join(map(str, self.sub)) + ')'


class BOr(BExpr):
    def __str__(self):
        return '(' + symor.join(map(str, self.sub)) + ')'


class BNot(BExpr):
    def __str__(self):
        return symnot + str(self.sub)


class BLit(BExpr):
    def __str__(self):
        return str(self.sub)
