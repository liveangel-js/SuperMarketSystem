package view;
import javax.swing.UIManager;

import org.jvnet.substance.SubstanceLookAndFeel;
import org.jvnet.substance.button.ClassicButtonShaper;
import org.jvnet.substance.skin.*;

public class Skin {
	/**
	 * 
	 */
	public static  void set() {
		// װ�ؿ�ѡ�������
		try {
			UIManager.setLookAndFeel(new SubstanceBusinessBlackSteelLookAndFeel());
			SubstanceLookAndFeel.setCurrentButtonShaper(new ClassicButtonShaper() );
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
