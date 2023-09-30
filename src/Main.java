public class Main {
    public static void main(String[] args){
        String name = "Ion";
        char ch = 'a';
        int x = 15;
        boolean prezent = false;
        double y = 4.5;
        clasa("Maxim", "Rusu");
        System.out.println(nume(12));
    }
    public static String nume(int a){
        return "Max" + " " + String.valueOf(a);
    }

    public static void clasa(String elev, String profesor){
        System.out.println(elev + " " + profesor);
    }
}