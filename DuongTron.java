package lab3;


	import java.util.Scanner;

	public class DuongTron extends Diem{
		public Diem I;
		public double R;
		
		public DuongTron() {
			I = new Diem();
		}
		
		public void NhapDT() {
			Scanner scanner = new Scanner(System.in);
			System.out.println("nhap tam duong tron :");
			I.NhapDiem();
			
			do {
				System.out.println("nhap ban kinh R = ");
				R = scanner.nextDouble();
			}while(R<0);
		}
		
		public void InDT() {
			System.out.print("duong tron tam I:");
			I.InDiem();
			System.out.println();
			System.out.println("ban kinh R :"+R);
		}
		
		public double ChuViDT() {
			double cv = Math.PI*2*R;
			return cv;
			
		}
		public double DienTichDT() {
			double dt = Math.PI*Math.pow(R,2);
			return dt;
		}
	}

