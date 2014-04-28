package test;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import com.sun.xml.wss.SubjectAccessor;
import javax.xml.ws.WebServiceContext;
import javax.jws.WebService;
import javax.annotation.Resource;
import javax.jws.WebService;
import javax.jws.HandlerChain;
import javax.xml.ws.Endpoint;



@WebService()
@HandlerChain(file = "handlers.xml")
public class SecureWebService {
    @Resource WebServiceContext context;

    /**
     * Web service operation
     */
    @WebMethod
    public String sayHello(@WebParam(name = "arg") String arg) {
        // Secure Method 
        try {
            System.out.println("\nRequester Subject in sayHello= " + SubjectAccessor.getRequesterSubject(context));
        } catch (Exception e) {
           throw new RuntimeException(e);
        }
        return "Hello " + arg;
    }

    /**
     * Web service operation
     */
    @WebMethod
    public String sayBye(@WebParam(name = "arg") String arg) {
         //Unsecure Method 
        try {
            System.out.println("\nRequester Subject in unsecure sayBye= " + SubjectAccessor.getRequesterSubject(context));
        } catch (Exception e) {
           throw new RuntimeException(e);
        }
        return "BYE " + arg;
        
    }
}
