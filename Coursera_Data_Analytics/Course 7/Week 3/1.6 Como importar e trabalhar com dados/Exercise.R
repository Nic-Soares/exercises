
bookings_df <- read.csv("hotel_bookings.csv", fileEncoding = "UTF-8")
head(bookings_df)

str(bookings_df)

colnames(bookings_df)

new_df <- select(bookings_df, `adr`, adults)

mutate(new_df, total = `adr` / adults)

# Importar seus próprios dados

own_df <- read_csv("<filename.csv>")