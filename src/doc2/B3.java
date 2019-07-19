package doc2;

import java.util.Scanner;

public class B3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;
		System.out.println("Nhap so sinh vien: ");
		n = Integer.parseInt(in.nextLine());
		String ten[] = new String[n];
		float diem[] = new float[n];
		String hocLuc[] = new String[n];
		System.out.println("Nhap ten sinh vien va diem: ");
		for (int i = 0; i < n; i++) {
			ten[i] = in.nextLine();
			diem[i] = Float.parseFloat(in.nextLine());
		}
		xeploai(diem, hocLuc);
		xuat(diem, ten, hocLuc);

	}

	public static void xuat(float diem[], String ten[], String hocluc[]) {
		for (int i = 0; i < diem.length; i++) {
			System.out.println(ten[i] + " " + diem[i] + " " + hocluc[i]);
		}
	}

	public static void xeploai(float diem[], String hocluc[]) {
		for (int i = 0; i < diem.length; i++) {
			if (diem[i] < 5) {
				hocluc[i] = "Yeu";
			} else if (diem[i] >= 5 && diem[i] < 6.5) {
				hocluc[i] = "Trung binh";
			} else if (diem[i] >= 6.5 && diem[i] < 7.5) {
				hocluc[i] = "Kha";
			} else if (diem[i] >= 7.5 && diem[i] < 9) {
				hocluc[i] = "Gioi";
			} else {
				hocluc[i] = "Xuat Sac";
			}
		}
	}
}
