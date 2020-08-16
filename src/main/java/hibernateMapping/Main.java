package hibernateMapping;

import hibernateDAO.CustomerDAO;

public class Main {

    public static void main(String[] arg) {
        CustomerDAO customerDAO = new CustomerDAO();

        customerDAO.saveCustomer(new Customer("Kai", "Viet Nam"));
        customerDAO.saveCustomer(new Customer("Thanos", "Viet Nam"));
        customerDAO.saveCustomer(new Customer("Thor", "Asgard"));
        customerDAO.saveCustomer(new Customer("Hulk", "USA"));
        customerDAO.saveCustomer(new Customer(5,"Hieu","a",Possion.UltraVIP));  // mapping customer

        customerDAO.savebill(new Bill(1, "20", "SRM"));
        customerDAO.savebill(new Bill(2, "20", "SRM"));
        customerDAO.savebill(new Bill(3, "20", "SRM"));
        customerDAO.savebill(new Bill(4, "20", "SRM")); // mappint bill

        //Search name by id-customer
        customerDAO.findById(5);
        //update customer
        customerDAO.updateName(5,"trung hieu");
        //show all customer
        customerDAO.showAll();

    }
}
