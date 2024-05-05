
![[Mackenzie Logo.png]]

- **Curso**: Análise e Desenvolvimento de Sistemas
- **Polo de Apoio Presencial**: Campus Alphaville
- **Semestre**: Quinto
- **Componente Curricular / Tema**: Propabilidade e Estatistica Aplicada
- **Nome Completo do Aluno**: Nicolas Soares Santos
- **TIA**: 22021221
- **Nome do Professor**: Gaston Alberto Concha Henriquez

----
# Estatística Descritiva
### Exercício 1

Considere a base.

```
df = read.csv('https://meusite.mackenzie.br/rogerio/TIC/Life_Expectancy_Data.csv')
df = na.omit(df)
head(df)
```

```
##       Country Year     Status Life.expectancy Adult.Mortality infant.deaths
## 1 Afghanistan 2015 Developing            65.0             263            62
## 2 Afghanistan 2014 Developing            59.9             271            64
## 3 Afghanistan 2013 Developing            59.9             268            66
## 4 Afghanistan 2012 Developing            59.5             272            69
## 5 Afghanistan 2011 Developing            59.2             275            71
## 6 Afghanistan 2010 Developing            58.8             279            74
##   Alcohol percentage.expenditure Hepatitis.B Measles  BMI under.five.deaths
## 1    0.01              71.279624          65    1154 19.1                83
## 2    0.01              73.523582          62     492 18.6                86
## 3    0.01              73.219243          64     430 18.1                89
## 4    0.01              78.184215          67    2787 17.6                93
## 5    0.01               7.097109          68    3013 17.2                97
## 6    0.01              79.679367          66    1989 16.7               102
##   Polio Total.expenditure Diphtheria HIV.AIDS       GDP Population
## 1     6              8.16         65      0.1 584.25921   33736494
## 2    58              8.18         62      0.1 612.69651     327582
## 3    62              8.13         64      0.1 631.74498   31731688
## 4    67              8.52         67      0.1 669.95900    3696958
## 5    68              7.87         68      0.1  63.53723    2978599
## 6    66              9.20         66      0.1 553.32894    2883167
##   thinness..1.19.years thinness.5.9.years Income.composition.of.resources
## 1                 17.2               17.3                           0.479
## 2                 17.5               17.5                           0.476
## 3                 17.7               17.7                           0.470
## 4                 17.9               18.0                           0.463
## 5                 18.2               18.2                           0.454
## 6                 18.4               18.4                           0.448
##   Schooling
## 1      10.1
## 2      10.0
## 3       9.9
## 4       9.8
## 5       9.5
## 6       9.2
```

1. Explore os dados. Quantos registros, quantidade de atributos, período etc.

**Solução**

2. Selecione somente os dados de 2014 e empregue eles nos exercícios a seguir. Verifique a quantidade de registros resultante.

**Solução**

3. Qual a média de Expectativa de Vida para os países em desenvolvimento e desenvolvidos em 2014?

**Solução**

4. Qual a média, mediana e quartis de BMI e Expectativa de Vida para os países desenvolvidos em 2014?

**Solução**

5. Qual a média e desvio padrão para os valores de BMI e Expectativa de Vida para os países em desenvolvimento e desenvolvidos em 2014?

**Solução**

6. Existe correlação significativa entre BMI e Expectativa de Vida para os desenvolvidos em 2014?

**Solução**

7. E para países em desenvolvimento, existe correlação significativa entre BMI e Expectativa de Vida em 2014?

**Solução**

8. Leia os dados novamente com todos os anos. Existem _outliers_ de BMI e Expectativa de Vida no conjunto de todos os países? Se sim, quantos dados são outliers? (empregue o critério dos interquartis)

DICA: empregue o comando `df = na.omit(df)` para eliminar valores ausentes nos dados como fizemos no início do exercício.

**Solução**

9. Qual a média de Expectativa de Vida com e sem _outliers_ (lembre-se de considerar aqui a base completa)?

**Solução**

### Exercício 2

Considere a base.

```
library(MASS)
help(painters)
```

```
## starting httpd help server ... done
```

```
painters = na.omit(painters)
head(painters)
```

```
##               Composition Drawing Colour Expression School
## Da Udine               10       8     16          3      A
## Da Vinci               15      16      4         14      A
## Del Piombo              8      13     16          7      A
## Del Sarto              12      16      9          8      A
## Fr. Penni               0      15      8          0      A
## Guilio Romano          15      16      4         14      A
```

1. Quantos tipos de escolas de pintores existem?

**Solução**

2. Qual a _moda_ das escolas de pintores?

**Solução**

3. Quantos pintores estão acima da média em composição?

**Solução**

4. Qual o pintor ou pintores com maior pontuação considerando todos os critérios? Não há muita surpresa aqui não?

DICA: crie uma nota com a soma de todas as pontuações dos pintores.

**Solução**

5. Explore a mediana e média através das notas de Composição e Colour dos pintores.

**Solução**

### Exercício 3

1. A mediana e desvio padrão são estatística que ajudam a compreender:

1. A centralidade e dispersão dos dados
2. A centralidade dos dados
3. A dispersão dos dados
4. A posição dos dados
5. Nenhuma das alternativas

**Solução**

2. Um conjunto de dados com um desvio padrão alto:

1. Está mais concentrado
2. É mais disperso
3. Apresenta média e medianas próximas
4. Apresenta média e medianas distantes
5. Nenhuma das alternativas

**Solução**

3. Uma correlação, entre duas variáveis, próxima de zero indica que:

1. As variáveis são independentes
2. As variáveis não tem relação
3. As variáveis não tem relação linear
4. As variáveis apresentam valores muito iguais
5. Nenhuma das alternativas

**Solução**

4. Outliers nos dados ser encontrados por:

1. Erros de medida
2. Erro na entrada dos dados
3. Ruído nos dados (interferências)
4. Valores legítimos mas que de fato se destacam do padrão dos dados
5. Todas as alternativas

**Solução**

5. Sobre o desvio padrão:

1. Diferentemente da variância encontra-se na mesma unidade que os dados
2. É igual ao quadrado da variância
3. É uma medida de dispersão dos dados São corretas:

1. Somente i
2. Somente i, ii
3. Somente i, iii
4. Somente ii, iii
5. Todas

**Solução**