# Übungsnummer 2

|Gruppennummer|Übungsleiterin|Name|
|---|---|---|
|09|Emma Stellwag|Roman Gräf|

## H2.1
### a)
 - (i)

Induktionsanfang

$2^3=8>6=2\cdot3$

Induktionsvorraussetzung:

$2^n>2n$

Induktionsschluss:

$2^n>2n\implies 2^n\cdot 2>2n\cdot 2\implies 2^{n+1}=2(n+1)$

 - (ii) $n=0,5\implies n^2+n+41=46,125$ Bei 46,125 handelt es sich nicht um eine Primzahl.

### b)

$f(a_0a_1b)=f(a_1b)+1=f(b)+2=f(a_0b)+1=f(a_1a_0b)$. Dank $f$s rekursiver Definition folgt aus diesem Umstand dass beliebige Elemente getauscht werden können ohne dass sich der $f$ wert ändert. Da ein Wort mit $n$ Elementen mit endlich vielen Tauschungen zu einer beliebigen Permutation desselben Wortes umgeformt werden kann, gilt $f(a\cdot b)=f(b\cdot a)$.

Induktionsanfang

$f(\epsilon\cdot\epsilon)=1=f(\epsilon)+f(\epsilon)-1$

Induktionsvorraussetzung:

$f(v\cdot w)=f(v)+f(w)-1$

Induktionsschluss:

$$f(v\cdot w)=f(v)+f(w)-1$$
$$f(v\cdot w)+1=f(v)+1+f(w)-1$$
$$f(av\cdot w)=f(av)+f(w)-1$$


## H2.2
Die Stern-Operation ist definiert durch $L^*=\{\epsilon\}\cup\{w_1\dots w_n:n\ge 1,w_i\in L,\forall i\in\mathbb{N}:1\le i\le n\}$.

### a)

$L\subseteq\{w_1:n=1,w_i\in L,\forall i\in\{1\}\}\subseteq L^*$


## H2.3
### L1

![](AFE_2_l1.png)

### L2

![](U2_L2.svg)


### L3

![](U2_L3.svg)

### L4

![](U2_L4.svg)

### L5

![](U2_L5.svg)

### L6

![](U2_L6.svg)
