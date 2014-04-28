package test;

public class WSClient {
	public static void main(String[] args) {
		try {
			SecureWebServiceService service = new SecureWebServiceService();
			SecureWebService port = service.getSecureWebServicePort();
			String str = port.sayHello("KAPX");
			System.out.println(str);
		} catch (Exception e) {
		}
	}
}
