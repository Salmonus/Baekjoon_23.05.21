N  = int(input())
input_list = map(int, input().split(" "))

count = 0
BBADA = 0

for i in input_list:
    count += 1
    if count != i:
        BBADA += 1
        
print(BBADA)