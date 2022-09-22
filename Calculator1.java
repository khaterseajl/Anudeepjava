// WAP to create calculator for int &double using var...arg method
public class Calculator1 {
//declaring method for int values
public int  addition(int...a)
{
	int sum = 0;
	for(int i=0;i<a.length;i++)//declaring for each loop to show value of a
	{
		sum+=a[i];
	}
	return sum;//returning a values
}
public int  substraction(int...a)
{
	int sub = 0;
	for(int i=0;i<a.length;i++)
	{
		sub-=a[i];
	}
	return sub; 
	
}
public int multi (int...a)
{
	int multi = 0;
	for(int i=0;i<a.length;i++)
	{
		multi*=a[i];
	}
	return multi;
	
}
public int division(int...a)
{
	int div = 0;
	for(int i=0;i<a.length;i++)
	{
		div /=a[i];
	}
	return div;
	
}
// declaring method for double values
public double addition(double...a)
{
	int add = 0;
	for(int i=0;i<a.length;i++)
	{
		add+=a[i];
	}
	return add;
	
}
public double substraction(double...a)
{
	int sub = 0;
	for(int i=0;i<a.length;i++)
	{
		sub-=a[i];
	}
	return sub;
	
}
public double multi(double...a)
{
	int multi = 0;
	for(int i=0;i<a.length;i++)
	{
		multi*=a[i];
	}
	return multi;
	
}
public double division(double...a)
{
	int div = 0;
	for(int i=0;i<a.length;i++)
	{
		div /=a[i];
	}
	return div;
	
}

}
	



