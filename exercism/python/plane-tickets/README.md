Claro! Aqui está a tradução para o português:

---

# Passagens Aéreas

Bem-vindo ao exercício de Passagens Aéreas na Trilha de Python do Exercism.
Se precisar de ajuda para rodar os testes ou enviar seu código, confira `HELP.md`.
Se ficar preso no exercício, consulte `HINTS.md`, mas tente resolver por conta própria primeiro :)

## Introdução

Um `generator` é uma função ou expressão que retorna um tipo especial de [iterator][iterator] chamado [generator iterator][generator-iterator].
`Generator-iterators` são [lazy][lazy iterator]: eles não armazenam seus `values` na memória, mas _geram_ seus valores quando necessário.

Uma função geradora parece como qualquer outra função, mas contém uma ou mais [yield expressions][yield expression].
Cada `yield` suspende a execução do código, salvando o estado de execução atual (_incluindo todas as variáveis locais e instruções de try_).
Quando o gerador é retomado, ele retoma o estado da suspensão - ao contrário das funções regulares que são reiniciadas a cada chamada.

## Construindo um gerador

Geradores são construídos de forma semelhante a outras funções de loop ou recursivas, mas exigem uma [expressão `yield`](#the-yield-expression), que exploraremos em detalhes um pouco mais adiante.

Um exemplo é uma função que retorna os _quadrados_ de uma lista de números fornecida.
Como está escrito atualmente, toda a entrada deve ser processada antes que quaisquer valores possam ser retornados:

```python
>>> def squares(list_of_numbers):
...     squares = []
...     for number in list_of_numbers:
...         squares.append(number ** 2)
...     return squares
```

Você pode converter essa função em um gerador assim:

```python
>>> def squares_generator(list_of_numbers):
...     for number in list_of_numbers:
...         yield number ** 2
```

A razão por trás disso é que você usa um gerador quando não precisa produzir todos os valores _de uma vez_.
Isso economiza memória e poder de processamento, já que apenas o valor com o qual você está _trabalhando atualmente_ é calculado.

## Usando um gerador

Geradores podem ser usados no lugar da maioria dos `iterables` em Python.
Isso inclui _funções_ ou _objetos_ que requerem um `iterable`/`iterator` como argumento.

Para usar o gerador `squares_generator()`:

```python
>>> squared_numbers = squares_generator([1, 2, 3, 4])

>>> for square in squared_numbers:
...     print(square)
...
1
4
9
16
```

Valores dentro de um `generator` também podem ser produzidos/acessados através da função `next()`.
`next()` chama o método `__next__()` de um objeto generator-iterator, "avançando" ou avaliando o código até sua expressão `yield`, que então "rende" ou retorna um valor:

```python
>>> squared_numbers = squares_generator([1, 2])

>>> next(squared_numbers)
1
>>> next(squared_numbers)
4
```

Quando um `generator-iterator` é totalmente consumido e não tem mais valores para retornar, ele lança um erro `StopIteration`.

```python
>>> next(squared_numbers)
Traceback (most recent call last):
  File "<stdin>", line 1, in <module>
StopIteration
```

~~~~exercism/note

Generator-iterators são um subconjunto especial de [iterators][iterator].
`Iterators` são o mecanismo/protocolo que permite iterar sobre _iterables_.
Generator-iterators e os iterators retornados por [iterables][iterables] comuns do Python agem de maneira muito semelhante, mas há algumas diferenças importantes a serem observadas:

- Eles são _[lazily evaluated][lazy evaluation]_; a iteração é _unidirecional_ e não há "retorno" a um valor anterior.
- Eles são _consumidos_ ao iterar sobre os valores retornados; não há reinicialização ou armazenamento em memória.
- Eles não são ordenáveis e não podem ser revertidos.
- Eles não são tipos de sequência e _não têm_ `indexes`. 
  Você não pode referenciar um valor anterior ou futuro usando adição ou subtração e não pode usar notação de colchetes (`[]`) ou fatiamento.
- Eles não podem ser usados com a função `len()`, pois não têm comprimento.
- Eles podem ser _finitos_ ou _infinitos_ - tenha cuidado ao coletar todos os valores de um _infinite generator-iterator_!

[iterator]: https://docs.python.org/3.11/glossary.html#term-iterator
[iterables]: https://wiki.python.org/moin/Iterator
[lazy evaluation]: https://en.wikipedia.org/wiki/Lazy_evaluation
~~~~

## A expressão yield

A [yield expression][yield expression] é muito semelhante à expressão `return`.
_Contrariamente_ à expressão `return`, `yield` cede valores ao chamador em um _ponto específico_, suspendendo a avaliação/retorno de valores adicionais até que sejam solicitados.
Quando `yield` é avaliado, ele pausa a execução da função que o contém e retorna qualquer valor da função _naquele ponto no tempo_.
A função então _permanece em escopo_, e quando `__next__()` é chamado, a execução é retomada até que `yield` seja encontrado novamente.

~~~~exercism/note
O uso de expressões `yield` é proibido fora de funções.
~~~~

```python
>>> def infinite_sequence():
...     current_number = 0
...     while True:
...         yield current_number
...         current_number += 1

>>> lets_try = infinite_sequence()
>>> lets_try.__next__()
0
>>> lets_try.__next__()
1
```

## Por que criar um gerador?

Geradores são úteis em muitas aplicações.

Quando se trabalha com uma coleção potencialmente grande de valores, você pode não querer colocar todos eles na memória.
Um gerador pode ser usado para trabalhar com grandes conjuntos de dados peça por peça, economizando memória e melhorando o desempenho.

Geradores também são muito úteis quando um processo ou cálculo é _complexo_, _caro_ ou _infinito_:

```python
>>> def infinite_sequence():
...     current_number = 0
...     while True:
...         yield current_number
...         current_number += 1
```

Agora, sempre que `__next__()` é chamado no objeto `infinite_sequence`, ele retornará o _número anterior_ + 1.

[generator-iterator]: https://docs.python.org/3.11/glossary.html#term-generator-iterator
[iterables]: https://wiki.python.org/moin/Iterator
[iterator]: https://docs.python.org/3.11/glossary.html#term-iterator
[lazy evaluation]: https://en.wikipedia.org/wiki/Lazy_evaluation
[lazy iterator]: https://en.wikipedia.org/wiki/Lazy_evaluation
[yield expression]: https://docs.python.org/3.11/reference/expressions.html#yield-expressions

## Instruções

A Conda Airlines é a maior companhia aérea do mundo da programação, com mais de 10.000 voos por dia!

Eles estão atualmente atribuindo todos os assentos aos passageiros manualmente; isso precisará ser automatizado.

Eles pediram _para você_ criar um software para automatizar a atribuição de assentos aos passageiros.
Eles exigem que seu software seja eficiente em termos de memória e desempenho.

## 1. Gerar letras de assento

A Conda quer gerar letras de assento para seus aviões.
Um avião é composto por filas de assentos.
Cada fila tem _4 assentos_.
Os assentos em cada fila são sempre nomeados `A`, `B`, `C` e `D`.
O primeiro assento na fila é `A`, o segundo assento na fila é `B`, e assim por diante.
Após alcançar `D`, deve começar novamente com `A`.

Implemente uma função `generate_seat_letters(<number>)` que aceita um `int` que indica quantas letras de assento devem ser geradas.
A função deve então retornar um _iterable_ de letras de assento.

```python
>>> letters = generate_seat_letters(4)
>>> next(letters)
"A"
>>> next(letters)
"B"
```

## 2. Gerar assentos

A Conda quer um sistema que possa gerar um número específico de assentos para seus aviões.
Cada avião tem _4 assentos_ em cada fila.
As filas são definidas usando números, começando de `1` e seguindo em frente.
Os assentos devem ser ordenados, como: `1A`, `1B`, `1C`, `1D`, `2A`, `2B`, `2C`, `2D`, `3A`, `3B`, `3C`, `3D`, ...

Aqui está um exemplo:

|      x      |  1  |  2  |
| :---------: | :-: | :-: |
|     Fila    |  5  | 21  |
| Letra do assento |  A  |  D  |
|   Resultado    | 5A  | 21D |

Muitas companhias aéreas não têm _número de fila_ 13 em seus voos, devido à superstição entre os passageiros.
A Conda Airlines também segue essa convenção, então certifique-se de _não_ gerar assentos para a _fila_ número 13.

Im

plemente uma função `generate_seats(<number>)` que aceita um `int` que indica quantos assentos devem ser gerados.
A função deve então retornar um _iterable_ de assentos gerados.

```python
>>> seats = generate_seats(10)
>>> next(seats)
"1A"
>>> next(seats)
"1B"
```

## 3. Atribuir assentos aos passageiros

Agora que você tem uma função que gera assentos, pode usá-la para atribuir assentos aos passageiros.

Implemente uma função `assign_seats(<passengers>)` que aceita uma `list` de nomes de passageiros.
A função deve então retornar um _dicionário_ com `passenger` como _chave_ e `seat_number` como _valor_.

```python
>>> passengers = ['Jerimiah', 'Eric', 'Bethany', 'Byte', 'SqueekyBoots', 'Bob']

>>> assign_seats(passengers)
{'Jerimiah': '1A', 'Eric': '1B', 'Bethany': '1C', 'Byte': '1D', 'SqueekyBoots': '2A', 'Bob': '2B'}
```

## 4. Códigos de bilhetes

A Conda Airlines gostaria de ter um código único para cada bilhete.
Como são uma grande companhia aérea, têm muitos voos.
Isso significa que há vários voos com o mesmo número de assento.
Eles querem que você crie um sistema que gera um código de bilhete de _12_ caracteres para identificação.

Esse código começa com o `assigned_seat` seguido pelo `flight_id`.
O resto do código é completado com `0s`.

Implemente uma função `generate_codes(<seat_numbers>, <flight_id>)` que aceita uma `list` de `seat_numbers` e uma `string` com o número do voo.
A função deve então retornar um `generator` que gera um `ticket_number`.

```python
>>> seat_numbers = ['1A', '17D']
>>> flight_id = 'CO1234'
>>> ticket_ids = generate_codes(seat_numbers, flight_id)

>>> next(ticket_ids)
'1ACO12340000'
>>> next(ticket_ids)
'17DCO1234000'
```

## Fonte

### Criado por

- @J08K

### Contribuído por

- @BethanyG
- @kytrinyx
- @meatball133

---