package ocp.string_data_and_resource_bundles;

import java.util.Locale;
import java.util.ResourceBundle;

public class Bundles {
	
	private static final String LABELS_RESOURCES = "ocp.string_data_and_resource_bundles.resources.Labels";
	
	public static void main(String[] args) {
		resourceBundles();
		propertyBundles();
	}
	
	private static void resourceBundles() {
		Locale localeEnglish = new Locale("en");
		Locale localeFrench = new Locale("fr");
		
		ResourceBundle resourcesEnglish = ResourceBundle.getBundle(LABELS_RESOURCES, localeEnglish);
		ResourceBundle resourcesFrench = ResourceBundle.getBundle(LABELS_RESOURCES, localeFrench);
		
		System.out.println("Language: en, Hello: " + resourcesEnglish.getString("hello"));
		System.out.println("Language: fr, Hello: " + resourcesFrench.getString("hello"));
	}
	
	private static void propertyBundles() {
		Locale localeEnglishCanadian = new Locale("en", "CA");	
		ResourceBundle resourcesEnglish = ResourceBundle.getBundle(LABELS_RESOURCES, localeEnglishCanadian);
		StringBuilder builder = new StringBuilder();
		builder.append("Language: " + localeEnglishCanadian.getLanguage());
		builder.append(", Country: " + localeEnglishCanadian.getCountry());
		builder.append(", Message: " + resourcesEnglish.getObject("hello"));
		System.out.println(builder.toString());
	}
}
