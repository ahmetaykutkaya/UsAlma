import java.util.Scanner;
public class Main {
    public static int us(int taban,int usdeger){
        if (usdeger==0)
            return 1;
        else if(taban==1)
            return 1;
        else
            return taban*us(taban,usdeger-1);

    }
    public static void main(String[] args) {
        Scanner gir=new Scanner(System.in);
        System.out.print("Taban Degeri giriniz :");
        int taban=gir.nextInt();
        System.out.print("Us Degerini giriniz :");
        int usdeger=gir.nextInt();
        System.out.print("Sonuc : "+us(taban, usdeger));

    }

}