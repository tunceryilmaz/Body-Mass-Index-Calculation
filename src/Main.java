import java.util.Scanner;
        public class Main {
            public static void main(String[] args) {
                Scanner input =new Scanner(System.in);
                float boy,kilo,bodymassindex;

                System.out.print("Boyunuzu giriniz :");
                boy=input.nextFloat();
                System.out.print("Kilonuzu giriniz :");
                kilo=input.nextFloat();
                bodymassindex =kilo/(boy*boy);
                System.out.println("Body Mass Index : "+bodymassindex);

            }
}