package conexaoBD;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Livro;

public class ConexaoLivro {
    
   private PreparedStatement pstm;

    public void editarLivro(Livro livro) throws SQLException {
        String sql = "UPDATE tb_livros SET TITULO = ?, AUTOR = ?, GENERO = ?, EDITORA = ?, ANO_PUBLICACAO = ?, NUMERO_PAGINAS = ?, ESTOQUE = ? WHERE ISBN = ?";
       
        try (Connection conn = getConnection()) {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, livro.getTitulo());
            pstm.setString(2, livro.getAutor());
            pstm.setString(3, livro.getGenero());
            pstm.setString(4, livro.getEditora());
            pstm.setString(5, livro.getAnoPublicacao());
            pstm.setString(6, livro.getNumeroPaginas());
            pstm.setInt(7, livro.getEstoque());
            pstm.setString(8, livro.getIsbn());

            int rowsUpdated = pstm.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Livro atualizado com sucesso.");
            } else {
                System.out.println("Nenhum livro encontrado com o ISBN fornecido.");
            }
        } catch (SQLException e) {
            System.err.println("Erro ao atualizar o livro: " + e.getMessage());
            throw e;
        }
    }

    private Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/biblioteca_integrador";
        String user = "root";
        String password = "";
        return DriverManager.getConnection(url, user, password);
    }

    public void editarLivro(ConexaoLivro livro) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
