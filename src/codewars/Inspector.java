//package codewars;
//
//import java.util.*;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public class Inspector {
//
//	public Map<String, String> bulletinREX = new HashMap<String, String>() {{
//			put("Allow", "(?:Allow citizens of)? ([A-Za-z]+ *[A-Za-z]*)");
//			put("Deny", "(?:Deny citizens of)? ([A-Za-z]+ *[A-Za-z]*)");
//			put("Vaccination", "(?:Citizens of)? ([A-Za-z]+ *[A-Za-z]*)(?: require polio vaccination)?");
//			// вакцинация для citizens и entrance отдельно. разные регулярные выражения для запроса и отклонения вакцинации.
//			put("Wanted", "(?:Wanted by the State:)? ([A-Za-z]+ *[A-Za-z]*)");
//
//		}};
//
//	public Map<String, String> passportREX = new HashMap<String, String>() {{
//			put("ID", "ID#: [a-zA-Z_0-9]*-[a-zA-Z_0-9]*");
//			put("NATION", "NATION: [a-zA-Z]*");
//			put("NAME", "NAME: [a-zA-Z]*");
//			put("DOB", "DOB: ([0-9]{4}\\.[0-9]{2}\\.[0-9]{2})");
//			put("SEX", "SEX: [M|F]");
//			put("EXP", "EXP: ([0-9]{4}\\.[0-9]{2}\\.[0-9]{2})");
//		}};
//
//	public String passportExpiration = "1982.11.22";
//	public List<String> allowCitizensList = new ArrayList<String>();
//	public List<String> denyCitizensList = new ArrayList<String>();
//	public List<String> accessPermitList = new ArrayList<String>();
//	public List<String> IDcardList = new ArrayList<String>();
//	public List<String> workPassList = new ArrayList<String>();
//	public List<String> citizensVaccinationList = new ArrayList<String>();
//	public List<String> entrantsVaccinationList = new ArrayList<String>();
//	public List<String> wantedBy = new ArrayList<String>();
//
//	public void receiveBulletin(String bulletin) {
//
//		String[] bulletinArray = bulletin.split("\n");
//
//		for (String str : bulletinArray) {
//// Allow
//			if(str.matches("Allow citizens of \\w+")) {
//				Pattern pattern = Pattern.compile(bulletinREX.get("Allow"));
//				Matcher matcher = pattern.matcher(str);
//
//				while (matcher.find()) {
//					allowCitizensList.add(matcher.group(1));
//				}
//			}
//
//			if(str.matches("Deny citizens of \\w+")) {
//				Pattern pattern = Pattern.compile(bulletinREX.get("Deny"));
//				Matcher matcher = pattern.matcher(str);
//
//				while (matcher.find()) {
//					denyCitizensList.add(matcher.group(1));
//				}
//			}
//// Access
//			if(str.matches("((?<firstGroup>[A-z]*) require access permit")) {
//				// попробовать сделать один шаблон
//				Pattern pattern = Pattern.compile("[A-Z][a-z]*");
//				Matcher matcher = pattern.matcher(str);
//
//				while (matcher.find()) {
//					accessPermitList.add(matcher.group(1));
//				}
//			}
//
//			if(str.matches("(?<firstGroup>[A-z]*) no longer require access permit")) {
//				Pattern pattern = Pattern.compile("[A-Z][a-z]*");
//				Matcher matcher = pattern.matcher(str);
//
//				while (matcher.find()) {
//					accessPermitList.remove(matcher.group(1));
//				}
//			}
//
//			if(str.matches("(?:Citizens of)? ([A-Za-z]+ *[A-Za-z]*)(?: require ID card)?")) {
//				// попробовать сделать один шаблон
//				Pattern pattern = Pattern.compile("[A-Z][a-z]*");
//				Matcher matcher = pattern.matcher(str);
//
//				while (matcher.find()) {
//					IDcardList.add(matcher.group(1));
//				}
//			}
//
//			if(str.matches("(?:Citizens of)? ([A-Za-z]+ *[A-Za-z]*)(?: no longer require ID card)?")) {
//				Pattern pattern = Pattern.compile("[A-Z][a-z]*");
//				Matcher matcher = pattern.matcher(str);
//
//				while (matcher.find()) {
//					IDcardList.remove(matcher.group(1));
//				}
//			}
//
//			if(str.matches("(?:Citizens of)? ([A-Za-z]+ *[A-Za-z]*)(?: require work pass)?")) {
//				// попробовать сделать один шаблон
//				Pattern pattern = Pattern.compile("[A-Z][a-z]*");
//				Matcher matcher = pattern.matcher(str);
//
//				while (matcher.find()) {
//					workPassList.add(matcher.group(1));
//				}
//			}
//
//			if(str.matches("(?:Citizens of)? ([A-Za-z]+ *[A-Za-z]*)(?: no longer require work pass)?")) {
//				Pattern pattern = Pattern.compile("[A-Z][a-z]*");
//				Matcher matcher = pattern.matcher(str);
//
//				while (matcher.find()) {
//					workPassList.remove(matcher.group(1));
//				}
//			}
//
//
////Vaccination
//			if(str.matches("Citizens of (.*) require [a-z]* vaccination")) {
//				Pattern pattern = Pattern.compile(bulletinREX.get("Vaccination"));
//				Matcher matcher = pattern.matcher(str);
//
//				while (matcher.find()) {
//					citizensVaccinationList.add(matcher.group(1));
//				}
//			}
//
//			if(str.matches("Citizens of (.*) no longer require [a-z]* vaccination")) {
//				Pattern pattern = Pattern.compile(bulletinREX.get("Vaccination"));
//				Matcher matcher = pattern.matcher(str);
//
//				while (matcher.find()) {
//					citizensVaccinationList.remove(matcher.group(1));
//				}
//			}
//
//			if(str.matches("Entrants require [a-z]* vaccination")) {
//				Pattern pattern = Pattern.compile(bulletinREX.get("Vaccination"));
//				Matcher matcher = pattern.matcher(str);
//
//				while (matcher.find()) {
//					entrantsVaccinationList.add(matcher.group(1));
//				}
//			}
//
//			if(str.matches("Entrants no longer require [a-z]* vaccination")) {
//				Pattern pattern = Pattern.compile(bulletinREX.get("Vaccination"));
//				Matcher matcher = pattern.matcher(str);
//
//				while (matcher.find()) {
//					entrantsVaccinationList.remove(matcher.group(1));
//				}
//			}
////Wanted
//			if(str.matches("Wanted by the State: \\w+")) {
//				Pattern pattern = Pattern.compile(bulletinREX.get("Wanted"));
//				Matcher matcher = pattern.matcher(str);
//
//				while (matcher.find()) {
//					wantedBy.add(matcher.group(1));
//				}
//			}
//		}
//	}
//
//	public String inspect(Map<String, String> person) {
//
//			if(wantedBy.contains(passportREX.get("NAME").matcher(person.get("passport")))) {
//				return "Detainment: Entrant is a wanted criminal.";
//			}
//
//			if(wantedBy.contains()) {
//				return "Entry denied: passport expired.";
//			}
//
//
//		return "";
//	}
//
//}