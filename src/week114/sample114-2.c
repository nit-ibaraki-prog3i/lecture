#include <stdio.h>

int main(void)
{
    float c = 0.6;
    double d = 0.6;

    printf("c: %f\n", c);
    printf("d: %lf\n", d);
    if(c==d) {
        printf("true (c==d)\n");
    } else {
        printf("false (c==d)\n");
    }

    return 0;
}
