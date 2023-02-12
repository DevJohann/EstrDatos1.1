package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.AppDTO;
import co.edu.unbosque.view.MainView;

public class Controller implements ActionListener {

	// Frame
	MainView MV;

	// Model
	AppDTO DTO;

	public Controller() {
		MV = new MainView();
		DTO = new AppDTO();
		funcionar();
	}

	public void funcionar() {
		setListeners();
	}

	public void setListeners() {
		MV.getBtn1().addActionListener(this);
		MV.getBtn2().addActionListener(this);
		MV.getBtn3().addActionListener(this);
		MV.getBtn4().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {
		case "Btn1":
			// System.out.println("Botón presionado");
			String newValue = JOptionPane.showInputDialog(null, "Ingrese el valor a agregar");
			if (newValue != null) {
				DTO.add(newValue);
				JOptionPane.showMessageDialog(null, "Agregado correctamente");
			}

			break;
		case "Btn2":
//			System.out.println("Botón presionado");
			if (!(DTO.getMainDB().size() == 0)) {
				JOptionPane.showMessageDialog(null, DTO.search());
			} else {
				JOptionPane.showMessageDialog(null, "No hay información para mostrar");
			}

			break;
		case "Btn3":
//			System.out.println("Botón presionado");
			if (DTO.getMainDB().size() == 0) {
				JOptionPane.showMessageDialog(null, "No hay información para modificar");
				break;
			}
			String targetIndex = JOptionPane.showInputDialog("Ingrese la posición a modificar");
			String Value = JOptionPane.showInputDialog("Ingrese el nuevo valor para la posición " + targetIndex);
			if (targetIndex != null && Value != null) {
				DTO.modify(Integer.parseInt(targetIndex) - 1, Value);
				JOptionPane.showMessageDialog(null, "Actualizado correctamente");
			}
			break;
		case "Btn4":
//			System.out.println("Botón presionado");
			if (DTO.getMainDB().size() == 0) {
				JOptionPane.showMessageDialog(null, "No hay información para modificar");
				break;
			}
			String deleteTarget = JOptionPane.showInputDialog(null, "Ingrese la posición del elemento a eliminar");
			if (deleteTarget != null) {
				DTO.delete(deleteTarget);
				JOptionPane.showMessageDialog(null, "Eliminado correctamente");
			}
			break;
		default:
			System.out.println("Error detectando el botón");
			break;
		}
	}
}
