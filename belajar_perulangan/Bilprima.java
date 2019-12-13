public class Bilprima{ //menentukan  bilangan prima
	public static void main(String[] args){
		
		int[] data = {3,10,7,11,15,16,23,50};
		
		for(int index = 0; index< data.length;index++){ // looping data index sebanyak lebih kecil dari data.length
			int angka = data[index];
			
			boolean prima = true;
		
			for(int i = 2; i < angka; i++){
				if(angka % i == 0){ // jika angka di % i hasilnya dibandingkan bernilai 0 maka true 
					prima = false;
					break;
				}
			}
			if(prima == true){
				System.out.println(angka);
			}
		}
		
		
		
		
		
		
	
		
		
	}
}