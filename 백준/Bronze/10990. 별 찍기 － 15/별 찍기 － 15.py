N = int(input())

for i in range(0, N):
    i += 1
    for x in range(0, N - i, 1):
        print(" ", end="")
    print("*", end="")
    for s in range(0, (i - 1)*2 - 1, 1):
        print(" ", end="")
    if (i != 1):
        print("*", end="")
    print()