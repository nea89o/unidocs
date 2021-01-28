# H07

|Gruppennummer|Übungsleiterin|Name|
|---|---|---|
|10|Eya Chemangui|Roman Gräf|
|07|Keyoumars Kayhanfar|Krist-Obi Fredrick|
|07|Keyoumars Kayhanfar|Johannes Yaunan|

## H07.1
### a)

$\langle(x_1,x_2)^T,(y_2,y_2)^T\rangle:=(x_1+x_2)\cdot y_1$

Diese Konstruktion wiederspricht der Symmetrie von Skalarprodukten:

$\langle(0,1)^T,(1,1)^T\rangle=(0+1)\cdot 1=1\ne 0 = (1+1)\cdot 0 =\langle(1,1)^T,(0,1)^T\rangle$

### b)

$\langle(x_1,x_2)^T,(y_1,y_2)^T\rangle :=(x_1+x_2)\cdot(y_1+y_2)$

Diese Konstruktion wiederspricht der Definitheit von Skalarprodukten:

$\langle(1,-1)^T,(1,-1)^T\rangle=(1+-1)\cdot(1+-1)=0\implies(1,-1)^T=0$

### c)

$\langle(x_1,x_2)^T,(y_1,y_2)^T\rangle:=x_1\cdot y_1 + 2\cdot x_2\cdot y_2$

Definitheit:

$\forall x\in\mathbb{R}^2:\langle x,x\rangle=x_1^2+2x^2_2\geq 0$, da die Summe von positiven Zahlen (die Quadrate in $\mathbb{R}$ immer sind) immer nicht-negativ ist, ist das hier gegeben.

$x_1^2+2x_2^2=0\implies x_1=0 \land x_2=0$
$x_1=0,x_2=0\implies \langle x,x\rangle = 0^2+2\cdot 0^2=0$

Symmetrie:

$\forall x,y\in\mathbb{R}^2:\langle x,y\rangle=x_1\cdot y_1+2\cdot x_2\cdot y_2\stackrel{\text{Kommutativgesetz}}=y_1\cdot x_1+2\cdot y_2\cdot x_2=\langle y,x\rangle$

Linearität im ersten Argument:


$\forall x,y,z\in\mathbb{R}^2\forall\alpha,\beta\in\mathbb{R}:\langle\alpha x+\beta y,z\rangle=(\alpha x_1+\beta y_1)\cdot z_1+2\cdot(\alpha x_2+\beta y_2)\cdot z_2$
$=\alpha\cdot x_1\cdot z_1+\beta \cdot y_1\cdot z_1+2\alpha \cdot x_2\cdot z_2+2\beta \cdot y_2\cdot z_2$
$=\alpha\cdot x_1\cdot z_1+2\alpha \cdot x_2\cdot z_2+\beta \cdot y_1\cdot z_1+2\beta \cdot y_2\cdot z_2$
$=\alpha\cdot x_1\cdot z_1+\alpha\cdot 2 \cdot x_2\cdot z_2+\beta \cdot y_1\cdot z_1+\beta\cdot 2 \cdot y_2\cdot z_2$
$\alpha (x_1\cdot z_1+2\cdot x_2\cdot z_2)+\beta (y_1\cdot z_1+2\cdot y_2\cdot z_2)=\alpha\langle x,z\rangle+\beta \langle y,z\rangle$


### d)

$\langle(x_1,x_2)^T,(y_1,y_2)^T\rangle:=x_1\cdot y_1\cdot x_2\cdot y_2$

Diese Konstruktion wiederspricht der Linearität im ersten Argument von Skalarprodukten:

$x=y=z=(1,1)^T$

$\langle 1x+2y,z\rangle=(1x_1+2y_1)\cdot(1x_2+2y_2)\cdot z_1\cdot z_2=1+2+2+4\ne 1+2=1\langle x,z\rangle + 2\langle y, z\rangle$

## H07.2

### a)

Zu zeigen: $\forall b,b'\in M:b\ne b'\implies\forall \lambda_1,\lambda_2\in\mathbb{R}:\lambda_1\cdot b+\lambda_2\cdot b'=0\implies \lambda_1=0\land\lambda_2=0$

$\lambda_1\cdot b+\lambda_2\cdot b'=0\implies \lambda_1\cdot b\cdot b+\lambda_2\cdot b'\cdot b=0$. Da $b\cdot b'=0:\lambda_1\cdot b\cdot b=0$. Da $b\ne 0$, gilt $\lambda_1=0$.

$\lambda_1\cdot b+\lambda_2\cdot b'=0\implies \lambda_1\cdot b\cdot b'+\lambda_2\cdot b'\cdot b'=0$. Da $b'\cdot b=0:\lambda_2\cdot b'\cdot b'=0$. Da $b'\ne 0$, gilt $\lambda_2=0$.

Daraus folgt $M$ ist linear unabhängig.

### b)

$v_1\cdot v_2=(\frac{1}{\sqrt{3}}\cdot\frac{1}{\sqrt{6}})(1+1-2)=0$

$v1\cdot v_3=(\frac{1}{\sqrt{3}}\cdot\frac{1}{\sqrt{2}})(1-1+0)=0$

$v2\cdot v_3=(\frac{1}{\sqrt{6}}\cdot\frac{1}{\sqrt{2}})(1-1+0)=0$

Daraus folgt die lineare Unabhängigkeit der drei Vektoren, daraus dass sie paarweise orthogonal sind und daraus das es sich um eine Orthogonalbasis handelt.

$|v_1|=\frac{1}{\sqrt 3}\sqrt{1+1+1}=\frac{\sqrt 3}{\sqrt 3}=1$

$|v_2|=\frac{1}{\sqrt 6}\sqrt{1+1+4}=\frac{\sqrt 6}{\sqrt 6}=1$

$|v_3|=\frac{1}{\sqrt 2}\sqrt{1+1+0}=\frac{\sqrt 2}{\sqrt 2}=1$

Da es sich bei allen Vektoren um normalisierte Vektoren handelt, handelt es sich um eien Orthonormalbasis.

$v=a\cdot v_1+b\cdot v_2+c\cdot v_3$


$$\begin{array}\\
I: &\frac{a}{\sqrt 3}&+\frac{b}{\sqrt 6}&+\frac{c}{\sqrt 2}&=1\\
II:&\frac{a}{\sqrt 3}&+\frac{b}{\sqrt 6}&-\frac{c}{\sqrt 2}&=4\\
III:&\frac{a}{\sqrt 3}&-\frac{2b}{\sqrt 6}&&=5
\end{array}$$

$$\begin{array}\\
I: &\frac{a}{\sqrt 3}&+\frac{b}{\sqrt 6}&+\frac{c}{\sqrt 2}&=1\\
II-I:&&&-\frac{2c}{\sqrt 2}&=3\\
III-I:&&-\frac{3b}{\sqrt 6}&-\frac{c}{\sqrt 2}&=4
\end{array}$$

$c=-\frac{3\sqrt{2}}{2}$

In $III-I$ einsetzen:

$-\frac{3b}{\sqrt 6}-\frac{-\frac{3}{\sqrt{2}}}{\sqrt 2}=4$

$-\frac{3b}{\sqrt 6}=\frac{5}{2}$

$b=\frac{-5\sqrt 6}{6}$

In $I$ einsetzen:

$\frac{a}{\sqrt 3}+\frac{-5}{6}+\frac{-3}{2}=1$

$a=\frac{10\sqrt 3}{3}$


$v=\frac{10\sqrt 3}{3}\frac{1}{\sqrt 3}v_1-\frac{5\sqrt 6}{6}\frac{1}{\sqrt 6}v_2-\frac{3\sqrt 2}{2}\frac{1}{\sqrt 2}v_3$
