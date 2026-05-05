from abc import ABC, abstractmethod
class Personnage:

    def __init__(self, nom, pv):
        self.nom = nom
        self.pv = pv
    
    @abstractmethod
    def attaquer(self, cible):
        pass

    @abstractmethod
    def subir_degats(self, montant):
        self.pv = max(0, self.pv - montant)

    def est_vivant(self):
        return self.pv > 0 
