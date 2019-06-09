package Assignment2;

public class DemoArray {

	public static void main(String[] args) {
		int firstArrayMatrix[][]= {{1,3,5},{1,3,5}};
		int secondArrayMatrix[][]= {{2,4,6},{2,4,6}};
	//	System.out.println(firstArrayMatrix.length);
	//	for(int i=0;i<firstArrayMatrix.length;i++) {
	//		for(int j=0;j<secondArrayMatrix[i].length;j++) {
	//			System.out.print(firstArrayMatrix[i][j]+""+""+secondArrayMatrix[i][j] + "\t");
	//		}
	//		System.out.println();
	//	}

		for(int i=0;i<firstArrayMatrix.length;i++) {
			for(int j=0;j<firstArrayMatrix[i].length;j++) {
				System.out.print(firstArrayMatrix[i][j]+secondArrayMatrix[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
