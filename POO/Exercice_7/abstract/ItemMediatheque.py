from abc import ABC, abstractmethod

class ItemMediatheque(ABC):
    def __init__(self, id, titre):
        self.titre = titre
        self.id = id
        self._disponible = True
    @abstractmethod
    
    def description():
        pass
    
    @property
    def disponible(self):
        return self._disponible