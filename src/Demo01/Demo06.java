package Demo01;

/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-04-25 17:30
 */
public class Demo06 {
    public static void main(String[] args) {
        Date dae = new Date();
        dae.m = 10;
        dae.n=20;
        System.out.println("m="+dae.m+"n="+dae.n);
        //交换 m 和 n 的值
//        int temp = date.m;
//        date.m = date.n;
//        date.n = temp;
        Demo06 demo06 =new Demo06();
        demo06.swap(dae);
        //
        System.out.print("m="+dae.m+"n="+dae.n);
    }


    public void  swap(Date date){
        int temp = date.m;
        date.m = date.n;
        date.n = temp;
    }
}
class Date{
    int m;
    int n;
}

