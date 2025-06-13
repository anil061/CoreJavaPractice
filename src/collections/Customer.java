package collections;

import java.util.Objects;

public class Customer {
    private String policyId;
    private String firstName;
    private String lastName;
    private String category;

    public Customer(String policyId, String firstName, String lastName, String category) {
        this.policyId = policyId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "policyId='" + policyId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", category='" + category + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer customer)) return false;
        return Objects.equals(getPolicyId(), customer.getPolicyId()) && Objects.equals(getFirstName(), customer.getFirstName()) && Objects.equals(getLastName(), customer.getLastName()) && Objects.equals(getCategory(), customer.getCategory());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPolicyId(), getFirstName(), getLastName(), getCategory());
    }

    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
