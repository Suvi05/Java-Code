package JavaTraining.Basics;

import java.util.Scanner;

public class AverageCalculation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Marks of Subject 1 : ");
        int n1= sc.nextInt();
        System.out.print("Enter the Marks of Subject 2 : ");
        int n2= sc.nextInt();
        System.out.print("Enter the Marks of Subject 3 : ");
        int n3= sc.nextInt();

        AverageCalculation S1 = new AverageCalculation();
        AverageCalculation S2 = new AverageCalculation();

        int avg =S1.calculateAvg(n1,n2,n3);
        System.out.println("Average marks of student is : "+avg);

        char grade= S1.calculateGrade(avg);
        System.out.println("Grade of Student is : " +grade);
        int avg1 =S2.calculateAvg(n1,n2,n3);
        System.out.println("Average marks of student is : "+avg1);

        char grade1= S2.calculateGrade(avg);
        System.out.println("Grade of Student is : " +grade1);

        int x=100;
        System.out.println(System.identityHashCode(x));
        Integer y= Integer.valueOf(x);
        int z=y.hashCode();
    }
    public  int calculateAvg(int n1,int n2,int n3){
        return (n1+n2+n3)/3;
    }
    public  char calculateGrade(int avg){
        if(avg>90) return 'A';
        else if(avg >80) return 'B';
        else return 'C';
    }
}
