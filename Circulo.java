public class Circulo{
	private float radio;
	public Circulo(float radio){
		this.radio=radio;
		
	}
	public void setRadio(float radio){
		radio=radio;
	}
	public float getRadio(){
		return radio;
	}
	public void Area(){
		float area=0;
		float pi=3;
		area=(pi*(radio*radio));
		System.out.println("El area del circulo es:");
		System.out.println(area);
	}
}