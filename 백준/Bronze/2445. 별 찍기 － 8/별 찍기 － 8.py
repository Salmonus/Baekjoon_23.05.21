N = int(input())

for i in range(0, N):
    i += 1
    for x in range(0, i, 1):
        print("*", end="")
    for space in range(0, N * 2 - i * 2, 1):
        print(" ", end="")
    for x in range(0, i, 1):
        print("*", end="")
    print()
for i in range(N - 1, 0, -1):
    for x in range(0, i, 1):
        print("*", end="")
    for space in range(0, N * 2 - i * 2, 1):
        print(" ", end="")
    for x in range(0, i, 1):
        print("*",end= "")
    print()