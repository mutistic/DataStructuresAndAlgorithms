package chap01.complexity;

/**
 * 指数阶O(2^n)的推导过程
 * <p> 算法时间复杂度
 */
public class IndexTime {

  public static void main(String[] args) {
    f_Index(5, "main", 0);
  }
  // 算法f(Index)：指数阶O(2^n)的算法实现例子
  public static int f_Index(int n, String execName, int execNum) {
    System.out.println("execName = " + execName + "，execNum = " + execNum + "，n = " + n);
    if (n <= 1) {
      return 1;
    }
    return f_Index(n - 1, "a", execNum + 1)
        + f_Index(n - 1, "b", execNum + 1);
  }
}
