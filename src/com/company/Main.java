package com.company;
import java.util.Scanner;
public class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean valid = false;
        String password;

        System.out.print("Введите пароль:");
        password = sc.nextLine();
        if (password.length()<8){
            valid = false;
            System.out.println("Пароль должен содержать не менее 8 символов");}
        for (int i = 0; i < password.length(); i++){
            char c = password.charAt(i);
            if (!(('a' <= c && c <= 'z')||('A' <= c && c <= 'Z')||('0' <= c && c <= '9'))) {
                valid = true;}
            else{
                System.out.println("Пароль ненадёжный");
                valid = false;
                break;}
        }
        if (valid){
            System.out.println("Пароль надёжный");}
    }
}



