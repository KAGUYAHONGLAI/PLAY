package entiy;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;


public class order {
	int id;
	int pid;
	int cid;
	String cname;
	String pname;
	public void setCname(String cname) {
		this.cname = cname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getCname() {
		return cname;
	}
	public String getPname() {
		return pname;
	}
	int did;
	public void setDid(int did) {
		this.did = did;
	}
	public int getDid() {
		return did;
	}
	Timestamp date=new Timestamp(0);
	double cost;
	int action;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getDate() {
		return timeStamp2Date(date);
	}
	public void setDate(Timestamp date) {
		this.date = date;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	/**
	 * ������Ծ״̬ 
	 * 
	 * @return action
	 * 0���Ѿ����	1����������	 2��װ�޹�˾��ȷ��
	 */
	public int getAction() {
		return action;
	}
	/**
	 * ������Ծ״̬ 
	 * 
	 * @param action
	 * 0���Ѿ����	1����������	 2��װ�޹�˾��ȷ��
	 */
	public void setAction(int action) {
		this.action = action;
	}
	 /** 
	  		* ʱ���ת�������ڸ�ʽ�ַ��� 
	        * @param seconds ��ȷ������ַ��� 
	        * @param formatStr 
	        * @return 
	        */  
	     public  String timeStamp2Date(Timestamp d) {  
	    	 
	    	 SimpleDateFormat format =  new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
	    	 return format.format(d);
	     }  
	
}
