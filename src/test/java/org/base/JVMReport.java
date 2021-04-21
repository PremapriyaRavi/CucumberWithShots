package org.base;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {
	public static void generateJVMReport(String json) {
		//create one folder insider the Reports folder and pass that path as a arg for file
		
		File f=new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Reports\\JVMReport");	
		Configuration con=new Configuration(f,"CrazySales");
		con.addClassifications("Browsername","chrome");
		con.addClassifications("Browserversion","85");
		con.addClassifications("os version","8.1");
		con.addClassifications("Platform","windows");
		con.addClassifications("sprint","16");
	 
		List<String> jsanfiles=new ArrayList<String>();
		jsanfiles.add(json);
		ReportBuilder r=new ReportBuilder(jsanfiles, con);
		// to generate the report must....
		r.generateReports();
	
	}
//	public static void main(String[] args) {
//		System.out.println(System.getProperty("user.dir")+"\\src\\test\\resources\\Reports\\JVMReport");
//	}
}
