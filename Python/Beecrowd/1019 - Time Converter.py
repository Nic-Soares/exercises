seg = int(input())

h = seg // 3600
seg %= 3600
m = seg // 60
seg %= 60
s = seg

print("{}:{}:{}".format(h, m, s))