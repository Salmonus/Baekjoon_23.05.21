N = int(input())

for i in range(N, 0, -1):
    for y in range(0, N - i, 1):
        print(" ", end="")
    for x in range(0, i, 1):
        print("*", end="")
    print()