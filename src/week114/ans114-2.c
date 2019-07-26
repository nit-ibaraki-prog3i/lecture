//課題14-2
#include <stdio.h>

int main(void)
{
    float x = 0.6;
    float sum;
    int i;
    sum = 0;
    for(i=0; i<1000; i++) {
        sum += x;
    }
    printf("sum: %f\n", sum);

    return 0;
}
