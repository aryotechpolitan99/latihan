public class HelloWorld{
        public static void main(String args[]){
            System.out.println("Hello Dunia !!");
			mobil bmw = new mobil();//bangun objek bmw
			bmw.merk = "BMW 320i";
			bmw.maju();
			
			mobil fordShelby = new mobil();
			fordShelby.merk = "Ford Mustang Shelby";
			fordShelby.maju();
        }
}


class mobil{
	//atribut
	public String merk;
	//methode
	public void maju(){
		System.out.println("Mobil "+this.merk+" Maju!!! ngeeeng...");
	}
}