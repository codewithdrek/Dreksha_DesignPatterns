package com.test;

import com.VisitorClasses.Computer;
import com.VisitorClasses.Printer;
import com.impl.ShopingCartVisitorIMPL;
import com.interfaceD.Iteam;
import com.interfaceD.ShopingCartVisitor;

public class Test {
//https://www.google.com/search?q=visitor+design+patterns+in+java+in+hindi&biw=1422&bih=668&tbm=vid&sxsrf=APwXEdc7Et14GEZF45yGrCqGJf3yaIajqA%3A1682058229585&ei=9StCZIqRI7ndseMPzo-OoAU&oq=visitor+design+patterns+in+java+in+hins&gs_lcp=Cg1nd3Mtd2l6LXZpZGVvEAMYADIHCCEQoAEQCjIHCCEQoAEQCjIHCCEQoAEQCjoECCMQJzoGCAAQFhAeOggIABCKBRCGAzoICCEQFhAeEB06BQghEKABOgQIIRAVUN0DWJEVYNghaABwAHgAgAGoAogB5g6SAQUwLjguMpgBAKABAcABAQ&sclient=gws-wiz-video#fpstate=ive&vld=cid:79aeb4ac,vid:9MvUxwJN_F0

	public static void main(String[] args) {
		Iteam[] iteams = new Iteam[] { new Computer(7878, 787), new Computer(6768, 7899),
				new Printer(1000, 8779, 77878), new Printer(178723, 990, 898) };

		int totalCost = calculatePrice(iteams);

		System.out.println("totalCost" + totalCost);
	}

	private static int calculatePrice(Iteam[] iteams) {
		ShopingCartVisitor shopingCartVisitor = new ShopingCartVisitorIMPL();
		int sum = 0;
		for (Iteam iteam : iteams) {

			sum = sum + iteam.accept(shopingCartVisitor);
		}
		return sum;
	}

	//Theory
	//// An operation performed on Similar type of object like for example Group of
	//// student in school
	// Visitor is Doctor
	// health checkup is going on Visitor is Doctor
	// if any update coe on visitor got affected
	// any new class addeded it will not affect whole systm
}
