T = int(input())

M = 0
N = 0

for A in map(int, input().split(" ")):
    N += (A // 30 + 1) * 10
    M += (A // 60 + 1) * 15

if M < N:
    print(f"M {M}")
elif M > N:
    print(f"Y {N}")
else:
    print(f"Y M {M}")
