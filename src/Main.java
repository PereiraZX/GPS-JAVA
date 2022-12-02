import java.awt.*;
import javax.swing.*;
import javax.swing.JRadioButton;

public class Main {
    
    public static void main(String[] args){
        
    JFrame frame = new JFrame();


        //criando o painel
        JPanel painel = new JPanel();
        painel.setLayout(null);
        
        
        //criando as labels
        JLabel lab_origem = new JLabel("ORIGEM");
        painel.add(lab_origem);

        JLabel lab_destino = new JLabel("DESTINO");
        painel.add(lab_destino);

        JLabel lab_combustivel = new JLabel("COMBUSTIVEL");
        painel.add(lab_combustivel);

        

        //criando os inputs
        JTextField input_origem = new JTextField(20);
        painel.add(input_origem);
        
        JTextField input_destino = new JTextField(20);
        painel.add(input_destino);

        JTextField input_combustivel = new JTextField(20);
        painel.add(input_combustivel);
        
        JRadioButton c1 = new JRadioButton("Álcool");    
        JRadioButton c2 = new JRadioButton("Gasolina");    
        JRadioButton c3 = new JRadioButton("Diesel");  
        
        painel.add(c1); painel.add(c2); painel.add(c3);  

        JButton bt_calcular = new JButton("CALCULAR");
        painel.add(bt_calcular);


        
        GpsEvent event = new GpsEvent(input_origem, input_destino, c1, c2, c3);
        
        bt_calcular.addActionListener(event);

        //posicionamento dos elementos
        lab_origem.setBounds(40, 50, 60, 25);
        lab_destino.setBounds(40, 100, 60, 25);

        input_origem.setBounds(110, 50, 130, 25);
        input_destino.setBounds(110, 100, 130, 25);

        lab_combustivel.setBounds(40, 150, 100, 25);
        c1.setBounds(40,175,70,30);    
        c2.setBounds(115,175,75,30);  
        c3.setBounds(195,175,70,30); 

        bt_calcular.setBounds(100,300,100,30);
        

        frame.setTitle("EXGPS");
        frame.setSize(320, 420);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(painel);
        frame.setVisible(true);


        //estilização

        //background dos elementos
        painel.setBackground(Color.decode("#8470FF"));
        bt_calcular.setBackground(Color.decode("#ffffff"));
        c1.setBackground(Color.decode("#ffffff")); 
        c2.setBackground(Color.decode("#ffffff")); 
        c3.setBackground(Color.decode("#ffffff"));


        //cor da fonte das labels
        lab_origem.setForeground(Color.decode("#ECDB00"));
        lab_destino.setForeground(Color.decode("#ECDB00"));
        lab_combustivel.setForeground(Color.decode("#ECDB00"));


        //fonte e tam das labels
        lab_origem.setFont(new Font("Arial", 1, 13));
        lab_destino.setFont(new Font("Arial", 1, 13));
        lab_combustivel.setFont(new Font ("Arial", 1, 13));


        //fonte e tam dos radios
        c1.setFont(new Font("Arial", 1, 12));
        c2.setFont(new Font("Arial", 1, 12));
        c3.setFont(new Font("Arial", 1, 12));


        //Removendo bordas
        input_origem.setBorder(null);
        input_destino.setBorder(null);
        bt_calcular.setBorder(null);



    }

}