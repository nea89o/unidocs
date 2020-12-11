import sys
from bexprout import *

"""
python generate_knf.py <inpcount> <label0> <label1> ...

inpcount - the first n columns are treated as inputs, the others are treated as output for which a knf is generated.

truth table has to be supplied via stdin. example in segmentdisplay.txt
"""

if len(sys.argv) < 3:
    print("Invalid arguments.")
    exit(1)
inpcount = int(sys.argv[1])
labels = sys.argv[2:]
lines = [[bool(int(x)) for x in line.strip()] for line in sys.stdin]


def col(ind):
    return [line[ind] for line in lines]


def minterms(out_index):
    if sum(col(out_index)) == 0:
        yield BLit(0)
        return
    for line in lines:
        expr = []
        if not line[out_index]:
            continue
        for inp in range(inpcount):
            if line[inp]:
                expr.append(BLit(labels[inp]))
            else:
                expr.append(BNot(BLit(labels[inp])))
        yield BAnd(expr)


def maxterms(out_index):
    for line in lines:
        expr = []
        if line[out_index]:
            continue
        for inp in range(inpcount):
            if not line[inp]:
                expr.append(BLit(labels[inp]))
            else:
                expr.append(BNot(BLit(labels[inp])))
        yield BOr(expr)


for x in range(inpcount, len(labels)):
    print(labels[x])
    if mode == "LATEX":
        print(end="$")
    if sum(col(x)) < len(col(x)) / 2:
        print(end=str(BOr(minterms(x))))
    else:
        print(end=str(BAnd(maxterms(x))))
    if mode == "LATEX":
        print(end="$")
    print()
