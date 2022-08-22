package by.itacademy.task6.string;

public class Task10Str {
    public static void main(String[] args) {
        String str10 = "abfadfdf";
        System.out.println(str10);
        String str10N;
        if (str10.startsWith("abc"))
        {
            str10N=str10.replace("abc","www");
            System.out.println(str10N);

        }
        else {str10N=str10+"zzz";
            System.out.println(str10N);}
    }
}
