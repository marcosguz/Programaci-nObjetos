
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona objPersona;
		Persona objPersona2 = new Persona();
		Auto objAuto;
		
		objPersona = new Persona();
		
		objPersona.nombre="Marcos";
		objPersona.cedula="0850266248";
		objPersona.edad=21;
		objPersona.estaturacm=172;
		
		objPersona2.nombre="Júan";
		objPersona2.cedula="1789653241";
		objPersona2.edad=20;
		objPersona2.estaturacm=180;
		
		System.out.println("Persona 1");
		System.out.println("Sus datos son:");
		System.out.println("Nombre: "+objPersona.nombre);
		System.out.println("Cédula: "+objPersona.cedula);
		System.out.println("Edad: "+objPersona.edad);
		System.out.println("Estatura: "+objPersona.estaturacm+" cm \n");
		
		System.out.println("Persona 2");
		System.out.println("Sus datos son:");
		System.out.println("Nombre: "+objPersona2.nombre);
		System.out.println("Cédula: "+objPersona2.cedula);
		System.out.println("Edad: "+objPersona2.edad);
		System.out.println("Estatura: "+objPersona2.estaturacm+" cm");
		
	}

}
