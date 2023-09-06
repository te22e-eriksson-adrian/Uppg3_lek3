import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tangentbord = new Scanner(System.in);
        System.out.print("Ange tal 1: ");
        int tal1 = tangentbord.nextInt();
        tangentbord.nextLine();
        System.out.print("Ange tal 2: ");
        int tal2 = tangentbord.nextInt();
        tangentbord.nextLine();
        int produkt;
        produkt = tal1 * tal2;
        System.out.print(tal1+"*"+tal2+"="+produkt);
        tangentbord.close();
    }
}
