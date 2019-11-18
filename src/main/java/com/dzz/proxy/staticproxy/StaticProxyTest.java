package com.dzz.proxy.staticproxy;

/**
 *
 * 静态代理测试类
 *
 * @author duzhuangzhuang&#13;
 * @version CMR&#13;
 * @date: 2019\11\18 0018 14:10
 **/
public class StaticProxyTest
{
    public static void main(String[] args)
    {
        Father father = new Father().getInstance(new Son());
        father.findLove();
    }
}
