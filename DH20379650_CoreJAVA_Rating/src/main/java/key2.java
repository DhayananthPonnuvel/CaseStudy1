
public class key2 {

	String studName,sub;
	public key2(String s,String sub) {
		this.studName=s;
		this.sub=sub;
	}
	@Override
	public int hashCode() {
		final int prime=31;
		int result=1;
		result=prime*result+((studName==null)? 0 :studName.hashCode());
		result=prime*result+((sub==null)? 0 :sub.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if(this==obj)
			return true;  
		if(obj==null)
			return false;
		if(getClass()!=obj.getClass())
			return false;
		key2 other=(key2)obj;
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
