# Übungsnummer 2

|Gruppennummer|Übungsleiterin|Name|
|---|---|---|
|10|Eya Chemangui|Roman Gräf|

Bitte Aufgabe H2.2 und H2.3 bewerten.


# Aufgabe H2.1

 - 1. Reflexivität

$f(a)=f(a)$ ist gegeben, dementsprechend ist reflexivität erfüllt

 - 2. Symmetrie

$f(a)=f(b)\iff f(b)=f(a)$ ist gegeben, dementsprechend ist symmetrie gegeben.

 - 3. Transitivität

$f(a)=f(b)\land f(b)=f(c)\implies f(a)=f(c)$, dementsprechend ist transitivität gegeben.

Da alle 3 Eigenschaften einer Äquivalenzrelation gegeben sind, handelt es sich bei $A$ um eine.



# Aufgabe H2.2

## a)

$$sup(B)=max(B)=2$$
$$inf(B)=1$$
Es existiert kein Minimum für $B$. $B$ ist nach unten beschränkt.

## b)
$$i=min(inf(C), inf(D))$$

Aufgrund der Transitivität von $\le$ ist garantiert, dass $(\forall x\in C:i\le inf(C)\le x)\land(\forall x\in D:i\le inf(D)\le x)$, dementsprechend ist $i$ eine untere Schranke von $C\cup D$.


Es kann auch keine größere Schranke als $i$ geben, da das Infimum als größte Schranke immer dicht an einem Wert aus der Menge liegt. D.h. das jeder Wert über einem der beiden $inf(C)$ oder $inf(D)$ garantiert über einem Wert von entweder $C$ oder $D$ liegt, dementsprechend über einem Wert von $C\cup D$.

Daraus folgt dass es sich bei $i$ um die größte untere Schranke von $C\cup D$ handelt, also das Infimum.

# Aufgabe H2.3

 - a)

Die Definition des Urbilds (für $M\subseteq X$: $f^{-1}(M):=\{x\in X:f(x)\in M\}$) garantiert $a\in f^{-1}(f(A))$, falls $f(a)\in f(A)$

$$a\in A\implies f(a)\in f(A)\implies a\in f^{-1}(f(A))$$

 - b)

$$U=f^{-1}(f(A))$$
Durch (a) ist bewiesen das $A\subseteq U$. Für Gleichheit muss nur noch $U\subseteq A$ bewiesen werden.

$\forall u\in U$ gilt $f(u)\in f(A)=\{f(x):x\in A\}\implies \exists x\in A: f(x)=f(u)$. Da $f$ injektiv ist, ist garantiert das $u=x$, dementsprechend ist jedes $u\in A\implies U\subseteq A$.
