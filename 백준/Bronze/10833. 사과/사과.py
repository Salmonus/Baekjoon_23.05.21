T = int(input())

count = 0

for i in range(0, T):
    N, A = map(int, input().split(" "))
    if N <= A:
        count += A % N
    else:
        count += A

print(count)