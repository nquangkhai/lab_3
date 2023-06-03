package lab3_1;

import java.util.Scanner;
public class Sach {
	private String ma,ten,tg;
	private int trang,tap,gia;
	private String loai,nxb;
	
	//phuong thuc nhap sach
	public void NhapSach() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("\nnhap ma sach:");
		ma = scanner.nextLine();
		System.out.println("nhap ten sach:");
		ten = scanner.nextLine();
		System.out.println("nhap tac gia:");
		tg = scanner.nextLine();
		System.out.println("nhap loai:");
		loai = scanner.nextLine();
		System.out.println("nhap ngay xuat ban:");
		nxb = scanner.nextLine();
		System.out.println("nhap so trang:");
		trang = scanner.nextInt();
		System.out.println("tap:");
		tap = scanner.nextInt();
		System.out.println("nhap gia:");
		gia = scanner.nextInt();
		
	}
	
	//phuong thuc in sach
	public void InSach() {
		System.out.println("ma sach:"+ma);
		System.out.println("ten sach:"+ten);
		System.out.println("tac gia:"+tg);
		System.out.println("so trang:"+trang);
		System.out.println("tap:"+tap);
		System.out.println("gia sach:"+gia);
		System.out.println("loai:"+loai);
		System.out.println("ngay xuat ban:"+nxb);
		
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//nhap so luong dau sach
		System.out.println("nhap n:");
		int n = scanner.nextInt(); 
		Sach[] ds = new Sach[n];   //khai bao mang doi tuong sach
		
		// nhap thong tin n dau sach
		for(int i = 0; i < n ;i++) {
			System.out.printf("nhap vao thong tin sach thu %d :",i+1);
			ds[i] = new Sach();
			ds[i].NhapSach();
		}
		
		//in thong tin n dau sach
		System.out.print("<===============================>\n");
		for(int i = 0 ; i < n ;i++) {
			//System.out.print("<===============================>\n");
			System.out.printf(" thong tin sach thu %d :\n",i+1);
			ds[i].InSach();
			System.out.println();
			System.out.print("<===============================>\n");
		}	
		scanner.close();
	}
}