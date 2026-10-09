# AP2-S002-Q3 · Escrever `somaPotencias` a partir da assinatura

Tipo de questão da prova: escrever função a partir de assinatura e `main` dados, com comentários (P1, Q3 valeu 3,0: polinômio sem `pow`, potência acumulada no laço). Explicação completa na folha do Vault: `AP2-S002 Folha de exercícios`.

**Sem consulta**: não abra a resolução da P1 nem `class-*`.

## O que fazer

1. Preencha o plano em português no topo de `soma_potencias.c` **antes** do código.
2. Escreva o corpo de `somaPotencias(int base, int n)`: devolve base^0 + base^1 + ... + base^n, **sem `pow`**, com a potência acumulada no laço (multiplicando pela base a cada volta).
3. Comentário em cada linha do corpo (a prova exige).
4. Um `printf` de rastreio dentro do laço, uma linha por volta.
5. Escreva a previsão para `somaPotencias(3, 2)` no comentário do topo.
6. Compile e rode: `gcc -Wall -Wextra -o soma soma_potencias.c && ./soma`

## Casos de teste

| chamada | conta | esperado |
|---|---|---:|
| somaPotencias(2, 3) | 1 + 2 + 4 + 8 | 15 |
| somaPotencias(3, 2) | 1 + 3 + 9 | 13 |
| somaPotencias(5, 0) | só base^0 = 1 | 1 |
| somaPotencias(1, 4) | 1 + 1 + 1 + 1 + 1 | 5 |
| somaPotencias(10, 2) | 1 + 10 + 100 | 111 |

## Lista de conferência (seus erros já registrados)

- Acumulador (`soma`) e potência com valor inicial (Padrão 12: acumulador declarado sem valor).
- A potência muda **dentro** do laço, a cada volta (Padrão 16: valor que deveria mudar calculado uma vez só, fora do laço).
- `return` **depois** do `}` do laço, não dentro (Padrão 16: `return` dentro do laço).
- O caso `n = 0` tem que dar 1: confira se o seu laço não pula o base^0.
- Tipo de retorno `int` e o que a função devolve batem (Padrão 8).
