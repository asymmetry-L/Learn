#include "stdio.h"
int fun(int a[5])
{
    int n, min = a[0], max = 0, sum = 0;
    for (n = 1; n < 5; n++)
    {
        sum += a[n];
        if (a[n] < min)
        {
            min = a[n];
        }
        else if (a[n] > max)
        {
            max = a[n];
        }
    }
    printf(min);
    return min, max;
}
main()
{
    int i, a[5], b = 1, x, d, sum;
    for (i = 0; i < 5; i++)
    {
        printf("请输入第%d个数: ", b++);
        scanf("%d", &a[i]);
    }
    x = fun(a), d = fun(a);
    printf("min:%d\n", x);
    printf("max:%d\n", d);
    printf("avg:%d\n", sum / 5);
}