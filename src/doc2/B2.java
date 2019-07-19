package doc2;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class B2 {
	public static Integer a[];
	public static Integer b[];

	public static void main(String[] args) {
		nhap();
		System.out.println("Mang chung la: ");
		timMangChung();

	}

	public static void nhap() {
		Scanner in = new Scanner(System.in);
		int n;
		System.out.println("Nhap so phan tu mang a: ");
		n = in.nextInt();
		a = new Integer[n];
		System.out.println("Nhap mang a: ");
		for (int i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}
		System.out.println("Nhap so phan tu mang b: ");
		n = in.nextInt();
		b = new Integer[n];
		System.out.println("Nhap mang b: ");
		for (int i = 0; i < n; i++) {
			b[i] = in.nextInt();
		}
	}

	public static void timMangChung() {
		ArrayList<Integer> a1 = new ArrayList<>(Arrays.asList(a));
		a1.retainAll(Arrays.asList(b));
		Set<Integer> kq = new HashSet<>(a1);
		System.out.println(kq.toString());
	}
}
