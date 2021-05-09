package lacos;

public class Lacos {
	
	public static void main(String[] args) {
		
		System.out.println("Brincando com Laços");
		
		int count = 0;
		int total = 0;
		
		while(count < 10) {
			System.out.println(count);
			count++;
			total += count;
		}
		
		System.out.println("O total é: " + total);
		
		
		/*for (int count = 1; count >= 10; count += count) {
			System.out.println("contando");
		}*/
	}

}