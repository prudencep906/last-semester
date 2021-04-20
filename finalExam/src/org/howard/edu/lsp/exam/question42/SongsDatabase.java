package org.howard.edu.lsp.exam.question42;
import java.util.*;

public class SongsDatabase {
	private Map<String, Set<String>> map = new HashMap<String, Set<String>>();
				
	/* Add a song title to a genre */
	public void addSong(String genre, String songTitle) {
		
		if(map.containsKey(genre)) {
			map.get(genre).add(songTitle);
			}
		else {
			Set<String> newSet = new HashSet<String>();
            newSet.add(songTitle);
            map.put(genre,newSet);
            }
		}
   
    
    /* Return the Set that contains all songs for a genre */
	public Set<String> getSongs(String genre) {
		
		return map.get(genre);
		
		}

	/* Return genre, i.e., jazz, given a song title */
	public String getGenreOfSong(String songTitle) {
		for (Map.Entry<String, Set<String>> entry : map.entrySet()) {
            
            if(entry.getValue().contains(songTitle)){
                return entry.getKey();
            }
        
        }

        return "No value found";
	}


}
