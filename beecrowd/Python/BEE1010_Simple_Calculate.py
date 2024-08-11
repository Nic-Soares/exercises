'''
In this problem, the task is to read a code of a product 1, the number of units of product 1, the price for one unit of product 1, the code of a product 2, the number of units of product 2 and the price for one unit of product 2. After this, calculate and show the amount to be paid.

Input
The input file contains two lines of data. In each line there will be 3 values: two integers and a floating value with 2 digits after the decimal point.

Output
The output file must be a message like the following example where "Valor a pagar" means Value to Pay. Remember the space after ":" and after "R$" symbol. The value must be presented with 2 digits after the point.
'''


def simple_calculate_product(lines):
    total = 0
    for line in lines:
        code, units, price = line.split()
        units = int(units)
        price = float(price)
        total += units * price
    print(f"VALOR A PAGAR: {total:.2f}")

# Solicita a entrada do usuário
input_data = []
for _ in range(2):
    line = input()
    input_data.append(line)

# Chama a função com os valores obtidos
simple_calculate_product(input_data)

