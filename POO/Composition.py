class Processeur:
    def __init__(self, marque, generation, frequence):
        self.marque = marque
        self.generation = generation
        self.frequence = frequence
    
    def description(self):
       return f'processeur {self.marque} de {self.generation} ieme génération avec une fréquence de {self.frequence} Ghz'

class MemoireRAM:
    def __init__(self, marque, generation, frequence):
        self.marque = marque
        self.generation = generation
        self.frequence = frequence
    
    def description(self):
        return f'RAM {self.marque} en {self.generation} de {self.frequence} Ghz'

class DisqueDur:
    def __init__(self, type, stockage):
        self.type = type
        self.stockage = stockage

    
    def description(self):
        return f'disque {self.type} avec {self.stockage} giga de stockage'




class Ordinateur:
    def __init__(self, cpu, ram , disque):
        self.cpu = cpu
        self.ram = ram
        self.disque = disque
    
    def info(self):
        print(f'Mon ordinateur est composé de : {self.cpu.description()} avec une {self.ram.description()} et avec un stockage {self.disque.description()}')

my_computeur = Ordinateur(Processeur("AMD",6, 7800), MemoireRAM("Crucial", "DDR5", 4800), DisqueDur("SSD", 2000))
my_computeur.info()