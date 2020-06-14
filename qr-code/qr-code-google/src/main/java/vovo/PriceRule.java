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

        int count = getCount();

        /**
         * 找到团对应的SKU，设置到已选商品
         */

        setSkus("根据团code找到的SKU，最多找count个");

        setCount(count - "找到的SKU的数量");

    }


}
