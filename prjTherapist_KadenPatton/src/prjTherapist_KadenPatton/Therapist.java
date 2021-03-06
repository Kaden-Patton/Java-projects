// Therapist project by Kaden Patton December 3rd 2019
package prjTherapist_KadenPatton;

import java.util.*;

public class Therapist {

	private List<String> history;
	private Set<String> hedgeSet;
	private Set<String> qualifierSet;
	private Map<String, String> replacementMap;
	
	public Therapist() {
		history = new ArrayList<String>();
		
		hedgeSet = new HashSet<String>();
		hedgeSet.add("Please tell me more.");
		hedgeSet.add("I have heard the same thing from many of my patients.");
		hedgeSet.add("We have made a lot of progress today, perhaps we should take a break.");
		
		qualifierSet = new HashSet<String>();
		qualifierSet.add("And why exactly do you say that ");
		qualifierSet.add("You mentioned that ");
		qualifierSet.add("So, you think that ");
		
		replacementMap = new HashMap<String, String>();
		replacementMap.put("i", "you");
		replacementMap.put("me", "you");
		replacementMap.put("my", "your");
		replacementMap.put("am", "are");
		
	}
	
	
	public String reply(String userString)
	{
		String reply = "";
		int choice = randomInt(1, 4);
		
		
		if(userString.trim().contentEquals(""))
		{
			return "Please, talk to me.";
		}
		
		if(choice == 1)
		{
			reply = hedge(hedgeSet);
		}
		else if(choice == 2 || choice == 3)
		{
			reply = qualifier(qualifierSet) + changePerson(userString);
		}
		else if(history.size() > 3)
		{
			reply = "Earlier you said that " + changePerson(selectRandom(history));
		}
		else
		{
			reply = hedge(hedgeSet);
		}
		
		history.add(userString);
		return reply;
		
	}
	
	private String hedge(Set<String> hedgeSet)
	{
		return selectRandom(hedgeSet);
	}
	
	private String qualifier(Set<String> qualifierSet)
	{
		return selectRandom(qualifierSet);
	}
	
	private String changePerson(String str)
	{
		Scanner tokens = new Scanner(str);
		String result = "";
		
		while(tokens.hasNext())
		{
			String currentWord = tokens.next();
			String replacementWord = findReplacement(currentWord);
			result += replacementWord + " ";
		}
		
		return result;
	}
	
	
	private String findReplacement(String word)
	{
		word = word.toLowerCase();
		if(replacementMap.containsKey(word))
		{
			return (String) replacementMap.get(word);
		}
		else
		{
			return word;
		}
	}
	
	private String selectRandom(Collection<String> col) 
	{
		int index = randomInt(0, col.size() - 1);
		Iterator<String> iter = col.iterator();
		for(int i = 0; i < index; i++)
		{
			iter.next();
		}
		
		return iter.next();
	}
	
	
	private int randomInt(int low, int high)
	{
		return (int)(low + Math.random() * (high - low + 1));
	}
	
	
}
