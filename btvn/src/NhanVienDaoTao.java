

public class NhanVienDaoTao extends Nhanvien {
    private String job;

    public NhanVienDaoTao(String job) {
        this.job = job;
    }

    public NhanVienDaoTao(String name, int age, String gender, int phoneNumber, String email, int salary, String job) {
        super(name, age, gender, phoneNumber, email, salary);
        this.job = job;
    }

    @Override
    public String toString() {
        return super.toString() + "job='" + job + '\'';
    }
}
