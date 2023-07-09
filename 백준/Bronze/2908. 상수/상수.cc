#include <stdio.h>

int main() {
    char first[4], second[4];
    scanf("%s %s", first, second);

    int reversed_first = (first[2] - '0') * 100 + (first[1] - '0') * 10 + (first[0] - '0');
    int reversed_second = (second[2] - '0') * 100 + (second[1] - '0') * 10 + (second[0] - '0');

    if (reversed_first > reversed_second) {
        printf("%d", reversed_first);
    } else {
        printf("%d", reversed_second);
    }

    return 0;
}
