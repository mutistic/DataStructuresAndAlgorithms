package chap01.complexity;

/**
 * 立方阶O(n^3)的推导过程
 * <p> 算法时间复杂度
 */
public class CubeTime {

  public static void main(String[] args) {
    f_Cube(2);
  }

  // 算法f(Square)：双重循环打印
  public static void f_Cube(int n) {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        for (int k = 0; k < n; k++) {
          System.out.println("i = " + i + "，j = " + j + "，k = " + k);
        }
      }
    }
    // --- 算法f(Cube)执行过程，当第一层循环一次时，第二层循环n次，当第二层循环一次时，第三层循环n次。
    // --- 所以当第一层循环n次时，算法法f(Cube)总执行次数为n*n*n，即n^3次
    // --- 所以算法f(Cube)的时间复杂度为 O(n^3)
  }

}
