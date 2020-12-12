package pckAuo;
public class testAuto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Auto objAuto = new Auto();
		Auto objAuto2 = new Auto();
		
		objAuto.anio = 2020;
		objAuto.marca="Audi";
		objAuto.precio=150000;
		
		objAuto2.anio = 2020;
		objAuto2.marca="Mazda";
		objAuto2.precio=30000;
		
		System.out.println("Datos Auto 1: ");
		System.out.println("Año: "+objAuto.anio);
		System.out.println("Marca: "+objAuto.marca);
		System.out.println("Precio "+objAuto.precio+" $ \n");
		
		System.out.println("Datos Auto 2: ");
		System.out.println("Año: "+objAuto2.anio);
		System.out.println("Marca: "+objAuto2.marca);
		System.out.println("Precio "+objAuto2.precio+" $ \n");
	
	}

}
