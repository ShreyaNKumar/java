//
//package Projects;
//import java.io.File;
//import java.util.ArrayList;
//import java.util.List;
//import javax.sound.sampled.AudioInputStream;
//import javax.sound.sampled.AudioSystem;
//import javax.sound.sampled.Clip;
//import javax.swing.JOptionPane;
//
//
//public class MusicPlayer {
//
//	public static void main(String[] args) {
//		String filepath = "D:/Shreya/imp_notes/Mora-Saiyaan-Fuzon.au";
//		PlayMusic(filepath);
//		JOptionPane.showMessageDialog(null, "Press OK to stop playing");
//		
//	}
//	
//	public static Clip PlayMusic(String location) {
//		try {
//			File musicPath = new File(location);
//			
//			if(musicPath.exists()) {
//				AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
//				Clip clip = AudioSystem.getClip();
//				clip.open(audioInput);
//				clip.start();
//				
//			}
//			else {
//				System.out.println("Can't find File");
//			}
//		}
//		
//		catch(Exception e) {
//			System.out.println(e);
//		}
//		
//		return null;
//	}
//
//}

package Projects;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class MusicPlayer{
	public static void main(String[] args) {
		List<String> musicToPlay = new ArrayList<String>();
		
		musicToPlay.add("D:/Shreya/imp_notes/Phir-Le-Aya-Dil-Barfi-128-Kbps.au");
		musicToPlay.add("D:/Shreya/imp_notes/Mora-Saiyaan-Fuzon.au");
		musicToPlay.add("D:/Shreya/imp_notes/Saware-Phantom-128-Kbps.au");
		
		try {
			 for(int i=0; i< musicToPlay.size(); i++) {
				 System.out.println("Playing " + musicToPlay.get(i));
				 Clip currentClip = PlayMusic(musicToPlay.get(i));
				 while(currentClip.getMicrosecondLength() != currentClip.getMicrosecondPosition()) {
					  
				 }
			 }
		}
		
		catch(Exception e) {
			System.out.println(e);
		}
		
	}
	
	public static Clip PlayMusic(String location) {
		 try {
			 
			 File musicPath = new File(location);
			 
			 if(musicPath.exists()) {
				 AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
				 Clip clip = AudioSystem.getClip();
				 clip.open(audioInput);
				 clip.start();
				 return clip;
			 }
			 else {
				 System.out.println("Can't find file");
			 }
			 
		 }
		 catch(Exception e){
			 System.out.println(e);
		 }
		 
		 return null;
	}
	
}



