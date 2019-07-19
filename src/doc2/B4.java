package doc2;

import java.util.Scanner;

public class B4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		float soDien;
		System.out.println("Nhap vao so dien: ");
		soDien = in.nextFloat();
		System.out.println("Tien dien phai dong la: " + tinhTien(soDien));
	}

	public static double tinhTien(float soDien) {
		if (soDien < 50) {
			return soDien * 1678;
		} else if (soDien < 100) {
			return (50 * 1678 + (soDien - 50) * 1734);
		} else if (soDien < 200) {
			return (50 * 1678 + 50 * 1734 + (soDien - 100) 
					* 2014);
		} else if (soDien < 300) {
			return (50 * 1678 + 50 * 1734 + 100 * 2014 
					+ (soDien - 200) * 2536);
		} else if (soDien < 400) {
			return (50 * 1678 + 50 * 1734 + 100 * 2014 
					+ 100 * 2536 + (soDien - 300) * 2834);
		} else {
			return (50 * 1678 + 50 * 1734 + 100 * 2014 
					+ 100 * 2536 + 100 * 2834 + (soDien - 400) 
					* 2927);
		}

	}
}
