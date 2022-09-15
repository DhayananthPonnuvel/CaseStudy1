public class key1 {

	String studName,sub,assignment;
	public key1(String studName,String sub,String assignment) {

		this.studName=studName;
		this.sub=sub;
		this.assignment=assignment;
	}
	@Override
	public int hashCode() {
		final int p=31;
		int res=1;
		res=p*res+((assignment==null) ? 0 :assignment.hashCode());
		res=p*res+((studName==null) ? 0 :studName.hashCode());
		res=p*res+((sub==null) ? 0 :sub.hashCode());
		return res;
	}
	@Override
	public boolean equals(Object obj) {
		if(this==obj)
			return true;
		if(obj==null)
			return false;
		if(getClass()!=obj.getClass())
			return false;
		key1 other=(key1)obj;
		if(assignment==null) {
			if(other.assignment!=null)
				return false;
		} else if(!assignment.equals(other.assignment))
			return false;
		if(studName==null) {
			if(other.studName!=null)
				return false;
		} else if(!studName.equals(other.studName))
			return false;
		if(sub==null) {
			if(other.sub!=null)
				return false;
		} else if(!sub.equals(other.sub))
			return false;
		return true;
	}
	
}
