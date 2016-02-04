package soundTrackToLife;

import java.net.URI;

import javax.swing.JOptionPane;

public class SoundTrackToLife {

	public static void main(String[] args) {

		// 1. Adjust this pop-up to find out what mood the user is in.
		int userMood = JOptionPane.showOptionDialog(null, "How Do You Feel Today?", "Mood Music", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Happy", "Sad", "Angry" }, null);

		/* Link to a song for their mood */
		String moodSong;

		// 2. Their answer is stored in the userMood variable. Print it out.
		System.out.println("The user mood is: " + userMood);
		switch (userMood) {
		case 0:
			/* The user is Happy */
			System.out.println("The user is Happy today :)");
			moodSong = "http://www.youtube.com/watch?v=y6Sxv-sUYtM";
			break;
		case 1:
			/* The user is Sad */
			System.out.println("The user is Sad today :(");
			moodSong = "http://bit.ly/video-for-sad";
			break;
		case 2:
			/* The user is Angry */
			System.out.println("The user is Angry today x-(");
			moodSong = "http://bit.ly/video-for-angry";
			break;
		default:
			/* By default, the user is Happy */
			System.out.println("The user is Happy today :)");
			moodSong = "http://bit.ly/video-for-happy";
			break;
		}

		// 3. If they are in a stressed mood, use the playVideo method to play a
		// calming song from YouTube.
		playVideo(moodSong);

		// 4. Play different songs for other moods.

		// If you are seeing ads at the beginning of your videos, install
		// Adblock.

	}

	static void playVideo(String youTubeLink) {
		try {
			URI uri = new URI(youTubeLink);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

/**
 * If you can’t think of any, here are some you can use...
 * bit.ly/video-for-happy bit.ly/video-for-sad bit.ly/video-for-angry
 **/
