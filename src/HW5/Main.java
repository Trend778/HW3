package HW5;
import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            task1(sc);
            task2(sc);
            task3(sc);
            task4(sc);
            task5(sc);
        }
    }

    //TASK 1
    public static void task1(Scanner sc) {
        System.out.print("Press 0 or 1: ");
        byte clientOS = sc.nextByte();
        System.out.println(clientOS == 0 ? "Install the iOS version of the app by following the link." : "Install the Android version of the app by following the link. \n");
    }

    //TASK 2
    public static void task2 (Scanner sc) {
        System.out.print("Press 0 for iOS or 1 for Android: "); //Ввод типа операционной системы
        byte clientOS = sc.nextByte();
        System.out.print("Enter the manufacture year of your device: "); //Ввод года изготовления устройства
        short clientDeviceYear = sc.nextShort();
        Scanner close;
        switch (clientOS) {
            case 0:
                if (clientDeviceYear >= 2015) {
                    System.out.println("Follow this link for installing app to your iOS device \n");
                    break;
                } else {
                    System.out.println("Follow this link for installing light version app to your iOS device \n");
                    break;
                }
            case 1:
                if (clientDeviceYear >= 2015) {
                    System.out.println("Follow this link for installing app to your Android device \n");
                    break;
                } else {
                    System.out.println("Follow this link for installing light version app to your Android device \n");
                    break;
                }
            default:
                System.out.println("Please, chose 0 or 1, Try Again!) \n");
        }
    }

    //TASK 3
    public static void task3 (Scanner sc) {
        System.out.print("Введите год: ");
        int year = sc.nextInt();
        if (year%4==0 && year%100 !=0 || year%400==0) {
            System.out.println(year + " год високосный \n");
        } else {
            System.out.println(year + " год не високосный \n");
        }
    }

    //TASK 4
    public static void task4 (Scanner sc) {
        System.out.print("Введите расстояние от офиса до клиента: ");
        double deliveryDistance = sc.nextInt(), days; //Дистацния и кол-во дней
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + 1);
        } else if (deliveryDistance > 20) {
            days = (int)Math.ceil (deliveryDistance /40 + 1) ;
            System.out.println("Потребуется дней: " + (int) days + "\n");
        }
    }

    //TASK 5
    public static void task5 (Scanner sc) {

    }
}