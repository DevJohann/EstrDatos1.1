package co.edu.unbosque.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainView extends JFrame {

	// Labels
	private JLabel frameTitle;

	// Buttons
	private JButton Btn1;
	private JButton Btn2;
	private JButton Btn3;
	private JButton Btn4;

	public MainView() {
		setSize(600, 600);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		initComponents();
	}

	public void initComponents() {

		// Labels
		frameTitle = new JLabel("Título");
		frameTitle.setBounds(280, 50, 120, 20);
		add(frameTitle);

		// Buttons
		Btn1 = new JButton("Agregar");
		Btn1.setActionCommand("Btn1");
		Btn1.setBounds(40, 500, 120, 24);
		Btn1.setFocusable(false);
		add(Btn1);

		Btn2 = new JButton("Mostrar");
		Btn2.setActionCommand("Btn2");
		Btn2.setBounds(170, 500, 120, 24);
		Btn2.setFocusable(false);
		add(Btn2);

		Btn3 = new JButton("Modificar");
		Btn3.setActionCommand("Btn3");
		Btn3.setBounds(300, 500, 120, 24);
		Btn3.setFocusable(false);
		add(Btn3);

		Btn4 = new JButton("Eliminar");
		Btn4.setActionCommand("Btn4");
		Btn4.setBounds(430, 500, 120, 24);
		Btn4.setFocusable(false);
		add(Btn4);
	}

	public JLabel getFrameTitle() {
		return frameTitle;
	}

	public void setFrameTitle(JLabel frameTitle) {
		this.frameTitle = frameTitle;
	}

	public JButton getBtn1() {
		return Btn1;
	}

	public void setBtn1(JButton btn1) {
		Btn1 = btn1;
	}

	public JButton getBtn2() {
		return Btn2;
	}

	public void setBtn2(JButton btn2) {
		Btn2 = btn2;
	}

	public JButton getBtn3() {
		return Btn3;
	}

	public void setBtn3(JButton btn3) {
		Btn3 = btn3;
	}

	public JButton getBtn4() {
		return Btn4;
	}

	public void setBtn4(JButton btn4) {
		Btn4 = btn4;
	}

}
