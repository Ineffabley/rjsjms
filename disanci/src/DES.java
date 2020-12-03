import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import java.security.SecureRandom;
import java.util.Scanner;

public class DES implements Mi{
	public static byte[] encrypt(byte[] datasource, String password) {
		try {
			SecureRandom random = new SecureRandom();
			DESKeySpec desKey = new DESKeySpec(password.getBytes());
			SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
			SecretKey securekey = keyFactory.generateSecret(desKey);
			Cipher cipher = Cipher.getInstance("DES");
			cipher.init(Cipher.ENCRYPT_MODE, securekey, random);
			return cipher.doFinal(datasource);
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return null;
	}
	public static byte[] decrypt(byte[] src, String password) throws Exception {
		SecureRandom random = new SecureRandom();
		DESKeySpec desKey = new DESKeySpec(password.getBytes());
		SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
		SecretKey securekey = keyFactory.generateSecret(desKey);
		Cipher cipher = Cipher.getInstance("DES");
		cipher.init(Cipher.DECRYPT_MODE, securekey, random);
		return cipher.doFinal(src);
	}
	public void show() {
		System.out.println("DES");
		System.out.print("请输入加密内容：");
		Scanner out = new Scanner(System.in);
		String str = out.nextLine();
		String password = "12345678";

		byte[] result = DES.encrypt(str.getBytes(), password);
		System.out.println("加密后：" + result);

		try {
			System.out.println("解密内容："+result);
			byte[] decryResult = DES.decrypt(result, password);
			System.out.println("解密后：" + new String(decryResult));
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}
}