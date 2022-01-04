package com.example.designpattern.工厂模式;

/**
 * @description:
 * @author: zhangkai
 * @createDate: 2022/1/4
 * @version: 1.0
 */
public class Tesg {
    public static void main(String[] args) {
        BizServiceFactory bizServiceFactory = new BizServiceFactory();

        BizService bizService = bizServiceFactory.getBizService("Assss");

        bizService.doBiz("Assss");
    }
}
