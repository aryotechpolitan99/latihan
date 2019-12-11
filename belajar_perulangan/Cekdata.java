public class Cekdata{
	public static void main(String[] args){
		int[] data = {10,34,5,23,6,7,55,20,260,273,333}; //data array
		/*
		System.out.println("Data Ganjil");
		for(int i=0; i<data.length; i++){ //i data mulai dari 0, i < panjang array
			if(data[i]%2!=0){ // menentukan data ganjil = data i modulus 2 hasilnya bukan 0 maka ganjil
			System.out.println(data[i]);	
			}
		}
		*/
		
		int lowestData = data[0]; //diasumsikan bahwa data ke- 0 adalah paling kecil
		int lowestIndex = 0;
		
		for(int i=0; i<data.length; i++){
			if(data[lowestIndex] > data[i]){
				lowestData = data[i];
				lowestIndex = i;
			}
		}
		System.out.println("Jadi data paling kecil adalah "+lowestData+" yang berada pada index ke- "+lowestIndex);
	}
}