
public class rating {

	String studName,sub,assignment,date;
	int points;

	public rating(String s, String sub, String a, String d, int p) {
		this.studName=s;
		this.sub=sub;
		this.assignment=a;
		this.date=d;
		this.points=p;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}

	public String getStudentName() {
		return studName;
	}
	public void setStudentName(String s) {
		this.studName=s;
	}
	public String getSubject() {
		return sub;
	}
	public void setSubject(String sub) {
		this.sub= sub;
	}
	public String getAssignment() {
		return assignment;
	}
	public void setAssignmentCategory(String assignment) {
		this.assignment=assignment;
	}
}
