package week1.day1;

public class Mobile {

	public void makeCall() {
		System.out.println("Call to mobile");
	}
	
	public void sendMsg() {
		System.out.println("Send SMS to Mobile");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile obj= new Mobile();
		obj.makeCall();
		obj.sendMsg();
				
	}

}
