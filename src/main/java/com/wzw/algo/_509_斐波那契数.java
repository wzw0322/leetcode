package com.wzw.algo;

/**
 * https://leetcode-cn.com/problems/fibonacci-number/
 * 斐波那楔数列：
 *  * 又称黄金分割数列、因数学家列昂纳多·斐波那契（Leonardoda Fibonacci）以兔子繁殖为例子而引入，故又称为“兔子数列”
 *  * 数列：0、1、1、2、3、5、8、13、21、34、55、89、144
 *  *      0、1  2  3  4  5  6  7   8  9  10  11  12
 *  * 从第三项开始，每一项都等于前两项之和: F(N) = F(N-2)+F(N-1)
 */
public class _509_斐波那契数 {

    /**
     * 第一种实现方式，递归调用
     * @param index 寻求几何呀（N）
     * @return
     */
    public static int firstRealize(int index){
        if(index <= 1){
            return index;
        }
        return firstRealize(index-2)+firstRealize(index-1);
    }

    /**
     * 第二种实现方式，循环
     * @param index 寻求几何呀（N）
     * @return
     */
    public static int secondRealize(int index){
        if(index <= 1){
            return index;
        }
        int first = 0;
        int second = 1;
        for(int i=2; i<=index; i++){
            int sum = first+second;
            first = second;
            second = sum;
        }
        return second;
    }

    /**
     * 第三种实现方式：循环优化版
     * @param index
     * @return
     */
    public static int thirdRealize(int index){
        if(index <= 1){
            return index;
        }
        int first = 0;
        int second = 1;
        //先与1比较，然后在自减1
        while (index-- > 1){
            second += first;
            first = second - first;
        }
        return second;
    }

    public static void main(String[] args) {
        System.out.println(secondRealize(60));
        System.out.println(thirdRealize(60));


    }
}
