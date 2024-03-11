/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.individual1;
import java.util.Scanner;

/**
 *
 * @author Z-V
 */

public class Individual1 {

    public static void main(String[] args) {
        System.out.println("Задание 1. Вариант 2. Ремизова М.А.");
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Введите марку производителя телефона");
        String TelMark = scanner.nextLine();
        
        System.out.println("Введите серийный номер телефона");
        int TelNumber = scanner.nextInt();
        
        Telephone phone = new Telephone(TelMark,TelNumber);
        System.out.println("Старые данные:" + phone.toString());
        
        Seller sperson = new Seller();
        sperson.modify(phone);
        
        System.out.println("Новые данные:" + phone.toString());
    }
}
