package edu.kh.exception.model.vo;

public class child extends parent {

	
	@Override
	public void method() {
		// 오버라이딩 시 
		// 예외는 같거나 더 좋은 범위
		// * 좁은 범위 == 구체적인 예외
		
		
		System.out.println("오버라이딩된 자식 메소드");
	}
}
