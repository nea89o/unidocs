# H10

|Gruppennummer|Übungsleiterin|Name|
|---|---|---|
|10|Eya Chemangui|Roman Gräf|
|07|Keyoumars Kayhanfar|Krist-Obi Fredrick|
|07|Keyoumars Kayhanfar|Johannes Yaunan|

## Bitte bewerten sie H10.2 und H10.3.

## H10.1

### a -> b)

Zu zeigen: $A$ ist orthogonal impliziert dass $A$ invertierbar ist und $A^{-1}=A^T$ gilt.

Eine Matrix $A$ ist invertierbar, wenn diese quadratisch ist und eine $det(A) \ne 0$ hat. Da wir nur quadratische Matrixen betrachten, bleibt zu zeigen, dass die Determinante orthogonaler Matrixen immer $\ne 0$ ist.

Die Determinante einer $n \times n$ Matrix ist genau dann $=0$, wenn $Rang(A) < n$. Der Rang beschreibt die Anzahl linear unabhängiger Zeilen/Spalten in einer Matrix. Da bei einer orthogonalen Matrix alle Zeilen/Spalten paarweise orthogonal, d.h. linear Unabhängig, sind, ist der $Rang(A)$ der orthogonalen Matrix $=n$. Daraus folgt dass die Determinante der orthogonalen Matrix $\ne 0$, und dementsprechend ist $A$ invertierbar.

Bleibt zu zeigen dass $A^{-1}=A^T$:

Da es sich bei $A=\left( a_1, \ldots, a_n \right)$ um eine orthogonale Matrix handelt, gilt: $\langle a_i, a_j\rangle =\left\{\begin{array}{cc}0 & i \neq j \\ 1 & i=j\end{array}\right.$, da ein normierter Vektor mit sich selbst multipliziert $=1$ ist, und alle anderen Vektoren einer orthogonalen Matrix jeweils paarweise orthogonal sind.

Zu zeigen: $AA^{T} = I$

Das ist equivalent dazu, zu zeigen das: $I_{i,j} = \langle A_{i}, A^{T}_{j}\rangle$

Das ist der Fall, falls $i=j\implies \langle A_i, A^T_j\rangle = 1$, und für alle anderen Fälle $\langle A_i, A^T_j\rangle = 0$.

### b -> c)

Zu zeigen $AA^{-1}=I\land A^T=A^{-1}\implies$ die Zeilen von $A$ bilden eine Orthonormalbasis.

Aus $AA^T=I$ folgt, dass das Produkt zweier ungleicher Vektoren aus $A$ stehts null ergibt. Dementsprechend sind alle Zeilen aus $A$ paarweise orthogonal, d.h. die Zeilen aus $A$ bilden eine Orthogonalbasis.

Bleibt zu zeigen, dass die euklidische Norm aller Zeilen $1$ ist.

Aus $A^{-1}=A^T$ folgt dass für jeden Vektor $a$ aus $A$ gilt: $\langle a, a\rangle = 1$.

Dann ist $\langle a,a\rangle = a_1^2+ \ldots + a_n^2 = \left(\sqrt{a_1^2+\ldots+a_n^2}\right)^2 = \left(||a||_2\right)^2 = 1^2 \implies ||a||_2=1$

## H10.2

### a)

$A=\left(\begin{array}{lll}2 & 0 & 0 \\ 1 & 3 & 0 \\ 4 & 5 & 6\end{array}\right)$

$(A-\lambda I)=\left(\begin{array}{lll}2-\lambda & 0 & 0 \\ 1 & 3 - \lambda & 0 \\ 4 & 5 & 6 - \lambda\end{array}\right)$

$det(A-\lambda I)=0 = (2-\lambda)(3-\lambda)(6-\lambda)\implies \lambda = 2 \lor \lambda = 3 \lor \lambda = 6$

Für $\lambda=2:(A-2I)v_1=0$:

$\left(\begin{array}{lll|l}x & y & z & \\ 0 & 0 & 0 & 0 \\ 1 & 1 & 0 & 0 \\ 4 & 5 & 4 & 0\end{array}\right)$

Dementsprechend gilt $z=t$, $x = -y$ und $-x+4t=0$.

Dementsprechend ist $v_1=t\cdot\left(\begin{array}{} 4\\-4\\1\end{array}\right):t \in\mathbb R\backslash\{0\}$. Dementsprechend ist die Dimension von $v_1=1$.



Für $\lambda=3:(A-3I)v_1=0$:

$\left(\begin{array}{lll|l}x & y & z & \\ -1 & 0 & 0 & 0 \\ 1 & 0 & 0 & 0 \\ 4 & 5 & 3 & 0\end{array}\right)$

Mit $I'=I+II$:

$\left(\begin{array}{lll|l}x & y & z & \\ 0 & 0 & 0 & 0 \\ 1 & 0 & 0 & 0 \\ 4 & 5 & 3 & 0\end{array}\right)$

Dementsprechend gilt $x=0$, $y = t$ und $4x+5y+3z=0\implies 5t+3z=0\implies z =-\frac{5}{3}t$.

Dementsprechend ist $v_2=t\cdot\left(\begin{array}{} 0\\1\\-\frac{5}{3}\end{array}\right):t \in\mathbb R\backslash\{0\}$. Dementsprechend ist die Dimension von $v_2=1$.



Für $\lambda=6:(A-6I)v_1=0$:

$\left(\begin{array}{lll|l}x & y & z & \\ -4 & 0 & 0 & 0 \\ 1 & -3 & 0 & 0 \\ 4 & 5 & 0 & 0\end{array}\right)$

Dementsprechend gilt $x=0$, $y=0$ und $z=t$.

Dementsprechend ist $v_3=t\cdot\left(\begin{array}{} 0\\0\\1\end{array}\right):t \in\mathbb R\backslash\{0\}$. Dementsprechend ist die Dimension von $v_3=1$.

Da die Summe der Dimensionen der Eigenvektoren $\Sigma dim(v_i) = 3$, ist die Matrix $A$ diagonalisierbar. Eine Diagonalmatrix ist

$D=\left(\begin{array}{lll}2 & 0 & 0\\ 0 & 3 & 0 \\ 0 & 0 & 6\end{array}\right)$

### b)

$B=\left(\begin{array}{}-1 & 0 & -1 \\ 1 & -1 & 3 \\ 0 & 0 & -2 \end{array}\right)$

$(B-\lambda I)=\left(\begin{array}{}-1-\lambda & 0 & -1 \\ 1 & -1-\lambda & 3 \\ 0 & 0 & -2-\lambda \end{array}\right)$

$det(B-\lambda I) = (-2-\lambda)\cdot det\left(\begin{array}{}-1-\lambda & 0 \\ 1 & -1-\lambda \end{array}\right)$

$0 = (-2-\lambda)(-1-\lambda)^2 \implies \lambda = -2\lor \lambda = -1$

Für $\lambda=-1$: $(B+1I)v_1=0$:

$\left(\begin{array}{lll|l}x&y&z&\\0 & 0 & -1 & 0 \\ 1 & 0 & 3 & 0\\0&0&-1&0\end{array}\right)$

Dementsprechend gilt $z=0$, $x=0$ und $y=v$. 

Dementsprechend ist $v_1=\left(\begin{array}{}0\\u\\0\end{array}\right): u\in\mathbb R$. Die Dimension von $v_1=1$.


Für $\lambda=-2$: $(B+2I)v_2=0$:

$\left(\begin{array}{lll|l}x&y&z&\\1 & 0 & -1 & 0 \\ 1 & 1 & 3 & 0\\0&0&0&0\end{array}\right)$

Dementsprechend gilt: $x=u$, $z=-x=-u$ und $u+y-3u=0\implies y-2u=0\implies y=2u$.

Dementsprechend ist $v_2=\left(\begin{array}{}u\\2u\\-u\end{array}\right) : u\in\mathbb R$. Die Dimension von $v_2=1$.

Da die Summe der Dimensionen der Eigenvektoren $\Sigma dim(v_i)=2\neq 3$, dementsprechend ist $B$ nicht diagonalisierbar.

## H10.3

$A=\left(\begin{array}{}-2&-1&-1\\ 0 &2&4\\0&1&-1\end{array}\right)$.

$A-\lambda I=\left(\begin{array}{}-2-\lambda&-1&-1\\ 0 &2-\lambda&4\\0&1&-1-\lambda\end{array}\right)$.
$det(A-\lambda I)=(-2-\lambda)\cdot det\left(\begin{array}{}2-\lambda &4 \\1&-1-\lambda\end{array}\right) = (-2-\lambda)((2-\lambda)(-1-\lambda)-4)=0$
$\implies \lambda=-2\lor (2-\lambda)(-1-\lambda)=4$

$(2-\lambda)(-1-\lambda)=-2+2\lambda-\lambda+\lambda^2=4$

$\lambda^2+\lambda-6=0$

$\lambda=-\frac{1}{2}\pm\sqrt{\frac{1}{4}+6}$

$\lambda=-\frac{1}{2}\pm\frac{5}{2}$

$\implies \lambda=-2\lor\lambda=3$

Für $\lambda=-2$: $(A+2I)v_1=0$:

$\left(\begin{array}{lll|l}x&y&z&\\0 & -1 & -1&0\\0 & 4& 4&0\\ 0 & 1&1&0\end{array}\right)$

Dementsprechend ist $x=u$ und $y=-z=v$.

Dementsprechend ist $v_1=\left(\begin{array}{}u\\v\\-v\end{array}\right) : u,v\in\mathbb R$

Für $\lambda=3$: $(A-3I)v_2=0$:

$\left(\begin{array}{lll|l}x&y&z&\\-5 & -1 & -1&0\\0 & -1& 4&0\\ 0 & 1&-4&0\end{array}\right)$

Dementsprechend ist $z=u$, $y-4z=y-4u=0\implies y=4u$ und $-5x-y-z=-5x-4u-u=0\implies -5x=5u\implies x=-1$.

Dementsprechend ist $v_2=\left(\begin{array}{}-u\\4u\\u\end{array}\right) : u\in\mathbb R$

Eine Diagonalmatrix $D$ zu $A$ ist 

$D=\left(\begin{array}{}4&0&0\\0&-2&0\\0&0&-2\end{array}\right)$

$S=\left(\begin{array}{}-1&1&0\\4&0&-1\\1&0&1\end{array}\right)$

$A^{-1}=\left(\begin{array}{}-\frac{1}{2}&-\frac{1}{6}&-\frac{1}{6}\\0&\frac{1}{6}&\frac{2}{3}\\0&\frac{1}{6}&-\frac{1}{3}\end{array}\right)$

$S^{-1}=\left(\begin{array}{}0&\frac{1}{5}&\frac{1}{5}\\1&\frac{1}{5}&\frac{1}{5}\\0&-\frac{1}{5}&\frac{4}{5}\end{array}\right)$

