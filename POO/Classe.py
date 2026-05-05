# Classe clasique
class Livre:
    def __init__(self, titre, auteur, nombre_pages):
      self.titre = titre
      self.auteur = auteur
      self.nombre_pages = nombre_pages
      self.pages_lues = 0
    
    def est_termine(self):
       if (self.nombre_pages == self.pages_lues):
          return True
       else:
          return False
       
    def lire(self, nb_pages):
        isDone = self.est_termine()
        if (isDone):
           print("Livre déjà terminé")
           pass
        else:
          self.pages_lues = min(self.pages_lues + nb_pages, self.nombre_pages)
          pass
    
    def progression(self):
        return (self.pages_lues/self.nombre_pages) * 100

    

livre = Livre("Le livre de ma vie", "Moi", 300)
livre.lire(150)
print(livre.progression())