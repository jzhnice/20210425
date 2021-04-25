package Demo01;

/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-04-24 14:44
 */
/**
 * 可变个数形参的方法
 * 1.jdk5.0新增的内容
 * 2。具体使用
 *      2.1:可变个数形参的格式：数据类型...变量名
 *      2.2:当调用可变个数形参方法时，传入的参数个数可以是0个，1个，2个...
 *      2.3:可变个数形参的方法他与本类中方法名相同，形参不同的方法之间构成重载
 *      2.4:可变个数形参的方法他与本类中方法名相同，形参类型也相同的数组之间不构成数组，换句话说不能共存
 *      2.5:可变个数形参在方法的形参中，声明必须在末尾
 *      2.6:可变个数形参在方法的形参中，最多只能声明一个可变形参
 *      */
public class Demo03 {
    public static void main(String[] args) {
        Demo03 test = new Demo03();
        test.show(12);
        test.show("hello");
        test.show("hello","world","sadas");
        test.show("aa");
    }
    public void show(int i){

    }
    public void show(String s){
        System.out.println("show(String)");

    }
    public void show(String ...strs){
        System.out.println("show(String...)");
        for (int i = 0; i < strs.length;i++) {
            System.out.println(strs[i]);
        }
    }

    public void show(int i,String...strs ){

    }
//    public void show(String...strs,int i){


    }
//    public void show( String[] strs){}

