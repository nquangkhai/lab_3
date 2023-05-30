package lab3;

	import java.util.Scanner;

	public class Diem {
		 public double x;
		 public double y;
		 //ham tao Diem khong tham so 
		 public Diem() {
		 }
		 //ham tao Diem co tham 2 tham so x va y
		public Diem(double x, double y) {
			this.x = x;
			this.y = y;
		}
		
		// phuong thuc nhap diem
		public void NhapDiem() {
			Scanner scanner = new Scanner(System.in);
			System.out.println("nhap x = ");
			x = scanner.nextDouble();
			System.out.println("nhap y = ");
			y = scanner.nextDouble();
		}
		public void InDiem() {
			System.out.printf("(%.2f : %.2f)",x,y);
		}

}
