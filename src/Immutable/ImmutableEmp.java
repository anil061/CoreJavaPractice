package Immutable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public final class ImmutableEmp {
    private final String name;
    private final Date joiningDate;

    private List<Address> address;

    public ImmutableEmp(String name, Date joiningDate, List<Address> addressList) {
        this.name = name;
        this.joiningDate = joiningDate;
        this.address = new ArrayList<>(addressList);
    }

    public String getName() {
        return name;
    }

    public Date getJoiningDate() {
        return joiningDate;
    }

    public List<Address> getAddress(){
        return Collections.unmodifiableList(address);
    }

    @Override
    public String toString() {
        return "ImmutableEmp{" +
                "name='" + name + '\'' +
                ", joiningDate=" + joiningDate +
                '}';
    }
}
