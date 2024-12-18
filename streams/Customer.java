import java.util.Objects;

public class Customer {
    private String name;
    private String surename;
    private Integer debt;

    public Customer(String name, String surename, Integer debt) {
        this.name = name;
        this.surename = surename;
        this.debt = debt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurename() {
        return surename;
    }

    public void setSurename(String surename) {
        this.surename = surename;
    }

    public Integer getDebt() {
        return debt;
    }

    public void setDebt(Integer debt) {
        this.debt = debt;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", surename='" + surename + '\'' +
                ", debt=" + debt +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(name, customer.name) && Objects.equals(surename, customer.surename) && Objects.equals(debt, customer.debt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surename, debt);
    }
}
