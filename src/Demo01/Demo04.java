package Demo01;

/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-04-24 15:12
 */
/**
 * 关于变量的赋值
 * 如果 变量时基本数据类型，此时赋值的是所保存的数据值，
 * 如果变量是引用数据类型   此时复制的时变量所保存的地址值，
 * */

public class Demo04 {
    public static void main(String[] args) {
        System.out.println("********************************基本数据类型***************************");
        int m = 10;
        int n=m;
        System.out.print(m);
        System.out.print(n);

        n=20;
        System.out.println(m);
        System.out.println(n);
        System.out.println("********************************引用数据类型**************************");
        Order o1 = new Order();
        o1.id = 1001;
        Order o2 = o1;
        //复制以后 o1  o2   的地址值相同，都指向了对空间中同一个对象实体
        System.out.println(o1.id);
        System.out.println(o2.id);

        o2.id = 1002;
        System.out.println(o1.id);
        System.out.println(o2.id);
//        地址值的
    }


}
class  Order{
    int  id;
}