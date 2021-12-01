package likey;

public class LikeyDTO {

	String userDTO;
	int evaluationID;
	String userIP;
	public String getUserDTO() {
		return userDTO;
	}
	public void setUserDTO(String userDTO) {
		this.userDTO = userDTO;
	}
	public int getEvaluationID() {
		return evaluationID;
	}
	public void setEvaluationID(int evaluationID) {
		this.evaluationID = evaluationID;
	}
	public String getUserIP() {
		return userIP;
	}
	public void setUserIP(String userIP) {
		this.userIP = userIP;
	}
	
	public LikeyDTO() {
		
	}
	
	public LikeyDTO(String userDTO, int evaluationID, String userIP) {
		super();
		this.userDTO = userDTO;
		this.evaluationID = evaluationID;
		this.userIP = userIP;
	}
}
