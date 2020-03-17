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
		super(x,y);
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
