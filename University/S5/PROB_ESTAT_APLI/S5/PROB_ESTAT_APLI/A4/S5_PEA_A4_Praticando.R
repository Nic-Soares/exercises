library(ggplot2)

# Exercício 1

# 1.3. Cálculo da probabilidade
# Definindo a função pmf
pmf <- function(k, n, p) {
  return(factorial(n) / (factorial(k) * factorial(n - k)) * p^k * (1 - p)^(n - k))
}

# Definindo os parâmetros
n <- 100  # Número de segurados selecionados
k <- 12   # Número de mulheres desejado
p <- 0.2  # Probabilidade de selecionar uma mulher

# Calculando a probabilidade
probabilidade <- pmf(k, n, p)

# Imprimindo a probabilidade
print(probabilidade)

prob_exato <- dbinom(k, n, p)

print(prob_exato)

# 2.1. Necessidade de Revisão

# 2.2. Impacto da Inclusão de Mais um Transporte

# Exercício 2

mu <- 60
sigma <- 3

# Probabilidade de uma bateria durar menos de 65 horas
prob_menos_65 <- pnorm(65, mean = mu, sd = sigma)
cat("Probabilidade de uma bateria durar menos de 65 horas:", prob_menos_65, "\n")

# Probabilidade da pilha durar mais que a média
prob_mais_media <- 1 - pnorm(mu, mean = mu, sd = sigma)
cat("Probabilidade da pilha durar mais que a média:", prob_mais_media, "\n")

# Probabilidade da pilha durar mais que 65h
prob_mais_65 <- 1 - pnorm(65, mean = mu, sd = sigma)
cat("Probabilidade da pilha durar mais que 65 horas:", prob_mais_65, "\n")

# Exercício 3

# Parâmetros
media <- 18000
desvio_padrao <- 500
n_servidores <- 1000
horas_ano <- 8760

# Número esperado de servidores com falhas até o segundo ano
horas_segundo_ano <- 2 * horas_ano
falha_segundo_ano <- pnorm(horas_segundo_ano, mean = media, sd = desvio_padrao)
servidores_falha_segundo_ano <- n_servidores * falha_segundo_ano
cat("Número esperado de servidores com falhas até o segundo ano:", servidores_falha_segundo_ano, "\n")

# Número esperado de servidores com falhas até o terceiro ano
horas_terceiro_ano <- 3 * horas_ano
falha_terceiro_ano <- pnorm(horas_terceiro_ano, mean = media, sd = desvio_padrao)
servidores_falha_terceiro_ano <- n_servidores * falha_terceiro_ano
cat("Número esperado de servidores com falhas até o terceiro ano:", servidores_falha_terceiro_ano, "\n")

# Exercício 4

media <- 72
desvio_padrao <- 12
ponto <- 84

# Percentual de alunos com 84 ou mais pontos no exame
percentual_84_mais <- 100 * (1 - pnorm(ponto, mean = media, sd = desvio_padrao))
cat("Percentual de alunos com 84 ou mais pontos:", percentual_84_mais, "%\n")

# Porcentagem de alunos com até 70 pontos no exame
ponto <- 70
percentual_70_menos <- 100 * pnorm(ponto, mean = media, sd = desvio_padrao)
cat("Porcentagem de alunos com até 70 pontos:", percentual_70_menos, "%\n")

# Nota abaixo e acima dos percentis de 10% e 90% de notas
percentil_10 <- qnorm(0.10, mean = media, sd = desvio_padrao)
percentil_90 <- qnorm(0.90, mean = media, sd = desvio_padrao)
nota_abaixo_10_percentil <- round(percentil_10)
nota_acima_90_percentil <- round(percentil_90)
cat("Nota abaixo do percentil de 10%:", nota_abaixo_10_percentil, "\n")
cat("Nota acima do percentil de 90%:", nota_acima_90_percentil, "\n")

# Nota de corte para abranger 75% dos candidatos para uma segunda fase
percentil_75 <- qnorm(0.75, mean = media, sd = desvio_padrao)
nota_corte_segunda_fase <- round(percentil_75)
cat("Nota de corte para abranger 75% dos candidatos para uma segunda fase:", nota_corte_segunda_fase, "\n")
