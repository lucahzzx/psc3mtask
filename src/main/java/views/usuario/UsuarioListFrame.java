package views.usuario;

import models.Usuario;
import utils.ButtonEditor.ButtonEditor;
import utils.ButtonRenderer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.List;

public class UsuarioListFrame extends JPanel {
    private UsuarioTableModel tableModel;
    private JTable table;
    private JButton btnNew;

    public UsuarioListFrame(){
        initComponents();
    }

    private void initComponents(){
        setLayout(new BorderLayout());

        tableModel = new UsuarioTableModel(List.of());
        table = new JTable(tableModel);

        table.getColumn("Editar").setCellRenderer(new ButtonRenderer());

        table.getColumn("Excluir").setCellRenderer(new ButtonRenderer());
    table.getColumn("Excluir").setCellEditor(
            new ButtonEditor(table, row -> removeUser());


        JScrollPane scrollPane = new JScrollPane(table);

        btnNew = new JButton("Novo Usuário");
        btnNew.addActionListener((ActionEvent e) -> {
            JOptionPane.showMessageDialog(null,
                    "Novo Usuário não implementado");
        });

        JPanel panelBtn = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panelBtn.add(btnNew);

        add(scrollPane, BorderLayout.CENTER);
        add(panelBtn, BorderLayout.SOUTH);
    }

    private Object removeUser() {
        Usuario user = removeUser();
    }


}