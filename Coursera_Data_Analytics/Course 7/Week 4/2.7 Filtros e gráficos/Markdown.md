---
title: 'Lição 3: Filtros e gráficos'
output: html_document
---

## Histórico para esta atividade
Nesta atividade, você revisará um cenário e praticará a criação de uma visualização de dados com ggplot2. Você aprenderá a usar os recursos de filtros e facetas do ggplot2 para criar visualizações personalizadas com base em diferentes critérios. 

Ao longo dessa atividade, você também terá a oportunidade de praticar a escrita de seu próprio código, fazendo você mesmo as alterações nos blocos de código. Se você encontrar um erro ou ficar travado, sempre poderá verificar o arquivo Lesson3_Filters_Solutions.rmd na pasta Soluções na Semana 4 para obter o código completo e correto. 

## O cenário

Como analista de dados júnior de uma empresa de reservas de hotéis, você foi solicitado a limpar os dados de reservas de hotéis, criar visualizações com o `ggplot2` para obter informações sobre os dados e apresentar diferentes facetas dos dados por meio de visualização. Agora, você desenvolverá o trabalho realizado anteriormente para aplicar filtros às suas visualizações de dados em `ggplot2`.  

## Etapa 1: Importar seus dados

Se você não saiu de RStudio desde a última importação desses dados, você pode pular estas etapas. A reexecução desses blocos de código não afetará seu console se você quiser executá-los apenas por precaução.  

Se esta linha causar um erro, copie a linha `setwd("projects/Course 7/Week 4")` antes dela.

Execute o código abaixo para ler o arquivo 'hotel_bookings.csv' em um data frame: 

```{r load data}
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

## Etapa 4: Como fazer muitos gráficos diferentes

Anteriormente, você criou um gráfico de dispersão para explorar a relação entre o tempo de espera da reserva e os hóspedes que viajam com crianças. Para relembrar, aqui está o código:

```
{r
ggplot(data = hotel_bookings) +
  geom_point(mapping = aes(x = lead_time, y = children))
```

Sua parte interessada perguntou sobre o grupo de hóspedes que normalmente faz reservas antecipadas e esse gráfico mostrou que muitos desses hóspedes não têm filhos.

Agora, sua parte interessada deseja realizar uma promoção voltada para famílias visando os principais segmentos do mercado. Ela quer saber quais segmentos de mercado geram o maior número de reservas e onde essas reservas são feitas (hotéis urbanos ou hotéis resort).

Primeiro, você decide criar um gráfico de barras mostrando cada tipo de hotel e segmento de mercado. Você usa cores diferentes para representar cada segmento de mercado:

```
{r
ggplot(data = hotel_bookings) +
  geom_bar(mapping = aes(x = hotel, fill = market_segment))
```

A função `geom_bar()` usa barras para criar um gráfico de barras. O gráfico tem 'hotel' no eixo x e 'count' no eixo y (observação: se você não especificar uma variável para o eixo y, o código padrão será 'count'). O código mapeia a estética 'fill' para a variável 'market_segment' para gerar seções codificadas por cores dentro de cada barra.

Depois de criar este gráfico de barras, você percebe que é difícil comparar o tamanho dos segmentos de mercado no topo das barras. Você quer que sua parte interessada possa comparar claramente cada segmento.

Você decide usar a função `facet_wrap()` para criar um gráfico separado para cada segmento de mercado. Nos parênteses da função `facet_wrap()`, adicione a variável 'market_segment' após o símbolo de til (~):

```
{r
ggplot(data = hotel_bookings) +
  geom_bar(mapping = aes(x = hotel)) +
  facet_wrap(~ market_segment)
```

Agora você tem um gráfico de barras separado para cada segmento de mercado. Sua parte interessada tem uma ideia mais clara do tamanho de cada segmento de mercado, bem como os dados correspondentes para cada tipo de hotel.

## Etapa 5: Filtragem

Para a próxima etapa, você precisará ter o pacote `tidyverse` instalado e carregado. Você deve ver uma janela pop-up perguntando se deseja instalar; se esse for o caso, clique em 'Install'. Isso pode levar alguns minutos!

Se você já fez isso porque está usando o pacote `tidyverse` por conta própria, pode pular este bloco de código.

```
{r
install.packages('tidyverse')
library(tidyverse)
```

Depois de considerar todos os dados, sua parte interessada decide enviar a promoção para as famílias que fazem reservas online para hotéis urbanos. O segmento online é o que mais cresce, e as famílias tendem a gastar mais em hotéis na cidade do que outros tipos de hóspedes.

Sua parte interessada pergunta se você pode criar um gráfico que mostre a relação entre o tempo de espera e os hóspedes que viajam com crianças para reservas online em hotéis de cidade. Isso lhe dará uma ideia melhor do momento específico para a promoção.

Você pensa sobre isso e percebe que tem todas as ferramentas necessárias para atender ao pedido. Você o divide nas duas etapas a seguir: 1) filtrar seus dados; 2) diagramar seus dados filtrados.

Para a primeira etapa, você pode usar a função `filter()` para criar um conjunto de dados que inclua apenas os dados desejados. Insira 'City Hotel' no primeiro conjunto de aspas e 'Online TA' no segundo conjunto de aspas para especificar seus critérios:

```
{r
onlineta_city_hotels <- filter(hotel_bookings, 
                           (hotel=="City Hotel" &
                             market_segment=="Online TA"))
```

Observe que você pode usar o caractere '&' para demonstrar que deseja que duas condições diferentes sejam verdadeiras. Além disso, você pode usar o caractere '$' para especificar qual coluna no data frame 'hotel_bookings' você está referenciando (por exemplo, 'market_segment').

Você pode usar a função `View()` para verificar seu novo data frame:

```
{r
View(onlineta_city_hotels)
```

Há também outra maneira de fazer isso. Você pode usar o operador pipe (%>%) para fazer isso em etapas!

Você nomeia este data frame como `onlineta_city_hotels_v2`:

```
{r
onlineta_city_hotels_v2 <- hotel_bookings %>%
  filter(hotel=="City Hotel") %>%
  filter(market_segment=="Online TA")
```

Observe como no bloco de código acima, o símbolo %>% é usado para observar as etapas lógicas desse código. Primeiro, ele começa com o nome do data frame, `onlineta_city_hotels_v2`, E DEPOIS ele diz ao `R` para começar com o data frame original `hotel_bookings`. Em seguida, ele diz para filtrar na coluna 'hotel'; finalmente, ele diz para filtrar na coluna 'market_segment'.

Este bloco de código gera o mesmo data frame usando a função `View()`:

```
{r
View(onlineta_city_hotels_v2)
```

## Etapa 6: Usar seu novo data frame

Você pode usar qualquer um dos data frames criados acima para seus novos gráficos porque eles são os mesmos.

Usando o código do seu gráfico de dispersão anterior, substitua `variable_name` no bloco de código abaixo por `onlineta_city_hotels` ou `onlineta_city_hotels_v2` para diagramar os dados solicitados pela sua parte interessada:

```
{r
ggplot(data = variable_name) +
  geom_point(mapping = aes(x = lead_time, y = children))
```

Com base no seu filtro anterior, este gráfico de dispersão mostra dados de reservas online para hotéis urbanos. O gráfico revela que as reservas com filhos tendem a ter um tempo de espera menor e as reservas com 3 filhos têm um tempo de espera significativamente menor (<200 dias). Assim, as promoções dirigidas às famílias podem ser feitas mais perto das datas de reserva válidas.

## Encerramento da atividade

Os filtros permitem que você crie diferentes visualizações de seus dados e investigue relacionamentos mais específicos em seus dados. Você pode praticar essas habilidades modificando os blocos de código no arquivo rmd ou usar esse código como ponto de partida em seu próprio console de projeto. Agora que sua parte interessada teve a chance de revisar esses gráficos, ela está interessada em adicionar anotações que possam usar para explicar os dados em uma apresentação. Felizmente, `ggplot2` tem uma função que permite que você faça exatamente isso. Você aprenderá mais sobre `ggplot2` na próxima atividade!