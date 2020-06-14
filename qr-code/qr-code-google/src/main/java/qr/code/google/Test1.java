package qr.code.google;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * @QQ交流群: 648741281
 * @Email: 177300883312@163.com
 * @微信: londu19930418
 * @Author: Simon.Mr
 * @Created 2020/6/4
 */
public class Test1 {

    public static void main(String[] args) {

        BigDecimal db_money = new BigDecimal("79.41");

        System.out.println(db_money);
       /* BigInteger db_money = new BigInteger("7941");

        Integer money = 2147483647;

        if(db_money.compareTo(BigInteger.valueOf(money * 100)) == -1){
            System.out.println(" code=13,msg=您的剩余聚币不足");
            return;
        }

        System.out.println(" 溢出成功" + money * 100);*/


    }
}
