C, K, P = map(int, input().split(" "))

count = 0

for i in range(1, C + 1):
    count += K * i + P * (i ** 2)

print(count)