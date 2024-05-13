# Etapa 1: Carregar pacotes

library(tidyverse)
library(skimr)
library(janitor)

# Etapa 2: Importar dados

bookings_df <- read_csv("/home/nicolas/Projects/exercises/Coursera_Data_Analytics/Course 7/Week 3/3.5 Limpar dados em R/hotel_bookings.csv", locale = locale(encoding = "latin1"))

# Etapa 3: Conhecendo seus dados

head(bookings_df)

str(bookings_df)

glimpse(bookings_df)

colnames(bookings_df)

skim_without_charts(bookings_df)

# Limpeza de seus dados

trimmed_df <- bookings_df %>%
  select(hotel, is_canceled, lead_time)

trimmed_df %>% 
  select(hotel, is_canceled, lead_time) %>% 
  rename(hotel_type = hotel)

example_df <- bookings_df %>%
  select(arrival_date_year, arrival_date_month) %>% 
  unite(arrival_month_year, c("arrival_date_month", "arrival_date_year"), sep = " ")

# Outra meneira de fazer as coisas

example_df <- bookings_df %>%
  mutate(guests = adults + children + babies)
head(example_df)

example_df <- bookings_df %>%
  mutate(number_canceled = sum(is_canceled),
         average_lead_time = mean(lead_time))
head(example_df)

example_df <- bookings_df %>%
  summarize(number_canceled = sum(is_canceled),
            average_lead_time = mean(lead_time))

head(example_df)