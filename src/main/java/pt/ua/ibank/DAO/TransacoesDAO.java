package pt.ua.ibank.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import pt.ua.ibank.DTO.Transacoes;
import pt.ua.ibank.services.connection;
import static pt.ua.ibank.services.connection.conn;

public class TransacoesDAO {
     public static ArrayList<Transacoes> getTransacoes() {
        PreparedStatement stmt = null;
        ResultSet rs = null;

        ArrayList<Transacoes> ltransacoes = new ArrayList<>();

        try {
            stmt = conn.prepareStatement("SELECT * FROM  transacoes;");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Transacoes tr = new Transacoes();
                tr.setId(rs.getInt("id"));
                tr.setNum_cli(rs.getInt("num_cli"));
                tr.setDescricao(rs.getString("descricao"));
                tr.setValor(rs.getInt("valor"));
                ltransacoes.add(tr);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            connection.closeConnection(stmt, rs);
        }

        return ltransacoes;
    }
}