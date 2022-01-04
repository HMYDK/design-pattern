package com.example.designpattern.工厂模式;

/**
 * @description:
 * @author: zhangkai
 * @createDate: 2022/1/4
 * @version: 1.0
 */
public class BBizServiceImpl implements BizService {
    @Override
    public void doBiz(String name) {
        System.out.println(this.getClass().getName() + ":" + name);

    }
}
