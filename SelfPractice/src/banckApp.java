import java.util.*;
public class banckApp {
    public static void main(String[] args) {
        int deposit=1000;
        int having=0;
        try {
            while (having <= 1000) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter withDraw amount wd : ");
                int wd = sc.nextInt();
                having = having + wd;
            }
        if (having-1000>0){
            int bachat=having-1000;
            System.out.println("Not Sufficient is Present. " + bachat + " is exceeding");
        }
        }catch(Exception e){
            System.out.println("The first Catch Block");
        }
    }
}
