package baithuchanh;

import java.util.Scanner;

public class slide47 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int s=0;
		do{
			int n;
			System.out.println("moi nhap : ");
			n=sc.nextInt();
			s+=n;
		} while(s<=100);
		System.out.println(s);
	}

}
