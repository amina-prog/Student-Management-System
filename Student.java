import java.util.Scanner;

public class Student{
    private String emri;
    private String mbiemri;
    private int viti;
    private int ID;
    private String kursi;
    private int balanca;
    private static int tarifaKursit = 1000;
    private int idrandom = 0000;
    public Student(){
        Scanner input = new Scanner(System.in);
        System.out.print("Emri i studentit: ");
        this.emri = input.nextLine();
        System.out.print("Mbiemri i studentit: ");
        this.mbiemri = input.nextLine();
        System.out.print("Jepni numrin e vitit ne te cilin ndodhet studenti: " );
        this.viti = input.nextInt();
        setID();
    }
    //Konstruktor me emrin dhe vitin e studentit
    //gjenerohet nje ID
    public void setID(){
      idrandom++;
      this.ID = (viti*10000) + idrandom;
    }

    public void regjistrim(){
      do{
        System.out.print("Shkruani kursin qe doni te ndjekni ose shkruaj 'DALJE' per te dale nga veprimi: ");
         Scanner in = new Scanner(System.in);
         String zgjedhje = in.nextLine();
         if(!zgjedhje.equals("DALJE")){
          kursi = kursi+","+zgjedhje;
          balanca += tarifaKursit;
         }else{
          break;
         }
        } while ( 1 != 0);
    }
    //kurset qe ndjek
    //Balanca
    public void shikoBalancen(){
      System.out.println("Balanca juaj ne baze te kurseve eshte "+balanca+" leke te reja.");
    }
    public void bejPagesen(){
      shikoBalancen();
      System.out.print("Jepni sasine e pageses qe doni te beni: ");
      Scanner input = new Scanner(System.in);
      int pagesa = input.nextInt();
      balanca = balanca - pagesa;
      System.out.println("Pagesa juaj prej "+pagesa+"lekesh u krye!");
      shikoBalancen();
    }

    public String toString(){
      return "Emri: "+emri+" "+mbiemri+
             "\nViti: "+viti+
             "\n ID e studentit: "+ID+
              "\nKurset qe ndjek: "+kursi+
              "\n Balanca: "+balanca+" leke";
    }
    //tarifa
    //tregon statusin
}