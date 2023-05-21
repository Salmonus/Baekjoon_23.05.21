P, M = map(int, input().split())

a = (P + M)/2;
b = (P - M)/2;
a1 = int((P + M)/2);
b1 = int((P - M)/2);
if(a == a1 and b == b1):
    if(P >= M):
        if(a >= b):
            print(a1,b1);   
        else:
            print(b1,a1);
    elif(P < M):
        print("-1");
else:
    print("-1");
