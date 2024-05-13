library(ggplot2)
library(palmerpenguins)

ggplot(data = penguins) +
  geom_point(mapping = aes(x = flipper_length_mm, y = body_mass_g, shape = species, color = species))

ggplot(data = penguins) +
  geom_point(mapping = aes(x = flipper_length_mm, y = body_mass_g)) +
  geom_smooth(mapping = aes(x = flipper_length_mm, y = body_mass_g))


ggplot(data = penguins) +
  geom_smooth(mapping = aes(x = flipper_length_mm, y = body_mass_g, linetype = species))

ggplot(data = penguins) +
  geom_jitter(mapping = aes(x = flipper_length_mm, y = body_mass_g, shape = species, color = species))


ggplot(data = diamonds) +
  geom_bar(mapping = aes(x = cut, color = cut))
