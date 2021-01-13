# Partielle Übung 3

Nach dem Satz von Kleene existiert mindestens ein DEA $A$ der Äquivalent zu $L$ ist.
Dieser DEA muss zwar nicht zwingend minimiert sein, hat aber eine endliche Zustandsmenge, d.h. ein endliches $index(\sim_A)$. Da $index(\sim_L)$ minimal ist, ist $|index(\sim_L)|\le|index(\sim_A)|$ und dementsprechend auch endlich.

Repräsentantensystem von $\sim_L$:

 - $\epsilon$
 - b
 - bb
 - a

## b)

Da es unendlich viele Wörter $w\in \Sigma^*$ gibt und für jedes Wort ein $w^{-1}$ existiert, gibt es unendlich viele Palindrome in der Form $w\cdot w^{-1}$ für die gilt: $w\cdot w^{-1}=(w\cdot w^{-1})^{-1}$.

Für jedes $x$ in der Form $a^nb$ existiert ein Zustand $q$ den der Minimalautomat erreicht nach dem er $x$ abgelaufen ist. Angenommen es existieren endlich viele Zustände, gibt es ein Wort $y=a^mb, m\ne n$ dass auch auf den Zustand $q$ führt. Da $x$ auf den Zustand $q$ führt muss der Minimalautomat von $q$ aus mit dem zusätzlichem Input $a^n$ auf einem akzeptierendem Zustand landen. Dadurch würde dieser Automat auch $a^mba^n$ akzeptieren, was ein Widerspruch ist, da $a^mba^n$ kein Palindrom ist.
