package edu.java.inheritance06;

public class InheritanceMain06 {

	public static void main(String[] args) {
		//Object 클래스의 메서드 override : toString(), hashCode(), equals(), ...
		Point pt1 = new Point();
		System.out.println(pt1.getClass());
		System.out.println(pt1.hashCode());
		System.out.println(pt1.toString());
		
		System.out.println(pt1);
		//System.out.println(Object) 메서드는 파라미터에 전달된 객체에서 toString() 메서드를 호출하고,
		// 그 객체의 toString() 메서드가 리턴해 주는 문자열을 콘솔창에 출력
		//-> 클래스를 작성할 떄 toString() 메서드를 override하면 출력문의 형식을 바꿀 수 있음.
		System.out.println()
		;
		Point pt2 = new Point(0, 0);
		// ==, != 연산자는 인스턴스가 생성도니 주소값(참조값)을 직접비교
		// 생성자를 호출할 때마다 새로운 인스턴스가 Heap에 생성됨
		System.out.println("== 연산자: " + (pt1 == pt2));
		//Object 클래스의 equals() 메서드는 원래 hashCode() 값으로 
		System.out.println("equls 메서드: " + pt1.equals(pt2));
		
		System.out.println("");
		Point pt3 = new Point(1.0, 0.0);
		System.out.println(pt1.equals(pt3));
		System.out.println(pt3.hashCode());
	}

} // end class InheritanceMain06

class Point {
	private double x,y;
	
	public Point() {}

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	@Override //어노테이션(annotation) - 컴파일러에게 정보를 주기 위한 용도 
	public String toString() {
		// TODO Auto-generated method stub
		String result = "Point(x=" + x + ", y=" + y + ")"; 
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		if(obj instanceof Point) { //파라미터 obj가 Point 타입의 인스턴스이면
			Point other = (Point) obj;
			if(this.x == other.x && this.y == other.y) {
				result = true;
			}
		}
		return result;
	}
	@Override
	public int hashCode() {
		// equals() 메서드가 true를 리턴하는 인스턴스들은 hashCode()의 리턴값이 같아야 함
		
		return Double.valueOf(x).hashCode() * 10 + Double.valueOf(y).hashCode();
		
		
	}
	
	
} // end clas Point