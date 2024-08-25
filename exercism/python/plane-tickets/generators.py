"""Functions to automate Conda airlines ticketing system."""


def generate_seat_letters(number):
    """Generate a series of letters for airline seats.

    :param number: int - total number of seat letters to be generated.
    :return: generator - generator that yields seat letters.

    Seat letters are generated from A to D.
    After D it should start again with A.

    Example: A, B, C, D

    """

    letters = ['A', 'B', 'C', 'D']
    for seat in range(number):
        yield letters[seat % 4]


def generate_seats(number):
    """Generate a series of identifiers for airline seats.

    :param number: int - total number of seats to be generated.
    :return: generator - generator that yields seat numbers.

    A seat number consists of the row number and the seat letter.

    There is no row 13.
    Each row has 4 seats.

    Seats should be sorted from low to high.

    Example: 3C, 3D, 4A, 4B

    """

    row = 1
    seat_letters = generate_seat_letters(4)
    for _ in range(number):
        seat_letter = next(seat_letters)
        seat_number = f"{row}{seat_letter}"
        yield seat_number
        if seat_letter == 'D':
            row += 1
            if row == 13:
                row += 1
            seat_letters = generate_seat_letters(4)

def assign_seats(passengers):
    """Assign seats to passengers.

    :param passengers: list[str] - a list of strings containing names of passengers.
    :return: dict - with the names of the passengers as keys and seat numbers as values.

    Example output: {"Adele": "1A", "Björk": "1B"}

    """

    # Obtém o número de passageiros
    number = len(passengers)

    # Cria um dicionário vazio para armazenar as atribuições de assento
    assigned = {}

    # Itera simultaneamente sobre os passageiros e os números de assentos gerados
    for passenger, seat_number in zip(passengers, generate_seats(number)):
        # Atribui o número do assento ao passageiro correspondente no dicionário
        assigned[passenger] = seat_number

    # Retorna o dicionário com os passageiros e seus respectivos assentos
    return assigned

def generate_codes(seat_numbers, flight_id):
    """Generate codes for a ticket.

    :param seat_numbers: list[str] - list of seat numbers.
    :param flight_id: str - string containing the flight identifier.
    :return: generator - generator that yields 12 character long ticket codes.

    """

    for seat_number in seat_numbers:
        code = f"{seat_number}{flight_id}"
        code = f"{code:0<12}"
        yield code
