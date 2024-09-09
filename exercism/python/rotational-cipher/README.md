# Rotational Cipher

Welcome to Rotational Cipher on Exercism's Python Track.
If you need help running the tests or submitting your code, check out `HELP.md`.

## Instructions

Create an implementation of the rotational cipher, also sometimes called the Caesar cipher.

The Caesar cipher is a simple shift cipher that relies on transposing all the letters in the alphabet using an integer key between `0` and `26`.
Using a key of `0` or `26` will always yield the same output due to modular arithmetic.
The letter is shifted for as many values as the value of the key.

The general notation for rotational ciphers is `ROT + <key>`.
The most commonly used rotational cipher is `ROT13`.

A `ROT13` on the Latin alphabet would be as follows:

```text
Plain:  abcdefghijklmnopqrstuvwxyz
Cipher: nopqrstuvwxyzabcdefghijklm
```

It is stronger than the Atbash cipher because it has 27 possible keys, and 25 usable keys.

Ciphertext is written out in the same formatting as the input including spaces and punctuation.

## Examples

- ROT5 `omg` gives `trl`
- ROT0 `c` gives `c`
- ROT26 `Cool` gives `Cool`
- ROT13 `The quick brown fox jumps over the lazy dog.` gives `Gur dhvpx oebja sbk whzcf bire gur ynml qbt.`
- ROT13 `Gur dhvpx oebja sbk whzcf bire gur ynml qbt.` gives `The quick brown fox jumps over the lazy dog.`

## Source

### Created by

- @krapes

### Contributed to by

- @akashsara
- @behrtam
- @cmccandless
- @Dog
- @dotrungkien
- @ikhadykin
- @lekum
- @N-Parsons
- @tqa236

### Based on

Wikipedia - https://en.wikipedia.org/wiki/Caesar_cipher

---

# Cifra Rotacional

Bem-vindo à Cifra Rotacional no Track de Python do Exercism.
Se precisar de ajuda para executar os testes ou enviar seu código, consulte `HELP.md`.

## Instruções

Crie uma implementação da cifra rotacional, também chamada de cifra de César.

A cifra de César é uma cifra de deslocamento simples que se baseia na transposição de todas as letras do alfabeto usando uma chave inteira entre `0` e `26`.
Usar uma chave de `0` ou `26` sempre resultará na mesma saída devido à aritmética modular.
A letra é deslocada pelo número de posições igual ao valor da chave.

A notação geral para cifras rotacionais é `ROT + <chave>`.
A cifra rotacional mais comumente usada é a `ROT13`.

Um `ROT13` no alfabeto latino seria o seguinte:

```text
Plano:  abcdefghijklmnopqrstuvwxyz
Cifra:  nopqrstuvwxyzabcdefghijklm
```

Ela é mais forte que a cifra de Atbash porque tem 27 chaves possíveis e 25 chaves utilizáveis.

O texto cifrado é escrito no mesmo formato do texto original, incluindo espaços e pontuação.

## Exemplos

- ROT5 `omg` resulta em `trl`
- ROT0 `c` resulta em `c`
- ROT26 `Cool` resulta em `Cool`
- ROT13 `The quick brown fox jumps over the lazy dog.` resulta em `Gur dhvpx oebja sbk whzcf bire gur ynml qbt.`
- ROT13 `Gur dhvpx oebja sbk whzcf bire gur ynml qbt.` resulta em `The quick brown fox jumps over the lazy dog.`

## Fonte

### Criado por

- @krapes

### Contribuíram

- @akashsara
- @behrtam
- @cmccandless
- @Dog
- @dotrungkien
- @ikhadykin
- @lekum
- @N-Parsons
- @tqa236

### Baseado em

Wikipedia - https://en.wikipedia.org/wiki/Caesar_cipher