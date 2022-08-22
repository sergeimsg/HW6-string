package by.itacademy.task6.string;

public class Task3St {
    public static void main(String[] args) {
        String st3 = "Сдача системы контроля версий GitHub.";
        int length = st3.length();
        if (length<5) {
            System.out.println(st3.substring(0,3)+" "+st3.substring((length-4),(length-1)));
        }
        else {
            for (int i = 1; i <= length; i++) {

                System.out.println(st3.substring(0, 1)+i);
            }
        }

        
    }
}
