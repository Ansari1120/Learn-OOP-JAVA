package audio;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Main {

	public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
File file=new File("music.wav");
AudioInputStream audiostream=AudioSystem.getAudioInputStream(file);
Clip clip=AudioSystem.getClip();
clip.open(audiostream);
String response="";
Scanner scanner=new Scanner(System.in);
while(!response.equals("Q")) {
	System.out.println("p=play,s=stop,r=reset,q=quit");
	System.out.println("Enter Your Choice : ");
	response=scanner.next();
	response=response.toUpperCase();
	switch(response) {
	case ("P") : clip.start();
	break;
	case ("S") : clip.stop();
	break;
	case ("R") : clip.setMicrosecondPosition(0);
	break;
	case ("Q") : clip.close();
	break;
	default : 
		System.out.println("not a valid value");
	}

}
System.out.println("Music player closed");

	}

}
