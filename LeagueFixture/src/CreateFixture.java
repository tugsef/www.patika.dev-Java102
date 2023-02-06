import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CreateFixture {
	Scanner scanner = new Scanner(System.in);
	
	
	
	public ArrayList<String> changeTeamsList(ArrayList<String> teamsList){
		
		ArrayList<String> temporaryList = new ArrayList<>();
		
		for (int i = 1; i < teamsList.size(); i++) {
			temporaryList.add(teamsList.get(i));
		}
		
		temporaryList.add(teamsList.get(0));
		
		return temporaryList;
		
	}
	 public ArrayList<String> teamsList(){
		 
		 
		 ArrayList<String> teamsList = new ArrayList<>();
		 
		 
		 System.out.println("Lütfen Takım sayısı Giriniz...");
		 int teamscount = scanner.nextInt();
		 scanner.nextLine();
		 
		 
			 
			 
		 int count = 0;
		 
		 while(count <teamscount) {
			 System.out.println((count+1) + ".Takım");
			 String team = scanner.nextLine().toUpperCase();
			 
			 
			 if(teamsList.contains(team)||team.equals("")) {
			    System.out.println("Takım Listede Mevcut\n");
			    
			 }else {
				 teamsList.add(team);
				 count++;
			 }
			 
			 
		 }
		 Collections.shuffle(teamsList);
		 
         if(teamscount%2 == 1) {
			 
			 teamsList.add(0,"Bay Geçti");
			 
		 }
         
		 
		 
		 
		 return teamsList;
		 
	 }
	
	
	
	
	public ArrayList<Match> build() {
		
		ArrayList<String> teamsList = teamsList();
		ArrayList<Match> matchList = new ArrayList<>();
		ArrayList<Match> countMatchList= new ArrayList<>();
		
		int week = teamsList.size()-1;
			
		
		String firstteam = teamsList.get(0);
		
		teamsList.remove(firstteam);
		
		
		for (int i = 0; i <week ; i++) {
			matchList.add(new Match(firstteam, teamsList.get((teamsList.size()-1)/2)));
			for (int j = 0; j <(teamsList.size()-1)/2 ; j++) {
				
				matchList.add(new Match(teamsList.get(j), teamsList.get((teamsList.size()-1)-j)));
				
				
				
				
			}
			
			teamsList = changeTeamsList(teamsList);
			
		}
		
	
		for (Match match : matchList) {
			countMatchList.add(match);
		}
		for (Match match : matchList) {
			countMatchList.add(new Match(match.getAwayteam(), match.getHometeam()));
		}
		
		int count = 0;
		int weekcount = 0;
		
		
		for (int i = 0 ;i < countMatchList.size();i++) {
			count++;
			if(i==0) {
				System.out.println("***************LEAGUE FİXTURE***************\n");
				
				System.out.println(String.format("%25s", (weekcount+1) + ":WEEK")+"\n");
				
				
	         }	
			System.out.println(countMatchList.get(i));
         if((teamsList.size()+1)/2==(count)) {
        	
				
				System.out.println("\n***************LEAGUE FİXTURE***************\n");
				if(i <(countMatchList.size()-1)){
				 System.out.println(String.format("%25s",(weekcount+2) + ":WEEK"+"\n"));
				count = 0;
				weekcount++;
				}
			}
         
			
			
		}
		
		
		return matchList;
	}
	
	
}
