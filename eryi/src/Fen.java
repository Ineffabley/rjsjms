/**
 * @author ywq
 * @date 2020/11/26 14:42
 */
import java.util.ArrayList;
public class Fen{
    private ArrayList<Guancha> oblist;
    public Fen(){
        oblist=new ArrayList<>();
    }
    public void add(Guancha a){
        oblist.add(a);
    }
    public void remove(Guancha a){
        oblist.remove(a);
    }
    public void sheng(double a){
        if(a>0.05)
            for(Guancha guan:oblist){
                guan.sheng();
            }
    }
    public void jiang(double a){
        if(a>0.05)
            for(Guancha guan:oblist){
                guan.jiang();
            }
    }
}