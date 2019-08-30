package referenceType;

public class MultiArray
{
	public static void main(String[] args)
	{
		int [][] gugudan = {
				{9,1,9},
				{9,2,18},
				{9,3,27},
				{9,4,36},
				{9,5,45}		
		};
		
		int [][] gugudan2 = new int [5][3];
		
		for(int i = 0; i < 5; i++) {
			gugudan2[i][0] = 9;
			gugudan2[i][1] = (i+1);
			gugudan2[i][2] = gugudan2[i][0] * gugudan2[i][1];
		}
		
		int [][] gugudan3 = new int [5][5];
		for(int i = 0; i < 5; i++) {
			for(int j = 1; j < 6; j++) {
				gugudan3[i][j-1] = (i+j)+(5*i)-i;
				//System.out.print(gugudan3[i][j-1]+"\t");
			}			
			//System.out.println();
		}
		
		int [][] gugudan4 = new int [6][5];
		for(int i = 0; i < 6; i++) {
			for(int j = 0; j <5; j++) {
				if (i%2 == 0) {
					gugudan4[i][j] = j+(5*i)+1;
					System.out.print(gugudan4[i][j]+"\t");
				}
				else if(i%2 == 1) {
					gugudan4[i][j] = gugudan4[i-1][j] + 9 - 2*(j);
					System.out.print(gugudan4[i][j]+"\t");
				}
			}
			System.out.println();
		}
		
		
	}
}
