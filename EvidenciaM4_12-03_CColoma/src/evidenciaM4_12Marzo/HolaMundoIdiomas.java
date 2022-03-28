package evidenciaM4_12Marzo;

public class HolaMundoIdiomas {
	public static void main(String[] args) {
		
		if( args.length == 0 ){
			System.out.println("Hallo Welt.");
		}
		
		String idioma = args[0];
		
		switch( idioma ) {
			case "Ingles":
				System.out.println("Hello World.");
				break;
			case "Español":
				System.out.println("Hola Mundo.");
				break;
			case "Frances":
				System.out.println("Salut Monde.");
				break;
			case "Italiano":
				System.out.println("Ciao Mondo.");
				break;
			default:
				System.out.println("Konnichiwa Sekai.");
		}
	}
}