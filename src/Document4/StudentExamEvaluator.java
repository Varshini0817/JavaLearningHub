package Document4;

import java.util.Scanner;

public class StudentExamEvaluator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float sum=0;
        for(int i =0; i<5; i++){
            float m = sc.nextFloat();
            if(m<0) continue;
            sum+=m;
        }
        System.out.println(sum);
    }
}
