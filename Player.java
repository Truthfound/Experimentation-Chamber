import javax.swing.JFrame;
import javax.swing.*;
public class Player {
	public static int Str;
	public static int Dex;
	public static int Con;
	public static int Int;
	public static int Wis;
	public static int Cha;
	public Player(int Str1, int Dex1, int Con1, int Int1, int Wis1, int Cha1){
		Str = Str1;
		Dex = Dex1;
		Con = Con1;
		Int = Int1;
		Wis = Wis1;
		Cha = Cha1;
	}
	public int Mod(int stat){
		return (stat/2) - 5;
	}
}