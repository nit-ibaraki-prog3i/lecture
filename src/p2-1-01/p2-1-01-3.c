/* 課題1-3, 1-4 */
#include <stdio.h>

/* 時間を表す構造体 */
typedef struct Time {
    int hour;
    int minute;
} Time;

/* 関数のプロトタイプ宣言 */
void show(Time *t, char *s);
void add_time(Time *t1, Time *t2);

/* Timeの情報を出力*/
void show(Time *t, char *s)
{
    printf("(%s) %d:%d\n", 
           s, t->hour, t->minute);
}

/* 時間を加算する */
void add_time(Time *t1, Time *t2)
{
    int h, m;
    /* 時と分を加算する */
    h = t1->hour + t2->hour;
    m = t1->minute + t2->minute;
    /* 分を時に繰り上げる */
    h = h + m / 60;
    m = m % 60;
    /* 結果をt1に反映する */
    t1->hour = h;
    t1->minute = m;
}

int main(void)
{
    Time t1 = {40, 50};
    Time t2 = {30, 40};
    /* 課題1-3の動作確認 */
    show(&t1, "initial t1");
    show(&t2, "initial t2");
    /* 課題1-4の動作確認 */
    add_time(&t1, &t2);
    show(&t1, "added t1");

    return 0;
}
