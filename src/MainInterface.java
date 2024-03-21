import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainInterface extends JFrame{
    private javax.swing.JLabel LabelTitle1;
    private JTextField digiteAlgoAquiTextField;
    private JButton cliqueEmMimButton;
    private JPanel section1, section2;
    private JButton criarNovaTelaButton;

    public MainInterface(){
        setContentPane(section1);
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        cliqueEmMimButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String texto = digiteAlgoAquiTextField.getText();
                LabelTitle1.setText(texto);

            }
        });
        criarNovaTelaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Section2();
            }
        });
    }
    public static void main(String[] args) {
        new MainInterface();
    }
}
