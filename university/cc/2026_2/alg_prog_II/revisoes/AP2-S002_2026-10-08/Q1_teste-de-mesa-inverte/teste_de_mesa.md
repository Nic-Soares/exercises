# Teste de mesa · inverte(3782) (preencha SEM compilar)

Legenda: `"` = mesmo valor da célula de cima · `^` = não atualizei porque a expressão não é usada nesta linha.
Uma linha da tabela para cada linha do código executada, na ordem em que executa.

## main()

| LINHA | a   | Observação                   |
| ----- | --- | ---------------------------- |
| 14    | ?   | declara `a`, ainda sem valor |
| 15    | ?   | Chama inverte(3782)          |
| 15    | 2873| recebe r = 2873 da funcao    |
| 16    | "   | imprime main: a = 2873       |
| 17    | "   | return 0                     |

## inverte(3782)

| LINHA | x    | r   | d   | x > 0 | Observação          |
| ----- | ---- | --- | --- | ----- | ------------------- |
| 2     | 3782 | ?   |     |       | recebe 3782 do main |
| 3     | "    | 0   |     |       |                     |
| 4     | "    | "   |     | True  |                     |
| 5     | "    | "   | 2   |       |                     |
| 6     | "    | 2   | "   |       |                     |
| 7     | 378  | "   | "   |       |                     |
| 8     | "    | "   | "   |       | imprime x = 378     |
| 4     | "    | "   | "   | True  |                     |
| 5     | "    | "   | 8   |       |                     |
| 6     | "    | 28  | "   |       |                     |
| 7     | 37   | "   | "   |       |                     |
| 8     | "    | "   | "   |       | imprime x = 37      |
| 4     | "    | "   | "   | True  |                     |
| 5     | "    | "   | 7   |       |                     |
| 6     | "    | 287 | "   |       |                     |
| 7     | 3    | "   | "   |       |                     |
| 8     | "    | "   | "   |       | imprime x = 3       |
| 4     | "    | "   | "   | True  |                     |
| 5     | "    | "   | 3   |       |                     |
| 6     | "    | 2873| "   |       |                     |
| 7     | 0    | "   | "   |       |                     |
| 8     | "    | "   | "   |       | imprime x = 0       |
| 4     | "    | "   | "   | False |                     |
| 10    | "    | "   | "   |       | funcao retorna r = 2873 |

## SAÍDA

```
x = 378
x = 37
x = 3
x = 0
main: a = 2873
```

## Depois de rodar o rastreio

- Bateu volta por volta? (sim / não, em qual volta desviou)
