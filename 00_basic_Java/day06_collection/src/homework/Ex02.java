package homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Ex02 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map map = new HashMap();
		
		
		while (true) {
			
			System.out.println("1. Add Video / 2. Remove Video / 3. Show Videos / 4. Modify Video / 5. Exit");
			Integer choose = br.read();
			br.readLine();
			
			if (choose == '1') {
				System.out.println("Title :");
				String title = br.readLine();
				map.put("Title", title);
				
				System.out.println("Genre :");
				String genre = br.readLine();
				map.put("Genre", genre);
				
				System.out.println("Is Lended? (True / False) :");
				String lend = br.readLine();
				map.put("Lend", lend);
				
				System.out.println("Name : ");
				String lendName = br.readLine();
				map.put("Lend Name", lendName);
				
				Date lendDate = new Date();
				map.put("Lend Date", lendDate);
			} else if (choose == '5') break;

		}
		
		
		
	}

}
