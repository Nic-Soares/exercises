# Exercício 1

# df <- read.csv('https://meusite.mackenzie.br/rogerio/TIC/Life_Expectancy_Data.csv')
df <- read.csv('Life_Expectancy_Data.csv')
df <- na.omit(df)
head(df)

# 1. Explore os dados. Quantos registros, quantidade de atributos, período etc.
n_registros <- nrow(df)
n_atributos <- ncol(df)
periodo <- range(df$Year)

cat("Número de registros: ", n_registros, "\n")
cat("Número de atributos: ", n_atributos, "\n")
cat("Período: ", periodo[1], "a", periodo[2], "\n\n")

# 2. Selecione somente os dados de 2014 e empregue eles nos exercícios a seguir. Verifique a quantidade de registros resultante.
df_2014 <- df[df$Year == 2014, ]
n_registros_2014 <- nrow(df_2014)

cat("Números de registros em 2014:", n_registros_2014, "\n\n")

# 3. Qual a média de Expectativa de Vida para os países em desenvolvimento e desenvolvidos em 2014?
media_expectativa_desenvolvidos <- mean(df_2014$Life.expectancy[df_2014$Status == "Developed"])
media_expectativa_desenvolvimento <- mean(df_2014$Life.expectancy[df_2014$Status == "Developing"])

cat("Média de Expectativa de Vida para países desenvolvidos em 2014: ", media_expectativa_desenvolvidos, "\n")
cat("Média de Expectativa de Vida para países em desenvolvimento em 2014: ", media_expectativa_desenvolvimento, "\n")

# 4. Qual a média, mediana e quartis de BMI e Expectativa de Vida para os países desenvolvidos em 2014?
estatisticas_desenvolvidos <- data.frame(
  media_BMI = mean(df_2014$BMI),
  mediana_BMI = median(df_2014$BMI),
  quartil1_BMI = quantile(df_2014$BMI, 0.25),
  quartil3_BMI = quantile(df_2014$BMI, 0.75),
  media_expectativa = mean(df_2014$Life.expectancy),
  mediana_expectativa = median(df_2014$Life.expectancy),
  quartil1_expectativa = quantile(df_2014$Life.expectancy, 0.25),
  quartil3_expectativa = quantile(df_2014$Life.expectancy, 0.75)
)

print(estatisticas_desenvolvidos)
cat("\n")

# 5. Qual a média e desvio padrão para os valores de BMI e Expectativa de Vida para os países em desenvolvimento e desenvolvidos em 2014?
media_desenvolvidos <- mean(df_2014$BMI[df_2014$Status == "Developed"])
desvio_desenvolvidos <- sd(df_2014$BMI[df_2014$Status == "Developed"])
media_expectativa_desenvolvidos <- mean(df_2014$Life.expectancy[df_2014$Status == "Developed"])
desvio_expectativa_desenvolvidos <- sd(df_2014$Life.expectancy[df_2014$Status == "Developed"])

media_desenvolvimento <- mean(df_2014$BMI[df_2014$Status == "Developing"])
desvio_desenvolvimento <- sd(df_2014$BMI[df_2014$Status == "Developing"])
media_expectativa_desenvolvimento <- mean(df_2014$Life.expectancy[df_2014$Status == "Developing"])
desvio_expectativa_desenvolvimento <- sd(df_2014$Life.expectancy[df_2014$Status == "Developing"])

estatisticas_todos <- data.frame(
  media_BMI_desenvolvidos = media_desenvolvidos,
  desvio_BMI_desenvolvidos = desvio_desenvolvidos,
  media_expectativa_desenvolvidos = media_expectativa_desenvolvidos,
  desvio_expectativa_desenvolvidos = desvio_expectativa_desenvolvidos,
  media_BMI_desenvolvimento = media_desenvolvimento,
  desvio_BMI_desenvolvimento = desvio_desenvolvimento,
  media_expectativa_desenvolvimento = media_expectativa_desenvolvimento,
  desvio_expectativa_desenvolvimento = desvio_expectativa_desenvolvimento
)

print(estatisticas_todos)

# 6. Existe correlação significativa entre BMI e Expectativa de Vida para os desenvolvidos em 2014?
correlacao_desenvolvidos <- cor.test(df_2014$BMI[df_2014$Status == "Developed"], df_2014$Life.expectancy[df_2014$Status == "Developed"])
print(correlacao_desenvolvidos)
cat("\n")

# 7. E para países em desenvolvimento, existe correlação significativa entre BMI e Expectativa de Vida em 2014?
correlacao_desenvolvimento <- cor.test(df_2014$BMI[df_2014$Status == "Developing"], df_2014$Life.expectancy[df_2014$Status == "Developing"])
print(correlacao_desenvolvimento)
cat("\n")

# 8. Leia os dados novamente com todos os anos. Existem outliers de BMI e Expectativa de Vida no conjunto de todos os países? Se sim, quantos dados são outliers? (empregue o critério dos interquartis)
df <- na.omit(df)

outliers_BMI <- df$BMI < quantile(df$BMI, 0.25) - 1.5 * IQR(df$BMI) | df$BMI > quantile(df$BMI, 0.75) + 1.5 * IQR(df$BMI)
outliers_expectativa <- df$Life.expectancy < quantile(df$Life.expectancy, 0.25) - 1.5 * IQR(df$Life.expectancy) | df$Life.expectancy > quantile(df$Life.expectancy, 0.75) + 1.5 * IQR(df$Life.expectancy)

n_outliers_BMI <- sum(outliers_BMI)
n_outliers_expectativa <- sum(outliers_expectativa)
cat("Número de outliers de BMI:", n_outliers_BMI, "\n")
cat("Número de outliers de Expectativa de Vida:", n_outliers_expectativa, "\n\n")

# 9. Qual a média de Expectativa de Vida com e sem outliers (lembre-se de considerar aqui a base completa)?
media_com_outliers <- mean(df$Life.expectancy)
media_sem_outliers <- mean(df$Life.expectancy[!outliers_expectativa])

cat("Média de Expectativa de Vida com outliers:", media_com_outliers, "\n")
cat("Média de Expectativa de Vida sem outliers:", media_sem_outliers, "\n")

# Exercício 2

library(MASS) # Carregando a biblioteca MASS

painters <- na.omit(painters) # Carregando a base de dados painters e removendo linhas com valores ausentes

head(painters) # Visualizando as primeiras linhas da base de dados

# 1. Quantos tipos de escolas de pintores existem?
tipos_escolas <- unique(painters$School)
num_tipos_escolas <- length(tipos_escolas)

# Exibindo o resultado
print(num_tipos_escolas)

# 2. Qual a nota das escolas de pintores?
frequencia_escolas <- table(painters$School) # Utilizando a função table() para contar a frequência de cada escola

nota_escola <- names(frequencia_escolas)[which.max(frequencia_escolas)] # Encontrando a moda (escola mais frequente)

print(nota_escola)

# 3. Quantos pintores estão acima da média em composição?
media_composicao <- mean(painters$Compos) # Calculando a média da pontuação de Composição

pintores_acima_da_media <- sum(painters$Compos > media_composicao) # Contando o número de pintores acima da média em Composição

print(pintores_acima_da_media)

# 4. Qual o pintor ou pintores com maior pontuação considerando todos os critérios? Não há muita surpresa aqui não?
# DICA: crie uma nota com a soma de todas as pontuações dos pintores.
painters$Nota <- rowSums(painters[, c("Composition", "Colour", "Drawing", "Expression")]) # Removendo a coluna "School" do cálculo da nota

pintor_maior_pontuacao <- painters[which.max(painters$Nota), ] # Encontrando o(s) pintor(es) com maior pontuação

print(pintor_maior_pontuacao)

# 5. Explore a mediana e média através das notas de Composição e Colour dos pintores.
# Calculando a mediana e média das notas de Composição e Colour
mediana_composicao <- median(painters$Composition)
media_composicao <- mean(painters$Composition)

mediana_colour <- median(painters$Colour)
media_colour <- mean(painters$Colour)

# Exibindo os resultados
print(paste("Mediana Composição:", mediana_composicao))
print(paste("Média Composição:", media_composicao))
print(paste("Mediana Colour:", mediana_colour))
print(paste("Média Colour:", media_colour))
