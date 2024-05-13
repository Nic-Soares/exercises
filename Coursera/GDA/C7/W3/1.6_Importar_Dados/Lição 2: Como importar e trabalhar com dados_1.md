---
title: "Lição 2: Como importar e trabalhar com dados"
output: html_document
---

## Histórico para esta atividade / Introdução
Até agora, você já tem alguma experiência inserindo dados manualmente em R para criar um data frame. Como analista de dados, também será comum para você importar dados de arquivos externos para seu console de R e usá-los para criar um data frame e analisá-lo. Nesta atividade você aprenderá como importar dados de fora do `R` usando a função `read_csv()`. Então, uma vez que você importou um arquivo de dados, você usará funções `R` para manipular e interagir com esses dados.

Você pode começar a criar e explorar dados com os blocos de código no espaço RMD. Para interagir com o bloco de código, clique na seta verde no canto superior direito do bloco. O código executado aparecerá no espaço RMD e em seu console. 

Ao longo dessa atividade, você também terá a oportunidade de praticar a escrita de seu próprio código, fazendo você mesmo as alterações nos blocos de código. Se você encontrar um erro ou estiver travado, você sempre poderá verificar o arquivo Lesson2_Import_Solutions.rmd na pasta Soluções na Semana 3 para obter o código completo e correto.

## O cenário

Nesse cenário, você é um analista de dados iniciante que trabalha para uma empresa de reservas de hotéis. Você foi solicitado a limpar um arquivo .csv que foi criado após consultar um banco de dados para combinar duas tabelas diferentes de hotéis diferentes. Para saber mais sobre esses dados, você precisará usar funções para visualizar a estrutura deles, incluindo suas colunas e linhas. Você também precisará usar funções básicas de limpeza para preparar esses dados para análise.

## Etapa 1: Carregar pacotes

Comece instalando o pacote necessário. Se você já instalou e carregou o `tidyverse` nesta sessão, sinta-se à vontade para pular os blocos de código nesta etapa.

```{r}
install.packages("tidyverse")
```

Uma vez que um pacote é instalado, podemos carregá-lo executando a função `library()` com o nome do pacote entre parênteses:

```{r}
library(tidyverse)
```

## Etapa 2: Importar dados

Um dos tipos de arquivo mais comuns que os analistas de dados importam para o `R` são os arquivos de valores separados por vírgulas, ou arquivos .csv. O pacote `readr` da biblioteca `tidyverse` tem várias funções para «ler» ou importar dados, inclusive arquivos .csv e outras fontes externas. 

No bloco abaixo, use a função `read_csv()` para importar dados de um .csv na pasta de projeto chamada "hotel_bookings.csv" e salvá-los como um data frame chamado `bookings_df`. 

Se esta linha causar um erro, copie a linha setwd("projects/Course 7/Week 3") antes dela. 

Os resultados serão exibidos como especificações de coluna:

```{r}
bookings_df <- read_csv("hotel_bookings.csv")
```

Agora que você tem o `bookings_df`, você pode trabalhar com ele usando todas as funções de `R` que você aprendeu até agora. 

## Etapa 3: Inspecionar e limpar dados

Uma função comum que você pode usar para visualizar os dados é a função `head()`, que retorna as colunas e as várias primeiras linhas de dados. Verifique a função `head()` executando o bloco abaixo:

```{r}
head(bookings_df)
```

Além de `head()`, existem várias outras funções úteis para resumir ou visualizar seu data frame. Por exemplo, a função `str()` fornece resumos de cada coluna em seus dados organizados horizontalmente. Confira a função `str()` executando o bloco de código abaixo:

```{r}
str(bookings_df)
```

Para descobrir quais colunas você tem em seu data frame, tente executar a função `colnames()` no bloco de código abaixo:

```{r}
colnames(bookings_df)
```

Se você quiser criar outro data frame usando `bookings_df` que se concentre na taxa média diária, que é chamada de `adr` no data frame e `adults`, você pode usar o bloco de código a seguir para fazer isso:

```{r}
new_df <- select(bookings_df, `adr`, adults)
```

Para criar novas variáveis no seu data frame, você pode usar a função `mutate()`. Isso fará alterações no data frame, mas não no conjunto de dados original que você importou. Esses dados fonte permanecerão inalterados. 

```{r}
mutate(new_df, total = `adr` / adults)
```

# Etapa 4: Importar seus próprios dados.

Agora você pode encontrar seu próprio .csv para importar! Usando a interface de RStudio Cloud, importe e salve o arquivo na mesma pasta deste documento R Markdown. Para fazer isso, vá para a guia Files no console inferior direito. Em seguida, clique no botão Upload ao lado do botão + New Folder. Isso abrirá uma janela pop-up para permitir que você procure um arquivo em seu computador. Selecione qualquer arquivo .csv e clique em Open. Agora, escreva o código no bloco abaixo para ler esses dados em `R`:

```{r}

```
Você pode consultar o documento de soluções desta atividade para verificar seu trabalho.

## Encerramento da atividade
Agora que você sabe como importar dados usando a função `read_csv()`, você poderá trabalhar com dados que foram armazenados externamente diretamente em seu console `R`. Você pode continuar praticando essas habilidades modificando os blocos de código no arquivo rmd ou usar esse código como ponto de partida em seu próprio console de projeto. À medida que você se familiarizar com o processo de importação de dados, considere como a importação de dados de um arquivo .csv mudou a maneira como você acessava e interagia com os dados. Você fez algo diferente? Ser capaz de importar dados de fontes externas permitirá que você trabalhe com ainda mais dados, oferecendo ainda mais opções para analisar dados em `R`.  

Certifique-se de marcar esta atividade como concluída em Coursera.