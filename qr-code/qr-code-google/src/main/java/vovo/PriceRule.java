package vovo;

import java.util.List;

/**
 * @QQ交流群: 648741281
 * @Email: 177300883312@163.com
 * @微信: londu19930418
 * @Author: Simon.Mr
 * @Created 2020/6/14
 */
public class PriceRule extends Rule {
    @Override
    protected void calculation(List<Groupon> groupon) {

    }

/*    @Override
    protected void calculation(int type) {
        if(type == 3) {
            System.out.println("价格计算规则");
        }
        System.out.println("价格过低，未能达到计算规则要求");
        nextRule.calculation(type);

    }*/
}
