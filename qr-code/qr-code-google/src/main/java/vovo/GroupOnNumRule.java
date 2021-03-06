package vovo;

import com.beust.jcommander.internal.Lists;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

/**
 * @QQ交流群: 648741281
 * @Email: 177300883312@163.com
 * @微信: londu19930418
 * @Author: Simon.Mr
 * @Created 2020/6/14
 */
public class GroupOnNumRule extends Rule{

    @Override
    protected void calculation(List<Groupon> groupon) {
        List<GroupOnNum> groupOnNums = Lists.newArrayList();
        int count = 0;
        for(Groupon groupOn:groupon){
            count++;
            GroupOnNum groupOnNum = new GroupOnNum();
            groupOnNum.setActCode(groupOn.getActCode());
            groupOnNum.setNumber(String.valueOf(count));
            groupOnNums.add(groupOnNum);
        }

        AtomicReference<Integer> numberCount = new AtomicReference<>(getCount());

        List<GroupOnNum> coll2 = new ArrayList<>();
         groupOnNums
                .stream()
                .sorted(Comparator.comparing(GroupOnNum::getNumber))
                .forEach(x-> {

                    if(numberCount.get() <= 0) {
                        setCount(0);
                        return;
                    }

                    String number = x.getNumber();
                    //找出相同人数的团有几个
                    List<GroupOnNum> collect1 = groupOnNums.stream()
                            .filter(y -> y.getNumber().equals(number)).collect(Collectors.toList());
                    if(CollectionUtils.isEmpty(collect1)) {
                        return;
                    }
                    if(collect1.size() == 1) {

                        /**
                         * 根据团ID 获取spu,如果只存在一个spu 获取到最优sku 设置到已选商品
                         * 如果存在多个spu,则获取 最多 count个sku
                         */
                        /**
                         * 查询SKU 设置到已选商品
                         */

                        List<Groupon> collect = groupon.stream().filter(i -> i.getActCode().equals(collect1.get(0).
                                getActCode())).collect(Collectors.toList());

                        nextRule.calculation(collect);

                    }

                    if(collect1.size() > 1) {


                        List<Groupon> collect3 = groupon.stream().filter(c -> {
                            Optional<GroupOnNum> first = coll2.stream().filter(x -> x.getActCode().equals(c.getActCode())).findFirst();
                            if (first.isPresent()) {
                                return true;
                            }
                            return false;
                        }).collect(Collectors.toList());

                        /**
                         * 当成团人数相同的团 数量大于1个的时候，调用价格规则 进行计算价格优先
                         */

                        nextRule.calculation(collect3);
                    }

                    // TODO: 2020/6/14 采用优先实施处理
                    /**
                     * 添加判断 如果已存在的团数据 不要重复添加
                     */


                });

    }
}
