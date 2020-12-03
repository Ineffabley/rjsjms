/**
 * @author ywq
 * @date 2020/11/5 16:17
 */
public abstract  class Leader {
    protected  String name;
    protected  Leader successor;
    public Leader(String name)
    {
        this.name=name;
    }

    public Leader(String name, Leader successor) {
        this.name = name;
        this.successor = successor;
    }

    public void setSuccessor(Leader successor) {
        this.successor = successor;
    }
    public abstract void Cai(Caigou cg);
}
