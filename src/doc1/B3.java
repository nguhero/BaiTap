package doc1;

import java.util.Scanner;

public class B3 {
	public int n;
	public int a[];

	public static void main(String[] args) {
		B3 b3 = new B3();
		b3.nhap();
		b3.xuat();

	}

	public void nhap() {
		Scanner in = new Scanner(System.in);
		System.out.println("Nhap n: ");
		this.n = in.nextInt();
		this.a = new int[this.n];
		int i = 0;
		System.out.println("Nhap phan tu: ");
		while (i < this.n) {
			int x = in.nextInt();
			if (x >= 0) {
				this.a[i] = x;
				i++;
			} else {
				System.out.println("Nhap so >=0! Moi nhap lai: ");
			}
		}
	}

	public void xuat() {
		sapXep(this.a);
	}

	public void sapXep(int a[]) {
		int n = a.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n - i - 1; j++) {
				if (a[j] == 0) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		System.out.println("Mang sau sap xep: ");
		for (int x : a) {
			System.out.print(x + " ");
		}
	}
}
