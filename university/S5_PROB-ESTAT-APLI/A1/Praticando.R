df <- read.csv('http://meusite.mackenzie.br/rogerio/TIC/mystocksn.csv')
head(df)

# 1. Inspecione os dados. Quantos registros e quantidade de atributos, quais atributos, etc. Qual o valor mínimo e máximo do dólar neste período?
str(df) # Obtendo informações sobre o DataFrame
dim(df) # Obtendo o número total de registros e atributos
summary(df$DOLAR) # Obtendo estatísticas resumidas, incluindo mínimo e máximo do dólar

# 2. Forneça as principais estatísticas dos dados com `summary`.
summary(df)

# 3. Crie um dataframe `mydf` somente com data e os índices VALE3 e PETR4.
mydf <- df[, c("data", "VALE3", "PETR4")]
head(mydf)

# 4. Qual o valor da ação VALE3 em 2020-03-02?
valor_VALE3_20200302 <- df[df$data == "2020-03-02", "VALE3"]
print(valor_VALE3_20200302)


# 5. Qual a média de valor da ação VALE3 nos dados?
media_VALE3 <- mean(df$VALE3)
print(media_VALE3)

# 6. Quantas vezes no período a ação VALE3 esteve acima da média para o mesmo período?
vezes_acima_media <- sum(df$VALE3 > media_VALE3)
print(vezes_acima_media)

# 7. Qual o percentual de vezes no período que a ação VALE3 esteve acima da média?
percentual_acima_media <- (vezes_acima_media / nrow(df)) * 100
print(percentual_acima_media)

# 8. Em algum momento no período a ação da VALE3 esteve com preço maior que a PETR4? Se sim, em que datas?
datas_maior_que_PETR4 <- df[df$VALE3 > df$PETR4, "data"]
print(datas_maior_que_PETR4)

### Exercício 2
library(MASS)
head(Cars93)

# 1. Quais são os tipos (`Type`) de veículos existentes? Qual o que apresenta maior número de veículos?
# Verificando os tipos de veículos
tipos_veiculos <- unique(Cars93$Type)
tipos_veiculos
# Encontrando o tipo que apresenta o maior número
tipo_maior_numero <- names(sort(table(Cars93$Type), decreasing = TRUE))[1]
tipo_maior_numero

# 2. Qual média de potência (`Horsepower`) dos veículos de Cars93 por origem?

origens <- unique(Cars93$Origin) # Verificando os valores únicos de origem
origens

media_potencia_por_origem <- tapply(Cars93$Horsepower, Cars93$Origin, mean) # Calculando a média de potência por origem
media_potencia_por_origem

# 3. Quantos veículos são do fabricante ‘Ford’ no total e somente para modelos ‘Sporty’?
total_ford <- sum(Cars93$Manufacturer == "Ford") # Contando o número total de veículos da Ford
sporty_ford <- sum(Cars93$Manufacturer == "Ford" & Cars93$Type == "Sporty") # Contando o número de veículos Ford do tipo Sporty

total_ford
sporty_ford

# 4. Qual o percentual de veículos são do fabricante ‘Ford’? E qual o percentual de veículos da Ford são ‘Sporty’?

percentual_ford <- (total_ford / nrow(Cars93)) * 100 # Calculando percentuais
percentual_sporty_ford <- (sporty_ford / total_ford) * 100

percentual_ford
percentual_sporty_ford

# 5. Qual o maior e o menor preço de veículos da ‘Ford’ ?
maior_preco_ford <- max(Cars93$Price[Cars93$Manufacturer == "Ford"], na.rm = TRUE) # Encontrando o maior e menor preço de veículos da Ford
menor_preco_ford <- min(Cars93$Price[Cars93$Manufacturer == "Ford"], na.rm = TRUE)

maior_preco_ford
menor_preco_ford
