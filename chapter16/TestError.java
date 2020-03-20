import java.io.IOException;


public class TestError {
	public static void main(String[] args) throws IOException {
		System.out.println("プログラム起動");
		throw new IOException();
	}
}