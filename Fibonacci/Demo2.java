import java.util.Scanner;

/**
 * Created by zhangzheming on 2018/6/14.
 */

//f0=0 f1=1 fn=fn-1+fn-2(n>1)

    //a  b  count    a    b        c
    //0  1  1        1    1     count   2

    //for 循环
public class Demo2 {
      public static  void main(String[] args){
          System.out.println("请输入m");
          Scanner sc=new Scanner(System.in);
          int m=sc.nextInt();
          int n=Feibonacci(m);
          System.out.println(n);
      }
    public static int Feibonacci(int m){
           int a=0;
           int b=1;
           int count=0;
        if(m<0)
            return -1;
        if(m==0)
            return 0;
        if(m==1)
            return 1;
        else if (m>1){
            for(int i=2;i<=m;i++) {
                count = a + b;
                a = b ;
                b=count;
            }
            return  count;
        }
        return  count;

    }


    }



