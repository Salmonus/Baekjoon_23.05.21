N = int(input())
count = 0
N = N - 1 if N > 1 else 0

if N==0:
    print("1")
else:
    while N > 0:
        N -= count * 6
        count += 1
    print(count)
        