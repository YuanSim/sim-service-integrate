package vovo;

import com.beust.jcommander.internal.Lists;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

/**
 * @QQ交流群: 648741281
 * @Email: 177300883312@163.com
 * @微信: londu19930418
 * @Author: Simon.Mr
 * @Created 2020/6/14
 */
public class Test {

    public static void main(String[] args) {


        Rule priceRule = new PriceRule();
        Rule groupRule = new GroupOnNumRule();
        //priceRule.setNextRule(groupRule);
        groupRule.setNextRule(priceRule);


        Groupon groupon  = new Groupon();
        groupon.setActName("huodong1");
        groupon.setActCode("aaa");

        Groupon groupon2 = new Groupon();
        groupon.setActName("huodong2");
        groupon.setActCode("bbb");



        Groupon groupon3 = new Groupon();
        groupon.setActName("huodong3");
        groupon.setActCode("ccc");


        Groupon groupon4 = new Groupon();
        groupon.setActName("huodong4");
        groupon.setActCode("ddd");


        List<Groupon> list = Lists.newArrayList();
        list.add(groupon);
        list.add(groupon2);
        list.add(groupon3);
        list.add(groupon4);
        groupRule.calculation(list);

    }

    void test() {

        // 查询所有进行中活动商品

        // skuCode  actCode 查询当前商品sku，选取最佳SKU

        Sku sku = new Sku();
        sku.setCode("23");
        sku.setName("红色五花肉");
        List<Sku> skus = Arrays.asList(sku);

        /**
         * 初始化责任链
         */

        Rule rule = new GroupOnNumRule();
        rule.setSkus(skus);
        rule.setCount(3 - skus.size());



        Rule priceRule = new PriceRule();

        rule.setNextRule(priceRule);

        /**
         * 查询出进行中的活动数据
         */
        /**
         * 成团规则计算 calculation
         * 先按成团人数排序，如果存在成团人数一样的情况 需将成团人数一样的数据 传递到价格规则进行筛选
         */

        Groupon groupon  = new Groupon();
        groupon.setActName("huodong1");
        groupon.setActCode("aaa");

        Groupon groupon2 = new Groupon();
        groupon.setActName("huodong2");
        groupon.setActCode("bbb");



        Groupon groupon3 = new Groupon();
        groupon.setActName("huodong3");
        groupon.setActCode("ccc");


        Groupon groupon4 = new Groupon();
        groupon.setActName("huodong4");
        groupon.setActCode("ddd");


        List<Groupon> list = Lists.newArrayList();
        list.add(groupon);
        list.add(groupon2);
        list.add(groupon3);
        list.add(groupon4);
        rule.calculation(list);
    }
}
