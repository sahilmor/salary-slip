import java.util.*;

public class AssignmentTwo {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Name : ");
        String name = sc.nextLine();
        System.out.print("Enter Your Experience : ");
        int exp = sc.nextInt();
        System.out.print("Enter Your Salary : ");
        double sal = sc.nextDouble();
        System.out.println(" ");

        System.out.println("=============================================");
        System.out.println("                PAY SLIP");
        System.out.println("=============================================");
        System.out.println(" ");
        System.out.println("Name : "+name);
        System.out.println("Experience : "+exp+" years");
        System.out.println("Basic Salary : "+sal);
        System.out.println("____________________________________________ ");
        System.out.println(" ");
        
        double DA = 0.05*sal;
        double TA = 0.065*sal;
        double CCA = 0.08*sal;
        double HRA = 0.1*sal;
        double PF = 0.125*sal;
        double TS = DA+TA+CCA+HRA+PF+sal;
        double NS = TS-PF;
        double bonus = 0;

        if(exp>25){
            bonus = 0.25*sal;
        }
        else if(exp>20){
            bonus = 0.2*sal;
        }
        else if(exp>15){
            bonus = 0.15*sal;
        }
        else{
            bonus = 0.1*sal;
        }

        System.out.println("DA : "+DA);
        System.out.println("TA : "+TA);
        System.out.println("CCA : "+CCA);
        System.out.println("HRA : "+HRA);
        System.out.println("PF : "+PF);
        System.out.println("Bonus : "+bonus);
        System.out.println("____________________________________________ ");
        System.out.println("");
        System.out.println("Total Salary : "+TS);
        System.out.println("NET Salary : "+NS);
        System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");

        sc.close();
    }
    
}
