package hibernateMapping;

import javax.persistence.*;

@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;

    @Column(name = "possion")
    @Enumerated(EnumType.STRING)
    private Possion possion;



    @ManyToOne(targetEntity = Bill.class)
    @JoinColumn(name="bill_id",nullable = false)
    private Bill bill;



    public Customer(String name, String address) {
        this.name = name;
        this.address = address;
    }
    public Customer(int id, String name, String address, Possion possion) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.possion = possion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }
}
