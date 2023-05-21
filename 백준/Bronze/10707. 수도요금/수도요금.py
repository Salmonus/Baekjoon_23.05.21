A = int(input())
B = int(input())
C = int(input())
D = int(input())
P = int(input())

X = A * P;
Y = B if P <= C else B + D * (P - C);
R = Y if X >= Y else X;
print(R);