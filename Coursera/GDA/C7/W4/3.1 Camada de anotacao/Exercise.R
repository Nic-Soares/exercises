library(tidyverse)
library(palmerpenguins)

ggplot(data = penguins) +
  geom_point(mapping=aes(x=flipper_length_mm, y=body_mass_g, color=species)) +
  labs(title="Palmer Penguins: Body Mass vs. Flipper Length",
       subtitle="Sample of Three Penguin Species",
       caption="Data collected by Dr. Kristen Gorman")+
  annotate("text", x=220, y=3500, label="The Gentoos are the largest", color="blue",
           fontface="bold", size=4.5)
