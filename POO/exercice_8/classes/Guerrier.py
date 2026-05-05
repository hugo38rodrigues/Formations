from .abstract.Personnage import Personnage
class Guerrier (Personnage):

    def __init__(self, nom , pv):
        super().__init__(nom, pv)

    
    def attaquer(self, cible):
        degats = 10 + 5
        print(f"{self.nom} frappe {cible.nom} pour {degats} dmg")
        cible.subir_degats(degats)
