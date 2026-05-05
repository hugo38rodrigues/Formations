# Héritage
class Véhicule:
    def __init__(self, marque, vitess_max):
        self.marque = marque
        self.vitesse_max = vitess_max
    
    def description(self):
        print(f'Voici un super véhicule de marque {self.marque}')

class Voiture(Véhicule):
    def __init__(self, marque, vitesse_max, nombres_portes):
        super().__init__(marque, vitesse_max)
        self.nombres_portes = nombres_portes
    
    def description(self):
        print(f'Voici une super voiture avec une vitesse de {self.vitesse_max}, de marque {self.marque} avec {self.nombres_portes} portes')


class Moto(Véhicule):
    def __init__(self, marque, vitesse_max, cylindree):
        super().__init__(marque, vitesse_max)
        self.cylindree = cylindree
    
    def description(self):
        print(f'Voici une super moto avec une vitesse de {self.vitesse_max}, de marque {self.marque} avec {self.cylindree} cylindrée')


voiture = Voiture("Hyundai", 150, 6)
moto = Moto("Ferrari", 450, 120)

print(voiture.description())
print(moto.description())