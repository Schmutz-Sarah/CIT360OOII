import java.net.*;
import java.util.Scanner;

public class HttpExample {

	public static void main(String[] args) throws Exception {

		URL u;
		Scanner s;

		u = new URL(args[0]);

		s = new Scanner(u.openStream());

		while (s.hasNext()) {
			System.out.println(s.nextLine());
		}
	}
}
