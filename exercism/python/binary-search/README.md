# Busca Binária

Bem-vindo à Busca Binária na Trilha de Python do Exercism.
Se você precisar de ajuda para rodar os testes ou enviar seu código, confira `HELP.md`.

## Introdução

Você encontrou um grupo de matemáticos que também são cantores e compositores.
Eles escreveram uma música para cada um de seus números favoritos e, como você pode imaginar, eles têm muitos números favoritos (como [0][zero] ou [73][setenta-e-três] ou [6174][constante-de-kaprekar]).

Você está curioso para ouvir a música do seu número favorito, mas com tantas músicas para percorrer, encontrar a música certa pode levar um tempo.
Felizmente, eles organizaram suas músicas em uma playlist ordenada pelo título — que é simplesmente o número sobre o qual a música fala.

Você percebe que pode usar um algoritmo de busca binária para encontrar rapidamente uma música dado o título.

[zero]: https://pt.wikipedia.org/wiki/0
[setenta-e-três]: https://pt.wikipedia.org/wiki/73_(número)
[constante-de-kaprekar]: https://pt.wikipedia.org/wiki/6174_(número)

## Instruções

Sua tarefa é implementar um algoritmo de busca binária.

Um algoritmo de busca binária encontra um item em uma lista dividindo-a repetidamente ao meio, mantendo apenas a metade que contém o item que estamos procurando.
Isso nos permite reduzir rapidamente as possíveis localizações do nosso item até encontrá-lo, ou até eliminarmos todas as possíveis localizações.

~~~~exercism/caution
A busca binária só funciona quando uma lista está ordenada.
~~~~

O algoritmo funciona assim:

- Encontre o elemento do meio de uma lista _ordenada_ e compare-o com o item que estamos procurando.
- Se o elemento do meio for o nosso item, então terminamos!
- Se o elemento do meio for maior que o nosso item, podemos eliminar esse elemento e todos os elementos **após** ele.
- Se o elemento do meio for menor que o nosso item, podemos eliminar esse elemento e todos os elementos **antes** dele.
- Se todos os elementos da lista forem eliminados, então o item não está na lista.
- Caso contrário, repita o processo na parte da lista que não foi eliminada.

Aqui está um exemplo:

Vamos supor que estamos procurando o número 23 na seguinte lista ordenada: `[4, 8, 12, 16, 23, 28, 32]`.

- Começamos comparando 23 com o elemento do meio, 16.
- Como 23 é maior que 16, podemos eliminar a metade esquerda da lista, restando `[23, 28, 32]`.
- Em seguida, comparamos 23 com o novo elemento do meio, 28.
- Como 23 é menor que 28, podemos eliminar a metade direita da lista: `[23]`.
- Encontramos nosso item.

## Mensagens de exceção

Às vezes é necessário [levantar uma exceção](https://docs.python.org/3/tutorial/errors.html#raising-exceptions). Quando você fizer isso, deve sempre incluir uma **mensagem significativa de erro** para indicar qual é a origem do erro. Isso torna seu código mais legível e ajuda significativamente na depuração. Para situações em que você sabe que a origem do erro será de um certo tipo, você pode optar por levantar um dos [tipos de erro embutidos](https://docs.python.org/3/library/exceptions.html#base-classes), mas ainda deve incluir uma mensagem significativa.

Este exercício específico requer que você use a [declaração raise](https://docs.python.org/3/reference/simple_stmts.html#the-raise-statement) para "lançar" um `ValueError` quando o valor fornecido não for encontrado no array. Os testes só passarão se você tanto `levantar` a `exceção` quanto incluir uma mensagem com ela.

Para levantar um `ValueError` com uma mensagem, escreva a mensagem como um argumento para o tipo de `exceção`:

```python
# exemplo quando o valor não é encontrado no array.
raise ValueError("valor não encontrado no array")
```

## Fonte

### Criado por

- @michaelkunc

### Contribuíram

- @AnAccountForReportingBugs
- @behrtam
- @BethanyG
- @cmccandless
- @Dog
- @fortrieb
- @ikhadykin
- @kytrinyx
- @mpatibandla
- @N-Parsons
- @patricksjackson
- @pheanex
- @subkrish
- @tqa236

### Baseado em

Wikipedia - https://pt.wikipedia.org/wiki/Busca_binária