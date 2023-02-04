import java.util.Objects;

public class Match {

	private String hometeam;
	private String awayteam;
	
	public Match(String hometeam, String awayteam) {
		super();
		this.hometeam = hometeam;
		this.awayteam = awayteam;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(awayteam, hometeam);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Match other = (Match) obj;
		return Objects.equals(awayteam, other.awayteam) && Objects.equals(hometeam, other.hometeam);
	}
	
	public String getHometeam() {
		return hometeam;
	}

	public String getAwayteam() {
		return awayteam;
	}

	@Override
	public String toString() {
		return this.hometeam + " Vs " + this.awayteam;
	}
	
	
	
	
}
