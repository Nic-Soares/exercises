---
title: "Lições de mudança - Lição 3: Soluções de mudança"
output: html_document
---

## Soluções de mudança de dados
Este documento contém as soluções para a atividade de mudança. Você pode usar essas soluções para verificar seu trabalho e garantir que seu código esteja correto ou solucionar problemas de seu código se ele estiver retornando erros. Se você ainda não concluiu a atividade, sugerimos que volte e termine-a antes de ler as soluções.

Se ocorrerem erros, lembre-se de que você pode pesquisar na Internet e na Comunidade de RStudio para obter ajuda: [Comunidade RStudio](https://community.rstudio.com/)

## Etapa 1: Carregar pacotes

Comece instalando os pacotes necessários. Se você já instalou e carregou o `tidyverse`, `skimr` e `janitor` nesta sessão, sinta-se à vontade para pular os blocos de código nesta etapa.

```R
install.packages("tidyverse")
install.packages("skimr")
install.packages("janitor")
```

Uma vez que um pacote é instalado, você pode carregá-lo executando a função `library()` com o nome do pacote entre parênteses:

```R
library(tidyverse)
library(skimr)
library(janitor)
```

## Etapa 2: Importar dados

Os dados neste exemplo são originalmente do artigo Hotel Booking Demand Datasets ([Hotel Booking Demand](https://www.sciencedirect.com/science/article/pii/S2352340918315191)), escrito por Nuno Antonio, Ana Almeida e Luis Nunes para Data in Brief, volume 22, fevereiro de 2019.

Os dados foram baixados e limpos por Thomas Mock e Antoine Bichat para o #TidyTuesday durante a semana de 11 de fevereiro de 2020 ([TidyTuesday 2020-02-11](https://github.com/rfordatascience/tidytuesday/blob/master/data/2020/2020-02-11/readme.md)).

Você pode aprender mais sobre o conjunto de dados aqui: [Hotel Booking Demand Kaggle](https://www.kaggle.com/jessemostipak/hotel-booking-demand)

No bloco abaixo, você usará a função `read_csv()` para importar dados de um .csv na pasta de projeto chamada "hotel_bookings.csv" e salvá-los como um data frame chamado `hotel_bookings`:

```
{r
hotel_bookings <- read_csv("hotel_bookings.csv")
```

## Etapa 3: Conhecendo seus dados

Como você tem feito em outros exemplos, use a função `head()` para visualizar as colunas e as primeiras linhas de dados executando o bloco abaixo:

```R
head(hotel_bookings)
```

### Respostas do Teste prático

1. Quantas colunas há neste conjunto de dados?
   - A: 45
   - B: 100
   - C: 32
   - D: 60
   - Resposta: C. Existem 32 colunas neste conjunto de dados. A função `head()` retorna uma visualização do conjunto de dados, incluindo as primeiras seis linhas de dados e quantas colunas couberem na tela. Na parte inferior esquerda da tabela, ela informa que está visualizando de 1 a 4 de 32 colunas.
2. A variável 'arrival_date_month' é um dado do tipo chr ou caractere.
   - A: Verdadeiro
   - B: Falso
   - Resposta: A. A variável 'arrival_date_month' é um dado do tipo chr ou caractere. Abaixo do nome da coluna na tabela de visualização, há uma descrição do tipo de dados para cada coluna.

Além de `head()`, você pode usar também as funções `str()` e `glimpse()` para obter resumos de cada coluna em seus dados organizados horizontalmente. Você pode testar essas duas funções executando os blocos de código abaixo:

```R
str(hotel_bookings)
```

Você pode ver os diferentes nomes de coluna e alguns valores de amostra à direita dos dois pontos.

```R
glimpse(hotel_bookings)
```

Você também pode usar `colnames()` para obter os nomes das colunas em seu conjunto de dados. Execute o bloco de código abaixo para obter os nomes das colunas:

```R
colnames(hotel_bookings)
```

## Como manipular seus dados

Digamos que você queira organizar os dados por maior tempo de espera para menor tempo de espera porque deseja se concentrar nas reservas feitas com bastante antecedência. Você decide que quer tentar usar a função `arrange()` e executa o comando a seguir:

```R
arrange(hotel_bookings, lead_time)
```

`arrange()` ordena automaticamente por ordem crescente, e você precisa dizer especificamente quando ordenar por ordem decrescente, como o bloco de código abaixo:

```R
arrange(hotel_bookings, desc(lead_time))
```

## Respostas do Teste prático

Qual foi o intervalo de tempo mais alto para uma reserva de hotel nesse conjunto de dados?

- A: 737
- B: 709
- C: 629
- D: 0
- Resposta: A. O intervalo de tempo mais alto para uma reserva de hotel nesse conjunto de dados é de 737 dias. Depois de usar a função `arrange()` para classificar hotel_bookings por tempo de espera em ordem decrescente, você notará que 737 é a primeira linha. Isso é mais de dois anos de antecedência!

Observe que quando você apenas executa `arrange()` sem salvar seus dados em um novo data frame, isso não altera o data frame existente. Verifique executando `head()` novamente para descobrir se os tempos de espera mais altos são os primeiros:

```R
head(hotel_bookings)
```

Se você quiser criar um novo data frame que tenha essas alterações salvas, você usará o <- conforme escrito no bloco de código abaixo para armazenar os dados organizados em um data frame chamado 'hotel_bookings_v2':

```R
hotel_bookings_v2 <-
  arrange(hotel_bookings, desc(lead_time))
```

Confira o novo data frame:

```R
head(hotel_bookings_v2)
```

Você também pode descobrir os tempos de espera máximo e mínimo sem classificar todo o conjunto de dados usando a função `arrange()`. Experimente usando as funções max() e min() abaixo:

```R
max(hotel_bookings$lead_time)
```

```R
min(hotel_bookings$lead_time)
```

Lembre-se, neste caso, você precisa especificar qual conjunto de dados e qual coluna usando o símbolo $ entre seus nomes. Tente executar o código abaixo para ver o que acontece se você esquecer uma dessas peças:

```R
min(lead_time)
```

Este é um erro comum que os usuários de R encontram.

Agora, digamos que você só queira saber qual é o tempo de espera médio de reserva porque seu chefe pergunta com que antecedência deve-se fazer promoções para quartos de hotel. Você pode usar a função `mean()` para responder a essa pergunta:

```R
mean(hotel_bookings$lead_time)
```

Você deve obter a mesma resposta mesmo se usar o conjunto de dados v2 que inclui a função `arrange()`.

```R
mean(hotel_bookings_v2$lead_time)
```

## Teste prático

Qual é o tempo de espera médio?

- A: 100
- B: 45
- C: 14
- D: 104,0114
- Resposta: D. O intervalo médio de tempo é de 104,0114 dias. Você pôde efetuar esse cálculo usando a função `mean()` na coluna lead_time em seu conjunto de dados.

Você conseguiu informar ao seu chefe qual é o tempo de espera médio antes da reserva, mas agora eles querem saber qual é o tempo de espera médio antes da reserva apenas para hotéis da cidade. Eles querem focar a promoção que estão realizando visando as principais cidades.

Você sabe que sua primeira etapa será criar um novo conjunto de dados que contenha apenas dados sobre hotéis da cidade. Você pode fazer isso usando a função `filter()` e nomear seu novo data frame como 'hotel_bookings_city':

```R
hotel_bookings_city <- 
  filter(hotel_bookings, hotel_bookings$hotel=="City Hotel")
```

Confira seu novo conjunto de dados:

```R
head(hotel_bookings_city)
```

Você verifica rapidamente qual é o tempo de espera médio para esse conjunto de hotéis, assim como fez para todos os hotéis anteriores:

```R
mean(hotel_bookings_city$lead_time)
```

Agora, seu chefe quer saber muito mais informações sobre os hotéis da cidade, incluindo o tempo de espera máximo e mínimo. Eles também estão interessados em como eles são diferentes dos hotéis resort. Você não quer executar cada linha de código repetidamente, então você decide usar as funções `group_by()` e `summarise()`. Você também pode usar o operador pipe para tornar seu código mais fácil de seguir. Você armazenará o novo conjunto de dados em um data frame chamado 'hotel_summary':

```R
hotel_summary <- 
  hotel_bookings %>%
  group_by(hotel) %>%
  summarise(average_lead_time=mean(lead_time),
            min_lead_time=min(lead_time),
            max_lead_time=max(lead_time))
```

Confira seu novo conjunto de dados usando `head()` novamente:

```R
head(hotel_summary)
```