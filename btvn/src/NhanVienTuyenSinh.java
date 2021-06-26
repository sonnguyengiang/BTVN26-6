public class NhanVienTuyenSinh extends Nhanvien{
    private int rank;

    public NhanVienTuyenSinh(int rank) {
        this.rank = rank;
    }

    public NhanVienTuyenSinh(String name, int age, String gender, int phoneNumber, String email, int salary, int rank) {
        super(name, age, gender, phoneNumber, email, salary);
        this.rank = rank;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int tienLuong(){
        int tienluong = this.getSalary() * 8 + this.rank*10;
        return tienluong;
    }
    @Override
    public String toString() {
        return "NhanVienTuyenSinh{" + super.toString() +
                "id=" + rank +
                '}';
    }
}
