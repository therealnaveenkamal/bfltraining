package MyMap;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.*;

class Cities{
	private int cityid;
	private String Name;
	private double airportdist;
	private int elevation;
	private int population;
	private String lang;
	private double GDP;
	
	public Cities(int cityid, String name, double airportdist, int elevation, int population, String lang, double gDP,
			double area) {
		super();
		this.cityid = cityid;
		Name = name;
		this.airportdist = airportdist;
		this.elevation = elevation;
		this.population = population;
		this.lang = lang;
		GDP = gDP;
		this.area = area;
	}
	
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}
	public String getRank() {
		return lang;
	}
	public void setRank(String lang) {
		this.lang = lang;
	}
	public double getGDP() {
		return GDP;
	}
	public void setGDP(double gDP) {
		GDP = gDP;
	}
	public int getElevation() {
		return elevation;
	}
	public void setElevation(int elevation) {
		this.elevation = elevation;
	}
	public int getCityid() {
		return cityid;
	}
	public void setCityid(int cityid) {
		this.cityid = cityid;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public double getAirportdist() {
		return airportdist;
	}
	public void setAirportdist(double airportdist) {
		this.airportdist = airportdist;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	
	@Override
	public String toString() {
		return "Cities [cityid=" + cityid + ", Name=" + Name + ", airportdist=" + airportdist + ", elevation="
				+ elevation + ", population=" + population + ", lang=" + lang + ", GDP=" + GDP + ", area=" + area + "]";
	}

	private double area;
	
	
	
}


public class StreamApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Cities> ls = new ArrayList<Cities>();
		ls.add(new Cities(102, "Chennai", 21, 7, 7088000, "Tamil", 86, 426));
		ls.add(new Cities(103, "Coimbatore", 10.8, 411, 1584719, "Tamil", 50, 246.75));
		ls.add(new Cities(145, "Vellore", 0, 216, 696110, "Tamil", 41.78, 87.92));
		ls.add(new Cities(112, "Mumbai", 3.4, 14, 12478447, "Marathi", 400, 603.4));
		ls.add(new Cities(192, "Pune", 11, 560, 5000000, "Marathi", 33.1, 516.18));
		ls.add(new Cities(118, "Bangalore", 34.9, 920, 8443675, "Kannada", 110, 741));
		System.out.println("Total Cities: "+ls.stream().count());
		
		//COUNT, DISTINCT, FILTER
		List<String> langs = new ArrayList<String>();
		ls.stream().forEach(s->langs.add(s.getRank()));
		langs.stream().distinct().forEach(s->System.out.println("Total Cities with Official Language as "+s+": "+ls.stream().filter(s1->s1.getRank().equals(s)).count()));
		
		System.out.println();
		//MIN MAX
		Optional<Cities> s = ls.stream().max((i,j)->i.getPopulation() > (j.getPopulation())?1:-1);
		Optional<Cities> s1 = ls.stream().min((i,j)->i.getPopulation() > (j.getPopulation())?1:-1);
		System.out.println(s.get().getName()+" has the maximum population of "+s.get().getPopulation()+" people");
		System.out.println(s1.get().getName()+" has the minimum population of "+s1.get().getPopulation()+" people\n");
		
		System.out.println("Chilly Areas:");
		ls.stream().filter(s12->s12.getElevation()>300).collect(Collectors.toList()).forEach(c->System.out.print(c.getName() +" "));
		
		System.out.println("\n");
		System.out.println("Ascending Population");
		//SORTED - Ascending Population
		ls.stream().sorted(Comparator.comparingInt(pop->((Cities) pop).getPopulation())).forEach(cs->System.out.println(cs.getName() +" - "+cs.getPopulation()));
		
		
		System.out.println();
		//SORTED - Descending Population
		System.out.println("Descending Population");
		ls.stream().sorted(Comparator.comparingInt(pop->((Cities) pop).getPopulation()).reversed()).forEach(cs->System.out.println(cs.getName() +" - "+cs.getPopulation()));
		
		System.out.println();
		System.out.println("Ascending Names");
		ls.stream().sorted(Comparator.comparing(pop->((Cities) pop).getName())).forEach(cs->System.out.println(cs.getName() +" - "+cs.getCityid()));
		
		System.out.println();
		//MAP
		List<String> als = ls.stream().map(ele->ele.getName()+" - "+ele.getElevation()+" m").collect(Collectors.toList());
		System.out.println(als);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//Collection<Integer> colls = Arrays.asList(1000,200,5000,5000);
		
		/*
		 * List<Integer> ai = stream .filter(str->str<=1000)
		 * //.forEach(s->System.out.println(s)); .collect(Collectors.toList());
		 * 
		 * System.out.println(ai);
		 */
		
		/*
		 * List<Student> ls = new ArrayList<Student>(); ls.add(new Student(785,
		 * "Naveen",741852)); ls.add(new Student(775, "Akash",7418)); ls.add(new
		 * Student(745, "Suhas",7418)); ls.add(new Student(715, "Richard",74852));
		 * 
		 * Collection<Integer> ci = colls.stream() .distinct()
		 * .collect(Collectors.toList()); ci.forEach(s->System.out.println(s));
		 * 
		 * 
		 * Optional<Integer> s = stream.max((i,j)->i.compareTo(j));
		 * System.out.println(s.get());
		 */
		
		
		
	}

}


