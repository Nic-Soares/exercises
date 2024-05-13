# Carregando o pacote tidyr
library(tidyr)

id <- c(1:10)
name <- c("John Mendes", "Rob Stewart", "Rachel Abrahamson", "Christy Hickman", "Johnson Harper", "Candace Miller", "Carlson Landy", "Pansy Jordan", "Darius Berry", "Claudia Garcia")
job_title <- c("Professional", "Programmer", "Management", "Clerical", "Developer", "Programmer", "Management", "Clerical", "Developer", "Programmer")

employee <- data.frame(id, name, job_title)

print(employee)

# Separando o nome em primeiro e último nome
employee <- separate(employee, name, into = c('first_name',  'last_name'), sep=' ')

print(employee)
