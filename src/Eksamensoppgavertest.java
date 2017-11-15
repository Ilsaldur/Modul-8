
public class Eksamensoppgavertest {

	public static void main(String[] args) {
		int [] numbers = {1,2,3,4,5,7,1,8};
		
		int sum = 0;
		
		for (int i : numbers) {
			sum += i;
		}
		
		int average = sum / numbers.length;
		
		System.out.println(average);

	}

}
