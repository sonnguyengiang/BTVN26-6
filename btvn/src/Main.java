import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ManagerNV managerNV = new ManagerNV();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("----Menu----");
            System.out.println("1. Thêm nhân viên");
            System.out.println("2. Nhập tên nhân viên muốn cho ra đảo");
            System.out.println("3. Xem tiền lương theo tên nhân viên");
            System.out.println("4. Tìm nhân viên theo tên");
            System.out.println("5. Hiện thị toàn bộ nhân viên");
            System.out.println("6. Sắp xếp theo tên nhân viên");
            System.out.println("0. Exit");
            System.out.print("Nhập: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                   managerNV.danhsachthem();
                    break;
                case 2:
                    managerNV.removeByName();
                    break;
                case 3:
                    managerNV.showTienLuongByName();
                    break;
                case 4:
                    managerNV.showByName();
                    break;
                case 5:
                    managerNV.show();
                    break;
                case 6:
                    managerNV.sort();
                    break;
                case 0:
                    System.exit(0);
            }
        }
    }
}
