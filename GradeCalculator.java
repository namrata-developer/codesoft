import java.util.Scanner;
public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //get number of subject
        System.out.println("Enter first number of subject:");
        int nsubject  = sc.nextInt();
         //array to score marks
        double[] marks = new double[nsubject];
        double totalmarks=0;
        //input marks for each subject
        for (int i = 0; i < nsubject; i++) {
            System.out.println("Enter marks obtained in subject"+(i+1) + "(out of 100 ):");
            marks[i] = sc.nextDouble();
            totalmarks += marks[i];
            sc.close();

        }
        // Calculate Average percentage
        double Averagepercentage = totalmarks /nsubject;
        char grade;
        if(Averagepercentage >= 90)
          {  grade = 'A';
        }
        if(Averagepercentage >= 80)
          {  grade = 'B';}
        if(Averagepercentage >= 70)
          {  grade = 'C';}
        if(Averagepercentage >= 60)
          {  grade = 'D';}
        else{
            grade ='F';
        }      
          //Display results 
        System.out.println("\n Totalmarks:"+ totalmarks);
        System.out.println("Average Percentage" + Averagepercentage);
        System.out.println("Grade:" + grade);
       
    }
}



    
