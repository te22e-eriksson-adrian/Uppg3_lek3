import java.util.Scanner;

import java.lang.Math;

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
        System.out.println("                    ");
        System.out.print("Ange decimaltal 1: ");
        double decimaltal1 = tangentbord.nextDouble();
        System.out.print("Ange decimaltal 2: ");
        double decimaltal2 = tangentbord.nextDouble();
        double kvot;
        kvot = decimaltal1 / decimaltal2;
        System.out.print(decimaltal1+"/"+decimaltal2+"="+kvot);
        System.out.println("                  ");
        System.out.print("Ange tal 3: ");
        int tal3 = tangentbord.nextInt();
        tangentbord.nextLine();
        System.out.print("Ange tal 4: ");
        int tal4 = tangentbord.nextInt();
        tangentbord.nextLine();
        kvot = tal3 % tal4;
        System.out.println("Rest av talen "+tal3+"/"+tal4+" = "+kvot);
        System.out.println("                   ");
        System.out.print("Ange koefficient: ");
        double a = tangentbord.nextDouble();
        System.out.print("Ange exponent: ");
        double b = tangentbord.nextDouble();
        System.out.println("Talet är = "+Math.pow(a, b)); 
        System.out.print("Ange tal 5: ");
        double tal5 = tangentbord.nextDouble();
        System.out.print("Ange tal 6: ");
        double tal6 = tangentbord.nextDouble();
        System.out.println("Det största talet är: "+Math.max(tal5, tal6));
        tangentbord.close();
    }
}
