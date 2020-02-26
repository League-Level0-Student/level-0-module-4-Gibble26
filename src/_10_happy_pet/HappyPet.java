package _10_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;
	
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
		int pet = JOptionPane.showOptionDialog(null, "What Pet Do You Want?", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "Dog", "Cat", "Monkey" }, null);

		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
		for (int i = 0; i < 30; i++) {
			int task = JOptionPane.showOptionDialog(null, "What do you want to do with your pet?", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Cuddle", "Feed", "Walk" }, null);

			// 5. Use user input to call the appropriate method created in step 4.

			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.\
			
		

	

if(pet == 0 && task == 0) {
	cuddle(pet);
	
}
if(pet == 1 && task == 0) {
	cuddle(pet);
}

if(pet == 2 && task == 0) {
	cuddle(pet);
}
if(pet == 0 && task == 1) {
	food(pet);
}
if(pet == 1 && task == 1) {
	food(pet);
}
if(pet == 2 && task == 1) {
	food(pet);
}
if(pet == 0 && task == 2) {
	walk(pet);
}
if(pet == 1 && task == 2) {
	walk(pet);
}
if(pet == 2 && task == 2) {
	walk(pet);
}
if (happinessLevel > 100) {
	JOptionPane.showMessageDialog(null, "Your pet loves you!");
	break;
}
else if(happinessLevel < 0) {
	JOptionPane.showMessageDialog(null, "You and your monkey got arrested for assault. Good Job.");
	break;
}
			}
	}
	
	static void cuddle(int pet) {
		if(pet == 0) {
		JOptionPane.showMessageDialog(null, "The Dog Wagged His Tail!");
		happinessLevel = happinessLevel + 25;
		}
		if(pet==1) {
			JOptionPane.showMessageDialog(null, "The Cat Purred!");
			happinessLevel = happinessLevel + 25;
		}
		if(pet==2) {
			JOptionPane.showMessageDialog(null, "Monkey Screeched and Slapped You!");
			happinessLevel = happinessLevel - 0;
		}
	}
	static void food(int pet) {
		if(pet == 0) {
		JOptionPane.showMessageDialog(null, "The Dog Loved His Kibble!");
		happinessLevel = happinessLevel + 15;
		}
		if(pet == 1) {
			JOptionPane.showMessageDialog(null, "The Cat Ate His Tuna!");
			happinessLevel = happinessLevel + 25;
		}
		if(pet == 2) {
			JOptionPane.showMessageDialog(null, "The Monkey Threw Its Own Feces At You!");
			happinessLevel = happinessLevel - 0 ;
		}
	}
	static void walk(int pet) {
		if(pet == 0) {
			JOptionPane.showMessageDialog(null, "The Dog Enjoyed His Walk!");
			happinessLevel = happinessLevel + 30;
		}
		if(pet == 1) {
			JOptionPane.showMessageDialog(null, "The Cat Hated The Walk, But Appreciated That You Care For Him.");
			happinessLevel = happinessLevel + 15;

		}
		if(pet == 2) {
			JOptionPane.showMessageDialog(null, "The Monkey Ran Across The Street And Assaulted An Innocent Civilian!");
			happinessLevel = happinessLevel - 1000; 

		}
	}
	
	
	}

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	
