names <- c("Peter", "Jennifer", "Julie", "Alex")
age <- c(15, 19, 21, 25)
people <- data.frame(names, age)

# Inspecionar o data frame

head(people)

str(people)
glimpse(people)

colnames(people)

colnames(people)

# Fazer um teste agora

fruit <- c("Limão", "Mirtilo", "Toranja", "Manga", "Morango")
rank <- c(4, 2, 5, 3, 1)
fruit_ranks <- data.frame(fruit, rank)