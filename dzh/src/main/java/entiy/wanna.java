package entiy;

public class wanna {
	int id;public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
int did;
String address;
double area;
int pid;
int activy=1;
int read;
String phone;
public void setPhone(String phone) {
	this.phone = phone;
}
public String getPhone() {
	return phone;
}
public int getRead() {
	return read;
}
public void setRead(int read) {
	this.read = read;
}
public int getActivy() {
	return activy;
}
/**
 * 表示该需求的状态 1：已创建  2：已受理  3：已完成  0:委托的wanna
 * @param activy 
 */
public void setActivy(int activy) {
	this.activy = activy;
}
public String getAddress() {
	return address;
}
public double getArea() {
	return area;
}
public int getPid() {
	return pid;
}
public int getDid() {
	return did;
}
public void setAddress(String address) {
	this.address = address;
}
public void setArea(double area) {
	this.area = area;
}
public void setpid(int pid) {
	this.pid = pid;
}
public void setDid(int pid) {
	this.did = pid;
}
}
