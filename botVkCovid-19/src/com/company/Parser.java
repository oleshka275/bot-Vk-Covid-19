package com.company;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class Parser {
	
	public static String covidInformation() throws IOException {
		Document doc;
		
			// Get html
			doc = Jsoup.connect("https://ru.wikipedia.org/wiki/%D0%A0%D0%B0%D1%81%D0%BF%D1%80%D0%BE%D1%81%D1%82%D1%80%D0%B0%D0%BD%D0%B5%D0%BD%D0%B8%D0%B5_COVID-19_%D0%B2_%D0%A0%D0%BE%D1%81%D1%81%D0%B8%D0%B8").get();
			// Get <b> tegs
			Element confirmedCase = doc.select("b").get(3);
			Element recovered = doc.select("b").get(4);
			Element deaths = doc.select("b").get(5);
			
			// Link for more information
			String url = "https://стопкоронавирус.рф/";
			
			// Output results 
			String printAllInformation = 
					"Подтверждённых Случаев >> " + confirmedCase.text() + 
					"\n" + "Выздоровело >> " + recovered.text() +
					"\n" + "Смертей >> " + deaths.text() +
					"\n" + "Официальный сайт >> " + url;
			return printAllInformation ;
	}	
}