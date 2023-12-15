import java.util.Scanner;
public class StudentDatabaseApp {
    public static void main(String[] args){
        //Kerkohet numri i studenteve qe do futen
        System.out.print("Jepni numrin e studenteve qe doni te fusni: ");
        Scanner input = new Scanner(System.in);
        int nrstudent = input.nextInt();
        Student [] studentat = new Student[nrstudent];
        for(int i=0; i<nrstudent;i++){
            studentat[i] = new Student();
            studentat[i].regjistrim();
            studentat[i].bejPagesen();
        }
        for(int j=0; j<nrstudent; j++){
              System.out.print(studentat[j].toString());
        }
            //krijoj nje numer n studentesh
    }
}
