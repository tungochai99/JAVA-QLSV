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
        System.out.print("Nh???p id sinh vi??n: ");
        id = sc.nextInt();
        System.out.print("Nh???p t??n sinh vi??n: ");
        hoten = sc.next();
        System.out.print("Nh???p tu???i sinh vi??n: ");
        tuoi = sc.nextInt();
        System.out.print("Nh???p khoa c???a sinh vi??n: ");
        khoa = sc.next();
        System.out.print("Nh???p kho?? h???c c???a sinh vi??n: ");
        namHoc = sc.next();
        System.out.print("Nh???p ??i???m m??n Gi???i T??ch B1: ");
        diemGiaiTichB1 = sc.nextInt();
        System.out.print("Nh???p ??i???m m??n C???u Tr??c D??? Li???u v?? Gi???i thu???t: ");
        diemCTDL = sc.nextInt();
        System.out.print("Nh???p ??i???m Qu???n Tr??? C?? S??? D??? Li???u: ");
        diemQTCSDL = sc.nextInt();
        System.out.print("Nh???p ??i???m To??n C?? S???: ");
        diemToanCoSo = sc.nextInt();
        System.out.print("Nh???p ??i???m K??? Thu???t L???p Tr??nh: ");
        diemKTLT = sc.nextInt();

    }

    public void xuatThongTin() {
        System.out.println("=====>     TH??NG TIN SINH VI??N     <=====");
        System.out.println("Id: " + id);
        System.out.println("T??n: " + hoten);
        System.out.println("Tu???i: " + tuoi);
        System.out.println("Khoa: " + khoa);
        System.out.println("Kho?? h???c: " + namHoc);
        System.out.println("??i???m Gi???i T??ch B1: " + diemGiaiTichB1);
        System.out.println("??i???m C???u Tr??c D??? Li???u v?? Gi???i Thu???t: " + diemCTDL);
        System.out.println("??i???m Qu???n Tr??? C?? S??? D??? Li???u: " + diemQTCSDL);
        System.out.println("??i???m To??n c?? s???: " + diemToanCoSo);
        System.out.println("??i???m K??? Thu???t L???p Tr??nh: " + diemKTLT);
    }

    public float tinhDiemTB() {
        return (diemGiaiTichB1 + diemKTLT + diemCTDL + diemQTCSDL + diemToanCoSo) / 5;
    }

    public void xepLoai() {
        float tb = tinhDiemTB();
        if(tb < 3.5 ) System.out.println("K??m!");
        else if (tb >= 3.5 && tb < 5 ) System.out.println("Y???u!");
        else if (tb >=5 && tb < 6.5 ) System.out.println("Trung B??nh!");
        else if( tb >= 6.5 && tb < 8 ) System.out.println("Kh??!");
        else if (tb >= 8 && tb < 9.5 ) System.out.println("Gi???i!");
        else if (tb >= 9.5 ) System.out.println("Xu???t x???c!");
    }
}
