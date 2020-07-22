package msq;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sample {

	public static void main(String[] args) {

		List< List<String> > applications = new ArrayList<>();
		applications.add(Arrays.asList("Boateng","6.1","22","24","45"));
		applications.add(Arrays.asList("Kaka","6","22","1","1"));
		applications.add(Arrays.asList("Ronalod","5.8","21","120","0"));
		applications.add(Arrays.asList("Suarez","5.9","20","100","1"));

		List< List<String> > selectionStatus = getSelectionStatus(applications);

		for(List<String> list : selectionStatus) {
			for(String val : list) {
				System.out.print(val+" ");
			}
			System.out.println();
		}
	}



	public static List< List<String> > getSelectionStatus(List< List<String> > applications){

		List< List<String> > response = new ArrayList<>();
		List<UserProfile> originalUserList = new ArrayList<>();

		Map<String, List<UserProfile>> map = new HashMap<>();
		map.put("BOTH", new ArrayList<>());
		map.put("STRIKER", new ArrayList<>());
		map.put("DEFENDER", new ArrayList<>());
		map.put("NONE", new ArrayList<>());

		for(List<String> list : applications) {
			String[] arr = list.toArray(new String[list.size()]);
			UserProfile u = new UserProfile(arr);
            System.out.println("user profile array="+u);

			originalUserList.add(u);

			if(isStriker(u) && isDefender(u)) {
				map.get("BOTH").add(u);
			}
			if(isStriker(u)) {
				map.get("STRIKER").add(u);
			}
			if(isDefender(u)) {
				map.get("DEFENDER").add(u);
			}
			if(!isStriker(u) && !isDefender(u)) {
				map.get("NONE").add(u);
			}
		}

		int bothCount = map.get("BOTH").size();
		int strikerCount = map.get("STRIKER").size();
		int defenderCount = map.get("DEFENDER").size();
		int noneCount = map.get("NONE").size();

		while(strikerCount!=defenderCount && bothCount>0) {
			if(strikerCount<defenderCount) {//fill strikers
				UserProfile u = map.get("BOTH").remove(bothCount-1);
				bothCount--;

				map.get("STRIKER").add(u);
				strikerCount++;
			}
			else {
				UserProfile u = map.get("BOTH").remove(bothCount-1);
				bothCount--;

				map.get("DEFENDER").add(u);
				defenderCount++;
			}
		}

		while(bothCount>=2) {
			UserProfile u = map.get("BOTH").remove(bothCount-1);
			bothCount--;

			map.get("STRIKER").add(u);
			strikerCount++;

			u = map.get("BOTH").remove(bothCount-1);
			bothCount--;

			map.get("DEFENDER").add(u);
			defenderCount++;
		}

		if(bothCount==1) {
			UserProfile u = map.get("BOTH").remove(0);
			map.get("NONE").add(u);
			noneCount++;
		}

		while(defenderCount!=strikerCount) {
			if(strikerCount<defenderCount) {//fill strikers
				UserProfile u = map.get("DEFENDER").remove(defenderCount-1);
				defenderCount--;

				map.get("NONE").add(u);
				noneCount++;
			}
			else {
				UserProfile u = map.get("STRIKER").remove(strikerCount-1);
				strikerCount--;

				map.get("NONE").add(u);
				noneCount++;
			}
		}

		for(UserProfile u: originalUserList) {

			if(map.get("STRIKER").contains(u)) {
				response.add(Arrays.asList(u.getName(),"SELECT","STRIKER"));
			}
			else if(map.get("DEFENDER").contains(u)) {
				response.add(Arrays.asList(u.getName(),"SELECT","DEFENDER"));
			}
			else {
				response.add(Arrays.asList(u.getName(),"REJECT","NA"));
			}

		}


		return response;
	}

	private static boolean isDefender(UserProfile u) {
    boolean ans= false;
    if(Integer.parseInt(u.getDefends())>=30) {
    	ans=true;
    }

    return ans;
  }

  private static boolean isStriker(UserProfile u) {
	    boolean ans= false;
	    if(Integer.parseInt(u.getScores())>=50) {
	    	ans=true;
	    }
	    return ans;
  }

  public static class UserProfile{
		String name;
		String height;
		String bmi;
		String scores;
		String defends;
		public UserProfile(String... profile){
			this.name=profile[0];
			this.height=profile[1];
			this.bmi=profile[2];
			this.scores=profile[3];
			this.defends=profile[4];
		}
    public String getName() {
    return name;}
    public String getHeight() {
    return height;}
    public String getBmi() {
    return bmi;}
    public String getScores() {
    return scores;}
    public String getDefends() {
    return defends;}
	}


}