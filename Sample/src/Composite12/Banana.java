package Composite12;

/**
 * @author ywq
 * @date 2020/11/22 13:05
 */
/*叶子构建类*/
public class Banana extends MyElement{

    @Override
    public void eat() {
        System.out.println("吃香蕉");
    }
}
