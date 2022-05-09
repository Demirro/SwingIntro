package de.uk.java;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Insets;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

/**
 * 
 */

/**
 * @author Théo Bouveyron
 *
 */
public class GUI {
	public GUI() {
		JFrame window = new JFrame("Hauptfenster"); // neues Fenster
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); // Design an das Betriebssystem anpassen
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		window.setSize(640, 480); // Initiale Größe des Fensters festlegen
		window.setLayout(new BorderLayout()); // Layout für das Fenster setzen (
		JPanel contentPane = new JPanel(); // neues inneres "fenster" für eine bessere Kontrolle der Elemente
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.PAGE_AXIS)); // Layout des inneren Fensters setzen
		
		JLabel label = new JLabel("Wir können Text ausgeben."); // Neuer Text
		label.setAlignmentX(JPanel.CENTER_ALIGNMENT); // Ausrichtung des Textes (hier mittig)
		label.setAlignmentY(JPanel.CENTER_ALIGNMENT); // Ausrichtung des Textes (hier mittig)
		contentPane.add(label); // dem inneren Fenster den Text hinzufügen
		
		JButton button1 = new JButton("Das ist ein Knopf"); // neuer Knopf
		button1.setMaximumSize(new Dimension(200,50)); // das spezifische Layout macht die Knöpfe immer maximal groß. Dementsprechend wird die Größe des Knopfes über MaximumSize geregelt
		button1.setAlignmentX(JPanel.CENTER_ALIGNMENT); // Ausrichtung des Knopfes (hier mittig)
		button1.setAlignmentY(JPanel.CENTER_ALIGNMENT); // Ausrichtung des Knopfes (hier mittig)
		contentPane.add(button1); // Knopf dem inneren Fenster hinzufügen
		
		window.setContentPane(contentPane); //das innere Fenster als sog. Content Pane festlegen
		
		// Menuleiste und Untermenü erstellen
		JMenuBar menu = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		fileMenu.add(new JMenuItem("Open.."));
		menu.add(fileMenu);
		
		window.add(menu);
		window.setJMenuBar(menu);
		
		
		window.setVisible(true); // Fenster als sichtbar setzen, um es anzuzeigen
		
	}		
}