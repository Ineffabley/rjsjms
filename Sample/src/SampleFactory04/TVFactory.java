package SampleFactory04;

/**
 * @author ywq
 * @date 2020/11/18 19:48
 */
public class TVFactory {
    public static TV prodecrTV(String brand) throws Exception {
        if(brand.equalsIgnoreCase("Haier"))
        {
            return new HaierTV();
        }
       else if(brand.equalsIgnoreCase("Hisense"))
        {
            return new HisenseTV();
        }
       else
        {
            throw new Exception("不生产");
        }

    }
}
