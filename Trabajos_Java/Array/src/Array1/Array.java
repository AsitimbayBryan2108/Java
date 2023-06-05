package Array1;

public class Array 
{
	{
	int edad0=10;
	int edad1=8;
	int edad2=7;
	int edad3=11;
	int edad4=10;
	int edad5=11;
	
	int suma= edad0+edad1+edad2+edad3+edad4+edad5;
	double promedio = suma/6;
	System.out.println("promedio:" + promedio);

    int[] edades = new int[6];
    edades[0] = 10;
    edades[1] = 8;
    edades[2] = 7;
    edades[3] = 11;
    edades[4] = 10;
    edades[5] = 11;
    
    int n = edades.length; 
    System.out.println(edades[3]);
    System.out.println(edades[5]);
    System.out.println("n:"+ n);

    System.out.println(edades [n=2] + edades[n=5]);
	}
	
	

}
