public class CekbilanganPrima{
	public static void main(String[] args){
	int n = Integer.parseInt(args[0]);
	int angka = n;
	int temp;
	boolean prima = true;
	
		for(int pembagi = 2; pembagi <= angka /2; pembagi++){
			temp = angka % pembagi;
			if(temp == 0){
				prima = false;
				break;
			}
		}
		if(prima && ((angka > 0) && (angka != 1)))
			System.out.println(angka+" adalah bilangan prima");
		else{
			System.out.println(angka+" bukan bilangan prima");
		}
	}
}