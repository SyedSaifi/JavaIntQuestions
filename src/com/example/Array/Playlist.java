package com.example.Array;

public class Playlist {

	public static void main(String[] args) {
		String[] song = {"a","b","c","d"};
		System.out.println(playlist(song,1,"d"));

	}
	
	static int playlist(String[] songs, int k, String q) {
        int revCount = 0;
        int forwardCount = 0;
        
        for(int i = k; i < songs.length ; i++){
            if(songs[i].equalsIgnoreCase(q))
                break;
            forwardCount++;
            if(i == songs.length - 1)
                i=0;
        }
        
        for(int j = k; j >= 0 ; j--){
            if(songs[j].equalsIgnoreCase(q))
                break;
            revCount++;
            if(j == 0)
                j=songs.length;
        }
        
        if(revCount<forwardCount)
            return revCount;
        else
            return forwardCount;

    }

}
