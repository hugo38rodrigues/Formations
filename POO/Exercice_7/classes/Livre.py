from abstract.ItemMediatheque  import ItemMediatheque

class Livre(ItemMediatheque):
    def __init__(self, id, titre, auteur):
        super().__init__(id, titre)
        self.auteur = auteur
    def description(self):
        return f"[Livre] {self.titre} - {self.auteur}"
