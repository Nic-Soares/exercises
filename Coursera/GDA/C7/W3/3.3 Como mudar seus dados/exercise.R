
# Etapa 1: Carregar pacotes
install.packages("tidyverse")
install.packages("skimr")
install.packages("janitor")

library(tidyverse)
library(skimr)
library(janitor)

# Etapa 2: Importar dados
# Certifique-se de estar no diretório correto
hotel_bookings <- read_csv("hotel_bookings.csv")

# Etapa 3: Conhecendo seus dados
head(hotel_bookings)

# Teste prático
# 1. Quantas colunas há neste conjunto de dados? A: 45 B: 100 C: 32 D: 60
# 2. A variável 'arrival_date_month' é um dado do tipo chr ou caractere. A: Verdadeiro B: Falso

str(hotel_bookings)
glimpse(hotel_bookings)
colnames(hotel_bookings)

# Como manipular seus dados
arrange(hotel_bookings, desc(lead_time))
arrange(hotel_bookings, lead_time)

head(hotel_bookings)

hotel_bookings_v2 <- arrange(hotel_bookings, desc(lead_time))
head(hotel_bookings_v2)

max(hotel_bookings$lead_time)
min(hotel_bookings$lead_time)

# Cuidado com o erro comum
# min(lead_time)  # Isto resultará em um erro, pois precisa do dataframe especificado

mean(hotel_bookings$lead_time)
mean(hotel_bookings_v2$lead_time)

# Teste prático
# Qual é o tempo de espera médio? A: 100,0011 B: 45,0283 C: 14,0221 D: 104,0114

hotel_bookings_city <- filter(hotel_bookings, hotel == "City Hotel")
head(hotel_bookings_city)
mean(hotel_bookings_city$lead_time)

hotel_summary <- 
  hotel_bookings %>%
  group_by(hotel) %>%
  summarise(average_lead_time = mean(lead_time),
            min_lead_time = min(lead_time),
            max_lead_time = max(lead_time))

head(hotel_summary)

mean(hotel_bookings$lead_time)

