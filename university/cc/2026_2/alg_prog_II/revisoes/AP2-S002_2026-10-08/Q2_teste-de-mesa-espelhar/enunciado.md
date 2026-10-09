# AP2-S002-Q2 · Teste de mesa de `espelhar` (vetor alterado por função)

Tipo de questão da prova: teste de mesa com vetor e três funções (P1, Q2 valeu 2,0). Explicação completa na folha do Vault: `AP2-S002 Folha de exercícios`.

## O que fazer

1. **Sem compilar**, preencha as três tabelas de `teste_de_mesa.md` (`main`, `espelhar`, `mostrar`) e o bloco SAÍDA.
2. Só depois confira:
   `gcc -Wall -Wextra -o rastreio espelhar_rastreio.c && ./rastreio`

## Lista de conferência

- Linha 9: calcule `n / 2` com divisão inteira **antes** de começar. Com `n = 5`, quantas voltas o `for` dá?
- Em cada volta, escreva na Observação as **duas posições** que trocam: `i` e `n - 1 - i` (com os números, por exemplo "troca posição 0 com posição 4").
- Linha 10 guarda o da **esquerda** em `t`. Linha 11 copia o da **direita** para a esquerda. Linha 12 põe o `t` guardado na direita. Na P1 você misturou as duas posições da troca.
- `espelhar` muda o vetor do `main` (vetor é passado pelo endereço), então `mostrar` imprime o vetor já alterado.
- SAÍDA: `printf("%d ", ...)` põe um espaço depois de cada número; a linha 6 só quebra a linha.
