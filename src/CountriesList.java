// what happens if modification is done on the GiHhub -> after the modification you have to do the pull request 
// and have the new version on the harddrive 


//files for branch two
//one more comment added to do the second merge

//blue version was done to check the GIT second branch


import java.util.HashMap;

public class CountriesList {

	public static void main(String[] args) {
	
		String[] countriesList = new String[8];
		HashMap<String, Integer> hash = new HashMap();
		
		countriesList[0] = "Ukraine";
		countriesList[1] = "Egypt";
		countriesList[2] = "Canada";
		countriesList[3] = "Ukraine";
		countriesList[4] = "USA";
		countriesList[5] = "Canada";
		countriesList[6] = "USA";
		countriesList[7] = "Canada"; // list of Countries
		
	
		for (String country : countriesList){
		//for (int i=0; i<countriesList.length; i++ ){
		//	String tmp = countriesList[i];
			int counter = 0;
			
			if (!hash.containsKey(/*tmp*/ country)){				
				for (int j=0; j<countriesList.length;j++){
					if (/*tmp*/country.equalsIgnoreCase(countriesList[j])){
						counter++;
					}
				}	
				hash.put(/*tmp*/country, counter);				
			}
		}
			System.out.println(hash.toString());					
	}
}
