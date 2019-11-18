package com.dzz.proxy.dunamicproxy.jdkproxy;

import com.dzz.proxy.Person;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author duzhuangzhuang&#13;
 * @version CMR&#13;
 * @date: 2019\11\18 0018 14:33
 **/
public class JdkProxyTest
{
    public static void main(String[] args)
    {
        try
        {
            Person proxyJdk = (Person)new JdkMeiPo().getInstance(new Girl());
            proxyJdk.findLove();;

            byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0", new Class[] {Person.class});
            FileOutputStream fos = new FileOutputStream("E://$Proxy0.class");
            fos.write(bytes);
            fos.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    
}
