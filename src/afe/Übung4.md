# Übungsnummer 2

|Gruppennummer|Übungsleiterin|Name|
|---|---|---|
|09|Emma Stellwag|Roman Gräf|
|04|Rebekka Gehlhaar|Kai Dominik Westphal|

## H4.1)

```
A := rTT | AL
L := uAL | uA
T := x | fTT
```

### Schritt 1: Terminale durch Nichtterminale mit entsprechender Produktion ersetzen.

```
A := RTT | AL
L := UAL | UA
T := X | FTT
R := r
U := u
X := x
F := f
```

### Schritt 2: Rechte Seiten mit mehr als zwei Nichtterminalsymbolen ersetzen.

```
A := RH | AL
L := UB | AL
T := X | FH
H := TT
B := AL
R := r
U := u
X := x
F := f
```

### Schritt 3: Kettenregeln entfernen

```
A := RH | AL
L := UB | AL
T := x | FH
H := TT
B := AL
R := r
U := u
F := f
```

## 4.3)

### a)

Angenommen $L_1$ wäre eine kontextfreie Sprache. Dann existiert eine Pumping-Länge $p\in\mathbb N$, für die sich jedes Wort $z\in L_1$ mit $|z|\geq p$ in $z=u\cdot v\cdot w\cdot x\cdot y:u,v,w,x,y\in \Sigma^* \land |v\cdot x|>0 \land |v\cdot w \cdot x|\leq p$ aufteilen lässt, sodass $u\cdot v^k\cdot w\cdot x^k \cdot y\in L_1$.

Nehmen wir das Wort $z=a^pb^pa^pb^p$. Es gilt offensichtlich das $z\in L_1$ (mit $t=a^pb^p$) und das $|z| \geq p$.

Da $|v\cdot w \cdot x| \leq p$, muss $v\cdot w \cdot x$ entweder komplett aus einem Symbol bestehen(d.h. $a^n$ oder $b^n$), oder kann maximal einmal das Symbol wechseln (d.h. $a^nb^m$ oder $b^na^m$)

Falls $v\cdot w \cdot x$ nur aus einem Symbol besteht, wird beim aufpumpen eine ungleiche Anzahl an $a$s und an $b$s erzeugt, weshalb das neue Wort nicht in $L_1$ ist, weswegen $L_1$ keine kontextfreie Spräche wäre.

Dementsprechend muss $v\cdot w\cdot x$ einen Symbolwechsel enthalten. Falls dieser Symbolwechsel in der Mitte von $t$ ist dann wird nur das eine $t$ aufgepumpt, und das andere bleibt gleich, weswegen das aufgepumpte Wort nicht mehr im Format $t't'$ ist, d.h. kein Teil der Sprache $L_1$. Falls der Symbolwechsel in der Mitte zwischen den beiden $t$s stattfindet, dann wird beim aufpumpen dem einen Wort nur $a$s und dem anderen nur $b$s hinzugefügt, was dazu führt das die aufgepumpten Wörter eine ungleiche Anzahl an $a$s haben, und dementsprechend nicht gleich sind.

Daraus lässt sich schließen das $L_1$ nicht kontextfrei ist.

### b)

Angenommen $L_2$ wäre eine kontextfreie Sprache. Dann existiert eine Pumping-Länge $p\in\mathbb N$, für die sich jedes Wort $z\in L_2$ mit $|z|\geq p$ in $z=u\cdot v\cdot w\cdot x\cdot y:u,v,w,x,y\in \Sigma^* \land |v\cdot x|>0 \land |v\cdot w \cdot x|\leq p$ aufteilen lässt, sodass $u\cdot v^k\cdot w\cdot x^k \cdot y\in L_2$.

Nehmen wir das Wort $z=a^pb^pa^p$. Es gilt offensichtlich das $z\in L_2$(mit $s=s^{-1}=a^p,t=b^p$) und das $|z|\geq p$.

Da $|v\cdot w\cdot x| \leq p$, muss $v\cdot w\cdot x$ entweder komplett aus einem Symbol bestehen (d.h. $a^n$ oder $b^n$), oder maximal einmal das Symbol wechselen (d.h. $a^nb^m$ oder $b^na^m$).

Falls $v\cdot w\cdot x$ nur aus einem Symbol besteht, wird beim aufpumpen nur $s$ oder $t$ länger, und ist demenstprechend aufgepumpt nicht mehr Teil von $L_2$.

Dementsprechend muss $v\cdot w\cdot x$ genau einen Symbolwechsel enthalten. Da Symbolwechsel in $z$ nur  zwischen $s$ oder $s^{-1}$ und $t$ auftreten, wird niemals $s$ und $s^{-1}$ aufgepumpt, aber immer mindestens eins der beiden. Daraus folgt das das aufgepumpte Wort ungleiche $|s|$ und $|s^{-1}|$ haben müsste, was nicht der Fall sein kann.

Daraus folgt das $L_2$ keine kontextfreie Sprache ist.

### c)

Falls $L$ eine kontextfreie Sprache ist, trifft das Pumping-Lemma zu. Der Herleitung des Pumping-Lemmas für $L$ trifft auch für $L\backslash\{\epsilon\}$ zu, da die Pumping-Länge immer größer als $0$ ist, und dementsprechend $\epsilon$ in beiden Argumentationen vernachlässigt wird.

### d)

Wählen wir zwei Sprachen mit $\Sigma=\{a,b,c\}$: $L_1=\{a^nb^mc^l|n,m,l\in\mathbb N\}$ und $L_2=\{a^nb^nc^n | n\in\mathbb N\}$, welche erwisenermaßen nach Bespiel 3.3.9 kontextsensitiv ist. Der Schnitt $L_1\cap L_2$ ist wieder $L_2$, was nicht kontextfrei ist.
