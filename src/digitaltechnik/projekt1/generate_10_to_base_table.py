from sys import argv
if len(argv)<=2:
    print("Usage:",argv[0],"<x> <base>")
    exit(1)
orig=a = int(argv[1])
base = int(argv[2])

print(r"| $X$ | $\lfloor\frac{X}{%d}\rfloor$ | $X$ mod $%d$ |"%(base,base))
print(r"|---|---|---|")
s = ""
while a > 0:
    n,m = divmod(a, base)
    print(r"| $%d$ | $\lfloor %d/%d\rfloor=%d$ | $%d$ |"%(a, a, base, n, m))
    a = n
    s=str(m)+s
print()
print(r"$%d_{10}=%s_{%d}$"%(orig,s,base))
