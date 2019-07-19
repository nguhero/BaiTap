package doc1;

import java.util.Arrays;
import java.util.Scanner;

public class B2 {
	public int n;
	public int a[];

	public static void main(String[] args) {
		B2 b2 = new B2();
		b2.nhap();
		b2.xuat();

	}

	public void nhap() {
		System.out.println("Nhap n: ");
		Scanner in = new Scanner(System.in);
		this.n = in.nextInt();
		this.a=new int[this.n];
		System.out.println("Nhap phan tu mang: ");
		for (int i = 0; i < this.n; i++) {
			this.a[i] = in.nextInt();
		}
	}

	public void xuat() {
		System.out.println("Mang sau sap sep: ");
		sort(this.a);
		System.out.println("Phan tu nho nhat: ");
		findMin(this.a);
		System.out.println("Trung binh cong phan tu chia het cho 3: ");
		tinhTrungBinh(this.a);
	}

	public void sort(int a[]) {
		Arrays.sort(a);
		for (int x : a) {
			System.out.print(x + " ");
		}
		System.out.println();
	}

	public void findMin(int a[]) {
		Arrays.sort(a);
		System.out.println(a[0]);
	}

	public void tinhTrungBinh(int a[]) {
		int i = 0;
		float sum = 0;
		for (int j = 0; j < a.length; j++) {
			if (a[j] % 3 == 0) {
				i++;
				sum += a[j];
			}
		}
		if (i == 0) {
			System.out.println("0");
		} else {
			System.out.println(sum / i);
		}
	}
}
