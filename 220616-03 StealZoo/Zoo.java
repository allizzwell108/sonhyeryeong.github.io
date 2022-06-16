import java.util.Scanner;

public class Zoo {
	// 동물원관리
	public static void zooManagement(Animal[] animal, Staff[] staff, Manage[] manage) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("================동물원 관리================");
			System.out.println(" 1.동물 관리 | 2.직원 관리 | 3.입력 관리 | 0.종료");
			System.out.println("========================================");
			int input = scan.nextInt();
			switch (input) {
			case 1 : {
				animalManage(animal,manage);
				continue;
			}
			case 2 : {
				staffManage(staff,manage);
				continue;
			}
			case 3 : {
				inputManage(animal,staff,manage);
				continue;
			}
			case 0 : {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			default : {
				System.out.println("잘못된 입력입니다.");
				continue;
			}
			}
			System.out.println("프로그램 종료.");
			break;
		}
	}

///////////////////////////////////////////////////////////////동물관리	
	public static void animalManage(Animal[] animal, Manage[] manage) {
		
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("==========1.동물 관리===========");
			System.out.println(" 1.초식 동물 | 2.육식 동물 | 0.이전");
			System.out.println("=============================");
			int input = scan.nextInt();
			switch (input) {
			case 1 : {
				System.out.println("==========1.초식 동물===========");
				for(int i = 0; i < animal.length; i++) {	
					if (animal[i] instanceof IHerbivores) {
						System.out.println(animal[i].toString());
					}
				}
				continue;
			}
			case 2 : {
				System.out.println("==========2.육식 동물===========");
				for(int i = 0; i < animal.length; i++) {	
					if (animal[i] instanceof ICarnivores) {
						System.out.println(animal[i].toString());
					}
				}
				continue;
			}
			case 0 : {
				System.out.println("이전으로 돌아갑니다.");
				break;
			}
			default : {
				System.out.println("잘못된 입력입니다.");
				continue;
			}
			}
			break;
		}
	}

///////////////////////////////////////////////////////////////직원관리
	public static void staffManage(Staff[] staff, Manage[] manage) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("==========2.직원 관리==========");
			System.out.println(" 1.직원 확인 | 2.담당 동물 | 0.이전  ");
			System.out.println("=============================");
			int input = scan.nextInt();
			switch (input) {
			case 1 : {
				jobinfo(staff);
				continue;
			}
			case 2 : {
				manageAnimal(staff, manage);
				continue;
			}
			case 0 : {
				System.out.println("이전으로 돌아갑니다.");
				break;
			}
			default : {
				System.out.println("잘못된 입력입니다.");
				continue;
			}
			}
			break;
		}
	}
	public static void jobinfo(Staff[] staff) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("=======1.직원 확인========");
			System.out.println(" 1.조련사 | 2.경영 | 0.이전  ");
			System.out.println("========================");
			int input = scan.nextInt();
			switch (input) {
			case 1 : {
				for(int i = 0; i < staff.length; i++) {	
					if (staff[i].getJob().equals("조련사")) {
						System.out.println(staff[i].toString());
					}
				}
				continue;
			}
			case 2 : {
				for(int i = 0; i < staff.length; i++) {	
					if (staff[i].getJob().equals("경영")) {
						System.out.println(staff[i].toString());
					}
				}
				continue;
			}
			case 0 : {
				System.out.println("이전으로 돌아갑니다.");
				break;
			}
			default : {
				System.out.println("잘못된 입력입니다.");
				continue;
			}
			}
			break;
		}
	}	
	public static void manageAnimal(Staff[] staff, Manage[] manage) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("=====================2.담당 동물=====================");
			System.out.println(" 1.코끼리 | 2.토끼  | 3.사자  | 4.늑대  | 5.담당 없음 | 0.이전  ");
			System.out.println("===================================================");
			int input = scan.nextInt();
			switch (input) {
			case 1 : {
				for(int i = 0; i < manage.length; i++) {	
					if (manage[i].getAnimal().getSpecies().equals("코끼리")) {
						System.out.println(manage[i].toString());
						if (manage[i].getTrainer() == null)
							System.out.println("담당조련사가 없습니다. 배정해주세요!!!");
					}
				}
				continue;
			}
			case 2 : {
				for(int i = 0; i < manage.length; i++) {	
					if (manage[i].getAnimal().getSpecies().equals("토끼")) {
						System.out.println(manage[i].toString());
						if (manage[i].getTrainer() == null)
							System.out.println("담당조련사가 없습니다. 배정해주세요!!!");
					}
				}
				continue;
			}
			case 3 : {
				for(int i = 0; i < manage.length; i++) {	
					if (manage[i].getAnimal().getSpecies().equals("사자")) {
						System.out.println(manage[i].toString());
						if (manage[i].getTrainer() == null)
							System.out.println("담당조련사가 없습니다. 배정해주세요!!!");
					}
				}
				continue;
			}
			case 4 : {
				for(int i = 0; i < manage.length; i++) {	
					if (manage[i].getAnimal().getSpecies().equals("늑대")) {
						System.out.println(manage[i].toString());
						if (manage[i].getTrainer() == null)
							System.out.println("담당조련사가 없습니다. 배정해주세요!!!");
					}
				}
				continue;
			}
			case 5 : {
				for(int i = 0; i < manage.length; i++) {	
					if (manage[i].getTrainer() == null) {
						System.out.println(manage[i].getAnimal());
						System.out.println("담당조련사가 없습니다. 배정해주세요!!!");
					}
				}
				continue;
			}
			case 0 : {
				System.out.println("이전으로 돌아갑니다.");
				break;
			}
			default : {
				System.out.println("잘못된 입력입니다.");
				continue;
			}
			}
			break;
		}
	}	
	
///////////////////////////////////////////////////////////////입력관리
	public static void inputManage(Animal[] animal, Staff[] staff, Manage[] manage) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("================3.입력 관리================");
			System.out.println(" 1.동물 입력 | 2.직원 입력 | 3.담당 입력 | 0.이전  ");
			System.out.println("========================================");
			int input = scan.nextInt();
			switch (input) {
			case 1 : {
				animalinput(animal);
				continue;
			}
			case 2 : {
				staffinput(staff);
				continue;
			}
			case 3 : {
				manageinput(animal, staff, manage);
				continue;
			}
			case 0 : {
				System.out.println("이전으로 돌아갑니다.");
				break;
			}
			default : {
				System.out.println("잘못된 입력입니다.");
				continue;
			}
			}
			break;
		}
	}
	// 동물 입력
	public static void animalinput(Animal[] animal) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("================1.동물 입력================");
			
		}
	}
	// 직원 입력
	public static void staffinput(Staff[] staff) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("================2.직원 입력================");
			
		}
	}
	// 담당 입력
	public static void manageinput(Animal[] animal, Staff[] staff, Manage[] manage) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("================3.담당 입력================");
			
		}
	}
}
