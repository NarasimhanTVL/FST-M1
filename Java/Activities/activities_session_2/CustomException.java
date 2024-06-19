package activities_session_2;

public class CustomException extends Exception {
	private String message="";
	private String Localizedmessage1="nara";
	public CustomException(String message){
		this.message=message;
		}
	@Override
	public String getMessage() {
		return Localizedmessage1;
	}
	@Override
	public String getLocalizedMessage() {
        return this.getMessage();
    }
}
