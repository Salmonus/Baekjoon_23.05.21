on, off = map(int, input().split(" "))
one = -1 * on + off;
on, off = map(int, input().split(" "))
two = one + -1 * on + off;
on, off = map(int, input().split(" "))
three = two + -1 * on + off;
on, off = map(int, input().split(" "))
four = three + -1 * on + off;

if(one > two and one >  three and one > four):
    print(one);
elif(two > one and two >  three and two > four):
    print(two);
elif(three > two and three >  one and three > four):
    print(three);
elif(four > two and four >  three and four > one):
    print(four);
