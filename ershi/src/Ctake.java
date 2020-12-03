/**
 * @author ywq
 * @date 2020/11/19 19:11
 */
public class Ctake {
    public Ctake(){
        array = new Memento[10];
        index = 0;
    }
    private Memento[] array = null;
    private int index;
    private Memento memento;
    public Memento getMemento()
    {
        return memento;
    }
    public void setMemento(Memento memento)
    {
        this.memento=memento;
    }
    public void addMemento(Memento Memento){
        array[index++] = Memento;
    }
    public Memento preMemento(){
        Memento pop = null;
        try {
            pop = array[--index];
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pop;
    }
}
