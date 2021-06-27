import main.fail.AgeFail;
import main.fail.EmailFail;
import main.fail.GenderFail;
import main.fail.SDTFail;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ManagerNV {
    Scanner input = new Scanner(System.in);
    ArrayList<Nhanvien> list = new ArrayList<>();

    public Nhanvien addNV(String type) {
        String name = getName();
        int age = getAge();
        String gender = getGender();
        int sdt = getSDT();
        String email = getEmail();
        int salary = getTienLuong();
        if (type.equals("tuyen sinh")) {
            System.out.print("Nhập tiền số tuyển sinh:");
            int rank = Integer.parseInt(input.nextLine());
            return new NhanVienTuyenSinh(name, age, gender, sdt, email, salary, rank);
        } else {
            if (type.equals("Full")) {
                System.out.print("nhập nghề nghiệp: ");
                String job = input.nextLine();
                return new NhanVienDaoTaoFullTime(name, age, gender, sdt, email, salary, job);
            } else {
                System.out.print("nhập nghề nghiệp: ");
                String job = input.nextLine();
                System.out.print("nhập nghề giờ làm: ");
                int time = Integer.parseInt(input.nextLine());
                return new NhanVienDaoTaoPartime(name, age, gender, sdt, email, salary, job, time);
            }
        }
    }

    public void add(Nhanvien nhanvien) {
        list.add(nhanvien);
    }

    public void danhsachthem() {
        int check = 0;
        while (check == 0) {
            System.out.println("   1. Thêm nhân viên đào tạo");
            System.out.println("   2. Thêm nhân viên truyển sinh");
            System.out.println("   3. Quay lại");
            int choise2 = Integer.parseInt(input.nextLine());
            switch (choise2) {
                case 1:
                    int checklist = 0;
                    while (checklist == 0) {
                        System.out.println("      1. Thêm nhân viên Fulltime");
                        System.out.println("      2. Thêm nhân viên partime");
                        System.out.println("      3. Quay lại");
                        int choice3 = Integer.parseInt(input.nextLine());
                        switch (choice3) {
                            case 1:
                                Nhanvien nhanvien = addNV("Full");
                                add(nhanvien);
                                break;
                            case 2:
                                Nhanvien nhanvien1 = addNV("part");
                                add(nhanvien1);
                                break;
                            case 3:
                                checklist = -1;
                                break;
                        }
                    }
                    break;
                case 2:
                    Nhanvien nhanvien = addNV("tuyen sinh");
                    add(nhanvien);
                    break;
                case 3:
                    check = -1;
                    break;
            }
        }
    }

    public void show() {
        for (Nhanvien a : list) {
            System.out.println(a);
        }
    }

    public void showByName() {
        System.out.println("nhập tên muốn tìm");
        String name = input.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().equals(name)) {
                System.out.println(list.get(i));
            }
        }
    }

    public void showTienLuongByName() {
        String name = moneyByName();
        for (Nhanvien a : list) {
            if (a instanceof NhanVienDaoTaoFullTime) {
                if (((NhanVienDaoTaoFullTime) a).getName().equals(name)) {
                    System.out.print(a);
                    int money = ((NhanVienDaoTaoFullTime) a).tienLuong();
                    System.out.println("Lương = " + money);
                }
            }
            if (a instanceof NhanVienDaoTaoPartime){
                if (((NhanVienDaoTaoPartime) a).getName().equals(name)) {
                    System.out.print(a);
                    int tien2 = ((NhanVienDaoTaoPartime) a).tienLuong();
                    System.out.println("Lương = " + tien2);
                }
            }
            if (a instanceof NhanVienTuyenSinh){
                if (((NhanVienTuyenSinh) a).getName().equals(name)) {
                    System.out.println(a);
                    int tien3 = ((NhanVienTuyenSinh) a).tienLuong();
                    System.out.println("Lương = " + tien3);
                }
            }
        }
    }
    private String moneyByName(){
        System.out.println("nhập tên muốn tìm");
        String name = input.nextLine();
        int check = -1;
        for (int i = 0; i < list.size(); i++){
            if (list.get(i).getName().equals(name)){
                check = 1;
                break;
            } else {
                check = 0;
            }
        }
        if (check > 0){
            return name;
        } else {
            return "tên không tồn tại";
        }
    }

    public void removeByName() {
        System.out.println("nhập tên muốn cho ra đảo");
        String name = input.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().equals(name)) {
                list.remove(i);
            }
            i--;
        }
    }

    public void sort(){
        SortByName sortByName = new SortByName();
        Collections.sort(list, sortByName);
    }


    private String getName() {
        System.out.print("Nhập tên:");
        return input.nextLine();
    }

    private int getAge() {
        while (true) {
            try {
                System.out.print("Nhập tuổi:");
                int age = Integer.parseInt(input.nextLine());
                if (age >= 18) {
                    return age;
                } else {
                    throw new AgeFail();
                }
            } catch (AgeFail a) {
                System.out.println(a.getMessage());
            } catch (Exception a) {
                System.out.println("nhập lại");
            }
        }
    }

    private int getTienLuong() {
        while (true) {
            try {
                System.out.print("Nhập tiền lương:");
                int tienLuong = Integer.parseInt(input.nextLine());
                return tienLuong;
            } catch (Exception e) {
                System.out.println("sai định dạng... nhập lại");
            }
        }
    }

    private String getEmail() {
        while (true) {
            try {
                System.out.print("Nhập email:");
                String email = input.nextLine();
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).getEmail().equals(email)) {
                        throw new EmailFail();
                    }
                }
                return email;
            } catch (EmailFail e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private int getSDT() {
        while (true) {
            try {
                System.out.print("Nhập sđt:");
                int sdt = Integer.parseInt(input.nextLine());
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).getPhoneNumber() == sdt) {
                        throw new SDTFail();
                    }
                }
                return sdt;
            } catch (SDTFail e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("sai định dạng");

            }
        }
    }

    private String getGender() {
        while (true) {
            try {
                System.out.print("Nhập giới tính:");
                String gender = input.nextLine();
                if (gender.equals("nam") || gender.equals("nu") || gender.equals("Nam") || gender.equals("Nu")) {
                    return gender;
                } else {
                    throw new GenderFail();
                }
            } catch (GenderFail e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
