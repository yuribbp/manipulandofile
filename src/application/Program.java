package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		System.out.println();
		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("*** FOLDERS ***");
		for (File folder : folders) {
			System.out.println(folder);
		}
		System.out.println();
		File[] file = path.listFiles(File::isFile);
		System.out.println("**** FILES ****");
		for (File files : file) {
			System.out.println(files);
		}
		
		boolean success = new File(strPath + "\\subdir").mkdir();
		System.out.println("Directory created successfully: " + success);
		
		sc.close();
	}

}
