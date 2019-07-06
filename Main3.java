import java.util.Scanner;
public class Main3{
	public static void main (String []args){
		float radio;
		Scanner lee= new Scanner(System.in);
		System.out.println("Ingrese el radio: ");
		radio=lee.nextInt();
		Circulo obj= new Circulo(radio);
		obj.Area();
	}
}