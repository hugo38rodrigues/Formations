from abstract.ItemMediatheque  import ItemMediatheque

class JeuVideo(ItemMediatheque):
    def __init__(self, id, titre, plateforme):
        super().__init__(id, titre)
        self.plateforme = plateforme
    def description(self):
        return f"[Jeu] {self.titre} - {self.plateforme}"