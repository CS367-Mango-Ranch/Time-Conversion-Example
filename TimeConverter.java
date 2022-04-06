/**
 * Utility to convert between database (hour & min sense midnight) time and website (human readable) time
 * @author Eric Golde
 *
 */
public class TimeConverter {

	private TimeConverter() {};
	
	//------------------ DB -> Website -------------------------------------
	public static String dbStartTimeToWebsiteTime(int minutes) {
	    int h = minutes / 60;
	    int m = minutes % 60;

	    String pm = (h >= 12) ? "PM" : "AM";

	    //display hours
	    int dh;

	    //display min
	    String dm;
	    

	    if(h == 0) {
	        dh = 12;
	    }
	    else if(h > 12) {
	        dh = h - 12;
	    }
	    else {
	        dh = h;
	    }

	    dm = ((m < 10) ? "0" : "") + m;

	    return dh + ":" + dm + " " + pm;
	}

	public static String dbDurationToWebsiteTime(int minutes) {
	    int h = minutes / 60;
	    int m = minutes % 60;

	    //display min
	    String dm;

	    dm = ((m < 10) ? "0" : "") + m;

	    return h + " hours and " + dm + " minutes.";
	}

	//------------------ Website -> DB -------------------------------------
	
	public static int websiteStartTimeToDBTime(int hour, int minute, boolean pm) {
		
		int result = 60 * hour + minute;
		
		if(hour == 12) {
			result -= 720; //12 * 60 = 720
		}
		
		if(pm) {
			result += 720; //12 * 60 = 720
		}
		
		return result;
	}
	
	public static int websiteDurationToDBTime(int hour, int minute) {
		return 60 * hour + minute;
	}
	
}
