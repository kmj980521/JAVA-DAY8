package ex1.io;
class a
{
	int x;
	int y;
	
	int getX()
	{
		return x;
	}
	int getY()
	{
		return y;
	}
	final void print()
	{
		System.out.println(x+","+y);
	}
	public void print1()
	{
		System.out.println("print1");
	}
	protected void print2() //한정공개
	{
		System.out.println("print2");
	}
	private void print3() //b로 상속x
	{
		System.out.println("print3");
	}
}
class b extends a // a를 확장시켜서 만든 클래스 b 
{
	int z;
	@Override void print() //a클래스의 final선언으로 상속 불가능
	{
		System.out.println(x+","+y+","+z);
	}
}
public class LearnJava {
	public static void main(String[] args) {
	}
	
}

