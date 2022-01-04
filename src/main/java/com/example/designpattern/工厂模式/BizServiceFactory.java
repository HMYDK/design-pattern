package com.example.designpattern.工厂模式;

/**
 * @description:
 * @author: zhangkai
 * @createDate: 2022/1/4
 * @version: 1.0
 */
public class BizServiceFactory {

    public BizService getBizService(String name){
        if (name.contains("A")){
            return new ABizServiceImpl();
        }
        return new BBizServiceImpl();
    }
}
