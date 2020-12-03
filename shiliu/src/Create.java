/**
 * @author ywq
 * @date 2020/11/19 11:03
 */
public class Create extends Mingling{
   int value;
   Add adder;

    public Create(int value, Add adder) {
        this.value = value;
        this.adder = adder;
    }
    public  void  execute()
    {
        adder.add(value);
    }
    public  void  undo()
    {
        adder.add(-1*value);
    }
}
