package lab3;


	public class TamGiac extends Diem{
		public Diem A;
		public Diem B;
		public Diem C;

		//ham tao khong tham so 
	public TamGiac() {
		A = new Diem();
		B = new Diem();
		C = new Diem();
	}
		
	public void NhapTG() {
		A.NhapDiem();
		B.NhapDiem();
		C.NhapDiem();
	}
	public boolean KiemTra() {
		boolean kt ;
		if(((A.x - B.x) * (C.y - B.y) != (A.y - B.y) * (C.x - B.x))) {
			kt = true;
		}else {
			kt = false;
		}	System.out.println(kt);
		return kt;
	}

	//phuong thuc tinh chu vi tam giac
	public double ChuViTG() {
		double AB = Math.sqrt(Math.pow(B.x-A.x,2) + Math.pow(B.y-A.y,2));
		double BC = Math.sqrt(Math.pow(C.x-B.x,2) + Math.pow(C.y-B.y,2));
		double CA = Math.sqrt(Math.pow(A.x-C.x,2) + Math.pow(A.y-C.y,2));
		return AB + BC + CA;
	}

	//phuong thuc tinh dien tich tam giac
	public double DienTichTG() {
		double p = ChuViTG()/2; 
		double AB = Math.sqrt(Math.pow(B.x-A.x,2) + Math.pow(B.y-A.y,2));
		double BC = Math.sqrt(Math.pow(C.x-B.x,2) + Math.pow(C.y-B.y,2));
		double CA = Math.sqrt(Math.pow(A.x-C.x,2) + Math.pow(A.y-C.y,2));
		   return Math.sqrt(p * (p - AB) * (p - CA) * (p - BC));
	}
	}
