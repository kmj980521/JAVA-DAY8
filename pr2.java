package ex1.io;
import java.util.Scanner;
class point2d
{
	int x;
	int y;
	point2d(){
		x=1;
		y=1;
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
	//생성자가 정의되지 있지 않다.(디폴트 생성자 자동생성)
	int z;
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
		point3d a1=new point3d();
		System.out.println(a1.getX());
		
	}

}
