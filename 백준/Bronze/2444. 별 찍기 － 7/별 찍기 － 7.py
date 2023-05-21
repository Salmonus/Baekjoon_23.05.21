N = int(input())

for i in range(1, N, 1):
    for y in range(0, N - i, 1):
        print(" ", end="")
    for x in range(0, 2 * i - 1, 1):
        print("*", end="")
    print()
for p in range(N, 0, -1):
    for q in range(0, N - p, 1):
        print(" ", end="")
    for r in range(0, 2 * p - 1, 1):
        print("*", end="")
    print()