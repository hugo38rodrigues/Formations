from .abstract.Personnage import Personnage
import random

class Mage (Personnage):

    def __init__(self, nom , pv):
        super().__init__(nom, pv)
    
    def attaquer(self, cible):
        degats = random.randint(5,20)
        print(f"{self.nom} frappe {cible.nom} pour {degats} dmg")
        cible.subir_degats(degats)
