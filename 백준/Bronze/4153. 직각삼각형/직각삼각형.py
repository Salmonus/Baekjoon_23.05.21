while True:
    A, B, C = map(int, input().split())
    if A == 0 and B == 0 and C == 0: 
        break
    
    if A > B and A > C:
        max_val = A
        other1 = B
        other2 = C
    elif B > A and B > C:
        max_val = B
        other1 = A
        other2 = C
    else:
        max_val = C
        other1 = A
        other2 = B
    
    if max_val ** 2 == other1 ** 2 + other2 ** 2:
        print("right")
    else:
        print("wrong")
