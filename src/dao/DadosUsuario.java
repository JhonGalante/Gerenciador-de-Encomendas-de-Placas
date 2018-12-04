/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import model.Usuario;

/**
 *
 * @author jhona
 */
public class DadosUsuario implements Dados {
    private static List<Usuario> usuarios = new ArrayList();
    private static final String nomeArquivo = "usuarios.xml";
    private DadoCaminho caminho = new DadoCaminho();

    @Override
    public void incluir(Object objeto) throws Exception {
        Usuario usuario = (Usuario) objeto;
        usuarios.add(usuario);
        XML.gravaXml(nomeArquivo, usuarios, caminho.lerCaminho().readLine());
    }

    @Override
    public void excluir(Object objeto) throws Exception {
        Usuario usuario = (Usuario) objeto;
        usuarios.remove(usuario);
        XML.gravaXml(nomeArquivo, usuarios, caminho.lerCaminho().readLine());
    }

    @Override
    public List<Usuario> getList() throws Exception{
        usuarios = (List<Usuario>) XML.leXml(nomeArquivo, caminho.lerCaminho().readLine());
        return usuarios;
    }
}
