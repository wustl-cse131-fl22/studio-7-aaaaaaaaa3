package studio7;

import java.security.PublicKey;
import java.util.Scanner;

import javax.management.loading.PrivateClassLoader;

public class Rectangle {
	private double length;
	private double width;
	// private double area;

	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	public double getLength() {
		return this.length;
	}

	public double getWidth() {
		return this.width;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double areaCal() {
		return this.length * this.width;
	}

	public double pCal() {
		return 2 * (this.length + this.width);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Rectangle r1 = new Rectangle(3, 4);// 创建一个新的长方形
		System.out.println(r1.areaCal());
		r1.setLength(6);// 重新set那个长方形的length
		r1.setWidth(5);// 重新set那个长方形的width
		System.out.println(r1.pCal());
	}
}
