package Singleton09;

/**
 * @author ywq
 * @date 2020/11/21 21:53
 */
public class Client {
    public static void main(String[] args) {
        PrintSpoolerSingleton a,b;
        try {
            a=PrintSpoolerSingleton.getInstance();
            a.manageJobs();
        } catch (PrintSpoolerException e) {
            e.printStackTrace();
        }

        System.out.println("===================================================");
        try {
            b=PrintSpoolerSingleton.getInstance();
            b.manageJobs();
        } catch (PrintSpoolerException e) {
            e.printStackTrace();
        }
    }
}
