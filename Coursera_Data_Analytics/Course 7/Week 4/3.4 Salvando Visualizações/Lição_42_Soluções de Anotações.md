---
title: "Lições 4: Soluções de anotações"
output: html_document
---

## Como anotar e salvar soluções

Este documento contém as soluções para a atividade de anotação e salvamento. Você pode usar essas soluções para verificar seu trabalho e garantir que seu código esteja correto ou solucionar problemas de seu código se ele estiver retornando erros. Se você ainda não concluiu a atividade, sugerimos que volte e termine-a antes de ler as soluções.

Se ocorrerem erros, lembre-se de que você pode pesquisar na Internet e na Comunidade de RStudio para obter ajuda: [RStudio Community](https://community.rstudio.com/)

## Etapa 1: Importar seus dados

Os dados neste exemplo são originalmente do artigo Hotel Booking Demand Datasets ([link](https://www.sciencedirect.com/science/article/pii/S2352340918315191)), escrito por Nuno Antonio, Ana Almeida e Luis Nunes para Data in Brief, volume 22, fevereiro de 2019.

Os dados foram baixados e limpos por Thomas Mock e Antoine Bichat para o #TidyTuesday durante a semana de 11 de fevereiro de 2020 ([link](https://github.com/rfordatascience/tidytuesday/blob/master/data/2020/2020-02-11/readme.md)).

Você pode aprender mais sobre o conjunto de dados [aqui](https://www.kaggle.com/jessemostipak/hotel-booking-demand).

Execute o código abaixo para ler o arquivo 'hotel_bookings.csv' em um data frame: 

```{r}
hotel_bookings <- read.csv("hotel_bookings.csv")
```

## Etapa 2: Refrescar sua memória

Até agora, você está bastante familiarizado com esse conjunto de dados. Mas você pode refrescar sua memória com as funções `head()` e `colnames()`. Execute dois blocos de código abaixo para obter uma amostra dos dados e também visualizar todos os nomes das colunas:

```
{r
head(hotel_bookings)
{r
colnames(hotel_bookings)
```

## Etapa 3: Instalar e carregar o pacote 'ggplot2' (opcional)

Se você ainda não instalou e carregou o pacote `ggplot2`, você precisará fazer isso antes de poder usar a função `ggplot()`. Você só precisa fazer isso uma vez, não toda vez que chamar `ggplot()`.

Você também pode pular esta etapa se não tiver fechado sua conta de RStudio desde a última atividade. Se você não tiver certeza, você pode executar o bloco de código e clicar em 'cancelar' se a mensagem de aviso aparecer informando que você já fez o download do pacote `ggplot2`.

Execute o bloco de código abaixo para instalar e carregar `ggplot2`. Isso pode levar alguns minutos!

```
{r
install.packages('ggplot2')
library(ggplot2)
```

## Etapa 4: Como fazer anotações no seu gráfico

Para relembrar, aqui está o gráfico que você criou anteriormente:

```R
ggplot(data = hotel_bookings) +
  geom_bar(mapping = aes(x = market_segment)) +
  facet_wrap(~hotel)
```

O primeiro passo será adicionar um título; essa geralmente é a primeira coisa em que as pessoas prestam atenção quando encontram uma visualização de dados pela primeira vez. Para adicionar um título, você adicionará `labs()` no fim do seu comando `ggplot()` e então inserirá um título lá:

```R
ggplot(data = hotel_bookings) +
  geom_bar(mapping = aes(x = market_segment)) +
  facet_wrap(~hotel) +
  labs(title="Comparação de segmentos de mercado por tipo de hotel para reservas de hotéis")
```

Você também deseja adicionar outro detalhe sobre qual período de tempo esses dados cobrem. Para fazer isso, você precisa descobrir de quando os dados são.

Você percebe que pode usar a função `min()` na coluna do ano nos dados:

```R
min(hotel_bookings$arrival_date_year)
```

E a função `max()`:

```R
max(hotel_bookings$arrival_date_year)
```

Mas você precisará salvá-las como variáveis a fim de usá-las em sua rotulagem; o seguinte bloco de código cria duas dessas variáveis:

```R
mindate <- min(hotel_bookings$arrival_date_year)
maxdate <- max(hotel_bookings$arrival_date_year)
```

Agora, você adicionará um subtítulo usando `subtitle=` na função `labs()`. Então, você poderá usar a função `paste0()` para usar suas variáveis recém-criadas em seus rótulos. Isso é muito útil, pois se os dados forem atualizados e houver dados mais recentes adicionados, você não precisará alterar o código abaixo porque as variáveis são dinâmicas:

```R
ggplot(data = hotel_bookings) +
  geom_bar(mapping = aes(x = market_segment)) +
  facet_wrap(~hotel) +
  labs(title="Comparação de segmentos de mercado por tipo de hotel para reservas de hotéis",
       subtitle=paste0("Dados de: ", mindate, " a ", maxdate))
```

Você decide trocar o `subtítulo` por uma `legenda` que aparecerá no canto inferior direito.

```R
ggplot(data = hotel_bookings) +
  geom_bar(mapping = aes(x = market_segment)) +
  facet_wrap(~hotel) +
  labs(title="Comparação de segmentos de mercado por tipo de hotel para reservas de hotéis",
       caption=paste0("Dados de: ", mindate, " a ", maxdate))
```

Agora você deseja limpar os rótulos dos eixos x e y para garantir que eles estejam realmente claros. Para fazer isso, você pode adicionar à função `labs()` e usar `x=` e `y=`. Sinta-se à vontade para alterar o texto do rótulo e interagir com ele:

```R
ggplot(data = hotel_bookings) +
  geom_bar(mapping = aes(x = market_segment)) +
  facet_wrap(~hotel) +
  labs(title="Comparação de segmentos de mercado por tipo de hotel para reservas de hotéis",
       caption=paste0("Dados de: ", mindate, " a ", maxdate),
       x="Segmento de Mercado",
       y="Número de Reservas")
```

## Etapa 5: Salvar seu gráfico

A função `ggsave()` foi usada para salvar o último gráfico que foi gerado, portanto, se você executou algo depois de executar o bloco de código acima, execute esse bloco de código novamente.

Em seguida, execute o seguinte bloco de código para salvar esse gráfico como um arquivo .png chamado `hotel_booking_chart`, o que deixa claro para as partes interessadas o que o arquivo .png contém. Agora você deve conseguir encontrar esse arquivo em sua guia 'Files' no canto inferior direito de sua tela. Dê uma olhada!

```R
ggsave('hotel_booking_chart.png')
```

## Teste prático

Quais são as dimensões padrão que `ggsave()` salvou sua imagem?

A: 5x5 B: 10x10 C: 7x7 D: 25x25

Resposta: C. As dimensões padrão dessa imagem ggsave() são 7x7. Essas dimensões também podem ser encontradas após a execução do bloco de código.

Se você quiser fazer seu gráfico maior e mais retangular para caber na apresentação de slides, você pode especificar a altura e largura do seu .png no comando `ggsave()`. Edite o bloco de código abaixo para criar uma imagem .png de 16x8:

```R
ggsave('hotel_booking_chart.png',
       width=16,
       height=8)
```