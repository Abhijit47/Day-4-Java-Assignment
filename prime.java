import java.util.*;
public class prime{
    public static void main(String args[]){
        int lower,upper,num=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the lower limit :: ");
        lower = sc.nextInt();
		System.out.print("Enter the upper limit :: ");
        upper = sc.nextInt();
		for(num = 0; lower <= upper; lower++){
            
            for(num = 2; num <= lower; num++){
                if(lower % num == 0){
                    break;
                }
            }
            if(num == lower){
                System.out.println(lower);
            }
        }
		
	}
}