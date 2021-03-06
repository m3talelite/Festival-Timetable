import java.io.IOException;

/**
 * Example on how 
 * @author Julian G. West
 *
 */
public class MainTest {

	public static void main(String[] args) throws IOException {
		
		Festival f = new Festival();
		
		Artist me = new Artist("Me", "Jazz", "");
		Artist him = new Artist("Him", "Hardcore", "Mentally unstable");
		Artist them = new Artist("Them", "Orchestra", "Encompasses 10 men and 1 elephant");
		f.addArtist(me);
		f.addArtist(them);
		f.addArtist(him);
		
		Stage mainStage = new Stage("Main Stage", 150, true);
		Stage purpleStage = new Stage("Purple Stage", 75, false);
		f.addStage(mainStage);
		f.addStage(purpleStage);
		
		Performance theFirst = new Performance(10.00f, 11.30f, 80, f.getStages().get(0));
		theFirst.addArtists(f.getArtists().get(0));
		Performance theSecond = new Performance(10.30f, 11.45f, 60, f.getStages().get(1));
		theSecond.addArtists(f.getArtists().get(1));
		theSecond.addArtists(f.getArtists().get(2));
		
		f.addPerformance(theFirst);
		f.addPerformance(theSecond);
		
		Timetable test = new Timetable("testival");		
		
		test.setFestival(f);
		
		test.saveFestival();
		
		test.openFestival();
		
		
		test.printFestival();
	
	}

}
