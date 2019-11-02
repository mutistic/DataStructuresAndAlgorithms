package chap01.complexity;

import algorithm.chap01.GaussAlgorithm;

/**
 * 常数阶O(1)的推导过程
 * <p> 算法时间复杂度
 */
public class ConstantTime {
    public static void main(String[] args) {
        f_Add();
        f_ForIndex();
        f_GaussAlgorithm(4);
    }

    // 算法f(Add)=计算1+2+3+4的值：
    public static void f_Add() {
        int sum = 1;
        sum += 2;
        sum += 3;
        sum += 4;
        System.out.println("f(Add) = " + sum);
        // --- 从算法f(Add)看虽然执行了4行代码进行操作，也就是说 T(n) = 4，
        // --- 但是在推导大O阶时，我们认为常数4操作是算法f(Add)所有加法常数，然后用常数1取代加法常数，
        // --- 也就是说4被取代成为1，那么可得出算法的时间复杂度为O(1)，记作：T(n) = O(1)
    }
    // 算法f(ForIndex)=计算1+2+3+4的值：
    public static void f_ForIndex() {
        int sum = 0;
        for (int i = 1; i <= 4; i++) {
            sum += i;
        }
        System.out.println("f(ForIndex) = " + sum);
        // --- 从算法f(ForIndex)执行来看，虽然使用的fori循环操作，
        // --- 但是已知问题规模n是一个固定的常数4，循环总共执行次数为常数4，
        // --- 所以可认为时间复杂度为O(1)，记作：T(n) = O(1)
    }
    // 算法f(高斯算法，Gauss Algorithm)=计算 1+2+3+4+...+(n-1)+n的值：
    public static void f_GaussAlgorithm(int n) {
        long sum = GaussAlgorithm.gaussAlgorithm(n); // n * (1 + n) / 2;
        System.out.println("f(高斯算法，Gauss Algorithm) = " + sum);
        // --- 从高斯算法计算来看执行次数问题规模n无关，始终是1次，所以认为 T(n) = O(1)
    }
}
