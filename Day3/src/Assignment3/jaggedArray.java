package Assignment3;

public class jaggedArray {
	//String[][] array = new String[][];
	public static void main(String[] args) {
		
	
	String array[][]= {{"Tony","JAVA","C","C++"},
			{"Thomas","JAVA","UNIX",""},
			{"Dinil","Linux","Oracle",""},
			{"Delvin","RDBMS","C#","ORACLE"}};
	
	for(int i=0;i<array[3].length;i++) {
		System.out.print(array[3][i]+"\t");
	}
	}
}
