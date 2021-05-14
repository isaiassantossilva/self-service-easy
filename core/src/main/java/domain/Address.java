package domain;

public class Address {
    private String id;
    private String street;
    private String numberHouse;
    private String cep;

    Address(){}

    public Address(String street, String numberHouse, String cep) {
        this.street = street;
        this.numberHouse = numberHouse;
        this.cep = cep;
    }

    public String getId() {
        return id;
    }

    public String getStreet() {
        return street;
    }

    public String getNumberHouse() {
        return numberHouse;
    }

    public String getCep() {
        return cep;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((cep == null) ? 0 : cep.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((numberHouse == null) ? 0 : numberHouse.hashCode());
        result = prime * result + ((street == null) ? 0 : street.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Address other = (Address) obj;
        if (cep == null) {
            if (other.cep != null)
                return false;
        } else if (!cep.equals(other.cep))
            return false;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (numberHouse == null) {
            if (other.numberHouse != null)
                return false;
        } else if (!numberHouse.equals(other.numberHouse))
            return false;
        if (street == null) {
            if (other.street != null)
                return false;
        } else if (!street.equals(other.street))
            return false;
        return true;
    }
}
