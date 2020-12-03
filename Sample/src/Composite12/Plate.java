package Composite12;

import java.util.ArrayList;

/**
 * @author ywq
 * @date 2020/11/22 13:07
 */
/*容器构建类*/
public class Plate extends MyElement {
    private ArrayList list=new ArrayList();
    public void add(MyElement element)
    {
        list.add(element);
    }

    public void remove(MyElement element)
    {
        list.remove(element);
    }

    public void eat()
    {
        for(Object obj:list)
        {
            ((MyElement)obj).eat();
        }
    }
}
