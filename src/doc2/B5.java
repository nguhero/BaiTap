package doc2;

import java.util.Scanner;

public class B5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String email;
		String reEmail = "\\w+@\\w+(\\.\\w+){1,2}";
		System.out.println("Nhap vao email: ");
		email = in.nextLine();
		if (email.matches(reEmail)) {
			System.out.println("Dung dinh dang");
		} else {
			System.out.println("Sai dinh dang!");
		}

	}
}
