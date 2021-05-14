package domain;

import enuns.DeliveryMethod;
import enuns.SolicitationStatus;

public class Cart {
    private String requestID;
    private SolicitationStatus status;
    private DeliveryMethod delivery;

    Cart(){}

    public Cart(SolicitationStatus status, DeliveryMethod delivery) {
        this.status = status;
        this.delivery = delivery;
    }

    public String getRequestID() {
        return requestID;
    }

    public SolicitationStatus getStatus() {
        return status;
    }

    public DeliveryMethod getDelivery() {
        return delivery;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((delivery == null) ? 0 : delivery.hashCode());
        result = prime * result + ((requestID == null) ? 0 : requestID.hashCode());
        result = prime * result + ((status == null) ? 0 : status.hashCode());
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
        Cart other = (Cart) obj;
        if (delivery != other.delivery)
            return false;
        if (requestID == null) {
            if (other.requestID != null)
                return false;
        } else if (!requestID.equals(other.requestID))
            return false;
        if (status != other.status)
            return false;
        return true;
    }

    
}
