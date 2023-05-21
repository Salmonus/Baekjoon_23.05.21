A,B,C = map(int, input().split())
a = A * B / C;
b = A / B * C;
R = a if a >= b else b;
print(int(R))