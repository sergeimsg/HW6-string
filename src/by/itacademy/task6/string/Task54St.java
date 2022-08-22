package by.itacademy.task6.string;

import java.util.Random;

public class Task54St {
    public static void main(String[] args) {
        String alphabet = "A B C D E F G H I K L M N O P Q R S T V X Y Z";
        String alphabetA = alphabet.replace(" ", "");
        String numbers = "0123456789";
        String zero1 = "01";
        int length = alphabetA.length();
        System.out.println(alphabetA + length);
        Random random = new Random();
        String str1 = "";
        String str2 = "";
        String str3 = "";
        String mail = "";
        for (int i = 0; i < 4; i++) {
            str1 = str1 + numbers.charAt(random.nextInt(10));

        }
        System.out.println(str1);

        for (int i = 0; i < 2; i++) {
            str2 = str2 + alphabetA.charAt(random.nextInt(23));

        }
        System.out.println(str2);
        for (int i = 0; i < 4; i++) {
            str3 = str3 + zero1.charAt(random.nextInt(2));

        }
        str3 = "0000";
        if (str3.contains("0000")) {
            String strX = str3.replace("0000", "0101");

            str3 = strX;
        }

        System.out.println(str3);

        String[] domen = {"by", "com", "sw", "io", "pl", "fr"};
        String str5 = domen[random.nextInt(6)];

        mail = str1+str2+str3+"@"+"mail"+"."+str5;

        System.out.println(mail);



    }
}
