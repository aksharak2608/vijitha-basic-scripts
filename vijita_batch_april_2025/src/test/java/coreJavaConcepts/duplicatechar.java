package coreJavaConcepts;
public class duplicatechar {

	public static void main(String[] args) {
		
		String s="javaprogram";
		StringBuilder sb= new StringBuilder();
		
		char temp;
		char[] ip= s.toCharArray();
		
		//for(char temp1:ip)
		for(int i=0;i<ip.length;i++)
		{
			temp=ip[i];
			int count=0;
			for(int j=i+1;j<ip.length;j++)
			{
				if(temp==ip[j])
				{
					count++;
				}
			}
			if(count==0)
			{
				sb.append(temp);
			}
			String url="www.googlw.cmip:234id:23";
		}
		System.out.println(sb);
	}
	}