package javaexp.a00_exp;

public class A10_1111 {

	public static void main(String[] args) {
		int nums[] = new int[3];
		// 1번째 방법
		// 최대값/최소값 지정하고, 그 외 중간값을 처리하는 방법
		int max=1;
		int min =100;
		for(int i=0;i<3;i++) {
			nums[i]=(int)(Math.random()*100+1);
			if(max<nums[i]) {
				max=nums[i];
			}
			if(min>nums[i]) {
				min=nums[i];
			}
			System.out.println(nums[i]+",");
		}
		var mid=0; // 중간값 : 한계 - 최대/최소값이 중간값이 동일할 때, 중간값을 0으로 처리..
		for(int i=0;i<3;i++) {
			//최소값보다 크고, 최대값 보다 작을 때
			if(min<nums[i]&&max>nums[i]) {
				mid = nums[i];
			}
		}
		
		System.out.println();
		System.out.println("최대:" + max);
		System.out.println("최소:" + min);
		System.out.println("중간:" + mid);
		
		// 문제 2번
		// 특정 배열에 할당
		// [25,3,27]
		// 반복문
		//0 1단계 X
		//1 2단계 3, 25를 비교해서 자리를 tmp를 통해 바꾸어줌.[3,25,27]
		//2 3단계 (3,27),(25,27) 비교해서 크기에 따라 바꾸어줌.[3,25,27]
		for(int i=0;i<3;i++) {
			for(int j=0;j<i;j++) {
				if(nums[i]<nums[j]) {
					var tmp = nums[i];
					nums[i] = nums[j];
					nums[j] = tmp;
				}
			}
		}
		for(int i=0;i<3;i++) {
			System.out.println(nums[i]+",");
		}
	}

}
