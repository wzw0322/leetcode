package com.wzw.learn;

/**
 * 求一个数的阶层
 * f(6) = 6*5*4*3*2*1
 */
public class 阶乘 {

    /**
     * 通过递归方法实现
     * @return
     */
    public static int method1(int n){
        if(n <= 1){
            return n;
        }
        return n * method1(--n);
    }

    public static void main(String[] args) {
        System.out.println(method1(4));
    }


}
