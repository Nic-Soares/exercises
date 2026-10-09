# AP2-S002-Q4 · Busca binária do zero + teste de mesa

Tipo de questão da prova: adaptar algoritmo visto em aula (P1, Q5 foi busca binária). Revisão da busca binária (Padrão 16) e do teste de mesa (Comportamento 6). Explicação completa na folha do Vault: `AP2-S002 Folha de exercícios`.

**Sem consulta**: não abra `class-5/` nem nenhuma busca binária antiga.

## O que fazer

1. No topo de `busca_binaria.c`, preencha o plano em português **antes** do código.
2. Escreva o corpo de `buscaBinaria`. Ela devolve a **posição** do alvo, ou `-1` se ele não estiver no vetor. Dentro do laço, o `printf` de uma linha por volta (já escrito no comentário).
3. No `main`, escreva o `if` que decide entre "achei na posicao ..." e "nao achei", usando `pos`.
4. Escreva a **previsão** no comentário do topo (alvo 10: quantas voltas, qual retorno).
5. **Sem compilar**, preencha `teste_de_mesa.md` para a chamada `buscaBinaria(v, 8, 10)`, com os números de linha do **seu** arquivo.
6. Só depois compile e rode: `gcc -Wall -Wextra -o busca busca_binaria.c && ./busca`

## Casos de teste (vetor `{2, 5, 9, 14, 20, 33, 41, 58}`, n = 8)

| alvo | onde está | esperado |
|---:|---|---|
| 2 | primeira posição | achei na posicao 0 |
| 14 | meio | achei na posicao 3 |
| 41 | perto do fim | achei na posicao 6 |
| 58 | última posição | achei na posicao 7 |
| 10 | ausente, no meio dos valores | nao achei |
| 1 | ausente, menor que todos | nao achei |
| 70 | ausente, maior que todos | nao achei |

## Lista de conferência (seus erros já registrados)

- `middle` calculado **dentro** do laço, a partir de `start` e `end` (Padrão 16: `middle` fixo, fora do laço). Se o `-Wall` reclamar de variável "set but not used", algo está fixo.
- `end` começa em `n - 1`, não em `n` nem em 0.
- O `return -1` fica **depois** do `}` do laço.
- `return` da **posição** (`middle`), nunca `v[middle]` (valor × posição).
- No `main`, compare `pos` com `-1` (`pos == -1`), nunca `if (pos)` nem `if (!pos)` (Padrão 11). O alvo 2 devolve 0 e pega esse erro.
