package com.dzz.proxy.staticproxy;

/**
 * @author duzhuangzhuang&#13;
 * @version CMR&#13;
 * @date: 2019\11\18 0018 14:06
 **/
public class Father
{
    private static Son son;
    
    public Father getInstance(Son son)
    {
        this.son = son;
        return new Father();
    }
    
    public void findLove()
    {
        System.out.println("帮儿子物色对象，达到父亲的标准");
        son.findLove();
        System.out.println("儿子父亲都满意，然后和对方父母商定结婚");
        
    }
}
