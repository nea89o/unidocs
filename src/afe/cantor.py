mi = ma = 0
for n in range(1,1000):
    x = (-1)**n+2/n
    print(x)
    mi= min(x,mi)
    ma = max(x,ma)

print("max:",ma)
print("min:",mi)
