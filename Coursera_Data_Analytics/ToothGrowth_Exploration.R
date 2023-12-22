data("ToothGrowth")
View(ToothGrowth)

filtered_tg <- filter(ToothGrowth, dose == 0.5)

View(filtered_tg)