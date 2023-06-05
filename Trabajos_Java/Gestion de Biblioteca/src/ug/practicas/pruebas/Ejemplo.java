package ug.practicas.pruebas;

import javax.swing.*;

public class Ejemplo extends JFrame{


  private JTextField textfield1;
  private JTextArea textarea1;

  public Ejemplo() {

    setLayout(null);
    setBounds(0,0,540,400);
    setTitle("Ejemplo 7: JTextArea");
    setResizable(false);
    setDefaultCloseOperation(EXIT_ON_CLOSE);

    textarea1=new JTextArea();
    textarea1.setBounds(10,50,400,300);
    add(textarea1);
    

    setVisible(true);

  }

  public static void main(String[] args) {

    new Ejemplo();

  }

}