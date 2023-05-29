for i in range(0, 3):
    count = sum(map(int, input().split(" ")))
    if count == 3:
        print("A")
    elif count == 2:
        print("B")
    elif count == 1:
        print("C")
    elif count == 0:
        print("D")
    else:
        print("E")
    
    