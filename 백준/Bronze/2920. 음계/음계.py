a, b, c, d, e, f, g, h = map(int, input().split())

if a + h == 9 and b + g == 9 and c + f == 9 and d + e == 9:
    if a == 1 and b == 2 and c == 3 and d == 4:
        print("ascending")
    elif a == 8 and b == 7 and c == 6 and d == 5:
        print("descending")
    else:
        print("mixed")
else:
    print("mixed")
