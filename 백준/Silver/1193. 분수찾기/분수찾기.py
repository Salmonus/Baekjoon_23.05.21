N = int(input())

line = 0
count = 0

while count < N:
    line += 1
    count += line

gap = count - N

if line % 2 == 0:  
    print(f"{line - gap}/{1 + gap}")
else: 
    print(f"{1 + gap}/{line - gap}")
