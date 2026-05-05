from abstract.ItemMediatheque  import ItemMediatheque

class DVD(ItemMediatheque):
    def __init__(self, id, titre, duree):
        super().__init__(id, titre)
        self.duree = duree
    def description(self):
        return f"[DVD] {self.titre} ({self.duree} min)"