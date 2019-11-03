package chap01.complexity;

import java.util.Random;

/**
 * 线性阶O(n)的推导过程
 * <p> 算法时间复杂度
 */
public class LinearTime {

  public static void main(String[] args) {
    f_TwoForSum(new Random().nextInt(1000));
  }

  // 算法f(ForSum)=循环计算一次1+2+3+...+(n-1)+n的值
  public static void f_TwoForSum(int n) {
    System.out.println("问题规模n=" + n);
    long sum = 0;
    for (int i = 1; i < n; i++) {
      sum += i;
    }
    System.out.println("算法f(TwoForSum)第一次循环计算1+2+3+...+(n-1)+n的值=" + sum);
    sum = 0;
    for (int i = 1; i < n; i++) {
      sum += i;
    }
    System.out.println("算法f(TwoForSum)第二次循环计算1+2+3+...+(n-1)+n的值=" + sum);

    // --- 随着问题规模n的增大，一次循环计算的次数也为n，算法f(TwoForSum)总共执行了两次循环，
    // --- 所以算法f(TwoForSum)的总执行时间为 O(f(2n))，我们在推导算法的时间复杂度时，
    // --- 会将保留高项阶，将常数用1替换，也就是n会被保留，2会被1替换
    // --- 所以算法f(TwoForSum)的时间复杂度 T(n) = O(n)，即线性阶
  }
}
