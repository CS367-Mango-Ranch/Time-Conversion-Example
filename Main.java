public class Main {

	public static void main(String[] args) {
		System.out.println("----- DB To Website -----");
		System.out.println("Start Time: " + TimeConverter.dbStartTimeToWebsiteTime(0));
		System.out.println("Start Time: " + TimeConverter.dbStartTimeToWebsiteTime(60));
		System.out.println("Start Time: " + TimeConverter.dbStartTimeToWebsiteTime(235));
		System.out.println("Start Time: " + TimeConverter.dbStartTimeToWebsiteTime(720));
		System.out.println("Start Time: " + TimeConverter.dbStartTimeToWebsiteTime(725));
		System.out.println("Start Time: " + TimeConverter.dbStartTimeToWebsiteTime(1439));
		
		System.out.println("Duration: " + TimeConverter.dbDurationToWebsiteTime(0));
		System.out.println("Duration: " + TimeConverter.dbDurationToWebsiteTime(30));
		System.out.println("Duration: " + TimeConverter.dbDurationToWebsiteTime(60));
		System.out.println("Duration: " + TimeConverter.dbDurationToWebsiteTime(90));
		System.out.println("Duration: " + TimeConverter.dbDurationToWebsiteTime(235));
		System.out.println("Duration: " + TimeConverter.dbDurationToWebsiteTime(1205));
		System.out.println("-------------------------");
		
		System.out.println();
		
		System.out.println("----- Website To DB -----");
		System.out.println("Start Time: " + TimeConverter.websiteStartTimeToDBTime(12, 00, false));
		System.out.println("Start Time: " + TimeConverter.websiteStartTimeToDBTime(1, 00, false));
		System.out.println("Start Time: " + TimeConverter.websiteStartTimeToDBTime(3, 55, false));
		System.out.println("Start Time: " + TimeConverter.websiteStartTimeToDBTime(12, 00, true));
		System.out.println("Start Time: " + TimeConverter.websiteStartTimeToDBTime(12, 05, true));
		System.out.println("Start Time: " + TimeConverter.websiteStartTimeToDBTime(11, 59, true));
		
		System.out.println("Duration: " + TimeConverter.websiteDurationToDBTime(0, 00));
		System.out.println("Duration: " + TimeConverter.websiteDurationToDBTime(0, 30));
		System.out.println("Duration: " + TimeConverter.websiteDurationToDBTime(1, 00));
		System.out.println("Duration: " + TimeConverter.websiteDurationToDBTime(1, 30));
		System.out.println("Duration: " + TimeConverter.websiteDurationToDBTime(3, 55));
		System.out.println("Duration: " + TimeConverter.websiteDurationToDBTime(20, 05));
		
		
		System.out.println("-------------------------");
	}

}
