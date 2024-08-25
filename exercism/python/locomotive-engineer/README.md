# Engenheiro de Locomotiva

Bem-vindo ao Engenheiro de Locomotiva na Trilha Python do Exercism.
Se precisar de ajuda para executar os testes ou enviar seu código, consulte `HELP.md`.
Se ficar preso no exercício, verifique `HINTS.md`, mas tente resolvê-lo sem usar essas dicas primeiro :)

## Introdução

Desempacotar refere-se ao ato de extrair os elementos de uma coleção, como uma `list`, `tuple` ou `dict`, usando iteração.
Os valores desempacotados podem ser atribuídos a variáveis na mesma instrução, o que é comumente chamado de [Atribuição Múltipla][multiple assignment].

Os operadores especiais `*` e `**` são frequentemente usados em contextos de desempacotamento e com atribuição múltipla.

~~~~exercism/caution
`*<nome_da_variavel>` e `**<nome_da_variavel>` não devem ser confundidos com `*` e `**`. Enquanto `*` e `**` são usados para multiplicação e exponenciação, respectivamente, `*<nome_da_variavel>` e `**<nome_da_variavel>` são usados como operadores de empacotamento e desempacotamento.
~~~~

## Atribuição Múltipla

Na atribuição múltipla, o número de variáveis no lado esquerdo do operador de atribuição (`=`) deve corresponder ao número de valores no lado direito.
Para separar os valores, use uma vírgula `,`:

```python
>>> a, b = 1, 2
>>> a
1
```

Se a atribuição múltipla receber um número incorreto de variáveis para os valores fornecidos, será gerado um `ValueError`:

```python
>>> x, y, z = 1, 2

ValueError: muitos valores para desempacotar (esperado 3, obtido 2)
```

A atribuição múltipla não é limitada a um tipo de dado:

```python
>>> x, y, z = 1, "Olá", True
>>> x
1

>>> y
'Olá'

>>> z
True
```

A atribuição múltipla pode ser usada para trocar elementos em `lists`.
Essa prática é bastante comum em [algoritmos de ordenação][sorting algorithms].
Por exemplo:

```python
>>> numeros = [1, 2]
>>> numeros[0], numeros[1] = numeros[1], numeros[0]
>>> numeros
[2, 1]
```

Como `tuples` são imutáveis, você não pode trocar elementos em uma `tuple`.

## Desempacotamento

~~~~exercism/note
Os exemplos abaixo usam `lists`, mas os mesmos conceitos se aplicam a `tuples`.
~~~~

Em Python, é possível [desempacotar os elementos de uma `list`/`tuple`/`dictionary`][unpacking] em variáveis distintas.
Como os valores aparecem dentro de `lists`/`tuples` em uma ordem específica, eles são desempacotados em variáveis na mesma ordem:

```python
>>> frutas = ["maçã", "banana", "cereja"]
>>> x, y, z = frutas
>>> x
"maçã"
```

Se houver valores que não são necessários, você pode usar `_` para sinalizá-los:

```python
>>> frutas = ["maçã", "banana", "cereja"]
>>> _, _, z = frutas
>>> z
"cereja"
```

### Desempacotamento Profundo

Desempacotar e atribuir valores de uma `list`/`tuple` dentro de uma `list` ou `tuple` (também conhecido como listas/tuples aninhadas) funciona da mesma forma que o desempacotamento superficial, mas muitas vezes precisa de qualificadores para esclarecer o contexto ou a posição dos valores:

```python
>>> frutas_legumes = [["maçã", "banana"], ["cenoura", "batata"]]
>>> [[a, b], [c, d]] = frutas_legumes
>>> a
"maçã"

>>> d
"batata"
```

Você também pode desempacotar profundamente apenas uma parte de uma `list`/`tuple` aninhada:

```python
>>> frutas_legumes = [["maçã", "banana"], ["cenoura", "batata"]]
>>> [a, [c, d]] = frutas_legumes
>>> a
["maçã", "banana"]

>>> c
"cenoura"
```

Se o desempacotamento tiver variáveis com posicionamento incorreto e/ou um número incorreto de valores, você obterá um `ValueError`:

```python
>>> frutas_legumes = [["maçã", "banana"], ["cenoura", "batata"]]
>>> [[a, b], [d]] = frutas_legumes

ValueError: muitos valores para desempacotar (esperado 1)
```

### Desempacotamento de uma list/tuple com `*`

Ao [desempacotar uma `list`/`tuple`][packing and unpacking], você pode usar o operador `*` para capturar os valores "sobrantes".
Isso é mais claro do que fatiar a `list`/`tuple` (o que em algumas situações é menos legível).
Por exemplo, podemos extrair o primeiro elemento e depois atribuir os valores restantes a uma nova `list` sem o primeiro elemento:

```python
>>> frutas = ["maçã", "banana", "cereja", "laranja", "kiwi", "melão", "manga"]
>>> x, *ultimo = frutas
>>> x
"maçã"

>>> ultimo
["banana", "cereja", "laranja", "kiwi", "melão", "manga"]
```

Também podemos extrair os valores no início e no final da `list`, enquanto agrupamos todos os valores no meio:

```python
>>> frutas = ["maçã", "banana", "cereja", "laranja", "kiwi", "melão", "manga"]
>>> x, *meio, y, z = frutas
>>> y
"melão"

>>> meio
["banana", "cereja", "laranja", "kiwi"]
```

Também podemos usar `*` no desempacotamento profundo:

```python
>>> frutas_legumes = [["maçã", "banana", "melão"], ["cenoura", "batata", "tomate"]]
>>> [[a, *resto], b] = frutas_legumes
>>> a
"maçã"

>>> resto
["banana", "melão"]
```

### Desempacotamento de um dicionário

[Desempacotar um dicionário][packing and unpacking] é um pouco diferente de desempacotar uma `list`/`tuple`.
A iteração sobre dicionários retorna por padrão as **chaves**.
Portanto, ao desempacotar um `dict`, você pode apenas desempacotar as **chaves** e não os **valores**:

```python
>>> inventario_frutas = {"maçã": 6, "banana": 2, "cereja": 3}
>>> x, y, z = inventario_frutas
>>> x
"maçã"
```

Se você quiser desempacotar os valores, pode usar o método `values()`:

```python
>>> inventario_frutas = {"maçã": 6, "banana": 2, "cereja": 3}
>>> x, y, z = inventario_frutas.values()
>>> x
6
```

Se tanto as **chaves** quanto os **valores** forem necessários, use o método `items()`.
Usar `items()` gerará tuplas com pares **chave-valor**.
Isso ocorre porque [`dict.items()` gera um iterável com tuplas chave-valor][items].

```python
>>> inventario_frutas = {"maçã": 6, "banana": 2, "cereja": 3}
>>> x, y, z = inventario_frutas.items()
>>> x
("maçã", 6)
```

## Packing

[Packing][packing and unpacking] é a habilidade de agrupar múltiplos valores em uma única `list` que é atribuída a uma variável. Isso é útil quando você deseja _unpack_ os valores, fazer alterações e, em seguida, _pack_ os resultados de volta em uma variável. Também possibilita realizar merges em 2 ou mais `lists`/`tuples`/`dicts`.

### Packing uma list/tuple com `*`

Packing de uma `list`/`tuple` pode ser feito utilizando o operador `*`. Isso agrupará todos os valores em uma `list`/`tuple`.

```python
>>> fruits = ("apple", "banana", "cherry")
>>> more_fruits = ["orange", "kiwi", "melon", "mango"]

# fruits e more_fruits são desempacotados e então seus elementos são agrupados em combined_fruits
>>> combined_fruits = *fruits, *more_fruits

# Se não houver * à esquerda do "=" o resultado será uma tuple
>>> combined_fruits
("apple", "banana", "cherry", "orange", "kiwi", "melon", "mango")

# Se o operador * for usado à esquerda do "=" o resultado será uma list
>>> *combined_fruits_too, = *fruits, *more_fruits
>>> combined_fruits_too
['apple', 'banana', 'cherry', 'orange', 'kiwi', 'melon', 'mango']
```

### Packing de um dictionary com `**`

Packing de um dictionary é feito utilizando o operador `**`. Isso agrupará todos os pares **key**-**value** de um dictionary em outro, ou combinará dois dictionaries juntos.

```python
>>> fruits_inventory = {"apple": 6, "banana": 2, "cherry": 3}
>>> more_fruits_inventory = {"orange": 4, "kiwi": 1, "melon": 2, "mango": 3}

# fruits_inventory e more_fruits_inventory são desempacotados em pares key-value e combinados.
>>> combined_fruits_inventory = {**fruits_inventory, **more_fruits_inventory}

# então os pares são agrupados em combined_fruits_inventory
>>> combined_fruits_inventory
{"apple": 6, "banana": 2, "cherry": 3, "orange": 4, "kiwi": 1, "melon": 2, "mango": 3}
```

## Uso de `*` e `**` com funções

### Packing com parâmetros de função

Quando você cria uma função que aceita um número arbitrário de argumentos, pode usar [`*args` ou `**kwargs`][args and kwargs] na definição da função. `*args` é usado para agrupar um número arbitrário de argumentos posicionais (não nomeados) e `**kwargs` é usado para agrupar um número arbitrário de argumentos nomeados.

Uso de `*args`:

```python
# Esta função é definida para aceitar qualquer número de argumentos posicionais

>>> def my_function(*args):
...     print(args)

# Argumentos passados para a função são agrupados em uma tuple

>>> my_function(1, 2, 3)
(1, 2, 3)

>>> my_function("Hello")
("Hello")

>>> my_function(1, 2, 3, "Hello", "Mars")
(1, 2, 3, "Hello", "Mars")
```

Uso de `**kwargs`:

```python
# Esta função é definida para aceitar qualquer número de argumentos nomeados

>>> def my_function(**kwargs):
...   print(kwargs)

# Argumentos passados para a função são agrupados em um dictionary

>>> my_function(a=1, b=2, c=3)
{"a": 1, "b": 2, "c": 3}
```

`*args` e `**kwargs` também podem ser usados em combinação:

```python
>>> def my_function(*args, **kwargs):
...   print(sum(args))
...   for key, value in kwargs.items():
...       print(str(key) + " = " + str(value))

>>> my_function(1, 2, 3, a=1, b=2, c=3)
6
a = 1
b = 2
c = 3
```

Você também pode escrever parâmetros antes de `*args` para permitir argumentos posicionais específicos. Argumentos nomeados individuais devem aparecer antes de `**kwargs`.

~~~~exercism/caution
[Argumentos precisam ser estruturados](https://www.python-engineer.com/courses/advancedpython/18-function-arguments/) desta forma:

`def my_function(<positional_args>, *args, <key-word_args>, **kwargs)`

Se você não seguir essa ordem, receberá um erro.
~~~~

```python
>>> def my_function(a, b, *args):
...   print(a)
...   print(b)
...   print(args)

>>> my_function(1, 2, 3, 4, 5)
1
2
(3, 4, 5)
```

Escrever argumentos em uma ordem incorreta resultará em um erro:

```python
>>>def my_function(*args, a, b):
... print(args)

>>>my_function(1, 2, 3, 4, 5)
Traceback (most recent call last):
  File "c:\something.py", line 3, in <module>
    my_function(1, 2, 3, 4, 5)
TypeError: my_function() missing 2 required keyword-only arguments: 'a' and 'b'
```

### Unpacking em chamadas de função

Você pode usar `*` para desempacotar uma `list`/`tuple` de argumentos em uma chamada de função. Isso é muito útil para funções que não aceitam um `iterable`:

```python
>>> def my_function(a, b, c):
...   print(c)
...   print(b)
...   print(a)

numbers = [1, 2, 3]
>>> my_function(*numbers)
3
2
1
```

Usar `*` unpacking com a função `zip()` é outro caso de uso comum. Como `zip()` aceita múltiplos iteráveis e retorna uma `list` de `tuples` com os valores de cada `iterable` agrupados:

```python
>>> values = (['x', 'y', 'z'], [1, 2, 3], [True, False, True])
>>> a, *rest = zip(*values)
>>> rest
[('y', 2, False), ('z', 3, True)]
```

[args and kwargs]: https://www.geeksforgeeks.org/args-kwargs-python/
[items]: https://www.geeksforgeeks.org/python-dictionary-items-method/
[multiple assignment]: https://www.geeksforgeeks.org/assigning-multiple-variables-in-one-line-in-python/
[packing and unpacking]: https://www.geeksforgeeks.org/packing-and-unpacking-arguments-in-python/
[sorting algorithms]: https://realpython.com/sorting-algorithms-python/
[unpacking]: https://www.geeksforgeeks.org/unpacking-arguments-in-python/?ref=rp

## Instruções

Seu amigo Linus é um Engenheiro de Locomotivas que conduz trens de carga entre cidades. Embora ele seja incrível em manejar trens, ele não é tão bom em lidar com logística ou computadores. Ele gostaria de contar com a sua ajuda na programação para organizar os detalhes dos trens e corrigir erros nos dados de rotas.

~~~~exercism/note
Este exercício poderia ser facilmente resolvido usando fatiamento, indexação e vários métodos de `dict`. No entanto, gostaríamos que você praticasse packing, unpacking e múltipla atribuição para resolver cada uma das tarefas abaixo.
~~~~

## 1. Criar uma lista de todos os vagões

Seu amigo tem acompanhado cada identificador de vagão (ID), mas nunca tem certeza de quantos vagões o sistema terá que processar em um dado momento. Seria muito mais fácil para o restante do programa de logística ter esses dados agrupados em uma `list` unificada.

Implemente uma função `get_list_of_wagons()` que aceita um número arbitrário de IDs de vagões. Cada ID será um número inteiro positivo. A função deve então `return` os IDs fornecidos como uma única `list`.

```python
>>> get_list_of_wagons(1, 7, 12, 3, 14, 8, 5)
[1, 7, 12, 3, 14, 8, 5]
```

## 2. Corrigir a lista de vagões

Neste ponto, você começa a entender melhor os dados e como eles são usados no programa de logística. O sistema de ID sempre atribui à locomotiva o ID **1**, com o restante dos vagões no trem recebendo um ID aleatório maior que **1**.

Seu amigo teve que conectar dois novos vagões ao trem e esqueceu de atualizar o sistema! Agora, os dois primeiros vagões na `list` do trem precisam ser movidos para o final, ou tudo ficará fora de ordem.

Para complicar ainda mais, seu amigo acabou de encontrar uma segunda `list` que parece conter IDs de vagões que estavam faltando. Tudo o que ele se lembra é que, uma vez que os novos vagões sejam movidos, os IDs desta segunda `list` devem ser colocados diretamente após o ID designado para a locomotiva.

Linus ficaria muito grato se você corrigisse seus erros e consolidasse os dados.

Implemente uma função `fix_list_of_wagons()` que aceita duas `lists` contendo IDs de vagões. Ela deve reposicionar os dois primeiros itens da primeira `list` para o final e inserir os valores da segunda `list` após a locomotiva (**1**). A função deve então `return` uma `list` com as modificações.

```python
>>> fix_list_of_wagons([2, 5, 1, 7, 4, 12, 6, 3, 13], [3, 17, 6, 15])
[1, 3, 17, 6, 15, 7, 4, 12, 6, 3, 13, 2, 5]
```

## 3. Adicionar paradas faltantes

Agora que todos os dados dos vagões estão corretos, Linus gostaria que você atualizasse as informações de roteamento do sistema. Ao longo de uma rota de transporte, um trem pode fazer paradas em várias estações diferentes para carregar e/ou descarregar carga. Cada viagem pode ter um número diferente desses pontos de entrega intermediários. Seu amigo gostaria que você atualizasse o `dict` de roteamento do sistema com qualquer informação de entrega adicional/faltante.

Implemente uma função `add_missing_stops()` que aceita um `dict` de roteamento seguido de um número variável de argumentos nomeados. Esses argumentos podem ser na forma de um `dict` contendo uma ou mais paradas, ou qualquer número de pares `stop_number=city`. Sua função deve então retornar o `dict` de roteamento atualizado com uma chave adicional que contenha uma `list` de todas as paradas adicionadas em ordem.

```python
>>> add_missing_stops({"from": "New York", "to": "Miami"},
                      stop_1="Washington, DC", stop_2="Charlotte", stop_3="Atlanta",
                      stop_4="Jacksonville", stop_5="Orlando")

{"from": "New York", "to": "Miami", "stops": ["Washington, DC", "Charlotte", "Atlanta", "Jacksonville", "Orlando"]}
```

## 4. Expandir informações de roteamento

Linus tem trabalhado no programa de roteamento e notou que certas rotas estão faltando alguns detalhes importantes. As informações iniciais da rota foram construídas como um `dict`, e seu amigo gostaria que você atualizasse esse `dict` com o que estiver faltando. Cada rota no sistema requer detalhes ligeiramente diferentes, então Linus realmente prefere uma solução genérica.

Implemente uma função chamada `extend_route_information()` que aceita dois `dicts`. O primeiro `dict` contém as cidades de origem e destino entre as quais a rota do trem passa.

O segundo `dict` contém outros detalhes de roteamento, como velocidade do trem, comprimento, ou temperatura. A função deve retornar um `dict` consolidado com todas as informações de roteamento.

~~~~exercism/note
O segundo `dict` pode conter diferentes/mais propriedades do que as mostradas no exemplo.
~~~~

```python
>>> extend_route_information({"from": "Berlin", "to": "Hamburg"}, {"length": "100", "speed": "50"})
{"from": "Berlin", "to": "Hamburg", "length": "100", "speed": "50"}
```

## 5. Corrigir o depósito de vagões

Quando Linus estava inspecionando o depósito de vagões, ele notou que os vagões não estavam sendo armazenados na ordem correta. Além de um ID, cada vagão tem uma cor que corresponde ao tipo de carga que transporta. Os vagões são armazenados no depósito em grades, onde cada coluna na grade tem vagões da mesma cor.

No entanto, o sistema de logística mostra `lists` de vagões a serem armazenados no depósito que têm suas _rows_ agrupadas por cor. Mas para que a grade de armazenamento funcione corretamente, cada _row_ deve ter três cores diferentes para que as _columns_ se alinhem por cor. Seu amigo gostaria que você organizasse as `lists` de vagões do depósito, para que os vagões sejam armazenados corretamente.

Implemente uma função chamada `fix_wagon_depot()` que aceita uma `list` de três itens. Cada item da `list` é uma sublist (ou "row") que contém três `tuples`. Cada `tuple` é um par `(<wagon ID>, <wagon color>)`.

Sua função deve retornar uma `list` com as três `lists` "row" reordenadas para que os vagões sejam trocados para suas posições corretas.

```python
>>> fix_wagon_depot([
    [(2, "red"), (4, "red"), (8, "red")],
    [(5, "blue"), (9, "blue"), (13,"blue")],
    [(3, "orange"), (7, "orange"), (11, "orange")],
])

[
    [(2, "red"), (5, "blue"), (3, "orange")],
    [(4, "red"), (9, "blue"), (7, "orange")],
    [(8, "red"), (13,"blue"), (11, "orange")]
]
```

## Source

### Created by

- @meatball133
- @BethanyG

### Contributed to by

- @IsaacG