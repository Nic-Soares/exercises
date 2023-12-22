---
title: "Lição 3: Limpeza de dados"
output: html_document
---

## Histórico para esta atividade

Nesta atividade, você revisará um cenário e focará na limpeza de dados reais em R. Você aprenderá mais sobre funções de limpeza de dados e realizará cálculos básicos para ganhar insights iniciais sobre seus dados.

Ao longo dessa atividade, você também terá a oportunidade de praticar a escrita de seu próprio código, fazendo você mesmo as alterações nos blocos de código. Se você encontrar um erro ou estiver travado, você sempre poderá verificar o arquivo Lesson2_Clean_Solutions.rmd na pasta Soluções na Semana 3 para obter o código completo e correto. 

## O cenário

Nesse cenário, você é um analista de dados iniciante que trabalha para uma empresa de reservas de hotéis. Você foi solicitado a limpar um arquivo .csv que foi criado após consultar um banco de dados para combinar duas tabelas diferentes de hotéis diferentes. Para saber mais sobre esses dados, você precisará usar funções para visualizar a estrutura deles, incluindo suas colunas e linhas. Você também precisará usar funções básicas de limpeza para preparar esses dados para análise.  

## Etapa 1: Carregar pacotes

Para começar a limpar seus dados, você precisará instalar os pacotes necessários. Se você já instalou e carregou o `tidyverse`, `skimr` e `janitor` nesta sessão, sinta-se à vontade para pular os blocos de código nesta etapa.

```r
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

Os dados dos quais se foi solicitada a limpeza estão atualmente em um arquivo .csv externo. Para visualizá-lo e limpá-lo em `R`, você precisará importá-lo. O pacote `readr` da biblioteca `tidyverse` tem várias funções para “ler” ou importar dados, inclusive arquivos .csv.

No bloco abaixo, você usará a função `read_csv()` para importar dados de um arquivo .csv na pasta de projeto chamada "hotel_bookings.csv" e salvá-los como um data frame chamado `bookings_df`:

Se esta linha causar um erro, copie a linha setwd("projects/Course 7/Week 3") antes dela.

```R
bookings_df <- read_csv("hotel_bookings.csv")
```

## Etapa 3: Conhecendo seus dados

Antes de começar a limpar seus dados, reserve um tempo para explorá-los. Você pode usar diversas funções com as quais já está familiarizado para visualizar seus dados, incluindo a função `head()` no bloco de código abaixo:

```R
head(bookings_df)
```

Você também pode resumir ou visualizar os dados com as funções `str()` e `glimpse()` para entender melhor os dados executando os blocos de código abaixo:

```R
str(bookings_df)
```

```R
glimpse(bookings_df)
```

Você também pode usar `colnames()` para verificar os nomes das colunas em seu conjunto de dados. Execute o bloco de código abaixo para descobrir os nomes das colunas neste conjunto de dados:

```R
colnames(bookings_df)
```

Alguns pacotes contêm funções mais avançadas para resumir e explorar seus dados. Um exemplo é o pacote `skimr`, que tem várias funções para esse propósito. Por exemplo, a função `skim_without_charts()` fornece um resumo detalhado dos dados. Tente executar o código abaixo:

```R
skim_without_charts(bookings_df)
```

## Etapa 4: Limpeza de seus dados

Com base nas funções que você usou até agora, como você descreveria seus dados em um resumo para sua parte interessada? Agora, digamos que você esteja principalmente interessado nas seguintes variáveis: 'hotel', 'is_canceled' e 'lead_time'. Criar um novo data frame com apenas essas colunas, chamando-o de `trimmed_df` adicionando os nomes das variáveis a esse bloco de código:

```R
trimmed_df <- bookings_df %>% 
  select(hotel, is_canceled, lead_time)
```

Lembre-se de verificar o documento de soluções se estiver tendo problemas para preencher qualquer um desses blocos de código.

Você pode notar que alguns dos nomes das colunas não são muito intuitivos, então você vai querer renomeá-los para torná-los mais compreensíveis. Você pode querer criar exatamente o mesmo data frame acima, mas renomeie a variável 'hotel' para 'hotel_type' a fim de deixar claro sobre o que são os dados

Preencha o espaço à esquerda do símbolo '=' com o novo nome da variável:

```R
trimmed_df %>% 
  select(hotel, is_canceled, lead_time) %>% 
  rename(hotel_type = hotel)
```

Outra tarefa comum é dividir ou combinar dados em colunas diferentes. Neste exemplo, você pode combinar o mês e o ano de chegada em uma coluna usando a função unite():

```R
example_df <- bookings_df %>%
  select(arrival_date_year, arrival_date_month) %>% 
  unite(arrival_month_year, c("arrival_date_month", "arrival_date_year"), sep = " ")
```

## Etapa 5: Outra maneira de fazer as coisas

Você também pode usar a função `mutate()` para fazer mudanças em suas colunas. Digamos que você queira criar uma nova coluna que resumisse todos os adultos, crianças e bebês em uma reserva para o número total de pessoas. Modifique o bloco de código abaixo para criar essa nova coluna:

```R
example_df <- bookings_df %>%
  mutate(guests = adults + children + babies)
head(example_df)
```

Ótimo. Agora é hora de calcular algumas estatísticas de resumo! Calcule o número total de reservas canceladas e o tempo médio de espera para reserva - você vai querer começar seu código após o símbolo %>%. Crie uma coluna chamada 'number_canceled' para representar o número total de reservas canceladas. Em seguida, crie uma coluna chamada 'average_lead_time' para representar o tempo médio de espera. Use a função `summarize()` para fazer isso no bloco de código abaixo:

```R
example_df <- bookings_df %>%
  mutate(number_canceled = sum(is_canceled),
         average_lead_time = mean(lead_time))
head(example_df)
```

Se você estiver tendo problemas para completar qualquer um dos blocos de código nessas atividades, lembre-se de que você pode consultar os documentos RMarkdown nas 'Soluções' para obter ajuda.

## Encerramento da atividade

Agora você tem alguma experiência em limpar e analisar dados em `R`; você usou funções de limpeza básicas como `rename()` e `clean_names()` e realizou cálculos básicos em dados reais. Você pode continuar praticando essas habilidades modificando os blocos de código no arquivo rmd ou usar esse código como ponto de partida em seu próprio console de projeto. Uma das razões pelas quais o `R` é uma ferramenta tão poderosa para análise de dados é porque você pode realizar tantas tarefas diferentes em um só lugar. Com as funções que você aprendeu nesse curso, você pode importar dados, criar e visualizar data frames e até limpar dados sem deixar seu console.

Certifique-se de marcar esta atividade como concluída em Coursera.