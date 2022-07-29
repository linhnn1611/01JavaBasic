package day5.QLTS;

public class Main {

	public static void main(String[] args) {
		//inDanhSach(nhapThongTin());
		//inDanhSach(sapXepTheoMaSV(nhapThongTin()));
		SinhVien[] danhSachBanDau = nhapThongTin();
		//
		SinhVien[] danhSachDaXep = sapXepTheoHoTen(danhSachBanDau);
		inDanhSach(danhSachDaXep);
	}

//Nhap thong tin sinh vien
	public static SinhVien[] nhapThongTin() {
		SinhVien s1 = new SinhVien();
		s1.maSV = "M04";
		s1.hoten = "Hiep";
		s1.gioitinh = "Nam";
		s1.username = "hiep1";
		s1.pass = "h1";
		s1.role = "Sinh vien";

		SinhVien s2 = new SinhVien();
		s2.maSV = "M06";
		s2.hoten = "Hau";
		s2.gioitinh = "Nu";
		s2.username = "hau1";
		s2.pass = "hh1";
		s2.role = "Sinh vien";

		SinhVien s3 = new SinhVien();
		s3.maSV = "M03";
		s3.hoten = "Linh";
		s3.gioitinh = "Nu";
		s3.username = "linh1";
		s3.pass = "l1";
		s3.role = "Sinh vien";

		SinhVien s4 = new SinhVien();
		s4.maSV = "M01";
		s4.hoten = "Hai";
		s4.gioitinh = "Nam";
		s4.username = "hai1";
		s4.pass = "hhh1";
		s4.role = "Sinh vien";

		SinhVien s5 = new SinhVien();
		s5.maSV = "M05";
		s5.hoten = "Ninh";
		s5.gioitinh = "Nam";
		s5.username = "ninh1";
		s5.pass = "n1";
		s5.role = "Sinh vien";

		SinhVien[] danhSachSinhVien = new SinhVien[5];
		danhSachSinhVien[0] = s1;
		danhSachSinhVien[1] = s2;
		danhSachSinhVien[2] = s3;
		danhSachSinhVien[3] = s4;
		danhSachSinhVien[4] = s5;
		return danhSachSinhVien;
	}

//In danh sach sinh vien
	public static void inDanhSach(SinhVien[] danhSachSinhVien) {
		for (int i = 0; i < danhSachSinhVien.length; i++) {
			System.out.print(danhSachSinhVien[i].maSV);
			System.out.print(" " + danhSachSinhVien[i].hoten);
			System.out.print(" " + danhSachSinhVien[i].gioitinh);
			System.out.print(" " + danhSachSinhVien[i].username);
			System.out.print(" " + danhSachSinhVien[i].pass);
			System.out.println(" " + danhSachSinhVien[i].role);
		}
	}

	public static SinhVien[] sapXepTheoMaSV(SinhVien[] danhSachSinhVien) {
		//SinhVien[] result=null;
		
		for (int i = 0; i < danhSachSinhVien.length - 1; i++) {
			for (int j = 0; j < danhSachSinhVien.length - 1 - i; j++)
			{
				if (danhSachSinhVien[j].maSV.compareTo(danhSachSinhVien[j + 1].maSV) > 0) {   //>0 sap xep tu be den lon, <0 nguoc lai
					// doi theo maSV nhung gan ca object
					SinhVien temp = danhSachSinhVien[j];
					danhSachSinhVien[j] = danhSachSinhVien[j + 1];
					danhSachSinhVien[j+1] = temp;
				}			
			}
		}
		return danhSachSinhVien;
	}
	public static SinhVien[] sapXepTheoMaSV2(SinhVien[] danhSachSinhVien) {
		for (int i = 0; i < danhSachSinhVien.length - 1; i++) {
		
		}
		return danhSachSinhVien;
	}
	public static SinhVien[] sapXepTheoHoTen(SinhVien[] danhSachSinhVien) {
		//SinhVien[] result=null;
		
		for (int i = 0; i < danhSachSinhVien.length - 1; i++) {
			for (int j = 0; j < danhSachSinhVien.length - 1 - i; j++)
			{
				if (danhSachSinhVien[j].hoten.compareTo(danhSachSinhVien[j + 1].hoten) > 0) {   //>0 sap xep tu be den lon, <0 nguoc lai
					// doi theo maSV nhung gan ca object
					SinhVien temp = danhSachSinhVien[j];
					danhSachSinhVien[j] = danhSachSinhVien[j + 1];
					danhSachSinhVien[j+1] = temp;
				}			
			}
		}
		return danhSachSinhVien;
	}

}
