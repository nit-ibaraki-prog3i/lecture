#include <stdio.h>

int main(void)
{
    float a = 0.8125;
    float b = 0.6;

    printf("a: %f\n", a);
    printf("b: %f\n", b);

    if(a==0.8125) {
        printf("true (a)\n");
    } else {
        printf("false (a)\n");
    }
    if(b==0.6) {
        printf("true (b)\n");
    } else {
        printf("false (b)\n");
    }
    return 0;
}
