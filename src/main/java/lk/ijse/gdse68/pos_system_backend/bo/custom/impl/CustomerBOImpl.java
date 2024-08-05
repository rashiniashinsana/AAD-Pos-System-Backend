package lk.ijse.gdse68.pos_system_backend.bo.custom.impl;

import lk.ijse.gdse68.pos_system_backend.bo.custom.CustomerBO;
import lk.ijse.gdse68.pos_system_backend.dao.CustomerDAO;
import lk.ijse.gdse68.pos_system_backend.dao.CustomerDAOImpl;
import lk.ijse.gdse68.pos_system_backend.dto.CustomerDTO;
import lk.ijse.gdse68.pos_system_backend.entity.Customer;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

public class CustomerBOImpl implements CustomerBO {
    CustomerDAO customerDAO = (CustomerDAO) new CustomerDAOImpl();

    @Override
    public boolean saveCustomer(Connection connection, CustomerDTO dto) throws SQLException {
        return customerDAO.save(connection, new Customer(dto.getId(), dto.getName(), dto.getAddress(), dto.getSalary()));
    }

    @Override
    public ArrayList<CustomerDTO> getAllCustomers(Connection connection) throws SQLException {
        ArrayList<Customer> customersList = customerDAO.getAll(connection);
        ArrayList<CustomerDTO> customerDTOList = new ArrayList<>();

        for (Customer customer : customersList) {
            CustomerDTO dto = new CustomerDTO(
                    customer.getId(),
                    customer.getName(),
                    customer.getAddress(),
                    customer.getSalary()
            );
            customerDTOList.add(dto);
        }
        return customerDTOList;

    }


    @Override
    public CustomerDTO getCustomerById(Connection connection, String id) throws SQLException {
        Customer customer = customerDAO.findBy(connection, id);
        return new CustomerDTO(
                customer.getId(),
                customer.getName(),
                customer.getAddress(),
                customer.getSalary()
        );

    }
    @Override
    public boolean updateCustomer(Connection connection, CustomerDTO dto) throws SQLException {
        return customerDAO.update(connection,new Customer(dto.getId(),dto.getName(),dto.getAddress(),dto.getSalary()));

    }

    @Override
    public boolean deleteCustomer(Connection connection, String id) throws SQLException {
        return customerDAO.delete(connection,id);


    }

}