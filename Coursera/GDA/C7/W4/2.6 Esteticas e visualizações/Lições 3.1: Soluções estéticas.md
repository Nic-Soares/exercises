---
title: "Lições 3: Soluções estéticas"
output: html_document
---

## Soluções de atividade de estética e visualizações

Este documento contém as soluções para a atividade de estética e visualizações. Você pode usar essas soluções para verificar seu trabalho e garantir que seu código esteja correto ou solucionar problemas de seu código se ele estiver retornando erros. Se você ainda não concluiu a atividade, sugerimos que volte e termine-a antes de ler as soluções.

Se ocorrerem erros, lembre-se de que você pode pesquisar na Internet e na Comunidade de RStudio para obter ajuda: [RStudio Community](https://community.rstudio.com/#)

## Etapa 1: Importar seus dados
Se você não saiu de RStudio desde a última importação desses dados, você pode pular estas etapas. A reexecução desses blocos de código não afetará seu console se você quiser executá-los apenas por precaução.

Os dados neste exemplo são originalmente do artigo Hotel Booking Demand Datasets ([Hotel Booking Demand Datasets](https://www.sciencedirect.com/science/article/pii/S2352340918315191)), escrito por Nuno Antonio, Ana Almeida e Luis Nunes para Data in Brief, volume 22, fevereiro de 2019.

Os dados foram baixados e limpos por Thomas Mock e Antoine Bichat para a #TidyTuesday durante a semana de 11 de fevereiro de 2020 ([TidyTuesday](https://github.com/rfordatascience/tidytuesday/blob/master/data/2020/2020-02-11/readme.md)).

Você pode aprender mais sobre o conjunto de dados aqui: [Hotel Booking Demand](https://www.kaggle.com/jessemostipak/hotel-booking-demand)

Execute o código abaixo para ler o arquivo 'hotel_bookings.csv' em um data frame:

```r
hotel_bookings <- read.csv("hotel_bookings.csv")
```

## Etapa 2: Refrescar sua memória

Até agora, você está bastante familiarizado com esse conjunto de dados. Mas você pode refrescar sua memória com as funções `head()` e `colnames()`. Execute dois blocos de código abaixo para obter uma amostra dos dados e também visualizar todos os nomes das colunas:

```R

# Look at data
head(hotel_bookings)
```

```
Look at column names
colnames(hotel_bookings)
```

## Etapa 3: Instalar e carregar o pacote 'ggplot2' (opcional)

Execute o bloco de código abaixo para instalar e carregar o `ggplot2` se você ainda não o tiver instalado e carregado. Isso pode levar alguns minutos!

```
r
install.packages('ggplot2')
library(ggplot2)
```

## Etapa 4: Como criar um gráfico de barras

Anteriormente, você usou a `geom_point` para criar um gráfico de dispersão comparando o tempo de reserva e o número de crianças. Agora, você usará `geom_bar` para criar um gráfico de barras neste bloco de código:

```
r
# Example chart
ggplot(data = hotel_bookings) +
  geom_bar(mapping = aes(x = distribution_channel))
```

## Teste prático

Use o gráfico de barras que você criou para responder esta pergunta: qual tipo de distribuição possui o maior número de reservas? Anote sua resposta e responda na plataforma Coursera.

A: TA/TO B: Direto C: GDS D: Corporativa Resposta: A. A distribuição tipo TA/TO tem o maior número de reservas.

## Etapa 5: Trabalho mais aprofundado com gráficos de barras

Depois de explorar seu gráfico de barras, sua parte interessada tem mais perguntas. Agora ela quer saber se o número de reservas para cada tipo de distribuição é diferente dependendo se houve ou não um depósito ou qual segmento de mercado ela representa.

Tente executar o código abaixo para responder à pergunta sobre depósitos. Você usará 'fill=deposit_type' para fazer isso.

```
r
ggplot(data = hotel_bookings) +
  geom_bar(mapping = aes(x = distribution_channel, fill=deposit_type))
```

Agora tente executar o código abaixo para responder à pergunta sobre diferentes segmentos de mercado. Você usará 'fill=market_segment' para fazer isso.

```
r
ggplot(data = hotel_bookings) +
  geom_bar(mapping = aes(x = distribution_channel, fill=market_segment))
```

## Etapa 6: Diversas facetas

Depois de revisar os novos gráficos, sua parte interessada pede que você crie gráficos separados para cada tipo de depósito e segmento de mercado para ajudá-la a entender as diferenças com mais clareza.

Execute o bloco de código abaixo para criar um gráfico diferente para cada tipo de depósito:

```
r
ggplot(data = hotel_bookings) +
  geom_bar(mapping = aes(x = distribution_channel)) +
  facet_wrap(~deposit_type)
```

Execute o bloco de código abaixo para criar um gráfico diferente para cada segmento de mercado:

```
r
ggplot(data = hotel_bookings) +
  geom_bar(mapping = aes(x = distribution_channel)) +
  facet_wrap(~market_segment)
```

A função `facet_grid` faz algo semelhante. A principal diferença é que `facet_grid` incluirá gráficos mesmo que estejam vazios. Execute o bloco de código abaixo verificar:

```R
ggplot(data = hotel_bookings) +
  geom_bar(mapping = aes(x = distribution_channel)) +
  facet_grid(~deposit_type)
```

Agora, você pode colocar tudo isso em um gráfico e explorar as diferenças por tipo de depósito e segmento de mercado.

Execute o bloco de código abaixo para descobrir; observe como o caractere ~ está sendo utilizado antes das variáveis pelas quais o gráfico está sendo dividido:

```R
ggplot(data = hotel_bookings) +
  geom_bar(mapping = aes(x = distribution_channel)) +
  facet_wrap(~deposit_type~market_segment)
```