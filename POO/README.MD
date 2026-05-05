# Cours complet sur la Programmation Orientée Objet (POO)

> Ce cours utilise **Python** pour les exemples car sa syntaxe est claire, mais les concepts s'appliquent à tous les langages orientés objet (Java, C++, C#, PHP, JavaScript, Ruby...).

---

## Table des matières

1. [Pourquoi la POO ?](#1-pourquoi-la-poo)
2. [Les 4 piliers de la POO](#2-les-4-piliers-de-la-poo)
3. [Classes et Objets : les bases](#3-classes-et-objets--les-bases)
4. [L'encapsulation](#4-lencapsulation)
5. [L'héritage](#5-lhéritage)
6. [Le polymorphisme](#6-le-polymorphisme)
7. [L'abstraction](#7-labstraction)
8. [Composition vs Héritage](#8-composition-vs-héritage)
9. [Concepts avancés](#9-concepts-avancés)
10. [Les principes SOLID](#10-les-principes-solid)
11. [Exercices récapitulatifs](#11-exercices-récapitulatifs)

---

## 1. Pourquoi la POO ?

Avant la POO, on faisait de la **programmation procédurale** : des fonctions qui agissent sur des données séparées.

### Le problème de la programmation procédurale

```python
# Programmation procédurale
nom_compte = "Alice"
solde_compte = 1000

def deposer(solde, montant):
    return solde + montant

def retirer(solde, montant):
    if solde >= montant:
        return solde - montant
    return solde

solde_compte = deposer(solde_compte, 500)
```

**Problèmes** :
- Les données et les fonctions sont séparées
- Si tu as 1000 comptes, tu dois passer le solde à chaque fonction
- Aucune garantie qu'on n'oublie pas de vérifier le solde
- Difficile à maintenir quand le code grossit

### La solution POO

La POO regroupe **données + comportements** dans un même objet. Un objet, c'est comme une "boîte" qui contient :
- Des **attributs** (les données)
- Des **méthodes** (les fonctions qui agissent sur ces données)

```python
class CompteBancaire:
    def __init__(self, nom, solde):
        self.nom = nom
        self.solde = solde

    def deposer(self, montant):
        self.solde += montant

    def retirer(self, montant):
        if self.solde >= montant:
            self.solde -= montant

compte = CompteBancaire("Alice", 1000)
compte.deposer(500)  # solde = 1500
```

**Avantages** :
- Code organisé et logique
- Réutilisable
- Plus proche de la façon dont on pense le monde réel
- Facile à étendre

---

## 2. Les 4 piliers de la POO

Retiens ces 4 mots, ils résument toute la POO :

| Pilier | Idée |
|--------|------|
| **Encapsulation** | Cacher les détails internes, exposer une interface |
| **Héritage** | Créer une classe à partir d'une autre |
| **Polymorphisme** | Un même appel, des comportements différents |
| **Abstraction** | Ne montrer que l'essentiel, masquer la complexité |

On les détaillera tous, mais d'abord les bases.

---

## 3. Classes et Objets : les bases

### Définitions clés

- **Classe** : un plan, un modèle (ex : le concept de "Voiture")
- **Objet** (ou **instance**) : une réalisation concrète d'une classe (ex : "ma Clio rouge")
- **Attribut** : une donnée qui appartient à l'objet
- **Méthode** : une fonction qui appartient à la classe
- **Constructeur** : la méthode appelée à la création de l'objet (`__init__` en Python)
- **`self`** : référence à l'objet lui-même (équivalent de `this` dans d'autres langages)

### Exemple commenté

```python
class Voiture:
    # Attribut de classe : partagé par TOUTES les instances
    nombre_de_roues = 4

    # Constructeur : appelé à chaque création d'objet
    def __init__(self, marque, modele, couleur):
        # Attributs d'instance : propres à chaque objet
        self.marque = marque
        self.modele = modele
        self.couleur = couleur
        self.vitesse = 0  # état initial

    # Méthode d'instance
    def accelerer(self, increment):
        self.vitesse += increment

    def freiner(self, decrement):
        self.vitesse = max(0, self.vitesse - decrement)

    def afficher(self):
        return f"{self.marque} {self.modele} ({self.couleur}) - {self.vitesse} km/h"


# Création de deux objets distincts
ma_clio = Voiture("Renault", "Clio", "rouge")
ta_polo = Voiture("Volkswagen", "Polo", "bleue")

ma_clio.accelerer(50)
print(ma_clio.afficher())  # Renault Clio (rouge) - 50 km/h
print(ta_polo.afficher())  # Volkswagen Polo (bleue) - 0 km/h
```

### Différence attribut de classe vs attribut d'instance

```python
class Chien:
    espece = "Canis lupus familiaris"  # attribut de classe

    def __init__(self, nom):
        self.nom = nom  # attribut d'instance

rex = Chien("Rex")
medor = Chien("Médor")

print(rex.espece)    # Canis lupus familiaris
print(medor.espece)  # Canis lupus familiaris (partagé)
print(rex.nom)       # Rex
print(medor.nom)     # Médor (différent)
```

### 🎯 Exercice 1 — Classe Livre

Crée une classe `Livre` avec :
- attributs : `titre`, `auteur`, `nombre_pages`, `pages_lues` (initialisé à 0)
- méthode `lire(nb_pages)` qui ajoute des pages à `pages_lues` (sans dépasser `nombre_pages`)
- méthode `progression()` qui retourne le pourcentage lu
- méthode `est_termine()` qui retourne `True` si tout est lu

Teste avec : un livre de 300 pages, lis 150 pages, vérifie que la progression est de 50 %.

<details>
<summary>✅ Solution</summary>

```python
class Livre:
    def __init__(self, titre, auteur, nombre_pages):
        self.titre = titre
        self.auteur = auteur
        self.nombre_pages = nombre_pages
        self.pages_lues = 0

    def lire(self, nb_pages):
        self.pages_lues = min(self.pages_lues + nb_pages, self.nombre_pages)

    def progression(self):
        return (self.pages_lues / self.nombre_pages) * 100

    def est_termine(self):
        return self.pages_lues == self.nombre_pages

livre = Livre("1984", "Orwell", 300)
livre.lire(150)
print(livre.progression())   # 50.0
print(livre.est_termine())   # False
livre.lire(200)              # 200, mais limité à 300 total
print(livre.est_termine())   # True
```

</details>

---

## 4. L'encapsulation

### Idée fondamentale

**Cacher les détails internes d'un objet et n'exposer qu'une interface contrôlée.**

Imagine une voiture : tu utilises le volant, l'accélérateur, les pédales. Tu ne touches pas directement au moteur ou aux pistons. C'est l'encapsulation.

### Pourquoi ?

1. **Sécurité** : empêcher des modifications invalides (ex : un solde négatif)
2. **Maintenabilité** : tu peux changer l'implémentation sans casser le code qui utilise ta classe
3. **Simplicité** : l'utilisateur n'a pas besoin de connaître les détails

### Niveaux de visibilité

En Python, par convention :
- `attribut` : public (accessible partout)
- `_attribut` : "protégé" (convention : ne pas y toucher de l'extérieur)
- `__attribut` : "privé" (Python applique du *name mangling*)

> Dans Java/C++/C#, ces niveaux sont enforced par le langage avec `public`, `protected`, `private`.

### Exemple : compte bancaire SANS encapsulation

```python
class CompteBancaire:
    def __init__(self, solde):
        self.solde = solde

compte = CompteBancaire(1000)
compte.solde = -999999  # 😱 catastrophe, on a accès direct
```

### Exemple AVEC encapsulation

```python
class CompteBancaire:
    def __init__(self, solde_initial):
        self.__solde = solde_initial  # privé

    def deposer(self, montant):
        if montant <= 0:
            raise ValueError("Le montant doit être positif")
        self.__solde += montant

    def retirer(self, montant):
        if montant <= 0:
            raise ValueError("Le montant doit être positif")
        if montant > self.__solde:
            raise ValueError("Solde insuffisant")
        self.__solde -= montant

    def get_solde(self):  # getter
        return self.__solde


compte = CompteBancaire(1000)
compte.deposer(500)
print(compte.get_solde())  # 1500
# compte.__solde = -999  # Ne fonctionne pas (mangling)
```

### Getters et Setters (et les `@property` Python)

Un **getter** lit un attribut, un **setter** le modifie (avec validation).

Python a une syntaxe élégante avec `@property` :

```python
class Personne:
    def __init__(self, age):
        self._age = age

    @property
    def age(self):           # getter
        return self._age

    @age.setter
    def age(self, valeur):   # setter avec validation
        if valeur < 0:
            raise ValueError("L'âge ne peut pas être négatif")
        self._age = valeur


p = Personne(25)
print(p.age)   # 25 → appelle le getter
p.age = 30     # → appelle le setter
# p.age = -5   # → ValueError
```

> Cette syntaxe permet d'utiliser `p.age` comme un attribut simple, mais avec contrôle.

### 🎯 Exercice 2 — Thermostat

Crée une classe `Thermostat` qui :
- a une température privée `_temperature` (par défaut 20)
- empêche de la régler en dehors de l'intervalle [10, 30]
- expose la température via un `@property`

<details>
<summary>✅ Solution</summary>

```python
class Thermostat:
    def __init__(self, temperature=20):
        self._temperature = None
        self.temperature = temperature  # passe par le setter pour valider

    @property
    def temperature(self):
        return self._temperature

    @temperature.setter
    def temperature(self, valeur):
        if not 10 <= valeur <= 30:
            raise ValueError("Température hors limites (10-30)")
        self._temperature = valeur


t = Thermostat()
t.temperature = 22
print(t.temperature)  # 22
# t.temperature = 50  # → ValueError
```

</details>

---

## 5. L'héritage

### Idée fondamentale

**Une classe peut hériter d'une autre pour réutiliser et étendre son comportement.**

Vocabulaire :
- Classe **parente** (ou **mère**, **superclasse**, **base**)
- Classe **enfant** (ou **fille**, **sous-classe**, **dérivée**)

C'est une relation **"est un"** : un `Chien` **est un** `Animal`.

### Exemple

```python
class Animal:
    def __init__(self, nom):
        self.nom = nom

    def respirer(self):
        print(f"{self.nom} respire")

    def parler(self):
        print(f"{self.nom} fait un bruit")


class Chien(Animal):  # Chien hérite d'Animal
    def parler(self):  # on redéfinit (override)
        print(f"{self.nom} aboie : Wouf !")


class Chat(Animal):
    def parler(self):
        print(f"{self.nom} miaule : Miaou !")


rex = Chien("Rex")
rex.respirer()  # Rex respire (hérité)
rex.parler()    # Rex aboie : Wouf ! (redéfini)
```

### Appeler la classe parente avec `super()`

Souvent, l'enfant veut **étendre** le parent, pas tout réécrire.

```python
class Animal:
    def __init__(self, nom, age):
        self.nom = nom
        self.age = age


class Chien(Animal):
    def __init__(self, nom, age, race):
        super().__init__(nom, age)  # appelle le constructeur du parent
        self.race = race


rex = Chien("Rex", 5, "Labrador")
print(rex.nom, rex.age, rex.race)  # Rex 5 Labrador
```

### Héritage multiple (à manier avec prudence)

Python autorise l'héritage de plusieurs classes :

```python
class Volant:
    def voler(self):
        print("Je vole")

class Nageant:
    def nager(self):
        print("Je nage")

class Canard(Volant, Nageant):
    pass

donald = Canard()
donald.voler()  # Je vole
donald.nager()  # Je nage
```

> Dans Java/C#, l'héritage multiple est interdit (mais on a des **interfaces** à la place). On y reviendra.

### Le diamant et le MRO

Si A hérite de B et C, qui héritent toutes deux de D, c'est le "problème du diamant". Python le résout avec le **MRO** (Method Resolution Order), accessible via `Classe.__mro__`.

### 🎯 Exercice 3 — Hiérarchie de véhicules

Crée :
- une classe `Vehicule` avec `marque`, `vitesse_max`
- une classe `Voiture(Vehicule)` qui ajoute `nombre_portes`
- une classe `Moto(Vehicule)` qui ajoute `cylindree`
- une méthode `description()` dans `Vehicule`, redéfinie dans les deux enfants

<details>
<summary>✅ Solution</summary>

```python
class Vehicule:
    def __init__(self, marque, vitesse_max):
        self.marque = marque
        self.vitesse_max = vitesse_max

    def description(self):
        return f"{self.marque}, max {self.vitesse_max} km/h"


class Voiture(Vehicule):
    def __init__(self, marque, vitesse_max, nombre_portes):
        super().__init__(marque, vitesse_max)
        self.nombre_portes = nombre_portes

    def description(self):
        base = super().description()
        return f"Voiture {base}, {self.nombre_portes} portes"


class Moto(Vehicule):
    def __init__(self, marque, vitesse_max, cylindree):
        super().__init__(marque, vitesse_max)
        self.cylindree = cylindree

    def description(self):
        base = super().description()
        return f"Moto {base}, {self.cylindree} cm³"


print(Voiture("Peugeot", 200, 5).description())
print(Moto("Yamaha", 250, 600).description())
```

</details>

---

## 6. Le polymorphisme

### Idée fondamentale

**Un même appel produit des comportements différents selon le type d'objet.**

Étymologie : "poly" (plusieurs) + "morphe" (formes) = plusieurs formes.

### Exemple classique

```python
class Animal:
    def parler(self):
        pass

class Chien(Animal):
    def parler(self):
        return "Wouf"

class Chat(Animal):
    def parler(self):
        return "Miaou"

class Vache(Animal):
    def parler(self):
        return "Meuh"


# Le polymorphisme : on appelle la même méthode, peu importe le type
animaux = [Chien(), Chat(), Vache()]
for animal in animaux:
    print(animal.parler())
# Wouf
# Miaou
# Meuh
```

> La beauté : si demain tu ajoutes `Mouton`, ta boucle marche sans aucune modification.

### Pourquoi c'est puissant ?

Tu écris du code générique qui fonctionne avec **n'importe quel** objet implémentant une interface, sans connaître les détails.

```python
def faire_parler(animal):
    print(animal.parler())  # marche pour tous les animaux

faire_parler(Chien())  # Wouf
faire_parler(Chat())   # Miaou
```

### Le duck typing (Python)

> "Si ça marche comme un canard et coin-coin comme un canard, c'est un canard."

En Python, peu importe le type : tant que l'objet a la méthode demandée, ça fonctionne.

```python
class Robot:
    def parler(self):
        return "Bip bop"

faire_parler(Robot())  # Bip bop — pas besoin d'hériter d'Animal !
```

### Surcharge d'opérateurs

En Python, on peut redéfinir `+`, `-`, `==`, etc. via des méthodes spéciales (les **dunder methods**).

```python
class Vecteur:
    def __init__(self, x, y):
        self.x = x
        self.y = y

    def __add__(self, autre):
        return Vecteur(self.x + autre.x, self.y + autre.y)

    def __repr__(self):
        return f"Vecteur({self.x}, {self.y})"


v1 = Vecteur(1, 2)
v2 = Vecteur(3, 4)
print(v1 + v2)  # Vecteur(4, 6)
```

### 🎯 Exercice 4 — Formes géométriques

Crée :
- une classe `Forme` avec une méthode `aire()` qui retourne 0
- des classes `Cercle`, `Rectangle`, `Triangle` qui héritent et redéfinissent `aire()`
- une fonction `aire_totale(formes)` qui prend une liste et retourne la somme

<details>
<summary>✅ Solution</summary>

```python
import math

class Forme:
    def aire(self):
        return 0

class Cercle(Forme):
    def __init__(self, rayon):
        self.rayon = rayon
    def aire(self):
        return math.pi * self.rayon ** 2

class Rectangle(Forme):
    def __init__(self, largeur, hauteur):
        self.largeur = largeur
        self.hauteur = hauteur
    def aire(self):
        return self.largeur * self.hauteur

class Triangle(Forme):
    def __init__(self, base, hauteur):
        self.base = base
        self.hauteur = hauteur
    def aire(self):
        return (self.base * self.hauteur) / 2


def aire_totale(formes):
    return sum(f.aire() for f in formes)


formes = [Cercle(2), Rectangle(3, 4), Triangle(5, 6)]
print(aire_totale(formes))  # ≈ 12.566 + 12 + 15 = 39.56...
```

</details>

---

## 7. L'abstraction

### Idée fondamentale

**Définir CE QUE doit faire un objet, sans dire COMMENT.**

L'abstraction se traduit par les **classes abstraites** et les **interfaces**.

### Classes abstraites

Une classe abstraite **ne peut pas être instanciée directement**. Elle force ses enfants à implémenter certaines méthodes.

En Python, on utilise le module `abc` (Abstract Base Classes) :

```python
from abc import ABC, abstractmethod

class Forme(ABC):
    @abstractmethod
    def aire(self):
        pass  # méthode abstraite : doit être implémentée par les enfants

    @abstractmethod
    def perimetre(self):
        pass

    def description(self):  # méthode concrète : déjà implémentée
        return f"Aire: {self.aire()}, Périmètre: {self.perimetre()}"


class Carre(Forme):
    def __init__(self, cote):
        self.cote = cote

    def aire(self):
        return self.cote ** 2

    def perimetre(self):
        return self.cote * 4


# forme = Forme()  # ❌ TypeError : on ne peut pas instancier une classe abstraite
c = Carre(5)
print(c.description())  # Aire: 25, Périmètre: 20
```

### Différence classe abstraite vs interface

- **Classe abstraite** : peut avoir des méthodes implémentées + des attributs
- **Interface** : que des signatures de méthodes (un "contrat" pur)

> En Java/C#, ce sont deux concepts distincts. En Python, on simule les interfaces avec des classes abstraites n'ayant que des `@abstractmethod`.

### Pourquoi l'abstraction ?

1. **Force un contrat** : tout `Forme` DOIT avoir `aire()` et `perimetre()`
2. **Documente** : la classe abstraite explique ce qu'on attend
3. **Évite les oublis** : si un enfant oublie d'implémenter, erreur immédiate

### 🎯 Exercice 5 — Système de paiement

Crée une classe abstraite `MoyenPaiement` avec une méthode abstraite `payer(montant)`. Crée trois implémentations : `CarteBancaire`, `Paypal`, `Especes`. Chacune affiche un message différent.

<details>
<summary>✅ Solution</summary>

```python
from abc import ABC, abstractmethod

class MoyenPaiement(ABC):
    @abstractmethod
    def payer(self, montant):
        pass

class CarteBancaire(MoyenPaiement):
    def __init__(self, numero):
        self.numero = numero
    def payer(self, montant):
        print(f"Paiement de {montant}€ par CB {self.numero[-4:]}")

class Paypal(MoyenPaiement):
    def __init__(self, email):
        self.email = email
    def payer(self, montant):
        print(f"Paiement de {montant}€ via Paypal ({self.email})")

class Especes(MoyenPaiement):
    def payer(self, montant):
        print(f"Paiement de {montant}€ en espèces")


paiements = [
    CarteBancaire("1234567890123456"),
    Paypal("alice@mail.com"),
    Especes()
]

for p in paiements:
    p.payer(50)
```

</details>

---

## 8. Composition vs Héritage

C'est un point crucial souvent mal compris.

### Le problème de l'héritage abusif

Tendance débutante : "j'ai besoin de X dans ma classe → j'hérite de X".

❌ Faux ! L'héritage exprime un **"est un"**.

- Une voiture **a un** moteur → composition
- Une voiture **est un** véhicule → héritage

### Composition

La composition consiste à inclure un objet d'une autre classe **comme attribut**.

```python
class Moteur:
    def __init__(self, puissance):
        self.puissance = puissance

    def demarrer(self):
        print(f"Moteur de {self.puissance}ch démarre")


class Voiture:
    def __init__(self, marque, puissance_moteur):
        self.marque = marque
        self.moteur = Moteur(puissance_moteur)  # composition

    def demarrer(self):
        self.moteur.demarrer()
        print(f"{self.marque} en route !")


v = Voiture("Tesla", 350)
v.demarrer()
```

### Quand utiliser quoi ?

| Situation | Utilise |
|-----------|---------|
| "X est un Y" (Chien est un Animal) | Héritage |
| "X a un Y" (Voiture a un Moteur) | Composition |
| "X joue un rôle Y" | Composition + interface |

> **Règle d'or** : *"Favoriser la composition à l'héritage."*  
> L'héritage couple fortement les classes ; la composition est plus flexible.

### Exemple où composition >>> héritage

❌ Mauvaise idée :
```python
class Voiture(Moteur):  # une voiture EST un moteur ? Non !
    pass
```

✅ Bonne idée :
```python
class Voiture:
    def __init__(self):
        self.moteur = Moteur(...)  # une voiture A un moteur
```

Avantage : tu peux **changer de moteur** dynamiquement (électrique, thermique...) sans toucher à `Voiture`.

### 🎯 Exercice 6 — Ordinateur

Modélise un `Ordinateur` composé d'un `Processeur`, d'une `MemoireRAM` et d'un `DisqueDur`. Chaque composant a sa classe. L'ordinateur a une méthode `infos()` qui affiche les caractéristiques de chaque composant.

<details>
<summary>✅ Solution</summary>

```python
class Processeur:
    def __init__(self, modele, frequence):
        self.modele = modele
        self.frequence = frequence
    def infos(self):
        return f"CPU {self.modele} @ {self.frequence} GHz"

class MemoireRAM:
    def __init__(self, taille_go):
        self.taille_go = taille_go
    def infos(self):
        return f"RAM {self.taille_go} Go"

class DisqueDur:
    def __init__(self, taille_go, type_disque):
        self.taille_go = taille_go
        self.type_disque = type_disque
    def infos(self):
        return f"{self.type_disque} {self.taille_go} Go"

class Ordinateur:
    def __init__(self, cpu, ram, disque):
        self.cpu = cpu
        self.ram = ram
        self.disque = disque
    def infos(self):
        print(self.cpu.infos())
        print(self.ram.infos())
        print(self.disque.infos())


pc = Ordinateur(
    Processeur("Intel i7", 3.6),
    MemoireRAM(16),
    DisqueDur(512, "SSD")
)
pc.infos()
```

</details>

---

## 9. Concepts avancés

### 9.1 Méthodes de classe et méthodes statiques

```python
class Compteur:
    total = 0  # attribut de classe

    def __init__(self):
        Compteur.total += 1

    @classmethod
    def get_total(cls):           # méthode de classe (reçoit cls)
        return cls.total

    @staticmethod
    def info():                   # méthode statique (rien d'auto)
        return "Une classe Compteur"


Compteur(); Compteur(); Compteur()
print(Compteur.get_total())  # 3
print(Compteur.info())       # Une classe Compteur
```

| Type | 1er argument | Accès aux attributs ? |
|------|--------------|----------------------|
| Méthode normale | `self` | oui (instance) |
| `@classmethod` | `cls` | classe seulement |
| `@staticmethod` | rien | non |

**Cas d'usage classique des classmethods** : les **constructeurs alternatifs**.

```python
class Date:
    def __init__(self, jour, mois, annee):
        self.jour = jour
        self.mois = mois
        self.annee = annee

    @classmethod
    def from_string(cls, date_str):
        j, m, a = map(int, date_str.split("/"))
        return cls(j, m, a)


d = Date.from_string("28/04/2026")
```

### 9.2 Méthodes spéciales (dunder methods)

Les "double-underscore methods" permettent à tes objets de se comporter comme des objets natifs.

| Méthode | Sert à... |
|---------|-----------|
| `__init__` | Constructeur |
| `__str__` | `str(obj)`, `print(obj)` (lisible) |
| `__repr__` | Représentation (debug) |
| `__eq__` | `obj1 == obj2` |
| `__lt__`, `__le__`, etc. | comparaisons |
| `__add__`, `__sub__`, etc. | opérateurs |
| `__len__` | `len(obj)` |
| `__getitem__` | `obj[i]` |
| `__iter__` | itération `for x in obj` |
| `__call__` | `obj()` (objet appelable) |

```python
class Point:
    def __init__(self, x, y):
        self.x, self.y = x, y

    def __str__(self):
        return f"({self.x}, {self.y})"

    def __eq__(self, autre):
        return self.x == autre.x and self.y == autre.y

    def __add__(self, autre):
        return Point(self.x + autre.x, self.y + autre.y)


p1 = Point(1, 2)
p2 = Point(1, 2)
print(p1 == p2)       # True
print(p1 + p2)        # (2, 4)
```

### 9.3 Variables de classe vs piège mutable

⚠️ Attention au piège classique :

```python
class Personne:
    amis = []  # ⚠️ partagé par TOUTES les instances

    def __init__(self, nom):
        self.nom = nom

a = Personne("Alice")
b = Personne("Bob")
a.amis.append("Charlie")
print(b.amis)  # ['Charlie'] 😱
```

✅ Solution : initialiser dans `__init__` :

```python
class Personne:
    def __init__(self, nom):
        self.nom = nom
        self.amis = []  # propre à chaque instance
```

### 9.4 `isinstance` et `issubclass`

```python
isinstance(rex, Chien)      # True
isinstance(rex, Animal)     # True (héritage)
issubclass(Chien, Animal)   # True
```

Utile pour vérifier des types avant un traitement.

---

## 10. Les principes SOLID

5 principes incontournables pour une POO propre. Acronyme : **S**, **O**, **L**, **I**, **D**.

### S — Single Responsibility (Responsabilité unique)

> Une classe ne doit avoir qu'**une seule raison de changer**.

❌ Mauvais :
```python
class Utilisateur:
    def __init__(self, nom): ...
    def envoyer_email(self): ...        # rôle email
    def sauvegarder_en_bdd(self): ...   # rôle persistance
    def calculer_age(self): ...         # rôle métier
```

✅ Mieux : une classe par responsabilité.
```python
class Utilisateur: ...
class EmailService: ...
class UtilisateurRepository: ...
```

### O — Open/Closed (Ouvert/Fermé)

> Une classe doit être **ouverte à l'extension** mais **fermée à la modification**.

On doit pouvoir ajouter du comportement **sans modifier le code existant**, en ajoutant de nouvelles classes.

❌ Mauvais (chaque nouvelle forme = modification) :
```python
def aire(forme):
    if forme.type == "cercle":
        return math.pi * forme.r ** 2
    elif forme.type == "carre":
        return forme.cote ** 2
    # ajout d'une forme = modifier cette fonction
```

✅ Mieux (polymorphisme) :
```python
class Forme(ABC):
    @abstractmethod
    def aire(self): pass

# Ajouter une forme = créer une nouvelle classe, sans rien modifier
```

### L — Liskov Substitution (Substitution de Liskov)

> Une instance d'une classe enfant doit pouvoir **remplacer** une instance de la classe parente sans casser le programme.

Si tu as `def f(animal: Animal)` et que tu passes un `Chien`, tout doit marcher.

❌ Violation classique :
```python
class Oiseau:
    def voler(self): ...

class Pingouin(Oiseau):
    def voler(self):
        raise Exception("Je ne vole pas !")  # ❌ casse Liskov
```

→ Mauvaise modélisation. Il faudrait séparer `Oiseau` et `OiseauVolant`.

### I — Interface Segregation (Ségrégation des interfaces)

> Mieux vaut **plusieurs petites interfaces spécifiques** qu'une grosse fourre-tout.

❌ Mauvais : une interface `Travailleur` avec `coder()`, `dessiner()`, `chanter()` → tout le monde doit tout implémenter.

✅ Mieux : trois interfaces `Codeur`, `Dessinateur`, `Chanteur` ; chaque classe implémente celles qui la concernent.

### D — Dependency Inversion (Inversion des dépendances)

> Dépend des **abstractions**, pas des **implémentations concrètes**.

❌ Mauvais :
```python
class App:
    def __init__(self):
        self.bdd = MySQL()  # couplage fort à MySQL
```

✅ Mieux :
```python
class App:
    def __init__(self, bdd: BaseDeDonnees):  # abstraction
        self.bdd = bdd

# On peut injecter MySQL, PostgreSQL, ou un mock pour les tests
app = App(MySQL())
app = App(PostgreSQL())
```

C'est ce qu'on appelle l'**injection de dépendances**.

---

## 11. Exercices récapitulatifs

### 🎯 Exercice 7 — Système de bibliothèque (synthèse)

Conception complète d'un mini-système.

**Cahier des charges** :

1. Une classe abstraite `ItemMediatheque` avec :
   - attributs `titre`, `id`
   - méthode abstraite `description()`
2. Trois classes concrètes : `Livre`, `DVD`, `JeuVideo`, chacune avec ses spécificités (auteur, durée, plateforme...).
3. Une classe `Emprunt` (composition) qui lie un `Utilisateur` à un `ItemMediatheque` avec une date.
4. Une classe `Mediatheque` qui contient une liste d'items et d'emprunts, avec des méthodes `ajouter_item`, `emprunter`, `rendre`, `lister_emprunts`.
5. Encapsulation : la liste interne ne doit pas être modifiable directement.

<details>
<summary>✅ Solution</summary>

```python
from abc import ABC, abstractmethod
from datetime import date

class ItemMediatheque(ABC):
    def __init__(self, id, titre):
        self.id = id
        self.titre = titre
        self._disponible = True

    @abstractmethod
    def description(self):
        pass

    @property
    def disponible(self):
        return self._disponible


class Livre(ItemMediatheque):
    def __init__(self, id, titre, auteur):
        super().__init__(id, titre)
        self.auteur = auteur
    def description(self):
        return f"[Livre] {self.titre} - {self.auteur}"


class DVD(ItemMediatheque):
    def __init__(self, id, titre, duree):
        super().__init__(id, titre)
        self.duree = duree
    def description(self):
        return f"[DVD] {self.titre} ({self.duree} min)"


class JeuVideo(ItemMediatheque):
    def __init__(self, id, titre, plateforme):
        super().__init__(id, titre)
        self.plateforme = plateforme
    def description(self):
        return f"[Jeu] {self.titre} - {self.plateforme}"


class Utilisateur:
    def __init__(self, nom):
        self.nom = nom


class Emprunt:
    def __init__(self, utilisateur, item):
        self.utilisateur = utilisateur
        self.item = item
        self.date = date.today()


class Mediatheque:
    def __init__(self):
        self.__items = []
        self.__emprunts = []

    def ajouter_item(self, item):
        self.__items.append(item)

    def emprunter(self, utilisateur, item_id):
        for item in self.__items:
            if item.id == item_id and item.disponible:
                item._disponible = False
                emprunt = Emprunt(utilisateur, item)
                self.__emprunts.append(emprunt)
                return emprunt
        raise ValueError("Item indisponible ou inexistant")

    def rendre(self, item_id):
        for emprunt in self.__emprunts:
            if emprunt.item.id == item_id:
                emprunt.item._disponible = True
                self.__emprunts.remove(emprunt)
                return
        raise ValueError("Aucun emprunt trouvé")

    def lister_emprunts(self):
        for e in self.__emprunts:
            print(f"{e.utilisateur.nom} a emprunté {e.item.description()} le {e.date}")


# Test
m = Mediatheque()
m.ajouter_item(Livre(1, "1984", "Orwell"))
m.ajouter_item(DVD(2, "Inception", 148))
m.ajouter_item(JeuVideo(3, "Zelda BOTW", "Switch"))

alice = Utilisateur("Alice")
m.emprunter(alice, 1)
m.emprunter(alice, 3)
m.lister_emprunts()
m.rendre(1)
m.lister_emprunts()
```

</details>

---

### 🎯 Exercice 8 — Combat RPG (polymorphisme + héritage)

Crée un mini-système de combat :

1. Classe abstraite `Personnage` : `nom`, `pv`, méthodes `attaquer(cible)`, `subir_degats(montant)`, `est_vivant()`.
2. Classes `Guerrier` (force +5 dmg), `Mage` (sort, dmg variable), `Archer` (chance de critique).
3. Une fonction `combat(p1, p2)` qui les fait s'affronter au tour par tour jusqu'à K.O.

<details>
<summary>✅ Solution</summary>

```python
from abc import ABC, abstractmethod
import random

class Personnage(ABC):
    def __init__(self, nom, pv):
        self.nom = nom
        self.pv = pv

    @abstractmethod
    def attaquer(self, cible):
        pass

    def subir_degats(self, montant):
        self.pv = max(0, self.pv - montant)

    def est_vivant(self):
        return self.pv > 0


class Guerrier(Personnage):
    def attaquer(self, cible):
        degats = 10 + 5
        print(f"{self.nom} frappe {cible.nom} pour {degats} dmg")
        cible.subir_degats(degats)


class Mage(Personnage):
    def attaquer(self, cible):
        degats = random.randint(5, 20)
        print(f"{self.nom} lance un sort sur {cible.nom} pour {degats} dmg")
        cible.subir_degats(degats)


class Archer(Personnage):
    def attaquer(self, cible):
        degats = 8
        if random.random() < 0.3:
            degats *= 2
            print(f"{self.nom} fait un CRITIQUE sur {cible.nom} pour {degats} dmg !")
        else:
            print(f"{self.nom} tire sur {cible.nom} pour {degats} dmg")
        cible.subir_degats(degats)


def combat(p1, p2):
    tour = 0
    while p1.est_vivant() and p2.est_vivant():
        tour += 1
        print(f"\n--- Tour {tour} ---")
        attaquant, defenseur = (p1, p2) if tour % 2 == 1 else (p2, p1)
        attaquant.attaquer(defenseur)
        print(f"{defenseur.nom}: {defenseur.pv} PV restants")
    gagnant = p1 if p1.est_vivant() else p2
    print(f"\n🏆 {gagnant.nom} remporte le combat !")


combat(Guerrier("Conan", 50), Mage("Gandalf", 40))
```

</details>

---

## 🧠 Récapitulatif visuel : à retenir absolument

```
┌─────────────────────────────────────────────────────────┐
│                      LA POO EN BREF                     │
├─────────────────────────────────────────────────────────┤
│ CLASSE = plan        OBJET = instance du plan           │
│ ATTRIBUT = donnée    MÉTHODE = action                   │
├─────────────────────────────────────────────────────────┤
│ 4 PILIERS                                               │
│  • Encapsulation : cacher l'interne (_, __, @property)  │
│  • Héritage : "est un" — class B(A) + super()           │
│  • Polymorphisme : même appel, comportements variés     │
│  • Abstraction : ABC + @abstractmethod                  │
├─────────────────────────────────────────────────────────┤
│ COMPOSITION ("a un") > HÉRITAGE ("est un")              │
├─────────────────────────────────────────────────────────┤
│ SOLID                                                   │
│  S  Single responsibility                               │
│  O  Open/Closed                                         │
│  L  Liskov substitution                                 │
│  I  Interface segregation                               │
│  D  Dependency inversion                                │
└─────────────────────────────────────────────────────────┘
```

### Pour devenir tac-au-tac en POO

1. **Pratique tous les jours** : reprends ces exos, modifie-les, casse-les.
2. **Modélise le réel** : prends un objet du quotidien (cafetière, smartphone, jeu...) et modélise-le.
3. **Lis du code** : étudie de petits projets open source en Python/Java.
4. **Applique SOLID** : à chaque classe, demande-toi "elle a une seule responsabilité ?"
5. **Refais sans regarder** : les exos 7 et 8 sont parfaits pour t'auto-évaluer.

Bon apprentissage ! 🚀