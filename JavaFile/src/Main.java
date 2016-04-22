import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.LineNumberReader;


public class Main {

	public static void main(String[] args){
		String name = "plik.txt";
		try {
			FileReader fr = new FileReader(name);
			BufferedReader br = new BufferedReader(fr);
			LineNumberReader lr = new LineNumberReader(br);
			
			String x = "";
			x = br.readLine();
			x = br.readLine();
			System.out.println(x);
			System.out.println(lr.getLineNumber());
			//lr.setLineNumber(0);
			//x = br.readLine();
			//System.out.println(x);
				
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
