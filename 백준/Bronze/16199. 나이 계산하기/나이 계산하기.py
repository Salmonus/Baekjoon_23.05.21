BY, BM, BD = map(int, input().split())
SY, SM, SD = map(int, input().split())

D = SY - BY;
if(BM > SM):
    D1 = 0 if D < 1 else D-1;
    print(D1);
elif(BM == SM):
    if(BD > SD):
        D1 = 0 if D < 1 else D-1;
        print(D1);
    elif(BD <= SD):
        print(D);
elif(BM < SM):
    print(D);

print(D + 1);
print(D);