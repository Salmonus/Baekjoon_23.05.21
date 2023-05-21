A = int(input())
n = 0;
a,b,c,d,e = map(int, input().split());
n = n + 1 if A == a else n; 
n = n + 1 if A == b else n; 
n = n + 1 if A == c else n; 
n = n + 1 if A == d else n; 
n = n + 1 if A == e else n; 

print(n)