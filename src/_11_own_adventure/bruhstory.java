package _11_own_adventure;

import javax.swing.JOptionPane;

public class bruhstory {
public static void main(String[] args) {
	int first = JOptionPane.showOptionDialog(null, "You suddenly feel a call for adventure from the most wild, primal part of your soul. \n Do you take up arms and listen to the most wild, primal part of your soul, \n or do you sit on your couch and be lazy?", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
			new String[] { "Go!", "Sit." }, null);
	if(first == 1) {
		JOptionPane.showMessageDialog(null, "Congratulations. You die at the ripe old age of tomorrow, \n because you were too lazy to get up and drink water.");
	}
	if(first == 0) {
		int second = JOptionPane.showOptionDialog(null, "You pry your body off of the couch with an audible pop. \n Filled with determination, you step outside and... \n remember the fact that it is modern times, and you can't go on adventures these days.", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
		
				new String[] { "Give up", "Keep Going" }, null);
		if(second == 0) {
			JOptionPane.showMessageDialog(null, "Giving up is for losers, and losers don't get to go on adventures.");
		}
		if(second == 1) {
			int third  = JOptionPane.showOptionDialog(null, "You hear a low humming sound, and see a large grey portal in your backyard. \n You barely have time to wonder how you didn't notice it before when you are sucked in. \n You hear a voice, which asks you if you would like to choose the sword or the bow. \n Which do you choose?", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Sword", "Bow" }, null);
			if(third == 0) {
				JOptionPane.showMessageDialog(null,"You have chosen the mighty path of the sword! \n True masters of this art can cut even the tallest of mountains in two!");
						
			}
			if(third == 1) {
				JOptionPane.showMessageDialog(null, "You have chosen the refined path of the bow! \n True masters of this weapon can hit their targets from across the Earth.");
						
			}
			int fourth = JOptionPane.showOptionDialog(null, "Now, set off on your adventure to become the greatest of adventurers!", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Yes!", "no" }, null);
			if(fourth == 0) {
				JOptionPane.showMessageDialog(null, "Congratulations! After years of hard work and grueling missions, you finally achieve your dream of becoming the strongest adventurer!");
						
			}
			if(fourth == 1) {
				JOptionPane.showMessageDialog(null, "Oh. Okay then.");
						
			}
		
		
		
		
		
		
		}
		

	}
	
}
}

