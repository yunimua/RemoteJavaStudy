package myobj.phone;

public class PhoneG {
	
	String groupName;
	
	public PhoneG(String groupName) {
		this.groupName = groupName;
	}
	
	@Override
	public String toString() {
		return String.format("�׷��: [%s]\t", groupName);
	}
}
