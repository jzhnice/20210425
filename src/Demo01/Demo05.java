package Demo01;

/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-04-25 17:11
 */

/**
 * 方法的形参的传递机制，值传递
 * <p>
 * 1：形参，方法定义时，声明的小括号内的参数
 * 实参：方法调用时，实际传递给形参的数据
 * <p>
 * 2：值传递机制
 *        如果 变量时基本数据类型，此时实参赋给形参的是，实参真实存储的数据值
 *        如果变量是引用数据类型   此时实参赋给形参的是实参存储数据的地址值，
 */

public class Demo05 {
    public static void main(String[] args) {

//        交换两个变量的值
       int n = 12;
        int m = 20;

       /*  int temp = m;
        m = n;
        n = temp;*/

        Demo05 test = new Demo05();
        test.swap(m,n);
        System.out.println("m+:"+m);
        System.out.println("n+"+n);
    }

    public void swap(int n, int m) {
        int temp = m;
        m = n;
        n = temp;
        System.out.println("m+:"+m);
        System.out.println("n+"+n);
    }

}
