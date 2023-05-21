A = int(input())
B = int(input())
C = int(input())
D = int(input())
E = int(input())
if A > 0:
    T = (B - A) * E;
elif(A == 0):
    T = (B - A) * E + D;
else:
    T = -1 * A * C + D + B * E;

print(T);