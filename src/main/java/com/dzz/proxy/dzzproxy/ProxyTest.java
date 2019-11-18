package com.dzz.proxy.dzzproxy;

import com.dzz.proxy.Person;
import com.dzz.proxy.dunamicproxy.jdkproxy.Girl;
import com.dzz.proxy.dunamicproxy.jdkproxy.JdkMeiPo;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;
import java.lang.reflect.Method;

/**
 * @author duzhuangzhuang&#13;
 * @version CMR&#13;
 * @date: 2019\11\18 0018 14:33
 **/
public class ProxyTest
{
    public static void main(String[] args)
    {
        try
        {
            Object proxyDzz = new DzzMeiPo().getInstance(new Girl());
            Method method = proxyDzz.getClass().getMethod("findLove", null);
            method.invoke(proxyDzz);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    
}
