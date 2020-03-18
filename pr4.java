package ex1.io;
import java.util.Scanner;
class point2d
{
	String name;
	int x;
	int y;
	point2d(){
		x=1;
		y=1;
	}
	point2d(String name){
		this.name=name;
		x=1;
		y=1;
	}
	point2d(String name,int x,int y){
		this.name=name;
		this.x=x;
		this.y=y;
	}
	void setX(int x)
	{
		this.x=x;
	}
	void setY(int y)
	{
		this.y=y;
	}
	int getX() {
		return x;
	}
	int getY() {
		return y;
	}
	void print() {
		System.out.println("부모클래스 출력");
	}
}

class point3d extends point2d
{
	int z;
	point3d(String name,int x,int y,int z)
	{
		super(name,x,y); //상위 클래스 생성자 호출
		this.z=z;
	}
	int getZ()
	{
		return z;
	}
	void setz(int z)
	{
		this.z=z;
	}
	@Override void print()
	{
		System.out.println("자식클래스 출력");
	}
	void print2()
	{
		System.out.println("iunstanceof 연산자 사용");
	}
	
}
public class Program {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		point2d [] a= {
				new point2d("c언어",10,100),
				new point3d("자바",20,200,2000),
				new point2d("파이썬",30,300),
		};
		//point2d a1=new point2d("자바",1,2);
		//point3d a2=new point3d("자바스크립트",3,4,5);
		
		//a1.print(); //부모클래스 print
		//a2.print(); //자식클래스 print 
		
		//point2d ex=a2; //하위 클래스형의 인스턴스 참조
		//ex.print(); //다형성 사용 예제 , 자식클래스의 print()실행
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println("a["+i+"]");
			if(a[i] instanceof point3d)
				((point3d)a[i]).print2();
			else 
				a[i].print();
		}
		
		
	}

}
