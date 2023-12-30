library(ggplot2)
library(palmerpenguins)

# Quanto maior o penguin maior a nadadeira
ggplot(data=penguins)+
  geom_point(mapping=aes(x=flipper_length_mm, y=body_mass_g))