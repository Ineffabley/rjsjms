import java.util.*;

/**
 * @author ywq
 * @date 2020/11/19 11:26
 */
public class Iterators {
    public static void main(String[] args) {
        Student s1=new Student("20180001","AA");
        Student s2=new Student("20180002","BB");
        List<Student> list =new ArrayList<>();
        list.add(s1);
        list.add(s2);
        System.out.println("=======遍历链表(学号从小到大)======");

        Iterator<Student> iterator = list.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            System.out.println(student);
        }
        System.out.println("=======遍历set集合(学号从大到小)=======");
        Set<Student> set = new HashSet<>(list);
        iterator = set.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            System.out.println(student);
        }

    }

}
