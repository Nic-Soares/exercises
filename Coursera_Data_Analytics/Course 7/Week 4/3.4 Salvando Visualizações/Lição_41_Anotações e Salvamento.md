## Histórico para esta atividade

Nesta atividade, você revisará um cenário e praticará adicionar anotações a uma visualização de dados com ggplot2. Você também aprenderá como salvar imagens de visualizações ggplot2 para que possa adicioná-las diretamente às apresentações.

Ao longo dessa atividade, você também terá a oportunidade de praticar a escrita de seu próprio código, fazendo você mesmo as alterações nos blocos de código. Se você encontrar um erro ou ficar travado, sempre pode verificar o arquivo Lesson4_Annotations_Solutions.rmd na pasta Soluções na Semana 4 para obter o código completo e correto.

## O cenário

Como analista de dados iniciante de uma empresa de reserva de hotéis, você tem criado visualizações em `R` com o pacote `ggplot2` para compartilhar insights sobre seus dados com as partes interessadas. Depois de criar uma série de visualizações usando o `ggplot()`, a estética `ggplot2` e filtros, sua parte interessada solicita que você adicione anotações a suas visualizações para ajudar a explicar suas descobertas em uma apresentação. Felizmente, `ggplot2` tem funções de anotação embutidas.

## Etapa 1: Importar seus dados

Se você não saiu de RStudio desde a última importação desses dados, você pode pular estas etapas. A reexecução desses blocos de código não afetará seu console se você quiser executá-los apenas por precaução.

Se esta linha causar um erro, copie a linha setwd("projects/Course 7/Week 4") antes dela.

Execute o código abaixo para ler o arquivo 'hotel_bookings.csv' em um data frame:

```
{r
hotel_bookings <- read.csv("hotel_bookings.csv")
```

## Etapa 2: Refrescar sua memória

Até agora, você está bastante familiarizado com esse conjunto de dados. Mas você pode refrescar sua memória com as funções `head()` e `colnames()`. Execute dois blocos de código abaixo para obter uma amostra dos dados e também visualizar todos os nomes das colunas:

```R
head(hotel_bookings)
```

```R
colnames(hotel_bookings)
```

## Etapa 3: Instalar e carregar os pacotes 'ggplot2' e 'tidyverse' (opcionais)

Se você ainda não instalou e carregou o pacote `ggplot2`, você precisará fazer isso antes de poder usar a função `ggplot()`. Você só precisa fazer isso uma vez, não toda vez que chamar `ggplot()`.

Você também pode pular esta etapa se não tiver fechado sua conta de RStudio desde a última atividade. Se você não tiver certeza, você pode executar o bloco de código e clicar em 'cancelar' se a mensagem de aviso aparecer informando que você já fez o download do pacote `ggplot2`.

Execute o bloco de código abaixo para instalar e carregar `ggplot2`. Isso pode levar alguns minutos!

```
{r
install.packages('ggplot2')
library(ggplot2)
```

Se você não instalou e carregou o tidyverse nesta sessão RStudio, você pode executar o bloco de código abaixo. Isso pode levar alguns minutos!

```
{r
install.packages('tidyverse')
library(tidyverse)
```

## Etapa 4: Como fazer anotações no seu gráfico

Sua parte interessada informa que gostaria que você compartilhasse sua visualização detalhando o tipo de pagamento por cidade, pois isso ajudará a informar como a empresa visa promoções no futuro. Ela solicita que você crie uma versão limpa e rotulada e salve-a como um arquivo .png para incluir em uma apresentação.

Para relembrar, aqui está o gráfico que você criou anteriormente:

```R
ggplot(data = hotel_bookings) +
  geom_bar(mapping = aes(x = market_segment)) +
  facet_wrap(~hotel)
```

Isso cria dois gráficos de barras: um para dados 'city_hotel' e um para dados 'resort_hotel'. O eixo x é 'market_segment' e o eixo y é 'count' para ambos os gráficos.

Nesta visualização, não está claro de onde vêm os dados, qual é a principal conclusão ou até mesmo o que os dados estão mostrando. Para explicar tudo isso, você pode aproveitar as anotações em `ggplot2`.

O primeiro passo será adicionar um título; essa geralmente é a primeira coisa em que as pessoas prestam atenção quando encontram uma visualização de dados pela primeira vez. Para adicionar um título, você adicionará `labs()` no fim do seu comando `ggplot()` e então inserirá um título lá. Adicione um título descritivo para o bloco de código abaixo:

```R
ggplot(data = hotel_bookings) +
  geom_bar(mapping = aes(x = market_segment)) +
  facet_wrap(~hotel) +
  labs(title="")
```

Esse bloco de código gerará o mesmo gráfico de antes, mas agora inclui um título para explicar a visualização de dados com mais clareza para seu público-alvo.

Você também deseja adicionar outro detalhe sobre qual período de tempo esses dados cobrem. Para fazer isso, você precisa descobrir de quando os dados são.

Você percebe que pode usar a função `min()` na coluna do ano nos dados:

```
min(hotel_bookings$arrival_date_year)
```

E a função `max()`:

```
max(hotel_bookings$arrival_date_year)
```

Mas você precisará salvá-las como variáveis a fim de usá-las em sua rotulagem; o seguinte bloco de código cria duas dessas variáveis:

```
mindate <- min(hotel_bookings$arrival_date_year)
maxdate <- max(hotel_bookings$arrival_date_year)
```

Agora, você adicionar um subtítulo usando `subtitle=` na função `labs()`. Então, você poderá usar a função `paste0()` para usar suas variáveis recém-criadas em seus rótulos. Isso é muito útil, pois se os dados forem atualizados e houver dados mais recentes adicionados, você não precisará alterar o código abaixo porque as variáveis são dinâmicas:

```
ggplot(data = hotel_bookings) +
  geom_bar(mapping = aes(x = market_segment)) +
  facet_wrap(~hotel) +
  theme(axis.text.x = element_text(angle = 45)) +
  labs(title="Comparação de segmentos de mercado por tipo de hotel para reservas de hotéis",
       subtitle=paste0("Dados de: ", mindate, " a ", maxdate))
```

Esse bloco de código adicionará o subtítulo 'Dados de: 2015 a 2017' abaixo do título que você adicionou anteriormente ao gráfico.

Você percebe que esse gráfico está exibindo os detalhes técnicos com um pouco de destaque. Você não quer que essa seja a segunda coisa que as pessoas notem durante a apresentação. Você decide trocar o `subtítulo` por uma `legenda` que aparecerá no canto inferior direito.

```
ggplot(data = hotel_bookings) +
  geom_bar(mapping = aes(x = market_segment)) +
  facet_wrap(~hotel) +
  theme(axis.text.x = element_text(angle = 45)) +
  labs(title="Comparação de segmentos de mercado por tipo de hotel para reservas de hotéis",
       caption=paste0("Dados de: ", mindate, " a ", maxdate))
```

Esse bloco de código faz uma pequena alteração à visualização que você criou no último bloco; agora o subtítulo "dados de: 2015 a 2017" está no canto inferior direito.

Agora você deseja limpar os rótulos dos eixos x e y para garantir que eles estejam realmente claros. Para fazer isso, você pode adicionar à função `labs()` e usar `x=` e `y=`. Sinta-se à vontade para alterar o texto do rótulo e interagir com ele:

```
ggplot(data = hotel_bookings) +
  geom_bar(mapping = aes(x = market_segment)) +
  facet_wrap(~hotel) +
  theme(axis.text.x = element_text(angle = 45)) +
  labs(title="Comparação de segmentos de mercado por tipo de hotel para reservas de hotéis",
       caption=paste0("Dados de: ", mindate, " a ", maxdate),
       x="Market Segment",
       y="Number of Bookings")
```

Agora você tem a visualização de dados anterior, mas agora os rótulos dos eixos x e y foram alterados de 'market_segment' e 'count' para 'Market Segment' e 'Number of Bookings' para que o gráfico fique mais claro.

## Etapa 5: Salvar seu gráfico

Agora, é hora de salvar o que você acabou de criar para poder compartilhar facilmente com as partes interessadas.

Você pode usar a função `ggsave()` para fazer exatamente isso! Ela salvará sua imagem como uma 7x7 no caminho do arquivo que você inserir por padrão, o que simplifica a exportação de seus gráficos de R.

A função `ggsave()` no bloco de código abaixo salvará o último gráfico que foi gerado, portanto, se você executou algo depois de executar o bloco de código acima, execute esse bloco de código novamente.

Em seguida, execute o seguinte bloco de código para salvar esse gráfico como um arquivo .png chamado `hotel_booking_chart`, o que deixa claro para as partes interessadas o que o arquivo .png contém. Agora você deve conseguir encontrar esse arquivo em sua guia 'Files' no canto inferior direito de sua tela. Dê uma olhada!

```
ggsave('hotel_booking_chart.png')
```

## Teste prático

Quais são as dimensões padrão que `ggsave()` salva uma imagem? Anote sua resposta e responda na plataforma Coursera.

A: 5x5 B: 10x10 C: 7x7 D: 25x25

Se você quiser fazer seu gráfico maior e mais retangular para caber na apresentação de slides, você pode especificar a altura e largura do seu .png no comando `ggsave()`. Edite o bloco de código abaixo para criar uma imagem .png de 16x8:

```
ggsave('hotel_booking_chart.png',
       width=16,
       height=8)
```

## Encerramento da atividade

Agora que você terminou de criar e exportar uma visualização de dados com anotações em `ggplot2`, você pode compartilhar o que criou com as principais partes interessadas para fornecer insights de suas descobertas de dados. Essas habilidades permitirão que você crie, anote e compartilhe suas visualizações de dados diretamente de seu espaço de console `R`. Você pode praticar essas habilidades modificando os blocos de código no arquivo rmd ou usar esse código como ponto de partida em seu próprio console de projeto. Você continuará a aprender mais sobre funções `ggplot2` neste curso, mas com as habilidades que você já praticou, você será capaz de gerar gráficos, utilizar funções estéticas, aplicar filtros e criar anotações para explicar seus dados.