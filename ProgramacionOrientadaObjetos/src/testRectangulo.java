
public class testRectangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int perimetro, area;
		
		Rectangulo perimetroRectangulo = new Rectangulo();
		perimetro = perimetroRectangulo.CalcularPerimetro(8, 10);
		System.out.println("El perímetro del rectangulo es: "+perimetro);
		
		Rectangulo areaRectangulo = new Rectangulo();
		area = areaRectangulo.CalcularArea(8, 10);
		System.out.println("El área del rectangulo es: "+area);
		
	}

}
