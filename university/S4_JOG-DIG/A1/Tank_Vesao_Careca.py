import random


class Tanque(object):
    def __init__(self, name):
        self.name = name
        self.alive=True
        self.ammo=5
        self.armor=60

    def __str__(self):
        if self.alive:
            return "%s (%i armor, %i shells)" % (self.name, self.armor, self.ammo)
        else:
            return "%s (DEADE)" % self.name

    def fire_at(self, enemy):
        if self.ammo >=1:
            self.ammo -=1
            print(self.name, "fires on", enemy.name)
            enemy.hit()
        else:
            print(self.name, "has no shells!")

    def hit(self):
        self.armor -=20
        print(self.name, "is hit")
        if self.armor <=0:
            self.explode()

    def explode(self):
        self.alive = False
        print(self.name, "explodes!")



def criar_tanques():
    while True:
        try:
            num_tanques = int(input("Quantos tanques você deseja criar (entre 2 e 10)? "))
            if 2 <= num_tanques <= 10:
                break
            else:
                print("Por favor, insira um número entre 2 e 10.")
        except ValueError:
            print("Por favor, insira um número válido.")

    tanques = {}
    for i in range(num_tanques):
        nome_tanque = input(f"Digite o nome para o tanque {i + 1}: ")
        chave = chr(97 + i)  # 97 é o ASCII para 'a'
        tanques[chave] = Tanque(nome_tanque)

    return tanques


def loop_jogo(tanques):
    tanques_vivos = list(tanques.keys())

    while len(tanques_vivos) > 1:
        atirador_chave = random.choice(tanques_vivos)
        print(f"\nVez do {tanques[atirador_chave].name}!")

        print("Escolha um tanque para atirar:")
        for chave in tanques_vivos:
            if chave != atirador_chave:
                print(f"{chave}: {tanques[chave]}")

        while True:
            chave_alvo = input("Digite a letra do tanque que você deseja atirar: ")
            if chave_alvo in tanques_vivos and chave_alvo != atirador_chave:
                break
            else:
                print("Escolha inválida. Escolha um tanque válido.")

        tanques[atirador_chave].fire_at(tanques[chave_alvo])

        if not tanques[chave_alvo].alive:
            tanques_vivos.remove(chave_alvo)

        print("\nStatus após esta rodada:")
        for chave in tanques_vivos:
            print(tanques[chave])

    print(f"\n{tanques[tanques_vivos[0]].name} é o vencedor!")


def principal():
    tanques = criar_tanques()
    loop_jogo(tanques)


if __name__ == "__main__":
    principal()
