#include<stdio.h>

int main(void)
{
    printf("���㣺1+2+3+4+5+......+(n-1)+n �Ľ��\n");
    int n;
    scanf("����Ҫ�����n %d", &n);

    // 1����ͨѭ���㷨
    printf("1��ʹ����ͨѭ���㷨��ʱ�临�Ӷȣ�O(n)����");
    int sum, i = 0;
    for(i = 1; i <= n; i++)
    {
        sum += i;
    }
    printf("��ͨѭ���㷨��ʱ�临�Ӷȣ�O(n)����������%d", &sum);

    // 2����˹�㷨
    printf("2��ʹ�ø�˹�㷨��ʱ�临�Ӷȣ�O(1)����");
    sum = (1 + n) / 2;
    printf("��˹�㷨��O(1)����������%d", &sum);

    return 0;
}
