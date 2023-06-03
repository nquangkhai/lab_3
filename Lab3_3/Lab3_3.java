package Lab3_3;

	import java.util.Scanner;


	import java.util.ArrayList;


	class HangHoa{
		String mahang;
		String tenhang;
		String ngaysx;
		double gia;

		
		public void Nhap() {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Ten Hang :");
			tenhang = scanner.nextLine();
			System.out.println("Ma Hang :");
			mahang = scanner.nextLine();
			NgayThang nt3 = new NgayThang();
			System.out.println("Ngay San Xuat :");
			ngaysx = scanner.nextLine();
			System.out.println("Gia Ban :");
			gia = scanner.nextDouble();
		}
		
		public String toString() {
			return  "--------------------------"+" \n"
					+"Ten Hang:"+tenhang + " \n" 
					+"Ma Hang:"+ mahang +" \n" 
					+"Ngay San Xuat:"+ ngaysx +" \n" 
					+"Gia Ban:" + gia+" VND"; 
		}
	}

	class NgayThang{
		int ngay,thang,nam;
		
		public void Nhap(){
			Scanner scanner = new Scanner(System.in);
			System.out.println("nhap ngay:");
			ngay = scanner.nextInt();
			System.out.println("nhap thang:");
			thang = scanner.nextInt();
			System.out.println("nhap nam:");
			nam = scanner.nextInt();
		}
		
		public String toString() {
			return ngay+"/"+thang+"/"+nam;
		}
	}

	class HangDienMay extends HangHoa{
		private String thoiGianBaoHanh;
		private int dienAp;
		private int congSuat;
		
		public void Nhap() {
			super.Nhap();
			Scanner scanner = new Scanner(System.in);
			System.out.println("Thoi Gian Bao Hanh:");
			thoiGianBaoHanh = scanner.nextLine();
			System.out.println("Dien Ap:");
			dienAp = scanner.nextInt();
			System.out.println("Cong Suat:");
			congSuat = scanner.nextInt();
		}
		
		public String toString() {
			return  super.toString() + "\n"
					+"Thoi Gian Bao Hanh: "+thoiGianBaoHanh +" \n"
					+"Dien Ap: "+dienAp +" \n"
					+"Cong Suat: "+congSuat;
		}
	}

	class HangSanhSu extends HangHoa{
		private String LoaiNguyenLieu;
		
		public void Nhap() {
			super.Nhap();
			Scanner scanner = new Scanner(System.in);
			System.out.println("Loai Nguyen Lieu: ");
			LoaiNguyenLieu = scanner.nextLine();
		}
		
		public String toString() {
			return  super.toString()+ "\n"
					+"Loai Nguyen Lieu: "+LoaiNguyenLieu;
		}
	}


	class HangThucPham extends HangHoa{
		private String ngaySanXuat;
		private String ngayHetHan;
		
		NgayThang nt1 = new NgayThang();
		NgayThang nt2 = new NgayThang();
		public void Nhap() {

			super.Nhap();
			System.out.println("nhap ngay san xuat: ");
			nt1.Nhap();
			System.out.println("nhap ngay het han: ");
			nt2.Nhap();
		}
		
		public String toString() {
			return 	super.toString()+ " \n"
					+"Ngay San Xuat: "+nt1.toString()+" \n"
					+"Ngay Het Han: "+nt2.toString(); 
		}
	}
	public class Main {

		public static void main(String[] args) {
	        ArrayList<HangHoa> dsHH=new ArrayList<HangHoa>();
	        HangThucPham htp=new HangThucPham();
	        HangSanhSu hss=new HangSanhSu();
	        HangDienMay hdm=new HangDienMay();
	        int luachon;
	        int chon;
	        Scanner scanner=new Scanner(System.in);
	        // phan loai de nhap loai hang hoa
	    do{ System.out.println("\t\tMENU");
	        System.out.println("1.Nhap vao hang thuc pham.");
	        System.out.println("2.Nhap vao hang sanh su.");
	        System.out.println("3.Nhap vao hang dien may.");
	        System.out.println("4.In tat ca cac mat hang da nhap.");
	        System.out.println("Nhap vao lua chon cua ban: ");
	        luachon=scanner.nextInt();
	        switch(luachon){
	        case 1:{
	            htp.Nhap();
	            dsHH.add(htp);
	            break;
	        }
	        case 2:{
	            hss.Nhap();
	            dsHH.add(hss);
	            break;
	        }
	        case 3:{
	            hdm.Nhap();
	            dsHH.add(hdm);
	            break;
	        }
	        case 4:
	        	
	        	// in danh sach theo loai san pham (sd for-each)
	        	
	        	//danh sach hang dien may
	        	System.out.println("\n***************************");
	    		System.out.println("Danh Sach Hang Dien May:");
	            for (HangHoa hangHoa : dsHH) {
	                if (hangHoa instanceof HangDienMay) {
	                    System.out.println(hangHoa.toString());
	                    System.out.println("------------------------");
	                }
	            }
	            
	            //danh sach hang sanh su 
	            System.out.println("\n------------------------");
	            System.out.println("Danh Sach Hang Sanh Su:");
	            for (HangHoa hangHoa : dsHH) {
	                if (hangHoa instanceof HangSanhSu) {
	                    System.out.println(hangHoa.toString());
	                    System.out.println("------------------------");
	                }
	            }
	            //danh sach hang thuc pham
	            System.out.println("\n------------------------");
	            System.out.println("Danh Sach Hang Thuc Pham:");
	            for (HangHoa hangHoa : dsHH) {
	                if (hangHoa instanceof HangThucPham) {
	                    System.out.println(hangHoa.toString());
	                    System.out.println("------------------------");
	                }
	            break;
	        }
	            System.out.println("\n***************************");
	       }
	 
	        System.out.println("Ban co muon lua chon tiep khong(yes=1/no=0): ");
	        chon=scanner.nextInt();
	        scanner.nextLine();
	    }while(chon!= 0);
		}
	}

