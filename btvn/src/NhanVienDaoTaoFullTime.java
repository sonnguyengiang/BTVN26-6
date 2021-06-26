public class NhanVienDaoTaoFullTime extends NhanVienDaoTao{
    public NhanVienDaoTaoFullTime(String job) {
        super(job);
    }

    public NhanVienDaoTaoFullTime(String name, int age, String gender, int phoneNumber, String email, int salary, String job) {
        super(name, age, gender, phoneNumber, email, salary, job);
    }
    public int tienLuong(){
        int tienluong;
        tienluong = this.getSalary() * 8;
        return tienluong;
    }

    @Override
    public String toString() {
        return "NVfulltime{" + super.toString() + "}";
    }
}
