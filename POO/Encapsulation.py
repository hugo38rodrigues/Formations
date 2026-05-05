# Utilisation des attributs private
class Thermostat:
    temp: int

    def __init__(self):
        self.__temp = 20
    
    @property
    def temp(self):
       return self.__temp
    
    @temp.setter
    def temp(self, newTemp):
        if(newTemp<10 or newTemp>30):
            raise ValueError("La temperature doit etre comprise entre 10 et 30 degrés")
        self.__temp = newTemp

thermostat = Thermostat()
print(thermostat.temp)
thermostat.temp = 10
print(thermostat.temp)
