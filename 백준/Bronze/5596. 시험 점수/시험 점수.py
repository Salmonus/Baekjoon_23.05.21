S1, S2, S3, S4 = map(int, input().split())
T1, T2, T3, T4 = map(int, input().split())

S = S1 + S2 + S3 + S4;
T = T1 + T2 + T3 + T4;
print(S if S >= T else T );