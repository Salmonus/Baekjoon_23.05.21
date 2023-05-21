N = int(input())

for i in range(0, N, 1):
    for x in range(0, N - i - 1, 1):
        print(" ", end="")
    print("*", end="")
    for s in range(0, i, 1):
        print(" ", end="")
        print("*", end="")
    print()