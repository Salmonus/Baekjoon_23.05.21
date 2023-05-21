H , M = map(int, input().split())
C = int(input())

if M + C >= 60:
        h= H + (M + C)/60;
        h= h - 24 if h >= 24 else h;
        m= (M + C - 60) % 60;
        print(int(h), " ", int(m), sep="");
else:
    print(H , " " ,  (M + C), sep="");