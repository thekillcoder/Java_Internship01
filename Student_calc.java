import java.util.Scanner;
public class main
{
    public static void main(String[] args)
    {
        Scanner Sc =new Scanner(System.in);
        System.out.println("Student Grade Calculator");
        System.out.println("Enter Number of Subjects");
        int nS=Sc.nextInt();
        int total=0;
        for(int i=0;i<nS;i++)
        {
            System.out.println("Enter Marks Obtained in "+(i+1)+":");
            int marks=Sc.nextInt();
            total+=marks;   
        }
        double ave_per=(double)total/nS;
     char grade;
     if(ave_per>=100){
        grade='A';
     }   
     else if(ave_per>=80){
        grade='A';
     }
     else if(ave_per>=70){
        grade='B';
     }
     else if(ave_per>=60){
        grade='C';
     }
     else if(ave_per>=50){
        grade='D';
     }
     else if(ave_per>=40){
        grade='E';
     }
     else{
        grade='F';
     }
     System.out.println("Total Marks Scored is "+total);
     System.out.println("Average Persentage  Gained is  "+ave_per+"%");
     System.out.println("Grade:"+grade);
   }
}
