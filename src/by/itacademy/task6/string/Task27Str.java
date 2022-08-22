package by.itacademy.task6.string;

public class Task27Str {
    public static void main(String[] args) {

        String[] char10 = {"Hello","world,","summer", "is", "good", "!","!","!"};
        for (int i = 0; i < char10.length; i++) {
            System.out.printf("[%s]", char10[i]);
        }
        System.out.println();
        for (int i = 1; i < char10.length; i++) {
                String current = char10[i];
                int j =i-1;
                while (j>=0 && current.length() < char10[j].length()) {
                    char10[j+1]=char10[j];
                    j--;
                }
                char10[j+1]=current;
        }
        for (int i = 0; i < char10.length; i++) {

                System.out.println(char10[i]);

        }
    }
}
