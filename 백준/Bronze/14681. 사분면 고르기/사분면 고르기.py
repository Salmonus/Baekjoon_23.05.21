x = int(input())
y = int(input())
R=0;

if x > 0:
    if y > 0:
        R=1;
    if y < 0:
        R=4;
else:
    if y > 0:
        R=2;
    if y < 0:
        R=3;

print(R);
