package by.itacademy.task6.string;

public class Task8St {
    public static void main(String[] args) {
        String str8 = "sdfasdf x dsfsd fdsfax v";
        int leangthStr8 = str8.length();
        char str8N = 0;
        String strX;
        int iX=-1;
        int iW=-1;
        System.out.println(leangthStr8);
        for (int i = 0; i < leangthStr8; i++) {
            if (str8.charAt(i) =='x') {
                iX=i+1;
            System.out.print("The first symbol is X number  "+ iX);
                System.out.println();

            }
            if (str8.charAt(i) =='w') {
                iW=i;
                System.out.print("The first symbol is W number  "+iW);
                System.out.println();

            }




        }
        if (iX==-1)
        {
            System.out.println("No any X in text");
        }
        if (iW==-1)
        {
            System.out.println("No any W in text");
        }
    }
}
