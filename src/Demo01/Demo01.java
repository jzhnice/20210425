package Demo01;

/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-04-24 10:45
 */

/**
 * 练习
 * 1：编写程序，定义三个重载方法并都熬用，方法名为mOL,
 * 三个方法分别接受一个int参数，两个int参数，一个字符串参数
 * 分别执行平方运算并输出结果，相乘并输出结果，输出字符串信息
 * 在之类的main()方法中分别用参数区别调用三个方法
 * 2：定义三个重载方法max()
 * 第一个方法求两个int值中的最大值
 * 第二个方法求两个double中的最大值
 * 第三个方法求三个double中的最大值，
 * 分别调用三个方法
 */
public class Demo01 {
  /**1. public void mOL(int i){
        System.out.println(i*i);
    }
    public void mOL(int i,int b){
        System.out.println(i*b);
    }
    public void mOL(String a){
        System.out.println(a);
    }

    public static void main(String[] args) {
        Demo01 demo01 = new Demo01();
        demo01.mOL(2);
        demo01.mOL(2,5);
        demo01.mOL("我是帅哥");
    }*/
//    public void max(int a,int b){
//        System.out.println (Math.max( a, b));
//    }
    public void max(double i,double j ){
        System.out.println(Math.max(i,j));
    }
    public int max(int q,int w){
        return  (q>w)? q:w;
    }
//    public void max(double i,double j , double x){
//        System.out.println(Math.max(i, j, x));
//    }
public static void main(String[] args) {
   Demo01 demo01 = new Demo01();
   demo01.max( 12,43);
   demo01.max(11.2,34.5);

}



    }
