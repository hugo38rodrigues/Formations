from datetime import date

class Emprunt:
    def __init__(self, user, item):
        self.date = date.today()
        self.user = user
        self.item = item
