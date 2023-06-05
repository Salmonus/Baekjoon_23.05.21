min, count = 100, 0
for i in range(0, 7):
    n = int(input())
    if n % 2 != 0:
        count += n
        if n <= min:
            min = n
    n = 0
if count == 0:
    print("-1")
else:
    print(count, min, sep='\n')