/* 課題1-2 */
#include <stdio.h>

/* 関数のプロトタイプ宣言 */
int sum_range(int *ptr, int s, int e);

/* 指定した範囲内の配列の要素の合計を求める */
int sum_range(int *ptr, int s, int e)
{
    int i, result;
    result = 0;
    /* s番目からe番目までを繰り返し加算する */
    for(i=s; i<=e; i++) {
        result += *(ptr+i);
    }
    return result;
}

int main(void)
{
    int test[5] = {80, 60, 55, 22, 75};
    int test2[5] = {76, 85, 47, 92, 68};

    /* sum_range()の動作確認 */
    printf("sum_range: %d\n", 
           sum_range(test, 1, 3));
    printf("sum_range: %d\n", 
           sum_range(test2, 2, 4));

    return 0;
}
