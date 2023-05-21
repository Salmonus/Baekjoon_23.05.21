N, M, K = map(int, input().split())
O = K if M >= K else M;
X = N - K if K >= M else N - M; 
print(O + X);