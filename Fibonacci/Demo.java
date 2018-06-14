import java.util.Scanner;

/**
 * Created by zhangzheming on 2018/6/14.
 */
//f0=0 f1=1 fn=fn-1+fn-2(n>1)
//递归


public class Demo {
    public static void main(String[] args) {
        System.out.println("请输入m");
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=Feibonacci(m);
        System.out.print(n);
    }
    public static int Feibonacci(int m) {
        if(m<0)
        {
            return -1;
        }
        if(m==0) {
            return 0;
        }
        if(m==1) {
            return 1;
        }
        else if(m>1){
            return Feibonacci(m-1)+Feibonacci(m-2);
        }
        return -1;


    }
}
