a,b,c = map(int, input().split())

if a==b and b==c and c==a:
    print(10000 + 1000*a);
elif (a==b and b != c) or (c==a and a != b):
    print(1000 + 100*a);
elif b==c and c!=a:
    print(1000 + 100*b);
else:
    if a - b > 0 and a - c > 0:
        print(100*a);
    elif b - a > 0 and b - c > 0:
        print(100*b);
    elif(c - a > 0 and c - b > 0):
        print(100*c);