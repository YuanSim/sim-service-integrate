package vovo;

import java.util.List;

/**
 * @QQ交流群: 648741281
 * @Email: 177300883312@163.com
 * @微信: londu19930418
 * @Author: Simon.Mr
 * @Created 2020/6/14
 */
public class CommidityRule extends Rule {


    @Override
    protected void calculation(List<Groupon> groupon) {

        int count = getCount();
        /**
         * 根据团ID 获取spu,如果只存在一个spu 获取到最优sku 设置到已选商品 count 减去获取的sku数
         *
         *
         * 设置到已选商品
         */

        List<Sku> skus = getSkus();
        setSkus(skus.addAll(查到SKU));

        /**
         * 如果存在多个spu,则获取 最多 count个sku
         * 如果一个活动下面 存在多于count个spu,则调用价格规则
         */
        nextRule.calculation(groupon);

        /**
         * 如果已选商品数量未达到要求，在调用链路
         */

//

    }
}
