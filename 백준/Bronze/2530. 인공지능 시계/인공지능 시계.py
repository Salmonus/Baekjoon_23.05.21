h, m, s = map(int, input().split())
R = int(input())
h += int(m / 3600); m += int(R/60); s += R % 60;
m += int(s / 60);
h += int(m / 60);
m = m % 60;
h = h % 24;
s = s % 60;
print(int(h),int(m),int(s), sep=" ");
