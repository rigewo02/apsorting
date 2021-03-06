package sort;

public class Main {
	
	public static final int nElements = 10000;
	
	public static void main(String[] args) {
		
		int[] sorted = new int[nElements];
		for (int i = 0; i < sorted.length; i++) {
			sorted[i] = i;
		}
		int[] unsorted = Sort.shuffle(sorted);
		
		Sort sort = new Selection();
		
		long prev = System.currentTimeMillis();
		int[] newsorted = sort.sort(unsorted);
		long diff = System.currentTimeMillis() - prev;
		
		for (int i : newsorted) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("Time elapsed: " + ((float)diff)/1000 + "s");
		System.out.println("Compares: " + sort.bigOhCompare);
		System.out.println("Changes:  " + sort.bigOhChange);
	}
}
