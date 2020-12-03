/**
 * @author ywq
 * @date 2020/11/19 11:23
 */
public class Student{
    private String id;
    private String name;
    public Student(){}
    public Student(String id,String name){
        this.id = id;
        this.name = name;
    }

    public static Student fromString(String s) {
        String[] split = s.split(";");
        if(split.length==2){

            return new Student(split[0],split[1]);
        }else{
            throw new RuntimeException("不能从字符串‘"+s+"’解析出"+Student.class+"类型的对象！");
        }
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String toString() {
        return "ID=" + id + ", 名字=" + name ;
    }
}

