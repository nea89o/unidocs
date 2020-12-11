# Digital Technik Projekt Teil 1

Roman Gräf

## 1.1

### a)

Die Bitbreite einer Vorzeichenlosen Binärzahl lässt sich wie folgt errechnen:

$$b_2(X)=\lceil\frac{log(X+1)}{log(2)}\rceil$$

Für $11758070_{10}$ Coronafälle ergibt sich eine Bitbreite von 24.

### b)
Die benötigten Stellen für Basis-7-Zahlen errechnet sich durch $b_7(X)=\lceil\frac{X+1}{log(7)}\rceil$. Dementsprechend benötigt man für die Zahl $11758070_{10}$ 9 Stellen.

| $X$ | $\lfloor\frac{X}{7}\rfloor$ | $X$ mod $7$ |
|---|---|---|
| $11758070$ | $\lfloor 11758070/7\rfloor=1679724$ | $2$ |
| $1679724$ | $\lfloor 1679724/7\rfloor=239960$ | $4$ |
| $239960$ | $\lfloor 239960/7\rfloor=34280$ | $0$ |
| $34280$ | $\lfloor 34280/7\rfloor=4897$ | $1$ |
| $4897$ | $\lfloor 4897/7\rfloor=699$ | $4$ |
| $699$ | $\lfloor 699/7\rfloor=99$ | $6$ |
| $99$ | $\lfloor 99/7\rfloor=14$ | $1$ |
| $14$ | $\lfloor 14/7\rfloor=2$ | $0$ |
| $2$ | $\lfloor 2/7\rfloor=0$ | $2$ |

$11758070_{10}=201641042_{7}$

### c)

| $X$ | $\lfloor\frac{X}{7}\rfloor$ | $X$ mod $7$ |
|---|---|---|
| $374827$ | $\lfloor 374827/7\rfloor=53546$ | $5$ |
| $53546$ | $\lfloor 53546/7\rfloor=7649$ | $3$ |
| $7649$ | $\lfloor 7649/7\rfloor=1092$ | $5$ |
| $1092$ | $\lfloor 1092/7\rfloor=156$ | $0$ |
| $156$ | $\lfloor 156/7\rfloor=22$ | $2$ |
| $22$ | $\lfloor 22/7\rfloor=3$ | $1$ |
| $3$ | $\lfloor 3/7\rfloor=0$ | $3$ |

$374827_{10}=3120535_{7}$

| $X$ | $\lfloor\frac{X}{7}\rfloor$ | $X$ mod $7$ |
|---|---|---|
| $212164$ | $\lfloor 212164/7\rfloor=30309$ | $1$ |
| $30309$ | $\lfloor 30309/7\rfloor=4329$ | $6$ |
| $4329$ | $\lfloor 4329/7\rfloor=618$ | $3$ |
| $618$ | $\lfloor 618/7\rfloor=88$ | $2$ |
| $88$ | $\lfloor 88/7\rfloor=12$ | $4$ |
| $12$ | $\lfloor 12/7\rfloor=1$ | $5$ |
| $1$ | $\lfloor 1/7\rfloor=0$ | $1$ |

$212164_{10}=1542361_{7}$

#### Neuerkrankungen:

| | | | | | | | | | |
|--|--|--|--|--|--|--|--|--|--|
| | $2$ | $0$ | $1$ | $6$ | $4$ | $1$ | $0$ | $4$ | $2$ |
| $+$ |  |  | $3$ | $1$ | $2$ | $0$ | $5$ | $3$ | $5$ |
| Übertrag |  |  | $1$ |  |  |  | $1$ | $1$ |  |
| $=$ | $2$ | $0$ | $5$ | $0$ | $6$ | $1$ | $6$ | $1$ | $0$ |

$201641042_7+3120535_7=205061610_7$


#### Genesungen

| | | | | | | | | | |
|--|--|--|--|--|--|--|--|--|--|
| | $2$ | $0$ | $5$ | $0$ | $6$ | $1$ | $6$ | $1$ | $0$ |
| $-$ |  |  | $1$ | $5$ | $4$ | $2$ | $3$ | $6$ | $1$ |
| Übertrag |  |  | $1$ |  | $1$ |  | $1$ | $1$ |  |
| $=$ | $2$ | $0$ | $3$ | $2$ | $1$ | $6$ | $2$ | $1$ | $6$ |

$205061610_7-1542361_7=203216216_7$

#### Zurück zu Basis 10
| $a_i$ | $X$ | $X\times 7+a_i$ |
|---|---|---|
| $2$ | $0$ | $2$ |
| $0$ | $2$ | $14$ |
| $3$ | $14$ | $101$ |
| $2$ | $101$ | $709$ |
| $1$ | $709$ | $4964$ |
| $6$ | $4964$ | $34754$ |
| $2$ | $34754$ | $243280$ |
| $1$ | $243280$ | $1702961$ |
| $6$ | $1702961$ | $11920733$ |


Nach einer Woche gibt es $203216216_{7}=11920733_{10}$ aktive Fälle.

## 1.2

### a)

Da $1000000_{10}$ eine Bitbreite von 20 hat und wir zwei Zahlen haben, brauchen wir $20+2=22$ Paritätsbits, sowie $2*20=40$ Datenbits falls wir Genesungen und Neuerkrankungen seperat übertragen. Eine Übertragung von Fallzahlen bis zu $1000000000_{10}$ braucht eine Bitbreite von $30$. Dementsprechend ist eine Übertragung aller aktiven Fälle ohne Parität ($30$ Bits) effizienter als eine Übertragung der Genesungen und Neuerkrankungen mit Parität ($62$ Bits).

### b)
|   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   |   | P |
|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|
| 1 | 0 | 1 | 1 | 0 | 1 | 1 | 1 | 0 | 0 | 0 | 0 | 0 | 1 | 0 | 1 | 0 | 1 | 1 | 0 |
| 0 | 1 | 1 | 0 | 0 | 0 | 1 | 0 | 1 | 0 | 0 | 1 | 0 | 0 | 0 | 1 | ~~1~~ 0 | 0 | 1 | 1 |
| 1 | 1 | 0 | 1 | 0 | 1 | 0 | 1 | 1 | 0 | 0 | 1 | 0 | 1 | 0 | 0 | 0 | 1 | 0 | X |

Das durchgestrichene 1 Bit muss eine null sein, da Längs und Querparität für diese Zelle falsch sind. Dementsprechend liegen $100932_{10}$ Genesungen vor.

## 1.3

### a)

|Ziffer|$x_0$|$x_1$|$x_2$|$x_3$|$a$|$b$|$c$|$d$|$e$|$f$|$g_1$|$g_2$|$h$|$i$|$j$|$k$|$l$|$m$|$n$|$dp$|$dk$|
|------|-----|-----|-----|-----|---|---|---|---|---|---|-----|-----|---|---|---|---|---|---|---|----|----|
|0     |0    |0    |0    |0    |1  |1  |1  |1  |1  |1  |0    |0    |0  |0  |1  |1  |0  |0  |0  |0   |0   |
|1     |0    |0    |0    |1    |0  |1  |1  |0  |0  |0  |0    |0    |0  |0  |1  |0  |0  |0  |0  |0   |0   |
|2     |0    |0    |1    |0    |1  |1  |0  |1  |1  |0  |1    |1    |0  |0  |0  |0  |0  |0  |0  |0   |0   |
|3     |0    |0    |1    |1    |1  |1  |1  |1  |0  |0  |1    |1    |0  |0  |0  |0  |0  |0  |0  |0   |0   |
|4     |0    |1    |0    |0    |0  |1  |1  |0  |0  |1  |1    |1    |0  |0  |0  |0  |0  |0  |0  |0   |0   |
|5     |0    |1    |0    |1    |1  |0  |1  |1  |0  |1  |1    |1    |0  |0  |0  |0  |0  |0  |0  |0   |0   |
|6     |0    |1    |1    |0    |1  |0  |1  |1  |1  |1  |1    |1    |0  |0  |0  |0  |0  |0  |0  |0   |0   |
|7     |0    |1    |1    |1    |1  |1  |1  |0  |0  |0  |0    |0    |0  |0  |0  |0  |0  |0  |0  |0   |0   |
|8     |1    |0    |0    |0    |1  |1  |1  |1  |1  |1  |1    |1    |0  |0  |0  |0  |0  |0  |0  |0   |0   |
|9     |1    |0    |0    |1    |1  |1  |1  |1  |0  |1  |1    |1    |0  |0  |0  |0  |0  |0  |0  |0   |0   |

### b)


$a=(x_0\lor x_1\lor x_2\lor \neg x_3)\land (x_0\lor \neg x_1\lor x_2\lor x_3)$

$b=(x_0\lor \neg x_1\lor x_2\lor \neg x_3)\land (x_0\lor \neg x_1\lor \neg x_2\lor x_3)$

$c=(x_0\lor x_1\lor \neg x_2\lor x_3)$

$d=(x_0\lor x_1\lor x_2\lor \neg x_3)\land (x_0\lor \neg x_1\lor x_2\lor x_3)\land (x_0\lor \neg x_1\lor \neg x_2\lor \neg x_3)$

$e=(\neg x_0\land \neg x_1\land \neg x_2\land \neg x_3)\lor (\neg x_0\land \neg x_1\land x_2\land \neg x_3)\lor$
$(\neg x_0\land x_1\land x_2\land \neg x_3)\lor (x_0\land \neg x_1\land \neg x_2\land \neg x_3)$

$f=(x_0\lor x_1\lor x_2\lor \neg x_3)\land (x_0\lor x_1\lor \neg x_2\lor x_3)\land (x_0\lor x_1\lor \neg x_2\lor \neg x_3)\land$
$(x_0\lor \neg x_1\lor \neg x_2\lor \neg x_3)$

$g_1=(x_0\lor x_1\lor x_2\lor x_3)\land (x_0\lor x_1\lor x_2\lor \neg x_3)\land (x_0\lor \neg x_1\lor \neg x_2\lor \neg x_3)$

$g_2=(x_0\lor x_1\lor x_2\lor x_3)\land (x_0\lor x_1\lor x_2\lor \neg x_3)\land (x_0\lor \neg x_1\lor \neg x_2\lor \neg x_3)$

$h=0$

$i=0$

$j=(\neg x_0\land \neg x_1\land \neg x_2\land \neg x_3)\lor (\neg x_0\land \neg x_1\land \neg x_2\land x_3)$

$k=(\neg x_0\land \neg x_1\land \neg x_2\land \neg x_3)$

$l=0$

$m=0$

$n=0$

$dp=0$

$dk=0$

## TODO



## 1.4

### a

$G=\overline{\overline{45}(4+5)}\stackrel{\text{T12}}{=}\overline{(\overline{4}+\overline{5})(4+5)}\stackrel{\text{T8}}{=}\overline{\overline{4}4+\overline{4}5+\overline{5}4+\overline{5}5}$
$G\stackrel{\text{T5}}{=}\overline{\overline{4}5+\overline{5}4}\stackrel{\text{T12}}{=}\overline{\overline{4}5}\cdot\overline{\overline{5}4}\stackrel{\text{T12}}{=}(\overline{4}+5)(\overline{5}+4)\stackrel{\text{T8}}{=}(\overline{4}+5)\overline{5}+(\overline{4}+5)4$
$G\stackrel{\text{T8}}{=}\overline{4}\cdot\overline{5}+\overline{5}5+\overline{4}4+45\stackrel{\text{T5}}{=}\overline{4}\cdot\overline{5}+45$
$F=0\overline{4}(125+\overline{3}5+\overline{3}\cdot\overline{5}+123)+\overline{0}12(\overline{3}4\overline{5}+\overline{3}4\overline{0}+\overline{3}45)+1\overline{2}3G$
$\stackrel{\text{T5}}{=}0\overline{4}(125+\overline{3}+123)+\overline{0}12(\overline{3}4\overline{5}+\overline{3}4\overline{0}+\overline{3}45)+1\overline{2}3G$
$\stackrel{\text{T8}}{=}0\overline{4}125+0\overline{4}\cdot\overline{3}+0\overline{4}123+\overline{0}12\overline{3}4{5}+\overline{0}12\overline{3}4\overline{0}+\overline{0}12\overline{3}4\overline{5}+1\overline{2}3G$
$F=\overline{4}125+0\overline{4}\cdot\overline{3}+0\overline{4}123+\overline{0}12\overline{3}4\overline{5}+\overline{0}12\overline{3}4\overline{0}+\overline{0}12\overline{3}4\overline{5}+1\overline{2}3(\overline{4}\cdot\overline{5}+45)$
$\stackrel{\text{T8}}{=}\overline{4}125+0\overline{4}\cdot\overline{3}+0\overline{4}123+\overline{0}12\overline{3}4\overline{5}+\overline{0}12\overline{3}4\overline{0}+\overline{0}12\overline{3}4\overline{5}+1\overline{2}3\overline{4}\cdot\overline{5}+1\overline{2}345$
$\stackrel{\text{T6}}{=}12\overline{4}5+0\overline{3}\cdot\overline{4}+0123\overline{4}+\overline{0}12\overline{3}4\overline{5}+\overline{0}12\overline{3}4\overline{5}+\overline{0}\cdot\overline{0}12\overline{3}4+1\overline{2}3\overline{4}\cdot\overline{5}+1\overline{2}345$
$\stackrel{\text{T3}}{=}12\overline{4}5+0\overline{3}\cdot\overline{4}+0123\overline{4}+\overline{0}12\overline{3}4\overline{5}+\overline{0}12\overline{3}4\overline{5}+\overline{0}12\overline{3}4+1\overline{2}3\overline{4}\cdot\overline{5}+1\overline{2}345$
$\stackrel{\text{T8}}{=}12\overline{4}5+0\overline{3}\cdot\overline{4}+0123\overline{4}+\overline{0}12\overline{3}4(\overline{5}+\overline{5}+ONE)+1\overline{2}3\overline{4}\cdot\overline{5}+1\overline{2}345$
$\stackrel{\text{T2}}{=}12\overline{4}5+0\overline{3}\cdot\overline{4}+0123\overline{4}+\overline{0}12\overline{3}4+1\overline{2}3\overline{4}\cdot\overline{5}+1\overline{2}345$












































<!-- TODO -->
