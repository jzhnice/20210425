package Demo01;

/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-04-24 10:45
 */

/**
 * 方法的重载  overload
 * 1：定义：在同一个类中，允许存在一个以上的同名方法，之要他们的参数个数或者参数类型不同即可
 * 两同一不同： 同一个类  相同方法名
 * 参数列表不同，参数个数不同，参数类型不同
 * 3：判断是否重载：
 * 跟方法的权限修饰符，返回值类型，形参变量名，方法体  都没有关系
 * 4:在通过对象调用方法时，如何确定某一个指定的方法
 *      1：方法名：
 *      2：参数列表
 */


public class Demo02 {
    public static void main(String[] args) {
        Demo02 test  = new Demo02();
        test.getSum(1,2);
    }

    //        如下大四个方法 构成了重载
    //
    public void getSum(int i, int j) {
        System.out.println(1);
    }

    public void getSum(double d1, double d2) {
        System.out.println(2);
    }

    public void getSum(String s, int i) {
        System.out.println(3);
    }

    public void getSum(int i, String s) {
        System.out.println(4);
//                参数列表不同
    }

  /*  public int getSum(int i, int j) {
    }*/
       /* public void getSum(int m, int n){
                跟名字无关  看数据类型
        }
        private  void getSum(int i,int j){
                跟权限无关系
        }*/


}




























