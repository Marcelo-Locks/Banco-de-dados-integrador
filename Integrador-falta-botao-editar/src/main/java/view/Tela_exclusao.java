/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

//import java.awt.event.ActionEvent;
import conexaoBD.ConexaoLivro;
import java.awt.HeadlessException;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import java.util.List;
import model.Livro;

/**
 *
 * @author guilh
 */
public class Tela_exclusao extends javax.swing.JFrame {

    /**
     * Creates new form Tela_exclusao
     */
    public Tela_exclusao() {
        initComponents();
        setWindowProperties();
    }
    // Método para definir as propriedades da janela
    private void setWindowProperties() {
        // Define o tamanho da janela
        setSize(673,500);
        
        // Centraliza a janela
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        input_isbn1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        input_titulo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        input_autor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        input_genero = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        input_numero = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        button_voltar = new javax.swing.JToggleButton();
        jLabel7 = new javax.swing.JLabel();
        input_editora = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        input_estoque = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        input_ano = new javax.swing.JTextField();
        button_pesquisar = new javax.swing.JToggleButton();
        button_editar = new javax.swing.JToggleButton();
        button_excluir = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_list = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        input_isbn = new javax.swing.JTextField();
        button_devolver = new javax.swing.JToggleButton();

        jLabel10.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("ISBN:");

        input_isbn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_isbn1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Título:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 40, 60, 21);

        input_titulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_tituloActionPerformed(evt);
            }
        });
        getContentPane().add(input_titulo);
        input_titulo.setBounds(90, 40, 220, 30);

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Autor:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(320, 40, 60, 21);

        input_autor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_autorActionPerformed(evt);
            }
        });
        getContentPane().add(input_autor);
        input_autor.setBounds(380, 40, 220, 30);

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Gênero:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 80, 70, 21);

        input_genero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_generoActionPerformed(evt);
            }
        });
        getContentPane().add(input_genero);
        input_genero.setBounds(90, 80, 220, 30);

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Nº de Páginas:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(320, 120, 120, 30);
        getContentPane().add(input_numero);
        input_numero.setBounds(440, 120, 160, 30);

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Biblioteca Senac");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(240, 0, 200, 26);

        button_voltar.setText("Voltar");
        button_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_voltarActionPerformed(evt);
            }
        });
        getContentPane().add(button_voltar);
        button_voltar.setBounds(50, 410, 90, 24);

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Editora:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(320, 80, 70, 30);
        getContentPane().add(input_editora);
        input_editora.setBounds(380, 80, 220, 30);

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Estoque:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(10, 160, 80, 30);

        input_estoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_estoqueActionPerformed(evt);
            }
        });
        getContentPane().add(input_estoque);
        input_estoque.setBounds(90, 160, 220, 30);

        jLabel9.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Ano Publicação:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(10, 120, 130, 30);
        getContentPane().add(input_ano);
        input_ano.setBounds(140, 120, 170, 30);

        button_pesquisar.setText("Pesquisar");
        button_pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_pesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(button_pesquisar);
        button_pesquisar.setBounds(160, 410, 100, 24);

        button_editar.setText("Editar");
        button_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_editarActionPerformed(evt);
            }
        });
        getContentPane().add(button_editar);
        button_editar.setBounds(280, 410, 90, 24);

        button_excluir.setText("Excluir");
        button_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_excluirActionPerformed(evt);
            }
        });
        getContentPane().add(button_excluir);
        button_excluir.setBounds(390, 410, 90, 24);

        table_list.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Título", "Autor", "Gênero", "Editora", "Nº de Páginas", "Ano de Publicação", "Estoque", "ISBN"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table_list);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 210, 640, 180);

        jLabel11.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("ISBN:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(320, 160, 60, 30);

        input_isbn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_isbnActionPerformed(evt);
            }
        });
        getContentPane().add(input_isbn);
        input_isbn.setBounds(380, 160, 220, 30);

        button_devolver.setText("Devolver");
        button_devolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_devolverActionPerformed(evt);
            }
        });
        getContentPane().add(button_devolver);
        button_devolver.setBounds(500, 410, 100, 24);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void input_tituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_tituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_tituloActionPerformed

    private void input_autorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_autorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_autorActionPerformed

    private void input_generoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_generoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_generoActionPerformed

    private void input_estoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_estoqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_estoqueActionPerformed

    private void button_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_voltarActionPerformed
        // Criar uma nova instância da tela Professor
        Professor telaProfessor = new Professor();
        telaProfessor.setVisible(true);

        // Ocultar a tela de exclusão atual
        this.dispose();
    }//GEN-LAST:event_button_voltarActionPerformed

    private void button_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_excluirActionPerformed
        int row = table_list.getSelectedRow();
        if (row == -1) {
        JOptionPane.showMessageDialog(null, "Por favor, selecione um livro na tabela.");
        return;
    }

    DefaultTableModel model = (DefaultTableModel) table_list.getModel();
    String titulo = (String) model.getValueAt(row, 0); // ISBN está na coluna 4

    int confirm = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir o livro com o titulo: " + titulo + "?", "Confirmação", JOptionPane.YES_NO_OPTION);
    if (confirm == JOptionPane.YES_OPTION) {
        try {
            Livro livro = new Livro();
            livro.excluirLivro(titulo);
            JOptionPane.showMessageDialog(null, "Livro excluído com sucesso.");

            // Atualiza a tabela após a exclusão
            button_pesquisarActionPerformed(evt); // Chama o método de pesquisa para atualizar a tabela

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir o livro: " + e.getMessage());
        }
      }
    }//GEN-LAST:event_button_excluirActionPerformed

    private void button_pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_pesquisarActionPerformed
        
        String titulo = input_titulo.getText();
        String autor = input_autor.getText();
        String genero = input_genero.getText();
        String editora = input_editora.getText();
        String anoPublicacao = input_ano.getText();
        String numeroPaginas = input_numero.getText();
        String estoque = input_estoque.getText();
        String isbn = input_isbn.getText();
        
        try {
            Livro livro = new Livro();
            List<Livro> resultados = livro.pesquisarLivro(titulo, autor, genero, editora);
        if (resultados.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhum livro encontrado.");
        }else {
            // Criar um modelo de tabela para armazenar os resultados da pesquisa
            DefaultTableModel model = new DefaultTableModel();
            model.setColumnIdentifiers(new String[]{"Título", "Autor", "Gênero", "Editora", "ano_Publicacao", "numeroPaginas", "estoque", "ISBN"});

        for (Livro l : resultados) {
            model.addRow(new Object[]{
            l.getTitulo(),
            l.getAutor(),
            l.getGenero(),
            l.getEditora(),           
            l.getAnoPublicacao(),
            l.getNumeroPaginas(),
            l.getEstoque(),
            l.getIsbn()
    });
}         // Setar o modelo na tabela
            table_list.setModel(model);
        }
        }catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Erro na pesquisa: " + e.getMessage());
         }   
    }//GEN-LAST:event_button_pesquisarActionPerformed

    private void button_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_editarActionPerformed
  int selectedRow = table_list.getSelectedRow();
if (selectedRow >= 0) {
    String titulo = table_list.getValueAt(selectedRow, 0).toString();
    String autor = table_list.getValueAt(selectedRow, 1).toString();
    String genero = table_list.getValueAt(selectedRow, 2).toString();
    String editora = table_list.getValueAt(selectedRow, 3).toString();
    String numeroPaginas = table_list.getValueAt(selectedRow, 5).toString();
    String anoPublicacao = table_list.getValueAt(selectedRow, 4).toString();      
    String estoque = table_list.getValueAt(selectedRow, 6).toString();
    String isbn = table_list.getValueAt(selectedRow, 7).toString();

    try {
        Livro livro = new Livro();
        livro.setTitulo(titulo);
        livro.setAutor(autor);
        livro.setGenero(genero);
        livro.setEditora(editora);
        livro.setNumeroPaginas(numeroPaginas);
        livro.setAnoPublicacao(anoPublicacao);
        livro.setEstoque(estoque);
        livro.setIsbn(isbn);
        
        System.out.println("Tentando editar o livro: " + livro);
        livro.editarLivro(livro); // Chama o método para editar o livro
        System.out.println("Livro editado com sucesso!");

        JOptionPane.showMessageDialog(null, "Livro editado com sucesso!");
         button_pesquisarActionPerformed(evt); // Chama o método de pesquisa para atualizar a tabela
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Erro ao editar livro: " + e.getMessage());
        e.printStackTrace(); // Imprime o stack trace para debugging
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Erro inesperado: " + e.getMessage());
        e.printStackTrace(); // Imprime o stack trace para debugging
    }
} else {
    JOptionPane.showMessageDialog(null, "Por favor, selecione um livro para editar.");
}
    }//GEN-LAST:event_button_editarActionPerformed

    private void input_isbn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_isbn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_isbn1ActionPerformed

    private void input_isbnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_isbnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_isbnActionPerformed

    private void button_devolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_devolverActionPerformed
                
int selectedRow = table_list.getSelectedRow();
    if (selectedRow >= 0) {
        String titulo = table_list.getValueAt(selectedRow, 0).toString();
        String autor = table_list.getValueAt(selectedRow, 1).toString();
        String genero = table_list.getValueAt(selectedRow, 2).toString();
        String editora = table_list.getValueAt(selectedRow, 3).toString();
        String numeroPaginas = table_list.getValueAt(selectedRow, 5).toString();
        String anoPublicacao = table_list.getValueAt(selectedRow, 4).toString();      
        String estoque = table_list.getValueAt(selectedRow, 6).toString();
        String isbn = table_list.getValueAt(selectedRow, 7).toString();

        try {
            Livro livro = new Livro();
            livro.setTitulo(titulo);
            livro.setAutor(autor);
            livro.setGenero(genero);
            livro.setEditora(editora);
            livro.setNumeroPaginas(numeroPaginas);
            livro.setAnoPublicacao(anoPublicacao);
            livro.setEstoque(estoque);
            livro.setIsbn(isbn);                    
            livro.aumentarEstoque();
            
             button_pesquisarActionPerformed(evt); // Chama o método de pesquisa para atualizar a tabela
            
            JOptionPane.showMessageDialog(null, "Livro devolvido com sucesso!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao devolver livro: " + e.getMessage());
        }
    } else {
        JOptionPane.showMessageDialog(null, "Por favor, selecione um livro para devolver.");
        }
    }//GEN-LAST:event_button_devolverActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_exclusao().setVisible(true);
            }
        });
    }   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton button_devolver;
    private javax.swing.JToggleButton button_editar;
    private javax.swing.JToggleButton button_excluir;
    private javax.swing.JToggleButton button_pesquisar;
    private javax.swing.JToggleButton button_voltar;
    private javax.swing.JTextField input_ano;
    private javax.swing.JTextField input_autor;
    private javax.swing.JTextField input_editora;
    private javax.swing.JTextField input_estoque;
    private javax.swing.JTextField input_genero;
    private javax.swing.JTextField input_isbn;
    private javax.swing.JTextField input_isbn1;
    private javax.swing.JTextField input_numero;
    private javax.swing.JTextField input_titulo;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_list;
    // End of variables declaration//GEN-END:variables

}
