N = int(input())

for i in range(1, N + 1, 1):
    for y in range(0, N - i, 1):
        print(" ", end="")
    for x in range(0, 2*i - 1, 1):
        print("*", end="")
    print()