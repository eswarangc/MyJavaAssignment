package week1.day1;

public class Mobile {
	
		public static void main(String[] args) {
	
		int price =12000;
		boolean  iphonemodel= true;
		String name ="Iphone";
		char Logo= 'A';
		float weight = 99.6f;
				//System.out.println("Model of the mobile:"+name+"\n"+price+"\n"+iphonemodel+"\n"+Logo+"\n"+weight);
			Mobile data =new Mobile();
			data.sendSms();
			data.makecall(price);
						
		
	}

		private int makecall(int price) {
			// TODO Auto-generated method stub
			int result= price;
			System.out.println(result);
			return(result);
		}

		private void sendSms() 
		
	{
			// TODO Auto-generated method stub
			
			System.out.println("From Iphone");
			
		}

}
		

