/**
 * @author ywq
 * @date 2020/12/3 15:54
 */
public abstract class DbUtil {
    protected abstract void connDb();
    protected abstract void openDb();
    protected abstract void useDb();
    protected abstract void closeDb();
    public void yunxing(){
        connDb();
        openDb();
        useDb();
        closeDb();
    }
}