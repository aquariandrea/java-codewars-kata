public class TheOffice{
	public static String outed(Person[] meet, String boss) {
		double totalHappiness = 0;
		for(Person each : meet){
			totalHappiness = totalHappiness + each.happiness;
			if(each.name.equals(boss)){
				totalHappiness = totalHappiness + each.happiness;
			}
		}
		return (totalHappiness/(meet.length) <= 5) ? "Get Out Now!" : "Nice Work Champ!";
	}
}