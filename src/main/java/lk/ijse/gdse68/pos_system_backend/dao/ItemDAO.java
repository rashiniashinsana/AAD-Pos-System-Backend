package lk.ijse.gdse68.pos_system_backend.dao;

import lk.ijse.gdse68.pos_system_backend.entity.Item;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

public interface ItemDAO {
    boolean save(Connection connection, Item entity) throws SQLException;

    boolean update(Connection connection, Item entity) throws SQLException;

    ArrayList<Item> getAll(Connection connection) throws SQLException;

    boolean delete(Connection connection, String code) throws SQLException;

    Item findBy(Connection connection, String code) throws SQLException;

    //    @Override
//    public boolean reduceQty(Connection connection, Item item) throws SQLException {
//        String sql = "UPDATE item SET qty = ( qty - ? ) WHERE code = ?";
//        return CrudUtil.execute(connection, sql, item.getQty(), item.getCode());
//    }
    boolean reduceQty(Connection connection, Item item) throws SQLException;

    boolean exists(Connection connection, String itemCode) throws SQLException;
}
