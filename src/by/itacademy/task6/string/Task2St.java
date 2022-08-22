package by.itacademy.task6.string;

public class Task2St {
    public static void main(String[] args) {
        String st = "Сдача практических заданий в курсе происходит с помощью системы контроля версий GitHub.";
        int length = st.length();
        char st1 = st.charAt(0);
        char stLast = st.charAt(length-1);
        char stMiddle = st.charAt((length-1)/2);
        System.out.println(st+" length = " + length);
        System.out.println(st1);
        System.out.println(stLast);
        System.out.println(stMiddle);

    }
}
