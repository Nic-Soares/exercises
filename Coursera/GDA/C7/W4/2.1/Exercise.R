library(ggplot2)
library(palmerpenguins)

ggplot(data = penguins) +
  geom_point(mapping = aes(x = flipper_length_mm, y = body_mass_g, shape = species, color = species))


