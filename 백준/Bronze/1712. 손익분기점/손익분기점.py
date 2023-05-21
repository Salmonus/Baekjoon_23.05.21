A, B, P = map(int, input().split())

if B >= P:
    print("-1");
elif B < P:
    print(int(A / (P-B) + 1));