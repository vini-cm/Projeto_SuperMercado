package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDao {
	public void adicionarUsuario(Usuario usuario) {
        String sql = "INSERT INTO usuarios (nome, cpf) VALUES (?, ?)";
        Connection conexao = null;
        PreparedStatement pstm = null;

        try {
            conexao = BancoConnection.conectar();
            pstm = conexao.prepareStatement(sql);
            pstm.setString(1, usuario.getNome());
            pstm.setString(2, usuario.getCpf());
            pstm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
        	BancoConnection.desconectar(conexao);
            if (pstm != null) {
                try {
                    pstm.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
	 public List<Usuario> listarUsuarios() {
	        String sql = "SELECT * FROM usuarios";
	        List<Usuario> usuarios = new ArrayList<>();
	        Connection conexao = null;
	        PreparedStatement pstm = null;
	        ResultSet rset = null; // Objeto que guarda o resultado da consulta

	        try {
	            conexao = BancoConnection.conectar();
	            pstm = conexao.prepareStatement(sql);
	            rset = pstm.executeQuery();

	            while (rset.next()) {  
	                Usuario usuario = new Usuario();
	                usuario.setNome(rset.getString("nome"));
	                usuario.setCpf(rset.getString("Cpf"));
	                usuarios.add(usuario);
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        } finally {
	        	BancoConnection.desconectar(conexao);
	            // Fechar recursos
	        }
	        return usuarios;
	    }
	 public Usuario buscarAdm (String nome, String cpf){
		 String sql = "SELECT * FROM usuarios WHERE nome = ? and cpf = ? ";
		 PreparedStatement pstm = null;
		 Connection conectar = null;
		 ResultSet rset = null; 
		 Usuario usuario = new Usuario();
		 try {
	            conectar = BancoConnection.conectar();
	            pstm = conectar.prepareStatement(sql);
	            pstm.setString(1, nome);
	            pstm.setString(2, cpf);
	            pstm.executeQuery();
	            
	            rset = pstm.executeQuery();
	            
	            

	           if(rset.next()) {  
	               
	                usuario.setNome(rset.getString("nome"));
	                usuario.setCpf(rset.getString("Cpf"));
	                usuario.setFuncao(rset.getBoolean("funcao"));

	            }
		 } catch (SQLException e) {
	         e.printStackTrace();
	     } finally {
			BancoConnection.desconectar(conectar);
	     }
		 return usuario;
	}
	 public Usuario pesquisarUsuario(String cpf) {
	        String sql = "SELECT * FROM usuarios WHERE cpf = ?";
	        try (Connection conexao = BancoConnection.conectar();
	             PreparedStatement pstm = conexao.prepareStatement(sql)) {
	            pstm.setString(1, cpf);
	            try (ResultSet rs = pstm.executeQuery()) {
	                if (rs.next()) {
	                    Usuario usuario = new Usuario();
	                   
	                    usuario.setNome(rs.getString("nome"));
	                    usuario.setCpf(rs.getString("cpf"));
	                    usuario.setFuncao(false);
	                    return usuario;
	                }
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return null; 
	    }
	 
}
