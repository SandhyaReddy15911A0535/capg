package exercises;

public class StringConcate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="hello";
String s2="world";
char s3[]=s1.toCharArray();
char s4[]=s2.toCharArray();
for(int i=0;i<s3.length;i++)
{
	System.out.print(s3[i]);
	for(int j=0;j<=i;j++)
	{
		System.out.print(s4[i]);
		break;
	}
		

	
	}
/*StringBuilder str=new StringBuilder();
{
	
	//System.out.println(str);
	int len1=s3.length;
	int len2=s4.length;
	//System.out.println(len1);
	
	for(int i=0;i<str.length();i++)
	{
		str.append(s3.charAt[i]);
		str.append(s4.charAt[i]);
	}
}*/

	}

}
