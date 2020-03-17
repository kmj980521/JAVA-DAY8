
package ex1.io;
import java.util.Scanner;
class point2d
{
	int x;
	int y;
	
	point2d(int x,int y){this.x=x; this.y=y;} //생성자
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
	point3d(int x, int y,int z)
	{
<<<<<<< HEAD
		super(x,y); //상위 클래스 생성자 호출 
=======
		super(x,y); //상위 클래스의 생성자 호출
>>>>>>> 4a1b48b2ae93539cf60eb2c5b9e13eed7866143c
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
		point2d a1=new point2d(10,20);
		point3d a2=new point3d(10,20,30);
		
		System.out.printf("a1=(%d,%d)\n",a1.getX(),a1.getY());
		System.out.println();
		System.out.printf("a2=(%d,%d,%d)",a2.getX(),a2.getY(),a2.getZ());
		
	}

}
