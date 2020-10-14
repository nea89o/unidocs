---
title: "GA MI 3 Lösung"
date: 14.10.2020
author: "Roman Gräf"
---


## Definitionen aus dem Übungsblatt
Gegeben ist die Dirichlet-Funktion $f$
$$
f(x)=
\begin{cases}
1~\text{wenn}~x \in \mathbb{Q} \\
0~\text{wenn}~x \in \mathbb{R} \backslash \mathbb{Q}
\end{cases}
$$

$f(x)$ hat den Definitionsbereich $D_f = \mathbb{R}$

## Stetigkeit

Eine Funktion $f$ ist stetig an $x_0$, wenn zu jedem $\epsilon > 0$ ein $\delta > 0$ existiert, so dass für alle $x \in D_f$ folgendes gilt:

$$
|x-x_0| < \epsilon $$$$
|f(x) - f(x_0)| < \delta
$$

Daraus folgt umgekehrt dass, falls für ein gegebenes $\epsilon$ kein solches $\delta$ existiert, dass die Funktion nicht stetig ist.

### Konkret an der Dirichlet-Funktion

Für die Dirichlet-Funktion wähle ich das $\epsilon = 0,5$, da der Sprung zwischen $0$ und $1$ größer als $0,5$ ist. Es bleibt also zu beweisen dass in jedem beliebig kleinen Interval $\delta$ um ein $x \in \mathbb{R}$ ein Sprung vorliegt.

Falls $x \in \mathbb{Q}$ ist, so kann ein entsprechendes $y \in\mathbb{R}\backslash\mathbb{Q}$ gefunden werden, indem eine beliebige irrationale Zahl $0 < z < 1$ mit $\delta$ multipliziert wird, und zum originalem $x$ addiert wird. Beispiel mit $\sqrt{2}$ als irrationaler Zahl.

$$
y = x  + \frac{1}{\sqrt{2}} \times \delta
$$

Falls $x \in \mathbb{R}\backslash\mathbb{Q}$ ist, so kann ein entsprechendes $y \in \mathbb{Q}$ gefunden werden, indem die dezimale Ausschreibweiße nach ausreichender Genauigkeit abgeschnitten wird. Die entsprechende Dezimalzahl kann immer als Bruch in der Form $y=\frac{k}{10^n}, k,n \in \mathbb{N}$

Das gefundene $y$ wird immer einen Sprung um entweder $+1$ oder $-1$ im Graphen hervorrufen, $\implies$ die Dirichlet-Funktion $f$ ist an keiner Stelle stetig.

Da Stetigkeit an einer Stelle eine notwendige Bedingung für die Differenzierbarkeit an ebendieser Stelle ist, ist die Dirichlet-Funktion an keiner Stelle differenzierbar.
