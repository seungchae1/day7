package test.final1;

public class Child extends Parent{
	//fianl �ʵ�� ���߿� ���� �����ϴ� ���� �����Ѵ�.
	public final int time =3;
	
	@Override
	public void rest() {
//		time = 5;
		System.out.println(time + "�ð� �޽��Ѵ�.");
	}
	
}
