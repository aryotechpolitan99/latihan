public class Sort{ //program mengurutkan data
	public static void main(String[] args){
		int[] data = {3,10,5,50,51,2,4,-2,6};
		// lakukan pengulangan,pengecekan dan tukar data dari index ke-0 hingga akhir
		for(int index = 0; index < data.length; index++){
			int lowestindex = index; // lowest index sementara
			for(int i = lowestindex; i < data.length; i++){ // start cari paling
				if(data[lowestindex] > data[i]){ // membandingkan apakah nilai data[lowestindex] lebih kecil(ascending) dari data[i]
				lowestindex = i;
				}
			}
			int temp = data[index];
			data[index] = data[lowestindex];
			data[lowestindex] = temp;
		}
		for(int j = 0; j < data.length; j++){
			System.out.println(data[j]);
		}
	}
}