/**
 * @author ywq
 * @date 2020/11/26 14:58
 */
public class Person {
    private String name;
    private Fangshi f;
    public Person(String a){
        name=a;
    }
    public void setname(String a){
        name=a;
    }
    public void setfang(Fangshi a){
        f=a;
    }
    public void travel(){
        System.out.println(name+"要去旅游");
        f.travel();
        System.out.println();
    }
}