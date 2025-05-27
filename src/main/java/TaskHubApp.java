import models.Usuario;
import views.usuario.UsuarioListFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class TaskHubApp extends JFrame {
    private static final String EMPTY_SCREEN = "EMPTY_SCREEN";
    private static final String Usuario_SCREEN = "USUARIO_SCREEN";
    private final CardLayout cardLayout;
    private final JPanel mainPanel;

    public TaskHubApp() {
        setTitle("Task Hub Application");
        setSize(800,600);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);

        // Tela inicial
        JPanel emptyPanel = new JPanel(new BorderLayout());
        emptyPanel.add(new JLabel("Bem-Vindo! Use o Menu para navegar",
        SwingUtilities.CENTER),BorderLayout.CENTER);

        //Tela Usuários
        UsuarioListFrame usuariosPanel = new UsuarioListFrame();

        //Adicionar os CARD no mainPanel
        mainPanel.add(emptyPanel, EMPTY_SCREEN );
        mainPanel.add(emptyPanel, Usuario_SCREEN );

        //Menu
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Menu");

        JMenuItem loginItem = new JMenuItem("Login");
        JMenuItem usuarioListItem = new JMenuItem("Listar Usuários");
        JMenuItem exitItem = new JMenuItem("Sair");

        menu.add(loginItem);
        menu.add(usuarioListItem);
        menu.add(exitItem);

        menuBar.add (menu);
        setJMenuBar(menuBar);

        add(mainPanel);

        //eventos
        loginItem.addActionListener((ActionEvent e) -> {
            JOptionPane.showMessageDialog(this, "Login - não foi implementado ainda.");
        });

        usuarioListItem.addActionListener((ActionEvent e) -> {
            JOptionPane.showMessageDialog(this, "Lista Usuário - não foi implementado ainda.");
        });
        exitItem.addActionListener((ActionEvent e) -> {
            dispose();
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new TaskHubApp().setVisible(true);
        });
    }
}
