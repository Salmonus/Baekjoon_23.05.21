T = int(input())

for i in range(T):
    a, b = map(int, input().split())
    a = a % 10
    if a == 0:
        print(10)
    elif b == 0:
        print(1)
    else:
        b = b % 4 + 4
        print(pow(a, b, 10))
