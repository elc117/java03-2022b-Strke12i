
public class TeamMates {
	private String userId;
	private String name;
	private boolean online;
	
	public TeamMates() {
		this.name = "default";
		this.userId = "1234default";
		this.online = false;
	}
	
	public TeamMates(String userId,String name,boolean online) {
		this.name = name;
		this.userId = userId;
		this.online = online;
	}
	
	public TeamMates(String userId,String name) {
		this.name = name;
		this.userId = userId;
		this.online = false;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isOnline() {
		return online;
	}

	public void setOnline(boolean online) {
		this.online = online;
	}
	
	
}
