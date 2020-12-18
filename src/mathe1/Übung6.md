# Übungsblatt Nr 6

|Gruppennummer|Übungsleiterin|Name|
|---|---|---|
|10|Eya Chemangui|Roman Gräf|
|07|Keyoumars Kayhanfar|Krist-Obi Fredrick|
|07|Keyoumars Kayhanfar|Johannes Yaunan|

## H1

| | (i) | (ii) | (iii) | (iv) |
|---|---|---|---|---|
|a|false|true|true|true|
|b|true|false|true|false|
|c|false|true|false|true|
|d|true|false|false|true|
|e|true|true|true|false|


## H2

$v_1=\begin{pmatrix}1\\1\\-1\end{pmatrix} v_2=\begin{pmatrix}1\\-1\\1\end{pmatrix} v_3=\begin{pmatrix}-1\\1\\1\end{pmatrix} v_4=\begin{pmatrix}0\\1\\1\end{pmatrix}$

### a)


$$a\cdot\begin{pmatrix}1\\1\\-1\end{pmatrix}+b\cdot\begin{pmatrix}1\\-1\\1\end{pmatrix}+c\cdot\begin{pmatrix}-1\\1\\1\end{pmatrix}=\begin{pmatrix}0\\0\\0\end{pmatrix}$$

$$I:a+b=c$$
$$II:b+c=a$$
$$III:a+c=b$$
$$IV=I\text{ in }II\text{ einsetzen:}b+a+b=a\stackrel{-a}{\implies}2b=0\stackrel{:2}{\implies}b=0$$
$$V=IV\text{ in }I\text{ einsetzen:}a+0=a=c$$
$$V\text{ und }IV\text{ in }III\text{ einsetzen:}a+a=0\implies a=0$$

$$a=c=b=0$$

### b)

$$a\cdot\begin{pmatrix}1\\1\\-1\end{pmatrix}+b\cdot\begin{pmatrix}1\\-1\\1\end{pmatrix}+c\cdot\begin{pmatrix}-1\\1\\1\end{pmatrix}+d\cdot\begin{pmatrix}0\\1\\1\end{pmatrix}=\begin{pmatrix}0\\0\\0\end{pmatrix}$$
$$I:a+b-c=0$$
$$II:a-b+c+d=0$$
$$III:-a+b+c+d=0$$

$$\begin{array}\\
I: &a&+b&-c&  &=0\\
II:&a&-b&+c&+d&=0\\
II+III:& &  & c&+d&=0
\end{array}$$

$$\begin{array}\\
a+b-c&=0\\
a-b&=0
\end{array}$$

Dies ist ein unterbestimmtes LGS, dementsprechend handelt es sich um linear abhängige Vektoren.

### c)

 - (i) $1\cdot k=1\land 1\cdot k=-1 \land -1\cdot k=1 \implies k=0$, dementsprechend linear unabhängig.
 - (ii) $v_2-v_1=\begin{pmatrix}0\\-2\\2\end{pmatrix},v_3+v_1=\begin{pmatrix}0\\2\\0\end{pmatrix}$. Die dritte Zeile besagt: $-2k=0\implies k=0$, dementsprechend sind die Vektoren linear unabhängig.
 - (iii) Um $\mathbb{R}^3$ aufzuspannen bräuchten wir mindestens 3 linear unabhängige Vektoren $\implies$ falsch.
 - (iv) Wir haben in der a) gezeigt dass es sich um linear unabhängige Vektoren handelt, dementsprechend bilden die Vektoren eine Basis.
