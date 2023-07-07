T = int(input())

for i in range(0, T):
    a, b = map(int, input().split(" "))
    
    if (a == 1):
        fst = 500;
    elif(3 >= a and a >= 2):
        fst = 300;
    elif(6 >= a and a >= 4):
        fst = 200;
    elif(10 >= a and a >= 7):
        fst = 50;
    elif(15 >= a and a >= 11):
        fst = 30; 
    elif(21 >= a and a >= 16):
        fst = 10;
    else:
        fst = 0;
        
    if (b == 1):
        snd = 512;
    elif(3 >= b and b >= 2):
        snd = 256;
    elif(7 >= b and b >= 4):
        snd = 128;
    elif(15 >= b and b >= 8):
        snd = 64;
    elif(31 >= b and b >= 16):
        snd = 32; 
    else:
        snd = 0;
        
    print(fst * 10000 + snd * 10000)