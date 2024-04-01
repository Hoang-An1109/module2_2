// Bài tập Hiển thị các loại hình

import java.util.*;

public class BtHienThiCacLoaiHinh {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int choice=0;
        while (choice!=4){
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice){
                case 1:{//Hình chữ nhật
                    int a=3,b=7;
                    for(int i=0;i<a;i++){
                        for(int j=0;j<b;j++){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    for(int c=0;c<3;c++){
                        System.out.println();
                    }
                    break;
                }
                case 2:{//Hình tam giác vuông
                    int choice2=0;
                    while (choice2!=5){
                        System.out.println("The corner is square at 4 different angles");
                        System.out.println("1. Top-left");
                        System.out.println("2. Top-right");
                        System.out.println("3. Botton-left");
                        System.out.println("4. Botton-right");
                        System.out.println("5. Exit");
                        System.out.print("Enter your choice: ");
                        choice2 = scanner.nextInt();

                        switch (choice2){
                            case 1:{//Hình tam giác vuông trên trái
                                int x = 5;
                                for (int i = 0; i < x; i++) {
                                    for (int j = 0; j < x - i; j++) {
                                        System.out.print("*");
                                    }
                                    System.out.println();
                                }
                                for(int b=0;b<3;b++){
                                    System.out.println();
                                }
                                break;
                            }
                            case 2:{//Hình tam giác vuông trên phải
                                int x=5;
                                for(int i=0;i<x;i++){
                                    for(int j=0;j<=i;j++){
                                        System.out.print(" ");
                                    }
                                    for(int k=0;k<x-i;k++){
                                        System.out.print("*");
                                    }
                                    System.out.println();
                                }
                                for(int b=0;b<3;b++){
                                    System.out.println();
                                }
                                break;
                            }
                            case 3:{//Hinh tam giác vuông dưới trái
                                int x=5;
                                for(int i=0;i<x;i++){
                                    for(int j=0;j<=i;j++){
                                        System.out.print("*");
                                    }
                                    System.out.println();
                                }
                                for(int b=0;b<3;b++){
                                    System.out.println();
                                }
                                break;
                            }
                            case 4:{//Hình tam giác vuông dưới phải
                                int x=5;
                                for(int i=0;i<x;i++){
                                    for(int j=0;j<=x-i;j++){
                                        System.out.print(" ");
                                    }
                                    for(int k=0;k<=i;k++){
                                        System.out.print("*");
                                    }
                                    System.out.println();
                                }
                                for(int b=0;b<3;b++){
                                    System.out.println();
                                }
                                break;
                            }
                            case 5:{
                                System.exit(0);
                            }
                            default:{
                                System.out.println("No choice!");
                                for(int b=0;b<3;b++){
                                    System.out.println();
                                }
                            }
                        }
                    }

                    break;
                }
                case 3:{//Hình tam giác cân
                    int n = 5;
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < n - (i+1); j++) {
                            System.out.print(" ");
                        }
                        for (int k = 0; k < 2 * i - 1; k++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    for(int b=0;b<3;b++){
                        System.out.println();
                    }
                    break;
                }
                case 4:{
                    System.exit(0);
                }
                default:{
                    System.out.println("No choice!");
                    for(int b=0;b<3;b++){
                        System.out.println();
                    }
                }
            }
        }
    }
}
