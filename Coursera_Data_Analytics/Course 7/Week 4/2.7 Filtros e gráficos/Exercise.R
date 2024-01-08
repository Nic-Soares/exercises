library(tidyverse)

hotel_bookings <- read.csv("hotel_bookings.csv")

# Etapa 2: Refrescar sua memória

head(hotel_bookings)

colnames(hotel_bookings)

# Etapa 3: Instalar e carregar o pacote 'ggplot2' (opcional)

library(ggplot2)

# Etapa 4: Como fazer muitos gráficos diferentes:

ggplot(data = hotel_bookings) +
  geom_point(mapping = aes(x = lead_time, y = criancas))

ggplot(data = hotel_bookings) +
  geom_bar(mapping = aes(x = hotel, fill = market_segment))

ggplot(data = hotel_bookings) +
  geom_bar(mapping = aes(x = hotel)) +
  facet_wrap(~ market_segment)

# Etapa 5: Filtragem

onlineta_city_hotels <- filter(hotel_bookings, 
                               (hotel=="City Hotel" &
                                  market_segment=="Online TA"))

View(onlineta_city_hotels)

onlineta_city_hotels_v2 <- hotel_bookings %>%
  filter(hotel=="City Hotel") %>%
  filter(market_segment=="Online TA")

View(onlineta_city_hotels_v2)