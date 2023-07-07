while True:
    try:
        M, P, L, E, R, S, N = map(int, input().split())
        for _ in range(N):
            L, P, M = M * E, L // R, P // S
        print(M)
    except EOFError:
        break
