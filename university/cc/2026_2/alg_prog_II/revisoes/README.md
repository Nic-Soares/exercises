# revisoes (Algoritmos II)

Exercícios de revisão e rotina de Algoritmos e Programação II, puxados da Fila de Revisões do Vault.
Nesta matéria o exercício é feito aqui no repositório, não no caderno. O Vault (Obsidian) continua sendo o lugar do estado, checklist e fila de revisões; aqui fica só o código.

## Organização

Uma pasta por **sessão de estudo**, com o ID da sessão na frente. O ID é o mesmo do Vault (`Índice de Sessões - Algoritmos e Programação II`), então a pasta e a nota se acham pelo nome. Dentro, uma subpasta por questão, na ordem da folha.

```
revisoes/
  AP2-S002_2026-10-08/          ID da sessão + data
    LEIA-ME.md                  lista das questões, ordem e situação
    Q1_teste-de-mesa-inverte/   Q + número da questão na sessão + tema
      enunciado.md              o que pedir, casos de teste, conferência
      *.c                       código / sua solução
      teste_de_mesa.md          tabela no formato do professor (quando houver)
    Q2_.../
  AP2-S003_AAAA-MM-DD/
```

Como ler o ID `AP2-S002-Q3`: `AP2` = Algoritmos e Programação II; `S002` = sessão número 2 (sequencial, nunca reutilizado); `Q3` = questão 3 **dessa sessão** (não é o número do exercício na lista). Como o ID vem na frente, `ls` já mostra as sessões em ordem.

## Rotina

1. Abrir a pasta da sessão (`AP2-S###_data`) e ler o `LEIA-ME.md`.
2. Escrever o plano em português no topo do `.c` antes do código.
3. Compilar sempre com avisos ligados:
   `gcc -Wall -Wextra -o prog arquivo.c && ./prog`
4. Rodar os casos de teste do `enunciado.md`. O rastreio (o que seria a tabela do caderno) é feito com `printf` dentro do laço, uma linha por volta.
5. Registrar o resultado no Vault (Checklist, Registro de Erros, Fila de Revisões).
