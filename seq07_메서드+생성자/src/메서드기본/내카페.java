package 메서드기본;

public class 내카페 {

	public static void main(String[] args) {
		//계산기의 add()기능을 사용하고 싶으면
		//램에 계산기 원본을 이용해서 
		//대상을 가져다 놓고 난 다음
		//필요한 메서드를 사용한다.
		//==> 객체생성 먼저 한 후,
		//    필요한 메소드를 선택해서 사용하면
		//cal변수안에 계산기 생성된 것의 위치(주소)가 들어있음.
		//==> 생성된 주소가 있어야 메서도 사용이 가능!
		계산기 cal = new 계산기();
		cal.add(); //void
		
		//할인 기간이면 계산된 금액에서
		//1000을 빼주고 싶다.
		
		int total = cal.add2(); //void x
		//->int타입의 데이터를 return(반환)
		System.out.println(total - 1000);
		
		int total2 = cal.add3(3000, 5); //sum
		System.out.println(total2 - 1000);
		
		int total3 = cal.add4(10000);
		System.out.println(total3);
		

		
	}

}
