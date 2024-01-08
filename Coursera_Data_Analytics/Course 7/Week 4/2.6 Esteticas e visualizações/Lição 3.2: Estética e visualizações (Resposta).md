```
---
title: 'Lição 3: Estética e visualizações'
output: html_document
---

## Histórico para esta atividade

Nesta atividade, você revisará um cenário e continuará a aplicar seu conhecimento de visualização de dados com ggplot2. Você aprenderá mais sobre os recursos estéticos de visualizações e como personalizá-los por critérios específicos.

Ao longo dessa atividade, você também terá a oportunidade de praticar a escrita de seu próprio código, fazendo você mesmo as alterações nos blocos de código. Se encontrar um erro ou ficar travado, sempre poderá verificar o arquivo Lesson3_Aesthetics_Solutions.rmd na pasta Soluções na Semana 4 para obter o código completo e correto.

## O cenário

Neste exemplo, você é um analista de dados iniciante que trabalha para a mesma empresa de reservas de hotéis anterior. Da última vez, você criou algumas visualizações simples com `ggplot2` para fornecer às partes interessadas insights rápidos sobre seus dados. Agora, está interessado em criar visualizações que destacam diferentes aspectos dos dados para apresentar às partes interessadas. Você expandirá o que já aprendeu sobre `ggplot2` e criará novos tipos de visualizações como gráficos de barras.

## Etapa 1: Importar seus dados

Se não saiu de RStudio desde a última importação desses dados, pode pular estas etapas. A reexecução desses blocos de código não afetará seu console se quiser executá-los apenas por precaução.

Execute o código abaixo para ler o arquivo 'hotel_bookings.csv' em um data frame:

Se esta linha causar um erro, copie a linha setwd("projects/Course 7/Week 4") antes dela.

```{r load data}
hotel_bookings <- read.csv("hotel_bookings.csv")
```

## Etapa 2: Refrescar sua memória

Até agora, está bastante familiarizado com esse conjunto de dados. Mas pode refrescar sua memória com as funções `head()` e `colnames()`. Execute dois blocos de código abaixo para obter uma amostra dos dados e também visualizar todos os nomes das colunas:

```
{r
head(hotel_bookings)
{r
colnames(hotel_bookings)
```

## Etapa 3: Instalar e carregar o pacote 'ggplot2' (opcional)

Se ainda não instalou e carregou o pacote `ggplot2`, precisará fazer isso antes de poder usar a função `ggplot()`. Só precisa fazer isso uma vez, não toda vez que chamar `ggplot()`.

Também pode pular esta etapa se não tiver fechado sua conta de RStudio desde a última atividade. Se não tiver certeza, pode executar o bloco de código e clicar em 'cancelar' se a mensagem de aviso aparecer informando que já fez o download do pacote `ggplot2`.

Execute o bloco de código abaixo para instalar e carregar `ggplot2`. Isso pode levar alguns minutos!

```
{r
install.packages('ggplot2')
library(ggplot2)
```

## Etapa 4: Como criar um gráfico de barras

Sua parte interessada está interessada em desenvolver promoções com base em diferentes distribuições de reservas, mas primeiro ela precisa saber quantas das transações estão ocorrendo para cada tipo de distribuição diferente.

Pode dizer ao `ggplot()` que tipo de gráfico deseja criar usando o argumento `geom_`.

Anteriormente, usou a `geom_point` para criar um gráfico de dispersão comparando o tempo de reserva e o número de crianças. Agora, usará `geom_bar` para criar um gráfico de barras neste bloco de código:

```
{r
ggplot(data = hotel_bookings) +
  geom_bar(mapping = aes(x = distribution_channel))
```

Anteriormente, criava gráficos de dispersão com ggplot2. Esse bloco de código cria um gráfico de barras com 'distribution_channel' no eixo x e 'count' no eixo y. Há dados para canais de distribuição corporativa, diretos, sistema de distribuição global, TA/TO e indefinidos.

## Teste prático

Use o gráfico de barras que criou para responder a esta pergunta: qual tipo de distribuição possui o maior número de reservas? Anote sua resposta para a pergunta do teste prático no Coursera depois.

A: TA/TO B: Direto C: GDS D: Corporativa

## Etapa 5: Trabalho mais aprofundado com gráficos de barras

Depois de explorar seu gráfico de barras, sua parte interessada tem mais perguntas. Agora ela quer saber se o número de reservas para cada tipo de distribuição é diferente dependendo se houve ou não um depósito ou qual segmento de mercado ela representa.

Tente modificar o código abaixo para responder à pergunta sobre depósitos adicionando 'fill=deposit_type' após 'x = distribution_channel':

```
{r
ggplot(data = hotel_bookings) +
  geom_bar(mapping = aes(x = distribution_channel, fill=deposit_type))
```

Esse bloco de código também cria um gráfico de barras com 'distribution_channel' no eixo x e 'count' no eixo y. Mas também inclui dados da coluna 'deposit_type' como seções codificadas por cores de cada barra. Há uma legenda que explica o que cada cor representa no lado direito da visualização.

Agora tente adicionar 'fill=market_segment' a este bloco de código em vez de 'fill=deposit_type':

```
{r
ggplot(data = hotel_bookings) +
  geom_bar(mapping = aes(x = distribution_channel, fill=market_segment))
```

Esse gráfico de barras é semelhante ao gráfico anterior, exceto que os dados 'market_segment' estão sendo registrados nas seções codificadas por cores de cada barra.

## Etapa 6: Diversas facetas

Depois de revisar os novos gráficos, sua parte interessada pede que crie gráficos separados para cada tipo de depósito e segmento de mercado para ajudá-la a entender as diferenças com mais clareza.

Sabe que a função `facet_` pode fazer isso muito rapidamente.

Adicione 'deposit_type' após o símbolo '~' no bloco de código abaixo para criar um gráfico diferente para cada tipo de depósito:

```R
ggplot(data = hotel_bookings) +
  geom_bar(mapping = aes(x = distribution_channel)) +
  facet_wrap(~ deposit_type)
```

Esse bloco de código cria três gráficos de barras para os tipos de depósitos 'no_deposit', non_refund' e 'refundable'. Percebe que é difícil ler os rótulos do eixo x aqui, então adiciona um pedaço de código no final que gira o texto em 45 graus para facilitar a leitura.

Faça uma experiência

```
{r
ggplot(data = hotel_bookings) +
  geom_bar(mapping = aes(x = distribution_channel)) +
  facet_wrap(~deposit_type) +
  theme(axis.text.x = element_text(angle = 45))
```

Esse bloco de código cria um gráfico de barras semelhante ao bloco anterior, mas agora os rótulos no eixo x com os diferentes canais de distribuição estão mais claros.

Pode usar a mesma sintaxe para criar um gráfico diferente para cada segmento de mercado:

```
{r
ggplot(data = hotel_bookings) +
  geom_bar(mapping = aes(x = distribution_channel)) +
  facet_wrap(~market_segment) +
  theme(axis.text.x = element_text(angle = 45))
```

A função `facet_grid` faz algo semelhante. A principal diferença é que `facet_grid` incluirá gráficos mesmo que estejam vazios. Execute o bloco de código abaixo verificar:

```
{r
ggplot(data = hotel_bookings) +
  geom_bar(mapping = aes(x = distribution_channel)) +
  facet_grid(~deposit_type) +
  theme(axis.text.x = element_text(angle = 45))
```

Agora deve ter três gráficos de barras - mas observe que o gráfico 'Refundable' tem muito menos dados plotados do que os outros dois.

Agora, pode colocar tudo isso em um gráfico e explorar as diferenças por tipo de depósito e segmento de mercado.

Execute o bloco de código abaixo para descobrir; observe como o caractere ~ está sendo utilizado antes das variáveis pelas quais o gráfico está sendo dividido:

```
{r
ggplot(data = hotel_bookings) +
  geom_bar(mapping = aes(x = distribution_channel)) +
  facet_wrap(~deposit_type~market_segment) +
  theme(axis.text.x = element_text(angle = 45))
```

Esses gráficos provavelmente são sobrecarregados e muito difíceis de ler, mas podem ser úteis se estiver explorando seus dados por meio de visualizações.

## Encerramento da atividade

O pacote `ggplot2` permite que crie uma variedade de visualizações em `R`, desde gráficos de dispersão simples até gráficos de barras complicados e multifacetados. Pode praticar essas habilidades modificando os blocos de código no arquivo rmd ou usar esse código como ponto de partida em seu próprio console de projeto. À medida que continua explorando argumentos estéticos em `ggplot2`, considere como pode usar visualizações para obter insights e fazer observações sobre outros tipos de dados no futuro.