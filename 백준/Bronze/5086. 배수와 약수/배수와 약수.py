a, b = map(int, input().split(" "))

while(a != 0 or b != 0):
    if a == 0 or b == 0:
        print("neither")
    elif a % b == 0:
        print("multiple")
    elif b % a == 0:
        print("factor")
    else:
        print("neither")
    a, b = map(int, input().split(" "))