---
title: "Lição 2: Soluções com data frames"
output: html_document
---

##Crie uma solução com um data frame
Este documento contém as soluções para a atividade de criação de um data frame. Você pode usar essas soluções para verificar seu trabalho e garantir que seu código esteja correto ou solucionar problemas de seu código se ele estiver retornando erros. Se você ainda não concluiu a atividade, sugerimos que volte e termine-a antes de ler as soluções.

Se ocorrerem erros, lembre-se de que você pode pesquisar na Internet e na Comunidade de RStudio para obter ajuda:
https://community.rstudio.com/#

## Etapa 1: Carregar pacotes
Comece instalando o pacote necessário; neste caso, você quer instalar o `tidyverse`. Se você já instalou e carregou o `tidyverse` nesta sessão, sinta-se à vontade para pular os blocos de código nesta etapa.

```{r}
install.packages("tidyverse")
```
```{r}
library(tidyverse)
```

## Etapa 2: Criar um data frame

Às vezes, você precisará gerar um data frame diretamente em `R`. Existem várias maneiras de fazer isso; uma das mais comuns é criar vetores individuais de dados e então combiná-los em um data frame usando a função `data.frame()`.

Veja como isso funciona. Primeiro, crie um vetor de nomes:
```{r}
names <- c("Peter", "Jennifer", "Julie", "Alex")
```

Depois, crie um vetor de idades:

```{r}
age <- c(15, 19, 21, 25)
```

Com esses dois vetores, você pode criar um novo data frame chamado `people`:
```{r}
people <- data.frame(names, age)
```

## Etapa 3: Inspecionar o data frame

Agora que você tem esse data frame, pode usar algumas funções diferentes para inspecioná-lo.

Uma função comum que você pode usar para visualizar os dados é a função `head()`, que retorna as colunas e as várias primeiras linhas de dados. Você pode conferir como a função `head()` funciona executando o bloco abaixo:

```{r}
head(people)
```

Além de `head()`, existem várias outras funções úteis para resumir ou visualizar seus dados. Por exemplo, as funções `str()` e `glimpse()` fornecem resumos de cada coluna em seus dados organizados horizontalmente. Você pode conferir essas duas funções em ação executando os blocos de código abaixo:

```{r}
str(people)
```

```{r}
glimpse(people)
```

Você também pode usar `colnames()` para obter uma lista dos nomes das colunas em seu conjunto de dados. Execute o bloco de código abaixo para verificar esta função:

```{r}
colnames(people)
```

Agora que você tem um data frame, pode trabalhar com ele usando todas as ferramentas de `R`. Por exemplo, você pode usar `mutate()` se quiser criar uma nova variável que capture a idade de cada pessoa em vinte anos. O bloco de código abaixo cria essa nova variável:

```{r}
mutate(people, age_in_20 = age + 20)
```

## Etapa 4: Fazer um teste agora

Para se familiarizar mais com a criação e o uso de data frame, use os blocos de código abaixo para criar seu próprio data frame personalizado. 

Primeiro, crie um vetor de cinco frutas diferentes. Você pode digitar diretamente no bloco de código abaixo; basta colocar o cursor na caixa e clicar para digitar. Depois de inserir as frutas desejadas em seu data frame, execute o bloco de código.

```{r}
fruit <- c("Limão", "Mirtilo", "Toranja", "Manga", "Morango")
```

Agora, crie um novo vetor com um número representando sua classificação pessoal para cada fruta. Dê 1 para a fruta de que você mais gosta e 5 para a fruta de que você menos gosta. Lembre-se, as pontuações precisam estar na mesma ordem das frutas acima. Portanto, se sua fruta favorita for a última na lista acima, a pontuação '1' precisa estar na última posição na lista abaixo. Depois de inserir suas classificações, execute o bloco de código.

```{r}
rank <- c(4, 2, 5, 3, 1)
```

Finalmente, combine os dois vetores em um data frame. Você pode chamá-lo de `fruit_ranks`. Edite o bloco de código abaixo e execute-o para criar seu data frame.

```{r}
fruit_ranks <- data.frame(fruit, rank)
```

Depois de executar esse bloco de código, ele criará um data frame com suas frutas e classificações.