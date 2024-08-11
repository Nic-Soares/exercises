"""Functions used in preparing Guido's gorgeous lasagna.

Learn about Guido, the creator of the Python language:
https://en.wikipedia.org/wiki/Guido_van_Rossum

This is a module docstring, used to describe the functionality
of a module and its functions and/or classes.
"""


#TODO: define the 'EXPECTED_BAKE_TIME' constant.
EXPECTED_BAKE_TIME = 40  # ou qualquer valor que seja o esperado



#TODO: Remove 'pass' and complete the 'bake_time_remaining()' function below.
def bake_time_remaining(elapsed_bake_time):
    """Calculate the bake time remaining.

    :param elapsed_bake_time: int - baking time already elapsed.
    :return: int - remaining bake time (in minutes) derived from 'EXPECTED_BAKE_TIME'.

    Function that takes the actual minutes the lasagna has been in the oven as
    an argument and returns how many minutes the lasagna still needs to bake
    based on the `EXPECTED_BAKE_TIME`.
    """
    return EXPECTED_BAKE_TIME - elapsed_bake_time


#TODO: Define the 'preparation_time_in_minutes()' function below.
# You might also consider using 'PREPARATION_TIME' here, if you have it defined.

def preparation_time_in_minutes(layers):
    """Calculate the preparation time.

    :param layers: int - number of layers of lasagna.
    :return: int - preparation time (in minutes) derived from number of layers.

    Function that takes the number of layers of the lasagna as
    an argument and returns the preparation time based on 2 minutes per layer.
    """
    return layers * 2




#TODO: define the 'elapsed_time_in_minutes()' function below.
# Remember to add a docstring (you can copy and then alter the one from bake_time_remaining.)

# Função para calcular o tempo total gasto (preparação + cozimento)
def elapsed_time_in_minutes(layers, elapsed_bake_time):
    """Calculate the total elapsed time.

    :param layers: int - number of layers of lasagna.
    :param elapsed_bake_time: int - baking time already elapsed.
    :return: int - total time (in minutes) spent on preparation and baking.

    Function that takes the number of layers of the lasagna and the actual minutes the lasagna has been in the oven as
    arguments and returns the total time spent on preparation and baking.
    """
    return preparation_time_in_minutes(layers) + elapsed_bake_time
