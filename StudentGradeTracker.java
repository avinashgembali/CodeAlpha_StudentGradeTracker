package CodeAlpha;

import java.util.Scanner;

public class StudentGradeTracker {
    public static void main(String[] args) {
        System.out.println("enter no of student grades to be taken : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("enter the student grades : ");
        int[] arr = new int[n];
        for(int i = 0;i < n;i++){
            arr[i] = sc.nextInt();
        }
        int minGrade = Integer.MAX_VALUE;
        int maxGrade = Integer.MIN_VALUE;
        double avg = 0;
        for(int num : arr){
            avg += num;
            minGrade = Math.min(minGrade,num);
            maxGrade = Math.max(maxGrade,num);
        }
        avg /= n;
        System.out.println("average of student grades : "+avg);
        System.out.println("maximum grade given is : "+maxGrade);
        System.out.println("minimum grade given is : "+minGrade);
    }
}
