public class DoWhile{
	public static void main(String[] args){
		int battery = 3;
		
		do{
			System.out.println("Nyalakan Hp");
			battery--;
		}
		while(battery > 0);
	}
}