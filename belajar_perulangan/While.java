/*public class While{ 
	public static void main(String[] args){
		int sisaumur = 10;
		
		while(sisaumur > 0){
			System.out.println("Kerja");
			sisaumur--;
			if(sisaumur == 0){
				System.out.println("wafat");
			}
			
		}
	}
}*/ 
// menggunakan scanner
import java.util.Scanner;
public class While{ 
	public static void main(String[] args){
		
		boolean runApp = true;
		while (runApp){
			Scanner input = new Scanner(System.in);
			System.out.println("Pilih 1 untuk lanjutkan running aplikasi");
			System.out.println("Pilih 2 untuk lanjutkan running aplikasi");
			System.out.println("Pilih 3 untuk stop aplikasi");
			int x = input.nextInt();
			
			switch(x){
				case 1:
				System.out.println("kamu pilih 1");
				break;
				case 2:
				System.out.println("kamu pilih 2");
				break;
				default:
				runApp = false;
				break;
			}
		}
	}
}