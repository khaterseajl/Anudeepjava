//WAP to print multiplication of two matrices ?
public class Multiofmatrix {
public static void main(String[] args)
{
	//declaring array elements
	int n1[][] = {{1,2,3},{2,2,2}};
	int n2[][] = {{4,5,6},{7,7,0}};
	
	int n3[][]=new int [3][3];//declaring matrix size which 3D array
	for(int i=0;i<n1.length;i++)//created nested for loop to print values
	{
		for(int j=0;j<n1[i].length;j++)
		{
			 n3[i][j]= n1[i][j]* n2[i][j]; //multiplied to matrices
			 System.out.print(n3[i][j]+" ");
		}
		System.out.println();//it will print in next line
	}

	
	
}
}
