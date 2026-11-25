package estore;

public class BillingInformation {
    private int receiverPhoneNumber;
    private String receiverName;
    private String deliverAddress;

    public int getReceiverPhoneNumber() {
        return receiverPhoneNumber;
    }

    public void setReceiverPhoneNumber(int receiverPhoneNumber) {
        this.receiverPhoneNumber = receiverPhoneNumber;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getDeliverAddress() {
        return deliverAddress;
    }

    public void setDeliverAddress(String deliverAddress) {
        this.deliverAddress = deliverAddress;
    }

    public String getCreditCardInformation() {
        return creditCardInformation;
    }

    public void setCreditCardInformation(String creditCardInformation) {
        this.creditCardInformation = creditCardInformation;
    }

    private String creditCardInformation;
}
