import java.util.Scanner;

// 1.사용자에게 5번의 정수를 입력받아
//최근 입력한 순(역순)으로 출력하기

//2.사용자가 0 이하의 정수를 입력할 때까지 반복하여 입력
//최근 5개를 출력
//10 20 30 40 50 60....100 -1   -> 100 90 80 70 60


public class Main5 {
	
	// 1.사용자에게 5번의 정수를 입력받아
	//최근 입력한 순(역순)으로 출력하기
	static void printUserInPut() {
		Scanner scan =new Scanner(System.in);
		int[] fiveInt = new int [5];
		System.out.println("정수 5개를 순서대로 입력하세요: ");
		for(int i =0; i<fiveInt.length;i++) {
			fiveInt[i]=scan.nextInt();
		}
		System.out.print("입력하신 숫자입니다. ");
		for(int i =fiveInt.length; i>0;i--) {
			System.out.printf("%d\t",fiveInt[i]);
		}
	}
	
	static void printLastFive() {
	
		
		
	}
		


	public static void main(String[] args) {
		
		//printUserInPut();
		
		
		//2.사용자가 0 이하의 정수를 입력할 때까지 반복하여 입력
		//최근 5개를 출력
		//10 20 30 40 50 60....100 -1   -> 100 90 80 70 60
		Scanner scan =new Scanner(System.in);
		
		
		int maximum=100;//사용자가 얼마나 입력할 지 모르니까 변수를 만든다. 
		//변수가 0이하가 입력되기 전까지 계속 되어야 함. 0,1,2,3,4,5,,,,,,,
	
		
		
		
		int[] userNumber = new int[maximum];//얼마나 입력할 지 범위를 지정하는 것. 
		//시작은 있으나 끝은 조건을 충족하여야 한다. 
		
		//입력이 반복되어야 함. 
		//배열의 길이만큼 반복되어야 함.
		//0이하가 입력되면 멈추도록 함. 
		int count=0;
		for(int i =0; i<userNumber.length; i++) {
			System.out.println("정수를 입력하세요: ");
			userNumber[i] =scan.nextInt();// 사용자가 입력한 수.
			if(userNumber[i]>0) {
				count++;
				continue;
			
			}else {
				break;
			}
		}
		maximum=count;
		//최근 입력한 5개가 출력되어야 함.
		//
		System.out.print("입력하신 정수입니다:\t");
		for(int i =userNumber.length; i>userNumber.length-5; i--) {
			System.out.println(userNumber[i]);
		}
		
		
		
	}

}
