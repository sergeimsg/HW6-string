package by.itacademy.task6.string;

public class Task1St {
    public static void main(String[] args) {
        String str1 ="Hello world! Life is good? Yes.";
        String str2 = ",";
        String sum = str1+str2+str1+str2+str1+str2;
        int nSymb = sum.length();
        System.out.println(sum +";  Symbols quantity = "+nSymb);
        int str3 = str1.charAt(0)+str1.charAt(1);
        System.out.println(str1.charAt(0)+"/"+str1.charAt(1)+"//"+str3);
    }
}
