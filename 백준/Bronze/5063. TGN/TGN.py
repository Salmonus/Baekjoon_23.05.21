n = int(input())

for i in range(0, n):
    r, e, c = map(int, input().split(" "))
    if(e - (r + c) > 0):
        print("advertise");
    elif(e - (r + c) < 0):
        print("do not advertise");
    elif(e - (r + c) == 0):
        print("does not matter");
