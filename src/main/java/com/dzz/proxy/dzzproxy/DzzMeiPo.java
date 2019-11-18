package com.dzz.proxy.dzzproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author duzhuangzhuang&#13;
 * @version CMR&#13;
 * @date: 2019\11\18 0018 14:54
 **/
public class DzzMeiPo implements DzzInvocationHandler
{
    private Object proxyObj;
    
    public Object getInstance(Object proxyObj)
    {
        this.proxyObj = proxyObj;
        Class<?> clazz = proxyObj.getClass();
        return DzzProxy.newProxyInstance(new DzzClassLoader(), clazz.getInterfaces(), this);
    }
    
    public Object invoke(Object proxy, Method method, Object[] args)
        throws Throwable
    {
        before();
        Object o = method.invoke(this.proxyObj, args);
        after();
        return o;
    }
    
    private void before()
    {
        System.out.println("我是媒婆，收取一定的费用，开始给你找");
    }
    
    private void after()
    {
        System.out.println("介绍完成，两人去接触合适不合适和我没关系");
    }
}
