"""Funções para rastrear mãos de pôquer e tarefas diversas de cartas.

Documentação da lista Python: https://docs.python.org/3/tutorial/datastructures.html
"""

def get_rounds(number):
    """Cria uma lista contendo o número da rodada atual e os dois próximos números de rodada.

    :param number: int - número da rodada atual.
    :return: list - rodada atual e as duas seguintes.
    """
    return [number, number + 1, number + 2]

def concatenate_rounds(rounds_1, rounds_2):
    """Concatena duas listas de números de rodadas.

    :param rounds_1: list - primeiras rodadas jogadas.
    :param rounds_2: list - segundo conjunto de rodadas jogadas.
    :return: list - todas as rodadas jogadas.
    """
    return rounds_1 + rounds_2

def list_contains_round(rounds, number):
    """Verifica se a lista de rodadas contém o número especificado.

    :param rounds: list - rodadas jogadas.
    :param number: int - número da rodada.
    :return: bool - a rodada foi jogada?
    """
    return number in rounds

def card_average(hand):
    """Calcula e retorna o valor médio das cartas na lista.

    :param hand: list - cartas na mão.
    :return: float - valor médio das cartas na mão.
    """
    return sum(hand) / len(hand)

def approx_average_is_average(hand):
    """Retorna se a média do primeiro e último valor das cartas OU a mediana das cartas é igual à média calculada.

    :param hand: list - cartas na mão.
    :return: bool - uma das médias aproximadas é igual à `média verdadeira`?
    """
    if not hand:
        return False
    avg_all = sum(hand) / len(hand)
    avg_first_last = (hand[0] + hand[-1]) / 2
    median = hand[len(hand) // 2]
    return avg_all in {avg_first_last, median}

def average_even_is_average_odd(hand):
    """Retorna se a média dos valores das cartas de índice par é igual à média dos valores das cartas de índice ímpar.

    :param hand: list - cartas na mão.
    :return: bool - as médias de pares e ímpares são iguais?
    """
    even_positions = [hand[idx] for idx in range(0, len(hand), 2)]
    odd_positions = [hand[idx] for idx in range(1, len(hand), 2)]

    even_average = sum(even_positions) / len(even_positions) if even_positions else 0
    odd_average = sum(odd_positions) / len(odd_positions) if odd_positions else 0

    return even_average == odd_average

def maybe_double_last(hand):
    """Multiplica o valor da carta Valete (11) na última posição do índice por 2.

    :param hand: list - cartas na mão.
    :return: list - mão com os valores dos Valetes (se presentes) dobrados.
    """
    if not hand:
        return hand

    if hand[-1] == 11:
        hand[-1] *= 2

    return hand
