S, K, H = map(int, input().split())

if(S + K + H >= 100):
        print("OK");
else:
    if(S < K and S < H):
        print("Soongsil");
    if(K < S and K < H):
        print("Korea");
    if(H < S and H < K):
        print("Hanyang");
