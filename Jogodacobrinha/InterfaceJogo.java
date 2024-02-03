import javax.swing.JFrame;

public class InterfaceJogo extends JFrame {
    
    InterfaceJogo(){

        painelJogo painel = new painelJogo();
        this.add(painel);
        this.setTitle("Cobra");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
