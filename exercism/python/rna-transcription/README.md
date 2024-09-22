# Transcrição de RNA

Bem-vindo à Transcrição de RNA na trilha de Python do Exercism.
Se precisar de ajuda para rodar os testes ou enviar seu código, confira o arquivo `HELP.md`.

## Introdução

Você trabalha para uma empresa de bioengenharia que se especializa em desenvolver soluções terapêuticas.

Sua equipe recebeu um novo projeto para desenvolver uma terapia direcionada para um tipo raro de câncer.

~~~~exercism/note
É tudo muito complicado, mas a ideia básica é que, às vezes, os corpos das pessoas produzem uma quantidade excessiva de uma determinada proteína. Isso pode causar vários problemas.

Mas se você conseguir criar uma molécula muito específica (chamada micro-RNA), ela pode impedir a produção dessa proteína.

Essa técnica é chamada de [Interferência de RNA][rnai].

[rnai]: https://admin.acceleratingscience.com/ask-a-scientist/what-is-rnai/
~~~~

## Instruções

Sua tarefa é determinar o complemento de RNA de uma determinada sequência de DNA.

Tanto o DNA quanto o RNA são cadeias de nucleotídeos.

Os quatro nucleotídeos encontrados no DNA são adenina (**A**), citosina (**C**), guanina (**G**) e timina (**T**).

Os quatro nucleotídeos encontrados no RNA são adenina (**A**), citosina (**C**), guanina (**G**) e uracila (**U**).

Dada uma cadeia de DNA, sua cadeia de RNA transcrita é formada substituindo cada nucleotídeo pelo seu complemento:

- `G` -> `C`
- `C` -> `G`
- `T` -> `A`
- `A` -> `U`

~~~~exercism/note
Se quiser ver como as entradas e saídas são estruturadas, dê uma olhada nos exemplos no conjunto de testes.
~~~~

## Fonte

### Criado por

- @BrianHicks

### Contribuído por

- @behrtam
- @cmccandless
- @davepeake
- @Dog
- @dvermd
- @hariesramdhani
- @ikhadykin
- @jamesmcm
- @kytrinyx
- @lowks
- @magnus-hogberg
- @N-Parsons
- @pheanex
- @sjakobi
- @thomasjpfan
- @tqa236
- @yawpitch

### Baseado em

Hyperphysics - https://web.archive.org/web/20220408112140/http://hyperphysics.phy-astr.gsu.edu/hbase/Organic/transcription.html