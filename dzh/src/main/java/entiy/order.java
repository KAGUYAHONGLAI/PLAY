package entiy;

import java.util.Date;

public class order {
	int id;
	int pid;
	int cid;
	Date date;
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
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
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
	
}
