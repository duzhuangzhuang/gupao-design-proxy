package com.dzz.proxy.dunamicproxy.cglibproxy;

import net.sf.cglib.core.DebuggingClassWriter;

/**
 * @author duzhuangzhuang&#13;
 * @version CMR&#13;
 * @date: 2019\11\18 0018 16:07
 **/
public class CglibProxyTest
{
    public static void main(String[] args)
    {
        try
        {
            //输出cglib字节码文件
            //jdk是采用读取接口的信息
            //cglib覆盖父类方法
            //目的都是一样的，去实现增加代码逻辑功能

            //jdk proxy对用户而言必须要提供一个接口，目标类相对来说复杂
            //cglib可以代理任意一个普通的类，没有任何要求

            //cglib生成代理逻辑更复杂，调用效率更高，生成了一个包含所有逻辑的fastclass，不在需要反射调用
            //jdk生成的代理逻辑简单，效率较低，每次都是反射调用

            //cglib不能代理final修饰的方法
            System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY,"E://cglib_proxy_class");
            Son son  = (Son)new CglibMeiPo().getInstance(Son.class);
            son.findLove();
        }
        catch (Throwable a)
        {
            a.printStackTrace();
        }
    }
}
