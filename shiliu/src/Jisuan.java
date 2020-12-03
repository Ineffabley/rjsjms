import java.util.Stack;

/**
 * @author ywq
 * @date 2020/11/19 11:10
 */
public class Jisuan {
    private Stack<Mingling> s1;
    private Stack<Mingling> s2;

    public void setM(Mingling a)
    {
        s2.push(a);
    }

    public Jisuan() {
        s1=new Stack<>();
        s2=new Stack<>();
    }
    public void execute()
    {
        if(s2.isEmpty())
            return ;
        Mingling m=s2.peek();
        m.execute();
    }

    public void undo()
    {
        //没有操作,退出
        if(s2.isEmpty())
            return;
        Mingling m=s1.pop();
        if(m!=null)
        {
            m.undo();
            s2.push(m);
        }
    }

    public void redo(){
        if(s2.isEmpty())
            return ;
        Mingling m=s2.pop();
        if(m!=null){
            m.execute();
            s1.push(m);
        }
    }
}
