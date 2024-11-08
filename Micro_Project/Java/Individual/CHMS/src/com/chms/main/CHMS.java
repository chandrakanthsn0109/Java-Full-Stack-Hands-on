package com.chms.main;

import java.util.List;
import java.util.Scanner;

import com.chms.bean.Crop;
import com.chms.dao.CropDAO;

public class CHMS {
	
	static Scanner sc = new Scanner(System.in);
	static CropDAO dao = new CropDAO();
	
	public static int menu() {
		System.out.println("1. Insert");
		System.out.println("2. Delete");
		System.out.println("3. Update");
		System.out.println("4. Find");
		System.out.println("5. FindAll");
		System.out.println("6. Quit");
		System.out.println("Enter your choice: ");
		int choice = sc.nextInt();
		return choice;
	}
	
	public static Crop insertCrop() {
		System.out.println("Enter Crop id, name, cultivation period in months and harvest capacity in Kg");
		return new Crop(sc.nextInt(), sc.next(), sc.nextInt(), sc.nextInt());
	}
	
	public static int deleteCrop() {
		System.out.println("Enter Crop id");
		return sc.nextInt();
	}

	public static Crop updateCrop() {
		System.out.println("Enter Crop id, name, cultivation period in months and harvest capacity in Kg");
		return new Crop(sc.nextInt(), sc.next(), sc.nextInt(), sc.nextInt());
	}

	public static int findCrop() {
		System.out.println("Enter Crop id");
		return sc.nextInt();
	}

	public static void main(String[] args) {
		
		String msg = "";
		do {
			switch(CHMS.menu()) {
			case 1:
				if(dao.insertCrop(insertCrop()) == 1) {
					System.out.println("Record Inserted");
				}else {
					System.out.println("Record Not Inserted");
				}
				break;
			case 2:
				if(dao.deleteCrop(deleteCrop()) == 1) {
					System.out.println("Record Deleted");
				}else {
					System.out.println("Record Not Deleted");
				}
				break;
			case 3:
				//Crop crop = updateCrop();
				//int n = dao.updateCrop(crop);
				if(dao.updateCrop(updateCrop()) == 1) {
					System.out.println("Record Updated");
				}else {
					System.out.println("Record Not Updated");
				}
				break;
			case 4:
				int cid = findCrop();
				Crop temp = dao.findCrop(cid);
				if(temp == null) {
					System.out.println("Record Not Found");
				}else {
					System.out.println(temp.getCid() + " " + temp.getCname() + " " + temp.getCultPeriod() + " " + temp.getHarCap());
				}
				break;
			case 5:
				List<Crop> list = dao.findAllCrop();
				if(list.isEmpty()) {
					System.out.println("Records Not Found");
				}else {
					for(Crop c : list) {
						System.out.println(c.getCid() + " " + c.getCname() + " " + c.getCultPeriod() + " " + c.getHarCap());
						System.out.println();
					}
				}

				break;
			case 6: System.exit(0);
			}
			System.out.println("Do you want to continue [Yes | No]");
			msg = sc.next();
		}while(msg.equalsIgnoreCase("Yes"));

	}

}
