from abc import ABC, abstractmethod
class MoyenPaiement(ABC):

    @abstractmethod
    def payer(montant):
        pass 
class CarteBancaire(MoyenPaiement):
    def __init__(self, numero):
        self.numero = numero

    def payer(self, montant):
        print(f"Paiement de {montant}€ par CB {self.numero[-4:]}")

class Paypal(MoyenPaiement):
    def __init__(self, email):
        self.email = email
    def payer(self, montant):
        print(f"Paiement de {montant}€ via Paypal ({self.email})")

class Especes(MoyenPaiement):
    def payer(self, montant):
        print(f"Paiement de {montant}€ en espèces")


paiements = [
    CarteBancaire("1234567890123456"),
    Paypal("alice@mail.com"),
    Especes()
]

for p in paiements:
    p.payer(50)