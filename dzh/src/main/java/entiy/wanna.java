package entiy;

public class wanna {
int did;
String address;
double area;
int pid;
int activy=1;
int read;
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
 * ��ʾ�������״̬ 1���Ѵ���  2��������  3�������
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
