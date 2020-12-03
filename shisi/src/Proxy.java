/**
 * @author ywq
 * @date 2020/11/5 16:04
 */
public class Proxy implements People {
    private Real r=new Real();
    public void setr(Real a){
        r=a;
    }
    public void setAge(int a){
    }
    public void deng(){
        if(r.getAge()<18){
            System.out.println("对不起,不能早恋");
        }
        else{
            r.deng();
        }
    }
}
