
public class App {

	public static void main(String[] args) {

		 long tempoInicial = System.currentTimeMillis();
		 
		 System.out.println("Reading data from csv and convert to java object:");    
		 CsvToJavaObject csvToJavaObject = new CsvToJavaObject();    
		 System.out.println(csvToJavaObject.convertCsvToJava().size());
		 		 
		 for(int i = 0; i < csvToJavaObject.convertCsvToJava().size(); i++) {
			 System.out.println(
					 csvToJavaObject.convertCsvToJava().get(i).getNr_teste() +
					 " - " + csvToJavaObject.convertCsvToJava().get(i).getCenario());
		 }
		 
		 long tempoFinal = System.currentTimeMillis() - tempoInicial;
		 System.out.println("Demorou " + tempoFinal + " milissegundos");
	}

}
