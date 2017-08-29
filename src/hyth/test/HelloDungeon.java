package hyth.test;

import net.slashie.libjcsi.wswing.WSwingConsoleInterface;
import net.slashie.libjcsi.ConsoleSystemInterface;
import net.slashie.libjcsi.CSIColor;
import java.util.Properties;
 
public class HelloDungeon{
 
	public static void main(String[] args){
		Properties text = new Properties();
		text.setProperty("fontSize","20");
		text.setProperty("font", "Courier");
		ConsoleSystemInterface csi = null;
		try{
			csi = new WSwingConsoleInterface("My little Java Roguelike - Programming is fun", text);
		}
		catch (ExceptionInInitializerError eiie) {
			System.out.println("*** Error: Swing Console Box cannot be initialized. Exiting...");
			eiie.printStackTrace();
			System.exit(-1);
		}
		csi.print(0,0, "Welcome to the Dungeons of Doom!", CSIColor.WHITE);
	}
}