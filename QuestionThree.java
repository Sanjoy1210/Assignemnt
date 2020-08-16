import java.util.Scanner;
public class QuestionThree {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[n];
        
		for(int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		
		int max = 0;
		int secondMax = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		for(int k = 0; k < n; k++){
            if(arr[k]> secondMax && max>arr[k]){
                secondMax = arr[k];
            }
        }

        System.out.println("Second large number: " + secondMax);
	}
}