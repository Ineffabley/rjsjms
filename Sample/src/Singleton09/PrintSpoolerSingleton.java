package Singleton09;

/**
 * @author ywq
 * @date 2020/11/21 21:47
 */
/*单例类*/
public class PrintSpoolerSingleton {
    private static PrintSpoolerSingleton instance=null;

    public PrintSpoolerSingleton() {
    }

    public static PrintSpoolerSingleton getInstance() throws PrintSpoolerException
    {
        if(instance==null)

        {
            System.out.println("创建打印池");
            instance=new PrintSpoolerSingleton();
        }
        else
        {
            throw new PrintSpoolerException("打印池正在工作中");
        }
        return instance;
    }

    public void manageJobs()
    {
        System.out.println("管理打印任务");
    }
}
