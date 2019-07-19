package doc1;

import java.util.Scanner;

public class B4 {
	public B1 b1;
	public B2 b2;
	public B3 b3;

	public static void main(String[] args) {
		B4 b4 = new B4();
		b4.hienThi();
	}

	public void hienThi() {
		Scanner in = new Scanner(System.in);
		int c = 0;
		do {
			System.out.println("1.Tim so nguyen to");
			System.out.println("2.Sap xep mang so nguyen");
			System.out.println("3.Loc mang so nguyen");
			System.out.println("4.Ket thuc");
			System.out.println("Moi chon chuc nang: ");
			c = in.nextInt();
			switch (c) {
			case 1:
				b1 = new B1();
				b1.nhap();
				b1.xuat();
				break;
			case 2:
				b2 = new B2();
				b2.nhap();
				b2.xuat();
				break;
			case 3:
				b3 = new B3();
				b3.nhap();
				b3.xuat();
				break;
			}
			System.out.println();

		} while (c != 4);
	}
}
