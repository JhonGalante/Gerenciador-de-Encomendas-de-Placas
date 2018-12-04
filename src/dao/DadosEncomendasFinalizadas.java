/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import model.Encomenda;

/**
 *
 * @author jhona
 */
public class DadosEncomendasFinalizadas implements Dados {
    
    private static List<Encomenda> encomendas = new ArrayList();
    private static final String nomeArquivo = "encomendasFinalizadas.xml";
    private final DadoCaminho caminho = new DadoCaminho();

    @Override
    public void incluir(Object objeto) throws Exception {
        Encomenda encomenda = (Encomenda) objeto;
        encomendas.add(encomenda);
        XML.gravaXml(nomeArquivo, encomendas, caminho.lerCaminho().readLine());
    }

    @Override
    public void excluir(Object objeto) throws Exception {
        Encomenda encomenda = (Encomenda) objeto;
        encomendas.remove(encomenda);
        XML.gravaXml(nomeArquivo, encomendas, caminho.lerCaminho().readLine());
    }

    @Override
    public List<Encomenda> getList() throws Exception{
        encomendas = (List<Encomenda>) XML.leXml(nomeArquivo, caminho.lerCaminho().readLine());
        return encomendas;
    }
}
