L = int(input())
A = int(input())
B = int(input())
C = int(input())
D = int(input())

M = int(B / D if B % D == 0 else B / D + 1);
G = int(A / C if A % C == 0 else A / C + 1);
R = L - (M if M >= G else G);
print(R);