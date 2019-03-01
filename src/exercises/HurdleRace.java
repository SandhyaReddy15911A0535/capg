package exercises;

import java.util.Scanner;
import java.util.TreeSet;

public class HurdleRace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
TreeSet<Integer> ts=new TreeSet<>();
System.out.println("enter the height");
int []hei =new int[5];

for(int i=0;i<5;i++)
{
	int num=sc.nextInt();
	hei[i]=num;
}
for(int i=0;i<5;i++)
{
	ts.add(hei[i]);
}
//System.out.println(ts);

}

}
