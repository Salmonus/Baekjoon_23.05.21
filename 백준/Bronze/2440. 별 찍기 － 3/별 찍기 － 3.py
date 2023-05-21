N = int(input())

for i in range(N, 0, -1):
    for x in range(0, i, 1):
        print("*", end="")
    if i != 0: 
        print()