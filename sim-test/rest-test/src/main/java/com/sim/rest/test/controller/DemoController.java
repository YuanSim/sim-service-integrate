package com.sim.rest.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Title:
 * @Description:
 * @Company: 积分圈科技有限公司
 * @Author: Simon.Mr
 * @Created 2020/3/5
 */
@RestController
public class DemoController {

    @RequestMapping("sim/test/rest/test/hello")
    public Object hello() {

        return "你好";
    }
}
