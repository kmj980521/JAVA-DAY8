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
	
}
public class Program {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		point2d a1=new point2d("자바",1,2);
		point3d a2=new point3d("자바스크립트",3,4,5);
		point2d a3;
		a3=a2; //하위 클래스형의 인스턴스 참조 가능.
		System.out.println(a3.getX()+","+a3.getY());
		
		point3d a4;
		a4=a1; //상위 클래스형의 인스턴스는 참조 불가능 !!
		
	}

}
