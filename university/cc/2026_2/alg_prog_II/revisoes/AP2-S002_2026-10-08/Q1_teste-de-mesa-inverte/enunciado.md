# AP2-S002-Q1 · Teste de mesa de `inverte(3782)`

Tipo de questão da prova: teste de mesa (P1, Q1 valeu 2,0). Explicação completa (glossário, exemplo resolvido) na folha do Vault: `AP2-S002 Folha de exercícios`.

## O que fazer

1. **Sem compilar**, preencha as duas tabelas de `teste_de_mesa.md` (uma para `main`, uma para `inverte`) e o bloco SAÍDA.
2. Só depois confira:
   `gcc -Wall -Wextra -o rastreio inverte_rastreio.c && ./rastreio`
   As linhas `[rastreio]` não fazem parte da SAÍDA; elas só mostram as variáveis de cada volta para você comparar com a tabela.

## Lista de conferência

- As linhas 4, 5, 6, 7 e 8 se repetem a cada volta, nessa ordem. Depois da última volta aparece a linha 4 com `false` e a linha 10.
- `x % 10` é o último dígito (resto da divisão por 10). `x / 10` com dois `int` corta o último dígito (divisão inteira, sem vírgula).
- Linha 6: faça primeiro `r * 10`, depois `+ d`. Escreva a conta na Observação.
- O `printf` da linha 8 roda **dentro** do laço: ele aparece na SAÍDA uma vez por volta. Na P1 essas linhas ficaram de fora.
- SAÍDA: escreva exatamente o que aparece na tela, com os espaços (`x = ...`, `main: a = ...`).
