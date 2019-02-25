package exercises;

public class Tag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="24A284-22";
		char ch[]=s.toCharArray();
		if(ch[2]=='A'||ch[2]=='E'||ch[2]=='I'||ch[2]=='O'||ch[2]=='U'||ch[2]=='Y') 
			{
				System.out.println("invalid");
			}
			else
			{
			if((ch[0]+ch[1])%2==0 &&(ch[3]+ch[4])%2==0 && (ch[4]+ch[5])%2==0 && ch[6]=='-' && (ch[7]+ch[8])%2==0)
					{
				System.out.println("valid");
			}
			else
				
				System.out.println("invalid");
		}
	}
}


