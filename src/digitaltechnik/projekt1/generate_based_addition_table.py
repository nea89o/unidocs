from sys import argv
if len(argv)<=4:
    print("Usage:",argv[0],"<x> <op> <y> <base>")
    exit(1)
x = argv[1]
opl = argv[2]
if opl == "-":
    op = lambda x,y:x-y
elif opl == "+":
    op = lambda x,y:x+y
else:
    print("Unknown op",opl)
    exit(1)
y = argv[3]
base = int(argv[4])

bl = max(len(x), len(y))
x=list(x.zfill(bl+1))
y=list(y.zfill(bl+1))
ov = list("0"*(bl+1))
res = list(" "*(bl+1))
for d in reversed(range(1,bl+1)):
    xd = int(x[d])
    yd = int(y[d])
    od = int(ov[d])
    nd = op(op(xd,yd),od)
    no = 0
    while nd < 0: # subtraction
        no += 1
        nd += base
    while nd >= base: # addition
        no += 1
        nd -= base
    res[d] = str(nd)
    ov[d-1] = str(no)
res[0]=ov[0]
while res[0]==ov[0]==x[0]==y[0]=="0":
    del res[0]
    del ov[0]
    del x[0]
    del y[0]
for _ in range(len(res)):
    print(end="| ")
print("| |")
for _ in range(len(res)):
    print(end="|--")
print("|--|")
print(end="| | ")
hpd = False
for xd in x:
    if xd=="0" and not hpd:
        print(end=" | ")
    else:
        hpd=True
        print(end=r"$%s$ | "%xd)
print()

print(end="| $"+opl+"$ | ")
hpd = False
for yd in y:
    if yd=="0" and not hpd:
        print(end=" | ")
    else:
        hpd=True
        print(end=r"$%s$ | "%yd)
print()

print(end="| Übertrag | ")
for od in ov:
    if od=="0":
        print(end=" | ")
    else:
        print(end=r"$%s$ | "%od)
print()

print(end="| $=$ | ")
hpd = False
for rd in res:
    if rd == "0"and not hpd:
        print(end=" | ")
    else:
        hpd= True
        print(end=r"$%s$ | "%rd)
print()
