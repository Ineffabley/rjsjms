/**
 * @author ywq
 * @date 2020/11/26 14:44
 */
public class Gumin implements Guancha{
    private String name;
    public Gumin(String a){name=a;}
    public void sheng(){
        System.out.println(name+"股票升了");
    }
    public void jiang(){
        System.out.println("股票降了");
    }
}