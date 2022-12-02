import java.awt.*;
import javax.swing.*;
import javax.swing.text.JTextComponent;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GpsEvent implements ActionListener {

    private JTextField origem;
    private JTextField destino;
    private JRadioButton c1;  private JRadioButton c2;  private JRadioButton c3;

    public GpsEvent(JTextField _origem, JTextField _destino, JRadioButton _c1, JRadioButton _c2, JRadioButton _c3) { 
        this.origem = _origem;
        this.destino = _destino;
        this.c1 = _c1;
        this.c2 = _c2;
        this.c3 = _c3;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String or = (origem.getText()).toLowerCase();
        String ds = (destino.getText()).toLowerCase();
        String texto = "";
        int km = 0;      
        double combustivel;


    if(c1.isSelected()) {
        double alcool = 5.49;

        if (or.equals("lins") && ds.equals("lins") || or.equals("bauru") && ds.equals("bauru")|| or.equals("marilia") &&ds.equals("marilia")) {
            texto = "ROTA NÃO EXISTENTE/CADASTRADA!";
            System.out.println("ROTA NÃO EXISTENTE/CADASTRADA");
        }

        if (or.equals("lins") && ds.equals("bauru") || or.equals("bauru") && ds.equals("lins")) {
            km = 105;
            double conta = alcool / 12;
            combustivel = conta * km;
            texto = "KM: " + km + "\n" + "\n" + "GASTO COM COMBUSTIVEL: " + "R$" + Math.round(combustivel);
            System.out.println("KM: " + km + "\n" + "\n" + "GASTO COM COMBUSTIVEL: " + "R$" + combustivel);
        }

        if (or.equals("lins") && ds.equals("marilia") || or.equals("marilia") && ds.equals("lins")) {
            km= 75;
            double conta = alcool / 12;
            combustivel = conta * km;
            texto = "KM: " + km + "\n" + "\n" + "GASTO COM COMBUSTIVEL: " + "R$" + Math.round(combustivel);
            System.out.println("KM: " + km + "\n" + "\n" + "GASTO COM COMBUSTIVEL: " + "R$" + combustivel);
        }

        if (or.equals("marilia") && ds.equals("bauru") || or.equals("bauru") && ds.equals("marilia")) {
            km = 104;
            double conta = alcool/ 12;
            combustivel = conta * km;
            texto = "KM: " + km + "\n" + "\n" + "GASTO COM COMBUSTIVEL: " + "R$" + Math.round(combustivel);
            System.out.println("KM: " + km + "\n" + "\n" + "GASTO COM COMBUSTIVEL: " + "R$" + combustivel);
        }
    }

    ///////////////////////

    if(c2.isSelected()) {
        double gasolina = 3.91;

        if (or.equals("lins") && ds.equals("lins") || or.equals("bauru") && ds.equals("bauru")|| or.equals("marilia") && ds.equals("marilia")) {
            texto = "ROTA NÃO EXISTENTE/CADASTRADA!";
            System.out.println("ROTA NÃO EXISTENTE/CADASTRADA");
        }

        if (or.equals("lins") && ds.equals("bauru") || or.equals("bauru") && ds.equals("lins")) {
            km = 105;
            double conta = gasolina/ 12;
            combustivel = conta * km;
            texto = "KM: " + km + "\n" + "\n" + "GASTO COM COMBUSTIVEL: " + "R$" + Math.round(combustivel);
            System.out.println("KM: " + km + "\n" + "\n" + "GASTO COM COMBUSTIVEL: " + "R$" + combustivel);
        }

        if (or.equals("lins") && ds.equals("marilia") || or.equals("marilia") && ds.equals("lins")) {
            km= 75;
            double conta = gasolina / 12;
            combustivel = conta * km;
            texto = "KM: " + km + "\n" + "\n" + "GASTO COM COMBUSTIVEL: " + "R$" + Math.round(combustivel);
            System.out.println("KM: " + km + "\n" + "\n" + "GASTO COM COMBUSTIVEL: " + "R$" + combustivel);
        }

        if (or.equals("marilia") && ds.equals("bauru") || or.equals("bauru") && ds.equals("marilia")) {
            km = 104;
            double conta = gasolina / 12;
            combustivel = conta * km;
            texto = "KM: " + km + "\n" + "\n" + "GASTO COM COMBUSTIVEL: " + "R$" + Math.round(combustivel);
            System.out.println("KM: " + km + "\n" + "\n" + "GASTO COM COMBUSTIVEL: " + "R$" + combustivel);
        }
    }

     ///////////////////////

    if(c3.isSelected()) {
        double diesel = 6.25;

    if (or.equals("lins") && ds.equals("lins") || or.equals("bauru") && ds.equals("bauru")|| or.equals("marilia") && ds.equals("marilia")) {
        texto = "ROTA NÃO EXISTENTE/CADASTRADA!";
        System.out.println("ROTA NÃO EXISTENTE/CADASTRADA");
    }

    if (or.equals("lins") && ds.equals("bauru") || or.equals("bauru") && ds.equals("lins")) {
        km = 105;
        double conta = diesel/ 12;
        combustivel = conta * km;
        texto = "KM: " + km + "\n" + "\n" + "GASTO COM COMBUSTIVEL: " + "R$" + Math.round(combustivel);
        System.out.println("KM: " + km + "\n" + "\n" + "GASTO COM COMBUSTIVEL: " + "R$" + combustivel);
    }

    if (or.equals("lins") && ds.equals("marilia") || or.equals("marilia") && ds.equals("lins")) {
        km= 75;
        double conta = diesel/ 12;
        combustivel = conta * km;
        texto = "KM: " + km + "\n" + "\n" + "GASTO COM COMBUSTIVEL: " + "R$" + Math.round(combustivel);
        System.out.println("KM: " + km + "\n" + "\n" + "GASTO COM COMBUSTIVEL: " + "R$" + combustivel);
    }

    if (or.equals("marilia") && ds.equals("bauru") || or.equals("bauru") && ds.equals("marilia")) {
        km = 104;
        double conta = diesel/ 12;
        combustivel = conta * km;
        texto = "KM: " + km + "\n" + "\n" + "GASTO COM COMBUSTIVEL: " + "R$" + Math.round(combustivel);
        System.out.println("KM: " + km + "\n" + "\n" + "GASTO COM COMBUSTIVEL: " + "R$" + combustivel);
    }
}
    JOptionPane.showMessageDialog(null, texto);
}
}


//. ζξ
// ┌─┬┐
// │☆├┘
// └─┘
// DESENVOLVIDO POR PEREIRA! :)