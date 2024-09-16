package main.projeto.dao.factory;

import main.projeto.domain.Produto;
import main.projeto.domain.ProdutoQuantidade;

import java.sql.ResultSet;
import java.sql.SQLException;


/**
 * @author roberto.dinamite
 *
 */
public class ProdutoQuantidadeFactory {

    public static ProdutoQuantidade convert(ResultSet rs) throws SQLException {
        Produto produto = ProdutoFactory.convert(rs);
        ProdutoQuantidade prodQ = new ProdutoQuantidade();
        prodQ.setProduto(produto);
        prodQ.setId(rs.getLong("ID"));
        prodQ.setQuantidade(rs.getInt("QUANTIDADE"));
        prodQ.setValorTotal(rs.getBigDecimal("VALOR_TOTAL"));
        return prodQ;
    }
}