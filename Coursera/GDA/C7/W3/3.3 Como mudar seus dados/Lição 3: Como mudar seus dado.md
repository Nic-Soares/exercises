---
title: "Lição 3: Como mudar seus dados"
output: html_document
---

## Histórico para esta atividade
Nesta atividade, você revisará um cenário e se concentrará na manipulação e alteração de dados reais no R. Você aprenderá mais sobre as funções que pode usar para manipular seus dados, usar resumos estatísticos para explorar seus dados e obter insights iniciais para suas partes interessadas.

Ao longo dessa atividade, você também terá a oportunidade de praticar a escrita de seu próprio código, fazendo você mesmo as alterações nos blocos de código. Se encontrar um erro ou ficar travado, sempre poderá verificar o arquivo Lesson3_Change_Solutions.rmd na pasta Soluções na Semana 3 para obter o código completo e correto.

## O cenário
Nesse cenário, você é um analista de dados iniciante que trabalha para uma empresa de reservas de hotéis. Você foi solicitado a limpar um arquivo .csv que foi criado após consultar um banco de dados para combinar duas tabelas diferentes de hotéis diferentes. Você já executou algumas funções básicas de limpeza nesses dados; esta atividade se concentrará no uso de funções para conduzir a manipulação básica de dados.

## Etapa 1: Carregar pacotes

Comece instalando os pacotes necessários. Se já instalou e carregou o `tidyverse`, `skimr` e `janitor` nesta sessão, sinta-se à vontade para pular os blocos de código nesta etapa. Isso pode levar alguns minutos para ser executado e você pode receber uma janela pop-up perguntando se deseja continuar. Clique em sim para continuar e instalar os pacotes.

```{r install packages}
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

No bloco abaixo, você usará a função `read_csv()` para importar dados de um .csv na pasta de projeto chamada "hotel_bookings.csv" e salvá-los como um data frame chamado `hotel_bookings`.

Se esta linha causar um erro, copie a linha setwd("projects/Course 7/Week 3") antes dela.

Digite o nome do arquivo no local correto para lê-lo em seu console R:

```R
hotel_bookings <- read_csv("hotel_bookings.csv")
```

## Etapa 3: Conhecendo seus dados

Como você tem feito em outros exemplos, você usará funções de resumo para conhecer seus dados. Desta vez, você vai completar os blocos de código abaixo para usar essas diferentes funções. Você pode usar a função `head()` para visualizar as colunas e as várias primeiras linhas de dados. Termine o bloco de código abaixo e execute-o:

```R
head(hotel_bookings)
```

### Teste prático

1. Quantas colunas há neste conjunto de dados? A: 45 B: 100 C: 32 D: 60
2. A variável 'arrival_date_month' é um dado do tipo chr ou caractere.
   A: Verdadeiro B: Falso

Agora você sabe que esse conjunto de dados contém informações sobre reservas de hotéis. Cada reserva é uma linha no conjunto de dados, e cada coluna contém informações como que tipo de hotel foi reservado, quando a reserva ocorreu e com que antecedência a reserva ocorreu (a coluna 'lead_time').

Além de `head()`, você pode usar também as funções `str()` e `glimpse()` para obter resumos de cada coluna em seus dados organizados horizontalmente. Você pode testar essas duas funções completando e executando os blocos de código abaixo:

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

Digamos que você queira organizar os dados por maior tempo de espera para menor tempo de espera porque deseja se concentrar nas reservas feitas com bastante antecedência. Você decide que quer tentar usar a função `arrange()`; insira o nome correto da coluna após a vírgula e execute este bloco de código:

```R
arrange(hotel_bookings, desc(lead_time))
```

Mas por que existem tantos zeros? Isso acontece porque `arrange()` ordena automaticamente por ordem crescente, e você precisa dizer especificamente quando ordenar por ordem decrescente, como o bloco de código abaixo:

```R
arrange(hotel_bookings, desc(lead_time))
```

Agora está na ordem de que você precisava. Você pode clicar nas diferentes páginas de resultados para ver também linhas de dados adicionais.

## Teste prático

Qual foi o intervalo de tempo mais alto para uma reserva de hotel nesse conjunto de dados? A: 737 B: 709 C: 629 D: 0

Observe que quando você apenas executa `arrange()` sem salvar seus dados em um novo data frame, isso não altera o data frame existente. Verifique executando `head()` novamente para descobrir se os tempos de espera mais altos são os primeiros:

```R
head(hotel_bookings)
```

Isso será verdade para todas as funções que você usará nesta atividade. Se você quiser criar um novo data frame que tenha essas alterações salvas, você usará o operador de tarefa, <- , conforme escrito no bloco de código abaixo para armazenar os dados organizados em um data frame chamado 'hotel_bookings_v2':

```R
hotel_bookings_v2 <- arrange(hotel_bookings, desc(lead_time))
```

Execute `head()` para verificar:

```R
head(hotel_bookings_v2)
```

Você também pode descobrir os tempos de espera máximo e mínimo sem classificar todo o conjunto de dados usando a função `arrange()`. Experimente usando as funções `max()` e `min()` abaixo:

```R
max(hotel_bookings$lead_time)
```

```R
min(hotel_bookings$lead_time)
```

Lembre-se, neste caso, você precisa especificar qual conjunto de dados e qual coluna usando o símbolo $ entre seus nomes. Tente executar o código abaixo para ver o que acontece se você esquecer uma dessas peças

```R
min(lead_time)
```

Este é um erro comum que os usuários de R encontram. Para corrigir esse bloco de código, você precisará adicionar o data frame e o cifrão nos locais apropriados.

Agora, digamos que você só queira saber qual é o tempo de espera médio de reserva porque seu chefe pergunta com que antecedência deve-se fazer promoções para quartos de hotel. Você pode usar a função `mean()` para responder a essa pergunta, pois a média de um conjunto de números também é a mean do conjunto de números:

```R
mean(hotel_bookings$lead_time)
```

Você deve obter a mesma resposta mesmo se usar o conjunto de dados v2 que inclui a função `arrange()`. Isso ocorre porque a função `arrange()` não altera os valores no conjunto de dados; apenas os reorganiza.

```R
mean(hotel_bookings_v2$lead_time)
```

## Teste prático

Qual é o tempo de espera médio? A: 100,0011 B: 45,0283 C: 14,0221 D: 104,0114

Você conseguiu informar ao seu chefe qual é o tempo de espera médio antes da reserva, mas agora eles querem saber qual é o tempo de espera médio antes da reserva apenas para hotéis da cidade. Eles querem focar a promoção que estão realizando visando as principais cidades.

Você sabe que sua primeira etapa será criar um novo conjunto de dados que contenha apenas dados sobre hotéis da cidade. Você pode fazer isso usando a função `filter()` e nomear seu novo data frame como 'hotel_bookings_city':

```R
hotel_bookings_city <- filter(hotel_bookings, hotel == "City Hotel")
```

Confira seu novo conjunto de dados:

```R
head(hotel_bookings_city)
```

Você verifica rapidamente qual é o tempo de espera médio para esse conjunto de hotéis, assim como fez para todos os hotéis anteriores:

```R
mean(hotel_bookings_city$lead_time)
```

Agora, seu chefe quer saber muito mais informações sobre os hotéis da cidade, incluindo o tempo de espera máximo e mínimo. Eles também estão interessados em como eles são diferentes dos hotéis resort. Você não quer executar cada linha de código repetidamente, então você decide usar as funções `group_by()` e `summarize()`. Você também pode usar o operador pipe para tornar seu código mais fácil de seguir. Você armazenará o novo conjunto de dados em um data frame chamado 'hotel_summary':

```R
hotel_summary <- 
  hotel_bookings %>%
  group_by(hotel) %>%
  summarise(average_lead_time = mean(lead_time),
            min_lead_time = min(lead_time),
            max_lead_time = max(lead_time))
```

Confira seu novo conjunto de dados usando head() novamente:

```R
head(hotel_summary)
```

## Encerramento da atividade

Ser capaz de manipular dados é uma habilidade chave para trabalhar em `R`. Após esta atividade, você deve estar mais familiarizado com funções que permitem alterar seus dados, como `arrange()`, `group_by()` e `filter()`. Você também tem alguma experiência no uso de resumos estatísticos para obter insights sobre seus dados. Você pode continuar praticando essas habilidades modificando os blocos de código no arquivo rmd ou usar esse código como ponto de partida em seu próprio console de projeto. À medida que você pratica, considere como a execução de tarefas é semelhante e diferente em `R` em comparação com outras ferramentas que você conheceu ao longo deste programa.