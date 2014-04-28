package test;

import java.util.ResourceBundle;

import com.sun.xml.wss.impl.callback.PasswordValidationCallback;


/**
 * Password validator call-back handler for secured web service. This handler
 * will be invoked whenever any call is made to the service by clients. After
 * successful authentication web service access will be enabled to the user.
 * 
 * @author kapil.kumar
 * @version 1.0
 */
public class WSITPasswordValidator implements PasswordValidationCallback.PasswordValidator {
	private static final String USERNAME_TAG = "username";
	private static final String PASSWORD_TAG = "password";
	
	private static final String WSIT_PROPERTIES_FILE_NAME = "auth";
	
	public boolean validate(PasswordValidationCallback.Request request) throws PasswordValidationCallback.PasswordValidationException {
		boolean flag = false;
		
		ResourceBundle resourceBundle = ResourceBundle.getBundle(WSIT_PROPERTIES_FILE_NAME);
		if(resourceBundle != null) {
			String username = resourceBundle.getString(USERNAME_TAG);
			String password = resourceBundle.getString(PASSWORD_TAG);
			
			PasswordValidationCallback.PlainTextPasswordRequest plainTextRequest = (PasswordValidationCallback.PlainTextPasswordRequest) request;
			if (username.equals(plainTextRequest.getUsername()) && password.equals(plainTextRequest.getPassword())) {
				flag = true;            
			} 			
		}
		
		return flag;        
	}
}
