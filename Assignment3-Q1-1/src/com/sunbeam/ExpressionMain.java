package com.sunbeam;

public class ExpressionMain {
	public static int calculate(int op1,char opr,int op2)
	{
		switch(opr)
		{
		case '+':return op1+op2;
		case '-':return op1-op2;
		case '*':return op1*op2;
		case '/':return op1/op2;
		case '%':return op1%op2;
		
		}
		return 0;
	}
	public static int postfixEvaluation(String postfix)
	{
		Stack st=new Stack(10);
		for(int i = 0 ; i < postfix.length() ; i++) 
		{
			char ele=postfix.charAt(i);
			if(ele==' ')
				continue;
				else if(Character.isDigit(ele)) {
					int n=0;
					while(Character.isDigit(ele))
					{
						n=n*10+(int)(ele-'0');
						i++;
						ele=postfix.charAt(i);
					}
				}i--;
//		    st.push(ele-'0');
//			else
//			{
//				int op2=st.pop();
//				int op1=st.pop();
//				int res=calculate(op1,ele,op2);
//				st.push(res); 
//			}
		}//st.push(ele-'0');
			if(!st.isEmpty())
			return st.pop();
			
		
		return 0;
	}
		public static void main(String[] args) {	
		String postfix="231*+9-";
		System.out.println("Postfix : " + postfix);
		int result = postfixEvaluation(postfix);
		System.out.println("Result : " + result);
		
		

	}

}
