from sys import argv
if len(argv)<=2:
    print("Usage:",argv[0],"<x> <base>")
    exit(1)
a = list(argv[1])
base = int(argv[2])

print(r"| $a_i$ | $X$ | $X\times %d+a_i$ |"%base)
print(r"|---|---|---|")
acc= 0
for d in a:
    n = acc*base+int(d)
    print(r"| $%s$ | $%d$ | $%d$ |"%(d, acc, n))
    acc = n
print()
print(r"$%s_{%d}=%d_{10}$"%(''.join(a), base, acc))
