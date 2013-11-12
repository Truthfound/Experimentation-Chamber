import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class DMsBFF {
	public static void main(String[] args) {
		DMsBFF d = new DMsBFF();
		d.runMyFrame();
		Player john = new Player(12, 14, 10, 16, 18, 30);
		System.out.println("Str = " + john.Mod(john.Str));
		System.out.println("Dex = " + john.Mod(john.Dex));
		System.out.println("Con = " + john.Mod(john.Con));
		System.out.println("Int = " + john.Mod(john.Int));
		System.out.println("Wis = " + john.Mod(john.Wis));
		System.out.println("Cha = " + john.Mod(john.Cha));
	}
	public void runMyFrame(){
		JFrame stats = new JFrame();
		JButton b1 = new JButton("Stats");
		b1.setVerticalTextPosition(AbstractButton.CENTER);
		b1.setHorizontalTextPosition(AbstractButton.LEADING);
		b1.setActionCommand("Press");
		b1.addActionListener((ActionListener) this);
		JButton b2 = new JButton("Items");
		b2.setVerticalTextPosition(AbstractButton.CENTER);
		b2.setHorizontalAlignment(AbstractButton.LEADING);
		b2.setActionCommand("Press");
		b2.addActionListener((ActionListener) this);
	}
	public void actionPerformed(ActionEvent e){
		if ("Press".equals(e.getActionCommand())){
			System.out.println("Test Successful!");
		}
		else {
			System.exit(0);
		}
	}

}