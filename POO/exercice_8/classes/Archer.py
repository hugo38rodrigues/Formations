from .abstract.Personnage import Personnage
import random

class Archer (Personnage):

    def __init__(self, nom , pv):
        super().__init__(nom, pv)
    
    def attaquer(self, cible):
        degats = 8
        if random.random() < 0.3:
            degats *= 2
            print(f"{self.nom} fait un CRITIQUE sur {cible.nom} pour {degats} dmg !")
        else:
            print(f"{self.nom} frappe {cible.nom} pour {degats} dmg")
            cible.subir_degats(degats)
