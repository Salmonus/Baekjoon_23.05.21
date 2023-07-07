import sys

while True:
    T = int(sys.stdin.readline().rstrip())
    if T == 0:
        break
    T = list(str(T))
    res = 0
    for i in range(len(T), 0, -1):
        temp = 1
        for l in range(i, 0, -1):
            temp *= l
        temp *= int(T[len(T) - i])
        res += temp
    print(res)