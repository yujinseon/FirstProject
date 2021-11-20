package javaexp.a02_middle;

public class A10_Methods {
	
	// static은 객체 생성없이 사용할 수 있는 공유 메모리 영역의 속성을 사용할 때,
			// 선언되는 키워드이다 - 클래스/객체에서 다시 언급
			// 1. 메서드의 구성요소
			//	1) 리턴 유형
			//	2) 매개변수
			//	3) 기능 프로세스 처리
			//  4) 리턴값
		static String getName(String name) {
			name = name + "님^^";
			return name;
		}
		// 1. 리턴유형은 해당 메서드를 통해서 리턴하는 값의 유형을 선언하는 것으로
		// 	  리턴값에 할당할 수 있는 유형으로 선언되어야 한다
		/*
		 ex) 사람의 말을 하는 경우 : 객체가 저장된 음성 데이터를 조합해서 말을 한다.
		 		결과물로 말이라는 것을 리턴 리턴한다.
		 	 사람이 뛰어 간다 : 객체가 특정 상황에 판단하여 행동 양식으로 뛰어가는 것을 처리함.
		 	 메서드는 저장/프로세스처리/결과정보를 나오게 할 수 있는데, 
		 	 이 결과 정보를 나오게 하는 것을 리턴 처리라고 한다.
		 	 형식으로는 어떤 데이터 유형이 리턴될지를 선언하고
		 	 
		 	 리턴할데이터유형 메서드(){
		 	 	return 실제 리턴할 데이터;
		 	 }
		 	 
		 */
		static int getNum() {
			return 15;
		}
		static double getWeight() {
			return 30.5;
		}
		static int getWorkerNum() {
			return 17;
		}
		static String getWorkerName(String name) {
			name = name + "사원";
			return name;
		}
		static double getWorkerWeight() {
			return 60;
		}
		static int[] getArray() {
			return new int[] {2000,3000,4000};
		}
		
	public static void main(String[] args) {
		String name01 = getName("신길동");
		String name02 = getWorkerName("장훈주");
		System.out.println("메서드 처리 후 결과 값:" + name01);
		System.out.println("메서드 처리 후 결과 값:" + getName("심혜영"));
		System.out.println(getNum()+30);
		System.out.println(getWeight());
		System.out.println("사원번호: " + getWorkerNum());
		System.out.println("사원이름: "+ name02);
		System.out.println("사원이름: " + getWorkerName("김갑룡"));
		System.out.println("사원 몸무게: " + getWorkerWeight()+"kg");
		
		int[] arry = getArray();
		System.out.println(arry[0]);
		System.out.println(arry[1]);
		System.out.println(arry[2]);
	}

}
