import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NocheVieja{

	public static void main(String[] args) {

		try{
			
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

			String [] St = new String[10000];
			int [] falta = new int[10000];
			int horas = 0 ;
			int minutos = 0;
						
			int i = 0;
			boolean zerozero = false;
			
			while (zerozero != true){
				System.out.println("Introduzca una hora: (00:00 para salir)");
				St[i] = buffer.readLine();
				
				if(St[i].equals("00:00")){
					zerozero = true;
				}

		}
		}
		catch (Exception e){
			System.out.println("error: " + e);
		}
	}
}