package by.itacademy.task6.string;

public class Task74St {
    public static void main(String[] args) {
        String str74="25+78+528+53+89+87";
        System.out.println(str74);
        String[] split74 = str74.split("\\+");

        for (int i = 0; i < split74.length; i++) {
            System.out.print(split74[i]);
        }
        System.out.println();
            int[] sum = new int[split74.length];
            for (int j = 0; j < split74.length; j++) {
                sum[j]=Integer.parseInt(split74[j]);
                if (j== split74.length-1)
                {
                    System.out.printf("[%3d]", sum[j]);
                }
                else {
                System.out.printf("[%3d]+", sum[j]);}
            }

            int final74 = 0;
        for (int i = 0; i < sum.length; i++) {
            final74=final74+sum[i];
        }
        System.out.println("="+final74);
        }

    }


