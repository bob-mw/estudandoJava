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
		
		System.out.println("   ");
		
		System.out.println("Laço com for");
		
		for (int count2 = 1; count2 <= 10; count2++) {
			System.out.println("contando"+count2);
		}
	}

}