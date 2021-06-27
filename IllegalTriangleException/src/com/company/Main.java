package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            try {
                System.out.println("nhập giá trị 3 cạnh tam giác = ");
                System.out.print("nhập giá cạnh a: ");
                int a = Integer.parseInt(scanner.nextLine());
                System.out.print("nhập giá cạnh b: ");
                int b = Integer.parseInt(scanner.nextLine());
                System.out.print("nhập giá cạnh c: ");
                int c = Integer.parseInt(scanner.nextLine());
                if (a < 0 || b < 0 || c < 0){
                    throw new soam();
                } else if (a + b < c || a + c < b || b + c < a){
                    throw new NhoHon();
                } else {
                    System.out.println("thỏa mãn đk tam giác");
                    break;
                }
            } catch (soam e){
                System.out.println(e.getMessage());
            } catch (NhoHon e){
                System.out.println(e.getMessage());
            } catch (Exception e){
                System.out.println("sai định dạng");
            }
        }
    }
}
