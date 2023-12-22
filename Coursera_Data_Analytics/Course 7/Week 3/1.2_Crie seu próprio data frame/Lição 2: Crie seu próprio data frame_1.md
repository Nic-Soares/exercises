---
title: "Lição 2: Crie seu próprio data frame"
output: html_document
---

## Histórico para esta atividade
Essa atividade é focada em criar e usar data frames em `R`. Um data frame é uma coleção de colunas contendo dados, semelhante a uma planilha ou tabela SQL. Os data frames são uma das ferramentas básicas que você usará para trabalhar com dados em `R`. E você pode criar data frames de diferentes fontes de dados.  

Existem três fontes comuns de dados:

- Um `pacote` com dados que podem ser acessados carregando esse `pacote`
- Um arquivo externo como uma planilha ou CSV que pode ser importado para o `R`
- Dados que foram gerados do zero usando o código `R`

De onde quer que os dados venham, você quase sempre desejará armazená-los em um objeto de data frame para trabalhar com eles. Agora, você pode começar a criar e explorar data frames com os blocos de código no espaço RMD. Para interagir com o bloco de código, clique na seta verde no canto superior direito do bloco. O código executado aparecerá no espaço RMD e em seu console.

Ao longo dessa atividade, você também terá a oportunidade de praticar a escrita de seu próprio código, fazendo você mesmo as alterações nos blocos de código. Se você encontrar um erro ou ficar travado, sempre poderá verificar o arquivo Lesson2_Dataframe_Solutions.rmd na pasta Soluções na Semana 3 para obter o código completo e correto.

## Etapa 1: Carregar pacotes

Comece instalando o pacote necessário; neste caso, você quer instalar o `tidyverse`. Se você já instalou e carregou o `tidyverse` nesta sessão, sinta-se à vontade para pular os blocos de código nesta etapa.

```{r}
install.packages("tidyverse")
```

Uma vez que um pacote é instalado, você pode carregá-lo executando a função `library()` com o nome do pacote entre parênteses:

```{r}
library(tidyverse)
```

## Etapa 2: Criar um data frame

Às vezes, você precisará gerar um data frame diretamente em `R`. Existem várias maneiras de fazer isso; uma das mais comuns é criar vetores individuais de dados e então combiná-los em um data frame usando a função `data.frame()`.

Veja como isso funciona. Primeiro, crie um vetor de nomes inserindo quatro nomes neste bloco de código entre as aspas e execute-o:

```{r}
names <- c("", "", "", "")
```

Em seguida, crie um vetor de idades adicionando quatro idades separadas por vírgulas ao bloco de código abaixo. Verifique se você está inserindo valores numéricos para as idades ou poderá obter um erro. 

```{r}
age <- c(, , , )
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

```

Agora, crie um novo vetor com um número representando sua classificação pessoal para cada fruta. Dê 1 para a fruta de que você mais gosta e 5 para a fruta de que você menos gosta. Lembre-se, as pontuações precisam estar na mesma ordem das frutas acima. Portanto, se sua fruta favorita for a última na lista acima, a pontuação '1' precisa estar na última posição na lista abaixo. Depois de inserir suas classificações, execute o bloco de código.

```{r}

```

Finalmente, combine os dois vetores em um data frame. Você pode chamá-lo de `fruit_ranks`. Edite o bloco de código abaixo e execute-o para criar seu data frame.

```{r}

```

Depois de executar esse bloco de código, ele criará um data frame com suas frutas e classificações.  

## Encerramento da atividade
Nesta atividade, você aprendeu como criar data frame, visualizá-los com funções de resumo como `head()` e `glimpse()` e, em seguida, fez alterações com a função `mutate()`. Você pode continuar praticando essas habilidades modificando os blocos de código no arquivo rmd ou usar esse código como ponto de partida em seu próprio console de projeto. Ao explorar os data frames, considere como eles são semelhantes e diferentes das tabelas com as quais você trabalhou em outras ferramentas de análise de dados, como planilhas e SQL. Os data frames são um dos blocos de construção mais básicos de que você precisará para trabalhar com dados em `R`. Portanto, entender como criar e trabalhar com data frames é um primeiro passo importante para analisar dados.  

Certifique-se de marcar esta atividade como concluída em Coursera.