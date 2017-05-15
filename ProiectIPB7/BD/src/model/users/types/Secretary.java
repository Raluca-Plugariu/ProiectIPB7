package model.users.types;
import java.util.Vector;

import model.committee.Committee;
import model.users.User;

public class Secretary extends User{
	
	private Vector<Student> coordinatedStudents;
	private Committee committee;
	
	public Secretary()
	{
		this.tip = "Secretary";
	}
	
	public void setCoordinatedStudents( Vector<Student> coordinatedStudents){
		this.coordinatedStudents = coordinatedStudents;
	}
	
	public Vector<Student> getCoordinatedStudents(){
		return coordinatedStudents;
	}
	
	public void setCommittee( Committee committee){
		this.committee = committee;
	}
	
	public Committee getCommittee(){
		return committee;
	}
}