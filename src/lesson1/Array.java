package lesson1;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = new int[2];
		
		a[0] = 23;
		a[1]=(char)'a';
		
		for(int k=0;k<a.length;k++) {
			System.out.println((char)((a[k])));
		}
		/*int array[][]= {{1,2,3,4},
				        {5,6,7,8}};
		
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				System.out.println(" " +array[i][j]);
			}
			System.out.println();
		}

	}*/

	

}
}

