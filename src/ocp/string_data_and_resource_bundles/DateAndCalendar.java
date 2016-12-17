package ocp.string_data_and_resource_bundles;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;


public class DateAndCalendar {

	public static void main(String[] args) {
		simpleDate();
		dateFormatting();
		locales();
		numberFormatting();
	}

	private static void simpleDate() {

		// A Date that is the current date.
		Date now = new Date();

		// A Date that is 1st January 2016
		Date oneJanSixteen = new Date(1451606400000L);

		// Calendar retrieved with Factory.
		Calendar calendar = Calendar.getInstance();
		
		calendar.setTime(now); // Set the Calendar from the Date.
		now = calendar.getTime(); // Set the Date from the Calendar.
		
		System.out.println("First day of the week is " + calendar.getFirstDayOfWeek());
		
		// Calendar manipulation.
		calendar.add(Calendar.YEAR, 1);
		calendar.add(Calendar.MONTH, 5);	
	}
	
	private static void dateFormatting() {
		Date date = Calendar.getInstance().getTime();

		// DateFormatter retrieved with Factory.
		DateFormat formatter = DateFormat.getInstance(); 
		DateFormat dateFormatter = DateFormat.getDateInstance(); 
		DateFormat dateFormatterShort = DateFormat.getDateInstance(DateFormat.SHORT); 
		DateFormat dateFormatterMedium = DateFormat.getDateInstance(DateFormat.MEDIUM); 
		DateFormat dateFormatterLong = DateFormat.getDateInstance(DateFormat.LONG); 
		DateFormat dateFormatterFull = DateFormat.getDateInstance(DateFormat.FULL); 
		
		formatter.format(date); // Example: 9/8/16 5:48PM
		dateFormatter.format(date); // Example: Sep 8, 2016
		dateFormatterShort.format(date); // Example: 9/8/16
		dateFormatterMedium.format(date); // Example: Sep 8, 2016
		dateFormatterLong.format(date); // Example: September 8, 2016
		dateFormatterFull.format(date); // Example: Saturday, September 8, 2016
	}
	
	private static void locales () {
		Locale localeEnglish = new Locale("en"); // The language.
		Locale localeEnglishEngland = new Locale("en", "GB"); // The language and country.
		Locale localeItalianItaly = new Locale("it", "IT"); // Italian locale.
		
		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL, localeEnglishEngland);
		dateFormat.format(new Date()); // Will now print it Local specific.
		
		DateFormat dateFormatForItalians = DateFormat.getDateInstance(DateFormat.FULL, localeItalianItaly);
		dateFormatForItalians.format(new Date()); // Will now print it Local specific (Italian).
		
		System.out.println(localeItalianItaly.getDisplayLanguage()); // Can check the language.
		System.out.println(localeItalianItaly.getDisplayCountry()); // Can check the country.
	}
	
	private static void numberFormatting() {
		float testFloat = 123.4567f;
		Locale localeFrench = new Locale("fr");
		
		NumberFormat formatter = NumberFormat.getInstance();
		NumberFormat formatterFrench = NumberFormat.getInstance(localeFrench);
		NumberFormat formatterMoney = NumberFormat.getCurrencyInstance();
		NumberFormat formatterFrenchMoney = NumberFormat.getCurrencyInstance(localeFrench);
		
		formatter.format(testFloat); // Example: 123.457
		formatterFrench.format(testFloat); // Example: 123,457
		formatterMoney.format(testFloat); // Example: $123.46 (equivalent currency).
		formatterFrenchMoney.format(testFloat); // Example: 123,46 ?
	}
}