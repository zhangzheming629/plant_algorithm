/**
 * Created by zhangzheming on 2018/6/14.
 */
import java.math.BigInteger;
public class Demo3 {

    public static void main(String[] args) {
        BigInteger n = BigInteger.valueOf(10);////相当于 new BigInteger("10"),就是新建一个BigInteger值为10的对象。
        BigInteger result = Fib(n)[0];
        System.out.println(result);
    }
        public static BigInteger[] Fib(BigInteger n) {
            if (n.equals(BigInteger.ZERO))
                return new BigInteger[]{BigInteger.ZERO, BigInteger.ONE};//0 1
            BigInteger[] tmp = Fib(n.divide(BigInteger.valueOf(2)));
            //java.math.BigInteger.and(BigInteger val) 返回一个BigInteger，其值是 (this & val).
            // 该方法返回一个负BigInteger的当且仅当这个和Val均为负。
            if (n.and(BigInteger.ONE).equals(BigInteger.ONE)) {
                //multiply(BigInteger val)返回两个大整数的积
                return new BigInteger[]{tmp[0].multiply(tmp[0]).add(tmp[1].multiply(tmp[1])),
                        tmp[0].multiply(BigInteger.valueOf(2)).add(tmp[1]).multiply(tmp[1])};
            }
            else {
                //BigInteger subtract(BigInteger val)返回两个大整数相减的结果byte[]
                return new BigInteger[]{tmp[1].multiply(BigInteger.valueOf(2)).subtract(tmp[0]).multiply(tmp[0]),
                        tmp[0].multiply(tmp[0]).add(tmp[1].multiply(tmp[1]))};
            }
        }


    }

