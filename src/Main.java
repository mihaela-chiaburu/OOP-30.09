import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //---------lesson1
        /*System.out.println("\n\tVariables:");
        int age = 56;
        System.out.println(age);
        age = 21;
        System.out.println("Varsta " + age + ".");
        float num = 4.5f;
        double num2 = 8.45;

        char ch = 'A';
        String name = "Bob";
        System.out.println(name);

        boolean isHappy = false;*/

        Scanner scan = new Scanner(System.in);
        /*System.out.println("Enter ur name: ");
        String username = scan.nextLine();
        System.out.println("Hello, " + username);*/
        /*int num1 = scan.nextInt();
        byte num2 = scan.nextByte();
        boolean b = scan.nextBoolean();
        float num3 = scan.nextFloat();*/
        /*short num1 = 50, num2 = 10;
        int res = num1 + num2;
        System.out.println("REzultat: " + res);*/

        ///urok-----
        int[] nums = new int[5];
        nums[0] = 45;
        nums[1] = 95;
        nums[2] = 75;
        nums[3] = 25;
        nums[4] = 35;
        System.out.println(nums[0]);

        float[] nums2 = new float[] {5.0f, 6.45f, 89.984f};

        for(int i=0; i < nums2.length; i++)
        {
            System.out.println("Element " + nums2[i]);
        }

        Transport bmw = new Transport();
        bmw.speed = 250.5f;
        bmw.weight = 2500;
        bmw.color = "Black";
        bmw.coordinate = new byte[] {0, 0, 0};

    }
}
