package doc1;

import java.util.Scanner;

public class B1 {
	public int n;

	public static void main(String[] args) {
		B1 b1 = new B1();
		b1.nhap();
		b1.xuat();

	}

	public void nhap() {
		Scanner in = new Scanner(System.in);
		System.out.println("Nhap n: ");
		this.n = in.nextInt();
	}

	public void xuat() {
		for (int i = 2; i < this.n; i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");
			}
		}
	}

	public boolean isPrime(int n) {
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;

	}
}
