package test.final1;

public class Child extends Parent{
	//fianl 필드는 나중에 값을 변경하는 것을 금지한다.
	public final int time =3;
	
	@Override
	public void rest() {
//		time = 5;
		System.out.println(time + "시간 휴식한다.");
	}
	
}
