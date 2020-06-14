package vovo;

import java.util.List;

/**
 * @QQ交流群: 648741281
 * @Email: 177300883312@163.com
 * @微信: londu19930418
 * @Author: Simon.Mr
 * @Created 2020/6/14
 */
public abstract class Rule {

    protected Rule nextRule;

    private List<Sku> skus;

    private int count;

    public List<Sku> getSkus() {
        return skus;
    }

    public void setSkus(List<Sku> skus) {
        this.skus = skus;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    protected Rule getNextRule() {
        return nextRule;
    }

    protected void setNextRule(Rule rule){
        this.nextRule = rule;
    }

    protected abstract  void calculation(List<Groupon> groupon);
}
