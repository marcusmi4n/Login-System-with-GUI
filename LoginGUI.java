import javax.swing.*;

public class LoginGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Login");
        JLabel userLabel = new JLabel("Username:");
        JTextField userText = new JTextField();
        JLabel passLabel = new JLabel("Password:");
        JPasswordField passText = new JPasswordField();
        JButton loginBtn = new JButton("Login");

        frame.setLayout(null);
        userLabel.setBounds(20, 20, 80, 25);
        userText.setBounds(100, 20, 160, 25);
        passLabel.setBounds(20, 50, 80, 25);
        passText.setBounds(100, 50, 160, 25);
        loginBtn.setBounds(100, 90, 100, 25);

        loginBtn.addActionListener(e -> {
            String username = userText.getText();
            String password = new String(passText.getPassword());
            if (username.equals("admin") && password.equals("1234")) {
                JOptionPane.showMessageDialog(frame, "Login successful!");
            } else {
                JOptionPane.showMessageDialog(frame, "Invalid credentials");
            }
        });

        frame.add(userLabel); frame.add(userText);
        frame.add(passLabel); frame.add(passText);
        frame.add(loginBtn);
        frame.setSize(300, 180);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
