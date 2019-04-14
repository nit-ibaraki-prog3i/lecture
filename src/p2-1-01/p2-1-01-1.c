/* 課題1-1 */
#include <stdio.h>

/* 関数のプロトタイプ宣言 */
void shift_num(int *num1, int *num2, int *num3);

/* 変数の値を入れ替える */
void shift_num(int *num1, int *num2, int *num3)
{
    int tmp;
    /* *num3をtmpへ */
    tmp = *num3;
    /* *num2を*num3へ */
    *num3 = *num2;
    /* *num1を*num2へ */
    *num2 = *num1;
    /* tmpを*num1へ */
    *num1 = tmp;
}

int main(void)
{
    int n1, n2, n3;

    /* sort_num()の動作確認 */
    n1 = 6; n2 = 2; n3= -8;
    shift_num(&n1, &n2, &n3);
    printf("n1: %d, n2: %d, n3: %d\n", 
           n1, n2, n3);

    shift_num(&n1, &n2, &n3);
    printf("n1: %d, n2: %d, n3: %d\n", 
           n1, n2, n3);

    shift_num(&n1, &n2, &n3);
    printf("n1: %d, n2: %d, n3: %d\n", 
           n1, n2, n3);

    return 0;
}
