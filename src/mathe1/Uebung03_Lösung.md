# Übungsnummer 3

|Gruppennummer|Übungsleiterin|Name|
|---|---|---|
|10|Eya Chemangui|Roman Gräf|

# H3.1

Induktionsanfang:

$$q^0=1=\frac{1-q}{1-q}=\frac{1-q^1}{1-q},q\ne 1$$

Induktionsvorraussetzung:

$$\Sigma_{a=0}^{n}q^a=\frac{1-q^{n+1}}{1-q}$$

Induktionsschluss:

$$\Sigma_{a=0}^{n+1}q^a=q^{n+1}+\Sigma_{a=0}^{n}q^a$$
$$=\frac{1-q^{n+1}}{1-q}+q^{n+1}=\frac{1-q^{n+1}+q^{n+1}\cdot(1-q)}{1-q}$$
$$=\frac{1-q^{n+1}+q^{n+1}-q\cdot q^{n+1}}{1-q}=\frac{1-q^{n+2}}{1-q}$$

# H3.2
## a)

Für $ggT(m,n)$ existiert ein $a,x,b$ so dass $a=xm+bn$. Dementsprechend gilt:

$$a\text{ mod }n=k\text{ mod }n=x\cdot m+b\cdot n\text{ mod }n=x\cdot m\text{ mod }n$$

$a\cdot i\text{ mod }n=k\text{ mod }n$ gilt, da $0\le k<n$

## b)

|x|y| $\lfloor\frac{x}{y}\rfloor$ |a|b|
|---|---|---|---|---|
|47|17|2|4|-11|
|17|13|1|-3|4|
|13|4|3|1|-3|
|4|1|4|0|1|
|1|0| |1|0|

# H3.3

Aus $(10\text{ mod }11)^i\text{ mod }11=(10\text{ mod }11)^i\text{ mod }11$ und $10\text{ mod }11=-1\text{ mod }11$, folgt das $(10\text{ mod }11)^i\text{ mod }11=(-1\text{ mod }11)^i\text{ mod }11$, und laut Satz 2.1.5 aus den Folien folgt $(10)^i\text{ mod }11=(-1)^i\text{ mod }11$.


$$a\text{ mod }11=\Sigma_{i=0}^{k}(a_i 10^i)\text{ mod }11=\Sigma_{i=0}^k(a_i 10^i\text{ mod }11)\text{ mod }11$$

Aus dem obigen können wir $10^i\text{ mod }11$ durch $(-1)^i\text{ mod }11$ ersetzen.

$$a\text{ mod }11=\Sigma_{i=0}^k(a_i(-1)^i\text{ mod }11)\text{ mod }11$$
$$=a_0\cdot 1 +a_1\cdot -1+a_2\cdot 1+a_3\cdot -1+\dots\text{ mod }11=a_0-a_1+a_2-a_3+\dots\text{ mod }11$$
