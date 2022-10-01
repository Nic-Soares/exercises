days = int(input())

year = days // 365
days %= 365
month = days // 30
days %= 30
day = days

print(f"{year} ano(s)")
print(f"{month} mes(es)")
print(f"{day} dia(s)")
