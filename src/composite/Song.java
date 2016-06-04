package composite;

public class Song extends SongComponent {
	String songName;
	String bandName;
	int releaseYear;
	
	public Song(String nSongName, String nBandName, int nReleaseYear) {
		this.songName = nSongName;
		this.bandName = nBandName;
		this.releaseYear = nReleaseYear;
	}

	public String getSongName() {
		return songName;
	}

	public String getBandName() {
		return bandName;
	}

	public int getReleaseYear() {
		return releaseYear;
	}
	
	public void displaySongInfo() {
		System.out.println(getSongName()+ " was recorded by "+ getBandName()+ " in "+ getReleaseYear() );
	}
}
