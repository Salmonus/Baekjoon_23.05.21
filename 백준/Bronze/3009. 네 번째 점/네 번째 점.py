x1, y1 = map(int, input().split(" "))
x2, y2 = map(int, input().split(" "))
x3, y3 = map(int, input().split(" "))

x4 = x2 if x1 == x3 else (x3 if x1 == x2 else x1)
y4 = y2 if y1 == y3 else (y3 if y1 == y2 else y1)

print(x4, y4)