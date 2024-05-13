library(ggplot2)

hotel_bookings <- read.csv("hotel_bookings.csv", fileEncoding = "UTF-8", fill = TRUE)

ggplot(data = hotel_bookings) +
  geom_bar(mapping = aes(x = distribution_channel))

