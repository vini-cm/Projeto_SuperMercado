package views;

import javax.swing.JPanel;
import javax.swing.JLabel;

public class TelaDeCompra extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public TelaDeCompra() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Compra");
		lblNewLabel.setBounds(195, 148, 46, 14);
		add(lblNewLabel);

	}

}
