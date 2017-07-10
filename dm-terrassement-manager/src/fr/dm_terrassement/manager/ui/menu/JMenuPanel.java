package fr.dm_terrassement.manager.ui.menu;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import fr.dm_terrassement.manager.ui.JAbstractPanel;
import fr.dm_terrassement.manager.ui.JControllerInterface;

public class JMenuPanel extends JAbstractPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1287333845424534320L;

	private JButton categories;
	private JButton images;

	public JMenuPanel(JControllerInterface controller) {
		super(controller);
		this.setupUI();
		this.addActionLisner();
	}


	private void setupUI() {
		this.categories = new JButton("Ajouter une categories");
		this.images = new JButton("Ajouter une image");

		this.setLayout(new BorderLayout());
		this.add(categories,BorderLayout.LINE_START);
		this.add(images,BorderLayout.CENTER);
	}

	private void addActionLisner() {
		this.categories.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				((JMenuController)controller).categoriesOnClick();
			}
		});
		this.images.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				((JMenuController)controller).imagesOnClick();
			}
		});
	}

}
