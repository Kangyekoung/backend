package 배열기본;

public class 배열만들기 {

	public static void main(String[] args) {
		// 1. 배열 만들때 기준 - 값을 모르고 있는 경우
		int[] s = new int[5]; // 자동초기화 {0,0,0,0,0}
		// 2. 배열 만들때 기준 - 값을 이미 알고 있는 경우
		int[] s2 = { 1, 2, 3, 4, 5 };
		// id는 램에 저장자리에 대한 위치를 부여할 때 0부터 부여
		// s와 s2의 개수(사이즈 size, 길이 length)를 프린트
		System.out.println(s.length + " : " + s2.length);

		// s가 가르키는 첫번째 값 프린트
		System.out.println(s[0]);
		// s가 가르키는 세번째 값 프린트
		System.out.println(s[2]);
		// s가 가르키는 마지막 값 프린트
		System.out.println(s[s.length - 1]);

		// s가 가르키고 있는 첫번째 값과 세번째 값을 더해서 프린트(산술연산자)
		System.out.println(s[0] + s[2]);
		// s가 가르키고 있는 첫번째 값과 세번째 값이 동일한지 프린트(비교연산자)
		System.out.println(s[0] == s[2]);
		
		//c언어에서 사용하던 for문 문법
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
		for (int x : s) { //foreach
			//출력용으로만 사용
			System.out.println(x);
		}
	}

}
