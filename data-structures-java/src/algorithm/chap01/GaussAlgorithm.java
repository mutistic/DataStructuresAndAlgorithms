package algorithm.chap01;

import java.util.Scanner;

/**
 * 算法：高斯算法，Gauss Algorithm
 * <p> 描述：以首项加末项乘以项数除以2用来计算“1+2+3+4+5+···+(n-1)+n”的结果
 * <p> 公式：项数 * (首项 + 末项) / 2
 * <p> 时间复杂度：O(1)，常数阶
 * <p> 类型：等差数列求和算法
 * <p> 等差数列求和公式：Sn = (a1+an)n / 2，a1∈N*，n<∈N*。有且仅有当a1=1，公差d=1时，an=n
 */
public class GaussAlgorithm {

  // 高斯算法的实现
  public static long gaussAlgorithm(long n) {
    return n * (1 + n) / 2;
  }

  public static void main(String[] args) {
    System.out.println("\n=================================");
    Scanner scan = new Scanner(System.in);
    System.out.println("计算Sn=1+2+3+4+5+···+(n-1)+n的结果，请输入正自然数n的值：");
    long n = 0;
    try {
      n = scan.nextLong();
    } catch (Exception e) {
      System.err.println("输入的正自然数n不合法");
      return;
    }
    if (n < 1) {
      System.err.println("输入的正自然数n必须大于1");
      return;
    }
    long sum = gaussAlgorithm(n);
    System.out.println("Sn=1+2+3+4+5+···+" + (n - 1) + "+" + n + "=" + sum);
  }

}
