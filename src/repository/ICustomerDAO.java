/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repository;
/**
 *
 * @author macos
 */
import model.Customer;
import java.util.List;

public interface ICustomerDAO extends IDAO<Customer> {

    // Thêm mới một khách hàn
    void create(Customer customer);

    // Lấy thông tin khách hàng theo ID
    Customer read(int id);

    // Cập nhật thông tin khách hàng
    void update(Customer customer);

    // Xóa khách hàng theo ID
    void delete(int id);

    // Lấy danh sách tất cả các khách hàng
    List<Customer> getAll();

    // Tìm kiếm khách hàng theo tên hoặc email
    List<Customer> searchByNameOrEmail(String searchTerm);
}

