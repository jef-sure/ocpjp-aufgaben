package _10_11;

public class TestDelivery {

	public static void main(String[] args) {
		PostWorker w = new PostWorker();
		for(int i = 0; i < 5; ++i)
			new Thread(w).start();
		w.deliver("I am so blue I'm greener than purple.");
		w.deliver("I stepped on a Corn Flake, now I'm a Cereal Killer");
		w.deliver("Llamas eat sexy paper clips");
		w.deliver("Banana error.");
		w.deliver("Everyday a grape licks a friendly cow");
		w.deliver("On a scale from one to ten what is your favourite colour of the alphabet.");
		w.deliver("The sparkly lamp ate a pillow then punched Larry.");
		w.deliver("Look, a distraction!");
		w.deliver("Screw world peace, I want a pony");
		w.deliver("What do you think about the magical yellow unicorn who dances on the rainbow with a spoonful of blue cheese dressing?");
		w.deliver("Life is like a box of chocolates some of it sucks");
		w.deliver("I am puzzled how a manatee can kill a Mario in 888 thousand seconds squared.");
		w.deliver("My world is where everybody is a pony and we all eat rainbows and poop butterflies");
		w.deliver("If your canoe is stuck in a tree with the headlights on, how many pancakes does it take to get to the moon?");
		w.deliver("finish your work");
	}

}
