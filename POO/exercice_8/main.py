from classes import Guerrier
from classes import Mage
from classes import Archer
if __name__ == '__main__':
    def combat(p1,p2):
        tour = 0
        while p1.est_vivant() and p2.est_vivant():
            tour+=1
            print(f"\n--- Tour {tour} ---")
            attaquant, defenseur = (p1, p2) if tour % 2 == 1 else (p2, p1)
            attaquant.attaquer(defenseur)
            print(f"{defenseur.nom}: {defenseur.pv} PV restants")
        gagnant = p1 if p1.est_vivant() else p2
        print(f"\n🏆 {gagnant.nom} remporte le combat !")

combat(Guerrier("Conan", 50), Archer("Legolas", 40))