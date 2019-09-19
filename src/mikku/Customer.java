package mikku;

class Customer {
	private String name;
	private String address;
	private String contactNumber;
	private String email;
	private String  proofType;
	private String proofId;	
	private String ac;
	private int total;
	private int roomNo;
	public int getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public String getAc() {
		return ac;
	}
	
	public void setAc(String ac) {
		this.ac = ac;
	}
	public String getCot() {
		return cot;
	}
	public void setCot(String cot) {
		this.cot = cot;
	}
	public String getCable() {
		return cable;
	}
	public void setCable(String cable) {
		this.cable = cable;
	}
	public String getWifi() {
		return wifi;
	}
	public void setWifi(String wifi) {
		this.wifi = wifi;
	}
	public String getLaundry() {
		return laundry;
	}
	public void setLaundry(String laundry) {
		this.laundry = laundry;
	}

	private String cot;
	private String cable;
	private String wifi;
	private String laundry;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getProofType() {
		return proofType;
	}
	public void setProofType(String proofType) {
		this.proofType = proofType;
	}
	public String getProofId() {
		return proofId;
	}
	public void setProofId(String proofId) {
		this.proofId = proofId;
	}
	
	void register()
	{
		System.out.println(getName()+"\n"+getAddress()+"\n"+getContactNumber()+"\n"+getEmail()+"\n"+getProofType()+"\n"+getProofId());
		
	}
	void display()
	{
		System.out.println("The service selected are "+getAc()+"\n"+getCot()+"\n"+getCable()+"\n"+getWifi()+"\n"+getLaundry());
	System.out.println("Room number is "+getRoomNo());
	}
}
