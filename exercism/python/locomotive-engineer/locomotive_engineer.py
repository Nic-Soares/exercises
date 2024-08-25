"""Functions which helps the locomotive engineer to keep track of the train."""


def get_list_of_wagons(*wagons):
    """Return a list of wagons.

    :param: arbitrary number of wagons.
    :return: list - list of wagons.
    """
    return list(wagons)


def fix_list_of_wagons(each_wagons_id, missing_wagons):
    """Fix the list of wagons.

    :param each_wagons_id: list - the list of wagons.
    :param missing_wagons: list - the list of missing wagons.
    :return: list - list of wagons.
    """
    # Passo 1: Mover os dois primeiros vagões para o final da lista
    wagons_to_move = each_wagons_id[:2]
    remaining_wagons = each_wagons_id[2:]

    # Passo 2: Encontrar a posição da locomotiva (ID 1)
    loco_index = remaining_wagons.index(1)

    # Passo 3: Inserir os IDs dos vagões ausentes após a locomotiva
    corrected_list = (
            remaining_wagons[:loco_index + 1] +
            missing_wagons +
            remaining_wagons[loco_index + 1:]
    )

    # Passo 4: Adicionar os vagões movidos ao final da lista corrigida
    corrected_list += wagons_to_move

    return corrected_list


def add_missing_stops(route, *args, **kwargs):
    """Add missing stops to route dict.

    :param route: dict - the dict of routing information.
    :param: arbitrary number of stops.
    :return: dict - updated route dictionary.
    """
    # Inicializa uma lista vazia para as paradas
    stops = []

    # Desempacota as paradas fornecidas em args
    for arg in args:
        if isinstance(arg, dict):
            # Ordena as chaves das paradas e adiciona os valores à lista de paradas
            for key in sorted(arg):
                stops.append(arg[key])

    # Desempacota as paradas fornecidas em kwargs
    for key in sorted(kwargs):
        stops.append(kwargs[key])

    # Adiciona a lista de paradas ao dicionário de rota
    route['stops'] = stops
    return route


def extend_route_information(route, more_route_information):
    """Extend route information with more_route_information.

    :param route: dict - the route information.
    :param more_route_information: dict -  extra route information.
    :return: dict - extended route information.
    """
    extended_route = {**route, **more_route_information}
    return extended_route


def fix_wagon_depot(wagons_rows):
    """Fix the list of rows of wagons.

    :param wagons_rows: list[list[tuple]] - the list of rows of wagons.
    :return: list[list[tuple]] - list of rows of wagons.
    """
    # Desempacota as linhas de vagões
    row1, row2, row3 = wagons_rows

    # Reorganiza os vagões usando zip para transpor as linhas
    fixed_rows = list(map(list, zip(row1, row2, row3)))

    return fixed_rows
