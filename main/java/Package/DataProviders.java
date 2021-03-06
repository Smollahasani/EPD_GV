package Package;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.testng.annotations.DataProvider;
import com.opencsv.CSVReader;


public class DataProviders {
	
	@DataProvider(name = "Login")
	public Iterator<Object[]> Login () throws IOException{
		CSVReader reader = new CSVReader(
				new FileReader("./src/main/resources/CSVFiles/Login.csv"),',','\'',1);
		List<Object[]> myEntries = new ArrayList<Object[]>();
		String[] nextLine;
		while ((nextLine=reader.readNext())!=null) {
			myEntries.add(nextLine);
		}
		reader.close();
		return myEntries.iterator();
	}
	
	
	
	@DataProvider(name = "AddSpeciality")
	public Iterator<Object[]> AddSpeciality() throws IOException{
		CSVReader reader = new CSVReader(
				new FileReader("./src/main/resources/CSVFiles/AddSpeciality.csv"),',','\'',1);
		List<Object[]> myEntries = new ArrayList<Object[]>();
		String[] nextLine;
		while ((nextLine=reader.readNext())!=null) {
			myEntries.add(nextLine);
		}
		reader.close();
		return myEntries.iterator();
	}
	
	@DataProvider(name = "AddLicense")
	public Iterator<Object[]> AddLicense() throws IOException{
		CSVReader reader = new CSVReader(
				new FileReader("./src/main/resources/CSVFiles/AddLicense.csv"),',','\'',1);
		List<Object[]> myEntries = new ArrayList<Object[]>();
		String[] nextLine;
		while ((nextLine=reader.readNext())!=null) {
			myEntries.add(nextLine);
		}
		reader.close();
		return myEntries.iterator();
	}
	
	@DataProvider(name = "AddInsurance")
	public Iterator<Object[]> AddInsurance() throws IOException{
		CSVReader reader = new CSVReader(
				new FileReader("./src/main/resources/CSVFiles/AddInsurance.csv"),',','\'',1);
		List<Object[]> myEntries = new ArrayList<Object[]>();
		String[] nextLine;
		while ((nextLine=reader.readNext())!=null) {
			myEntries.add(nextLine);
		}
		reader.close();
		return myEntries.iterator();
	}
	
	@DataProvider(name = "AddCenterPart")
	public Iterator<Object[]> AddCenterPart() throws IOException{
		CSVReader reader = new CSVReader(
				new FileReader("./src/main/resources/CSVFiles/AddCenterPart.csv"),',','\'',1);
		List<Object[]> myEntries = new ArrayList<Object[]>();
		String[] nextLine;
		while ((nextLine=reader.readNext())!=null) {
			myEntries.add(nextLine);
		}
		reader.close();
		return myEntries.iterator();
	}



} 