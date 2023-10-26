package oops.demo;
import java.util.*;
public class Bill {
	private int billNo;
	private String custName;
	private Date Date;
	private double total;
	private String[] items;
	
	public Bill(int billNo, double total) {
		// TODO Auto-generated constructor stub
		this.billNo=billNo;
		this.total=total;
	}
	public int getBillNo() {
		return billNo;
	}
	public void setBillNo(int billNo) {
		this.billNo = billNo;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public Date getDate() {
		return Date;
	}
	public void setDate(Date date) {
		Date = date;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double newTotal) {
		this.total = newTotal;
	}
	public String[] getItems() {
		return items;
	}
	public void setItems(String[] items) {
		this.items = items;
	}
	

}
