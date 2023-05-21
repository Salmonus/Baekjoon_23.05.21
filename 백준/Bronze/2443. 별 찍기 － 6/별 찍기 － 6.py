N = int(input())

for i in range(N , 0, -1):
    for y in range(1, N - i + 1, 1):
        print(" ", end="")
    for x in range(1, 2 * i, 1):
        print("*", end="")
    print()