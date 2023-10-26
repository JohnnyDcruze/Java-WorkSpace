package oops.demo;
import java.util.*;

public class Reports {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numBills;

        System.out.print("Enter the number of bills: ");
        numBills = scanner.nextInt();
        BillReports billReports = new BillReports(numBills);
        for (int i = 0; i < numBills; i++) {
            System.out.println("Enter details for Bill " + (i + 1));
            System.out.print("Bill No: ");
            int billNo = scanner.nextInt();
            System.out.print("Bill Total: ");
            double total = scanner.nextDouble();

            Bill bill = new Bill(billNo, total);
            billReports.addBill(bill);
        }

        Bill[] allBills = billReports.getBills();
        System.out.println("Details of all bills:");
        for (Bill bill : allBills) {
            if (bill != null) {
                System.out.println("Bill No: " + bill.getBillNo() + ", Total: " + bill.getTotal());
            }
        }
        System.out.print("Enter Bill No to update: ");
        int updateBillNo = scanner.nextInt();
        System.out.print("Enter new total: ");
        double newTotal = scanner.nextDouble();
        boolean updated = billReports.updateBill(updateBillNo, newTotal);
        if (updated) {
            System.out.println("Bill updated successfully.");
        } else {
            System.out.println("Bill not found for updating.");
        }
        System.out.print("Enter Bill No to search: ");
        int searchBillNo = scanner.nextInt();
        Bill foundBill = billReports.searchBill(searchBillNo);
        if (foundBill != null) {
            System.out.println("Details of Bill " + searchBillNo + ":");
            System.out.println("Bill No: " + foundBill.getBillNo() + ", Total: " + foundBill.getTotal());
        } else {
            System.out.println("Bill with Bill No " + searchBillNo + " not found.");
        }

        scanner.close();
    }
}
