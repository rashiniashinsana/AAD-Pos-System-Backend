package lk.ijse.gdse68.pos_system_backend.bo.custom;

import lk.ijse.gdse68.pos_system_backend.dto.ItemDTO;

import java.sql.Connection;
import java.sql.SQLException;

public interface ItemBO {
    ItemDTO getItemByCode(Connection connection, String id) throws SQLException;
}
