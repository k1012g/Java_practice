import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("test.dat", true);

		// 2進数01000001 -> Aという文字を末尾に書き込む
		fos.write(65);
		fos.flush();
		fos.close();
	}
}