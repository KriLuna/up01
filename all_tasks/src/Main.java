import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class Main extends JFrame {
    private JTextField textField;
    public Main() {
        super("Все выполненные задания");
        createGUI();
    }
    public void createGUI() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        ActionListener actionListener = new TestActionListener();
        JButton button1 = new JButton("Задача 1");
        button1.setActionCommand("https://github.com/KriLuna/up01/blob/main/task_1/src/Main.java");
        panel.add(button1);
        button1.addActionListener(actionListener);
        JButton button2 = new JButton("Задача 2");
        button2.setActionCommand("https://github.com/KriLuna/up01/blob/main/task_2/src/Main.java");
        panel.add(button2);
        button2.addActionListener(actionListener);
        JButton button4 = new JButton("Задача 4");
        button4.setActionCommand("https://github.com/KriLuna/up01/blob/main/task_4/src/Main.java");
        panel.add(button4);
        button4.addActionListener(actionListener);
        JButton button5 = new JButton("Задача 5");
        button5.setActionCommand("https://github.com/KriLuna/up01/blob/main/task_4/src/Main.java");
        panel.add(button5);
        button5.addActionListener(actionListener);
        JButton button9 = new JButton("Задача 9");
        button9.setActionCommand("https://github.com/KriLuna/up01/blob/main/task_9/src/Main.java");
        panel.add(button9);
        button9.addActionListener(actionListener);
        getContentPane().add(panel);
        setPreferredSize(new Dimension(320, 200));
    }
    public class TestActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                Desktop.getDesktop().browse(new URL(e.getActionCommand()).toURI());
            } catch (Exception ex) {
                System.out.println(ex.toString());
            }
        }
    }
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame.setDefaultLookAndFeelDecorated(true);
                Main frame = new Main();
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }
}