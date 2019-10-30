#include<stdio.h>

int main(void)
{
    printf("计算：1+2+3+4+5+......+(n-1)+n 的结果\n");
    int n;
    scanf("输入要计算的n %d", &n);

    // 1、普通循环算法
    printf("1、使用普通循环算法（时间复杂度：O(n)）：");
    int sum, i = 0;
    for(i = 1; i <= n; i++)
    {
        sum += i;
    }
    printf("普通循环算法（时间复杂度：O(n)）计算结果：%d", &sum);

    // 2、高斯算法
    printf("2、使用高斯算法（时间复杂度：O(1)）：");
    sum = (1 + n) / 2;
    printf("高斯算法（O(1)）计算结果：%d", &sum);

    return 0;
}
