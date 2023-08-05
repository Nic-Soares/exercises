import random
import time

class Tank(object):
    def __init__(self, name):
        self.name = name
        self.alive = True
        self.ammo = 5  # Corrigindo o nome do atributo para "ammo"
        self.armor = 60

    def __str__(self):
        if self.alive:
            return "%s (%i armor, %i shells)" % (self.name, self.armor, self.ammo)
        else:
            return "%s (DEAD)" % self.name

    def fire_at(self, enemy):
        if self.ammo >= 1:
            self.ammo -= 1
            print(self.name, "fires on", enemy.name)
            enemy.hit()
        else:
            print(self.name, "has no shells!")

    def hit(self):
        self.armor -= 20
        print(self.name, "is hit")
        if self.armor <= 0:
            self.explode()

    def explode(self):
        self.alive = False
        print(self.name, "explodes!")

# 1) Crie cinco objetos do time Tanque e armazene-os em um array
tank_names = ["Tank1", "Tank2", "Tank3", "Tank4", "Tank5"]
tanks = [Tank(name) for name in tank_names]

# 2) Crie a simulação com as regras especificadas:
while len(tanks) > 1:
    # a. Sortear um número entre 0 e o tamanho do array de tanques
    attacker_index = random.randint(0, len(tanks) - 1)
    attacker = tanks[attacker_index]

    # Verificar se o tanque atacante ainda está vivo e tem munição
    if attacker.alive and attacker.ammo > 0:  # Corrigindo o nome do atributo para "ammo"
        targets = [i for i in range(len(tanks)) if i != attacker_index]
        target_index = random.choice(targets)
        target = tanks[target_index]

        # Ataque do tanque atirador no tanque alvo
        attacker.fire_at(target)

        # Se o tanque alvo explodir, remova-o do array de tanques
        if not target.alive:
            tanks.pop(target_index)
    else:
        # Caso contrário, selecione um novo tanque atacante
        continue

    # Adicione uma pequena pausa para melhorar a legibilidade da simulação
    time.sleep(2)

# O loop acima irá executar os ataques até que reste apenas um tanque.
# Após a execução, o último tanque sobrevivente estará no array 'tanks'.
print("O tanque sobrevivente é:", tanks[0].name)
