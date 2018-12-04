/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import model.Cliente;

/**
 *
 * @author jhona
 */
public class DadosClientes implements Dados {
    
    private static List<Cliente> clientes = new ArrayList();
    private static final String nomeArquivo = "clientes.xml";
    private DadoCaminho caminho = new DadoCaminho();

    @Override
    public void incluir(Object objeto) throws Exception {
        Cliente cliente = (Cliente) objeto;
        clientes.add(cliente);
        XML.gravaXml(nomeArquivo, clientes, caminho.lerCaminho().readLine());
    }
    
    public void alterar() throws Exception {
        XML.gravaXml(nomeArquivo, clientes, caminho.lerCaminho().readLine());
    }

    @Override
    public void excluir(Object objeto) throws Exception {
        Cliente usuario = (Cliente) objeto;
        clientes.remove(usuario);
        XML.gravaXml(nomeArquivo, clientes, caminho.lerCaminho().readLine());
    }

    @Override
    public List<Cliente> getList() throws Exception{
        clientes = (List<Cliente>) XML.leXml(nomeArquivo, caminho.lerCaminho().readLine());
        return clientes;
    }
    
}
