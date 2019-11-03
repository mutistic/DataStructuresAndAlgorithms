package chap01.complexity;

/**
 * 平方阶O(n^2)的推导过程
 * <p> 算法时间复杂度
 */
public class SquareTime {

  public static void main(String[] args) {
    f_Square(10);
  }

  // 算法f(Square)：双重循环打印
  public static void f_Square(int n) {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        System.out.println("i = " + i + "，j = " + j);
      }
    }
    // --- 算法f(Square)执行过程，当外层循环一次时，内层循环n次，
    // --- 所以外层循环n次时，算法f(Square)总共执行n*n次，即n^2次
    // --- 所以算法f(Square)的时间复杂度为 O(n^2)
  }

}
