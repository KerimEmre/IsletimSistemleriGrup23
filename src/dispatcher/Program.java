package dispatcher;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
public class Program {

	public static void main(String[] args) {
		Dispatcher dispatcher = new Dispatcher();
		try {
			//txt dosyasından veriler alınır.
			BufferedReader reader = new BufferedReader(new FileReader("giriş.txt"));
			String line;
			while ((line = reader.readLine()) != null) {
			String[] values = line.split(", ");
			int arrival = Integer.parseInt(values[0]);
			int priority = Integer.parseInt(values[1]);
			int burst = Integer.parseInt(values[2]);
			
			int bellek = Integer.parseInt(values[3]);
			int yazicilar = Integer.parseInt(values[4]);
			int tarayicilar = Integer.parseInt(values[5]);
			int modemler = Integer.parseInt(values[6]);
			int cdler = Integer.parseInt(values[7]);  
			
			
			//alınan veriler ile bir proses sıraya eklenir.
			dispatcher.addProcess(new Process(arrival, priority, burst, bellek, yazicilar, tarayicilar, modemler, cdler));
			
			}
			reader.close();
			dispatcher.run();
			} 
			 catch (IOException e) {
			e.printStackTrace();
			 }
	}

}
