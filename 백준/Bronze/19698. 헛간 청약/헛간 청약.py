N, W, H, L = map(int, input().split())

R = int(H/L) * int(W/L);
R = N if R >= N else R;
print(R);
