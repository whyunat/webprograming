package hw02;
import java.sql.Date;

public class Visitors {
	private int aid;
	private String username;
	private String email;
	private Date mdy;
	private String title;
	
	public Visitors(int aid, String username, String email, Date mdy, String title)
	{
		this.aid = aid;
		this.username=username;
		this.email=email;
		this.mdy=mdy;
		this.title=title;
	}
	public int getAid() {return aid;}
	public void setAid(int aid) { this.aid = aid;}
	
	public String getUsername() {return username;}
	public void setUsername(String username) {this.username=username;}
	
	public String getEmail() {return email;}
	public void setEmail(String email) {this.email=email;}
	
	public Date getMdy() {return mdy;}
	public void setMdy(Date mdy) {this.mdy=mdy;}
	
	public String getTitle() {return title;}
	public void setTitle(String title) {this.title=title;}

}
