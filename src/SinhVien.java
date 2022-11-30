import java.util.Scanner;

public class SinhVien {
    private int id;
    String hoten;
    int tuoi;
    String khoa;
    String namHoc;
    float diemGiaiTichB1;
    float diemCTDL;
    float diemQTCSDL;
    float diemToanCoSo;;
    float diemKTLT;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getKhoa() {
        return khoa;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }

    public String getNamHoc() {
        return namHoc;
    }

    public void setNamHoc(String namHoc) {
        this.namHoc = namHoc;
    }

    public float getDiemGiaiTichB1() {
        return diemGiaiTichB1;
    }

    public void setDiemGiaiTichB1(float diemGiaiTichB1) {
        this.diemGiaiTichB1 = diemGiaiTichB1;
    }

    public float getDiemCTDL() {
        return diemCTDL;
    }

    public void setDiemCTDL(float diemCTDL) {
        this.diemCTDL = diemCTDL;
    }

    public float getDiemQTCSDL() {
        return diemQTCSDL;
    }

    public void setDiemQTCSDL(float diemQTCSDL) {
        this.diemQTCSDL = diemQTCSDL;
    }

    public float getDiemToanCoSo() {
        return diemToanCoSo;
    }

    public void setDiemToanCoSo(float diemToanCoSo) {
        this.diemToanCoSo = diemToanCoSo;
    }

    public float getDiemKTLT() {
        return diemKTLT;
    }

    public void setDiemKTLT(float diemKTLT) {
        this.diemKTLT = diemKTLT;
    }

    public SinhVien(int id, String hoten, int tuoi, String khoa, String namHoc,
                    float diemGiaiTichB1, float diemCTDL, float diemQTCSDL, float diemToanCoSo, float diemKTLT) {
        this.id = id;
        this.hoten = hoten;
        this.tuoi = tuoi;
        this.khoa = khoa;
        this.namHoc = namHoc;
        this.diemGiaiTichB1 = diemGiaiTichB1;
        this.diemCTDL = diemCTDL;
        this.diemQTCSDL = diemQTCSDL;
        this.diemToanCoSo = diemToanCoSo;
        this.diemKTLT = diemKTLT;
    }

    public SinhVien() {

    }

    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập id sinh viên: ");
        id = sc.nextInt();
        System.out.print("Nhập tên sinh viên: ");
        hoten = sc.next();
        System.out.print("Nhập tuổi sinh viên: ");
        tuoi = sc.nextInt();
        System.out.print("Nhập khoa của sinh viên: ");
        khoa = sc.next();
        System.out.print("Nhập khoá học của sinh viên: ");
        namHoc = sc.next();
        System.out.print("Nhập điểm môn Giải Tích B1: ");
        diemGiaiTichB1 = sc.nextInt();
        System.out.print("Nhập điểm môn Cấu Trúc Dữ Liệu và Giải thuật: ");
        diemCTDL = sc.nextInt();
        System.out.print("Nhập điểm Quản Trị Cơ Sở Dữ Liệu: ");
        diemQTCSDL = sc.nextInt();
        System.out.print("Nhập điểm Toán Cơ Sở: ");
        diemToanCoSo = sc.nextInt();
        System.out.print("Nhập điểm Kỹ Thuật Lập Trình: ");
        diemKTLT = sc.nextInt();

    }

    public void xuatThongTin() {
        System.out.println("=====>     THÔNG TIN SINH VIÊN     <=====");
        System.out.println("Id: " + id);
        System.out.println("Tên: " + hoten);
        System.out.println("Tuổi: " + tuoi);
        System.out.println("Khoa: " + khoa);
        System.out.println("Khoá học: " + namHoc);
        System.out.println("Điểm Giải Tích B1: " + diemGiaiTichB1);
        System.out.println("Điểm Cấu Trúc Dữ Liệu và Giải Thuật: " + diemCTDL);
        System.out.println("Điểm Quản Trị Cơ Sở Dữ Liệu: " + diemQTCSDL);
        System.out.println("Điểm Toán cơ sở: " + diemToanCoSo);
        System.out.println("Điểm Kỹ Thuật Lập Trình: " + diemKTLT);
    }

    public float tinhDiemTB() {
        return (diemGiaiTichB1 + diemKTLT + diemCTDL + diemQTCSDL + diemToanCoSo) / 5;
    }

    public void xepLoai() {
        float tb = tinhDiemTB();
        if(tb < 3.5 ) System.out.println("Kém!");
        else if (tb >= 3.5 && tb < 5 ) System.out.println("Yếu!");
        else if (tb >=5 && tb < 6.5 ) System.out.println("Trung Bình!");
        else if( tb >= 6.5 && tb < 8 ) System.out.println("Khá!");
        else if (tb >= 8 && tb < 9.5 ) System.out.println("Giỏi!");
        else if (tb >= 9.5 ) System.out.println("Xuất xắc!");
    }
}
