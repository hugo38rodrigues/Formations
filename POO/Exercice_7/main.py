from classes import Emprunt
from classes import User
from classes import Livre
from classes import DVD
from classes import JeuVideo

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
            print(f"{e.user.nom} a emprunté {e.item.description()} le {e.date}")

if __name__ == '__main__':
    m = Mediatheque()
    m.ajouter_item(Livre(1, "1984", "Orwell"))
    m.ajouter_item(DVD(2, "Inception", 148))
    m.ajouter_item(JeuVideo(3, "Zelda BOTW", "Switch"))

    alice = User("Alice")
    m.emprunter(alice, 1)
    m.emprunter(alice, 3)
    m.lister_emprunts()
    m.rendre(1)
    m.lister_emprunts()