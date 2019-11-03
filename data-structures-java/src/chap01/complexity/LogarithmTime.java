package chap01.complexity;

/**
 * 对数阶O(logn)的推导过程
 * <p> 算法时间复杂度
 */
public class LogarithmTime {

  public static void main(String[] args) {
    f_RightHalfChars("ABCDEFGHIJKLMNOPKRSTUVWXYZ", 1);
  }

  // 算法f(RightHalfChars)=递归地将字符串对半并且输出右边字符
  public static void f_RightHalfChars(String chars, int execNum) {
    if (chars == null || chars.length() == 0) {
      return;
    }

    String rightChars = "";
    int rightLength = chars.length() / 2;
    if (rightLength > 0) {
      rightChars = chars.substring(rightLength, chars.length());
      System.out.println("第" + execNum + "次执行输出结果：" + rightChars);
      f_RightHalfChars(rightChars, execNum + 1);
    }
    // --- 递归结束条件：字符串chars为空或空串，递归执行条件：字符串chars长度对半取最小整数后大于0
    // --- 随着字符串长度(即问题规模n)的扩大，由于每次输出之前都将字符串对半
    // --- 则算法f(RightHalfChars)的执行次数的平方也趋近于n，则可推导出算法f(a)的时间复杂度为 O(log2n)，
    // --- 由于log2n的底为常数2，则在大O阶的推导中被忽略，所以认为：T(n) = O(logn)
  }
}
