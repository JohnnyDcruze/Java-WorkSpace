package oops.demo;

public class BillReports {
	private Bill[] bills;
	
	public BillReports(int numBills) {
		// TODO Auto-generated constructor stub
		this.bills=new Bill[numBills];
	}
	public void addBill(Bill bill) {
        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == null) {
                bills[i] = bill;
                break;
            }
        }
    }
	public boolean updateBill(int billNo, double newTotal) {
        for (Bill bill : bills) {
            if (bill != null && bill.getBillNo() == billNo) {
                bill.setTotal(newTotal);
                return true;
            }
        }
        return false;
    }
	public Bill[] getBills() {
        return bills;
    }

    public Bill searchBill(int billNo) {
        for (Bill bill : bills) {
            if (bill != null && bill.getBillNo() == billNo) {
                return bill;
            }
        }
        return null; 
    }

}
