package doc2;

import java.util.Scanner;

public class B6 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = "";
		String pattern;
		while (!str.equals("quit")) {
			System.out.println("Nhap pattern: ");
			pattern = in.nextLine();
			System.out.println("Nhap vao chuoi: ");
			str = in.nextLine();
			if (str.matches(pattern)) {
				System.out.println("true");
			} else {
				System.out.println("false");
			}
		}
	}

}
