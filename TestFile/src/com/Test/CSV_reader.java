package com.Test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

import com.opencsv.CSVReader;

public class CSV_reader {

	public static void main(String[] args) throws Exception {

	/*	CSVReader reader = null;
		reader = new CSVReader(new FileReader("C:\\Users\\mahima\\Documents\\excel.csv"));

		String[] nextline;
		
		while ((nextline = reader.readNext()) != null) {
			for (String token : nextline) {
				System.out.print(token);
			}

			System.out.println();
		}       */
		
		BufferedReader reader =new BufferedReader(new FileReader("C:\\Users\\mahima\\Documents\\excel.csv"));
	
		String nextline;
		
		while ((nextline = reader.readLine()) != null) {
			String[] clos=nextline.split(",");
			System.out.println(clos[0]);
			//System.out.println(clos[1]);
			}

	}

}
