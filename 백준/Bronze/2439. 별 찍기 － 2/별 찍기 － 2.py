N = int(input())
i =0

for i in range(i + 1, N + 1):
    for y in range(N - i):
        print(" ", end="")
    for x in range(i):
        print("*", end="")
    print()