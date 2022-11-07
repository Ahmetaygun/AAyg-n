//AHMET AYGÜN 02220224565
package ogrencikayit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;
import javax.swing.table.DefaultTableModel;

public class ogrencikayit extends JFrame{

public static void main(String[] args) {
    ogrencikayit frameTabel = new ogrencikayit();  
}
JButton add = new JButton("ekle");
JButton back = new JButton("geri");
JPanel panel = new JPanel();
JLabel name  = new JLabel("adınız:");
JLabel surname = new JLabel("soyadınız:");
JLabel number = new JLabel("numaranız:");
JTextField textname= new JTextField(15);
JTextField textsurname = new JTextField(15);
JTextField textnumber = new JTextField(15);

ogrencikayit(){
    super("----- ÖGRENCİ KAYIT -----");
    setSize(400,400);
    setLocation(500,280);
    setResizable(false);
    panel.setLayout(null);

    name.setBounds(70, 20, 100, 30);
    surname.setBounds(70, 50, 100, 30);
    number.setBounds(70, 80, 100, 30);
    textname.setBounds(170, 25, 150, 20);
    textsurname.setBounds(170, 55, 150, 20);
    textnumber.setBounds(170, 85, 150, 20);
    add.setBounds(70, 120, 80, 20);
    back.setBounds(270, 330, 80, 20);

    panel.add(add);
    panel.add(back);
    panel.add(name);
    panel.add(surname);
    panel.add(number);
    panel.add(textname);
    panel.add(textsurname);
    panel.add(textnumber);

    getContentPane().add(panel);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
    actionadd();
    actionback();
    }

    public void actionback(){
    back.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent ae){
    setVisible(false);
    }});}

    public void actionadd(){
    add.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent ae){
            String name = textname.getText().toString();
            String surname = textsurname.getText().toString();
            String number = textnumber.getText().toString();

            try {
                FileWriter writer = new FileWriter("src/ogrenci1.txt", true);
                writer.write(name);
                writer.write(System.getProperty("line.separator"));
                writer.write(surname);
                writer.write(System.getProperty("line.separator"));
                writer.write(number);
                writer.write(System.getProperty("line.separator"));
                writer.close();
                JOptionPane.showMessageDialog(rootPane, "kayıt basarılı");

            } catch (Exception e) {
       JOptionPane.showMessageDialog(rootPane, "Error");
          }

            }
        });
        }  
      

        }
