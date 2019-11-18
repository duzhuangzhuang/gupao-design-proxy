package com.dzz.proxy.dzzproxy;

import java.lang.reflect.Method;

/**
 * @author duzhuangzhuang&#13;
 * @version CMR&#13;
 * @date: 2019\11\18 0018 14:57
 **/
public interface DzzInvocationHandler
{
    public Object invoke(Object proxy, Method method, Object[] args)
        throws Throwable;
}
