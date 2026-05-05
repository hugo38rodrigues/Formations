import math

class Forme:

    def aire():
        return 0
    
class Cercle (Forme): 
    
    def __init__(self,rayon):
        self.rayon = rayon
          
    def aire(self):
        return math.pi * self.rayon **2
    
class Rectangle: 
    
    def __init__(self, longueur, largeur):
       self.longueur = longueur
       self.largeur = largeur
    
    def aire(self):
        return self.longueur * self.largeur
    
class Triangle: 
    
    def __init__(self, longueur, hauteur):
        self.longueur = longueur
        self.hauteur = hauteur
    
    def aire(self):
        return (self.longueur * self.hauteur)/2

formes = [Cercle(2), Rectangle(3,4), Triangle(5,6)]   

def air_total(formes):
    return sum(f.aire()for f in formes)


print(air_total(formes))