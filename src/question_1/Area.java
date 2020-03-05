package question_1;

public class Area {
	private float Radius;
	private float Length;
	private float Width;
	private float Base;
	private float Height;
	private float Area;
	
	public Area() {
		Radius = 0;
		Length = 0;
		Width = 0;
		Base = 0;
		Height = 0;
		Area = 0;
	}
	public Area(float Radius, float Length, float Width, float Base, float Height, float Area)
	{
		this.Radius = Radius;
		this.Length = Length;
		this.Width = Width;
		this.Base = Base;
		this.Height = Height;
		this.Area = Area;
	}
	public void GetAreaOfCircle(float Radius) {
		if (Radius <= 0) {
			System.out.println("error");
		}
		else {
			Area = (float) ((22.0/7) * Radius);
			System.out.println("area of circle is " + Area);
		}
	}
	public void GetAreaOfRectangle(float Length, float Width) {
		if(Length <= 0 || Width <= 0) {
			System.out.println("error");
		}
		else {
			Area = Length * Width;
			System.out.println("area of the rectangle is " + Area);
		}	
	}
	public void GetAreaOfTriangle(float Base, float Height) {
		if(Base <= 0 || Height <= 0) {
			System.out.println("error");
		}
		else {
			Area = (float) (Base * Height * 0.5);
			System.out.println("area of the rectangle is " + Area);
		}
	}
}
