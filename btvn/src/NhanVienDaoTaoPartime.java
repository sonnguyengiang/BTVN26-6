public class NhanVienDaoTaoPartime extends NhanVienDaoTao{
    private int time;

    public NhanVienDaoTaoPartime(String job, int time) {
        super(job);
        this.time = time;
    }

    public NhanVienDaoTaoPartime(String name, int age, String gender, int phoneNumber, String email, int salary, String job, int time) {
        super(name, age, gender, phoneNumber, email, salary, job);
        this.time = time;
    }

    public int tienLuong(){
        int tienluong;
        tienluong = this.getSalary() * this.time;
        return tienluong;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "NVPartime{" + super.toString() +
                "time=" + time +
                '}';
    }
}
