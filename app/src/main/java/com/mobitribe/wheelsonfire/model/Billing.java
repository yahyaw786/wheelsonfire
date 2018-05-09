package com.mobitribe.wheelsonfire.model;
import java.io.Serializable;
import java.util.List;


public class Billing implements Serializable{

    private String firstName;
    private String lastName;
    private String address1;
    private String address2;
    private String city;
    private String state;
    private String postcode;
    private String country;
    private String email;
    private String phone;

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

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public static class LineItem implements Serializable{

        private Integer productId;
        private Integer quantity;
        private Integer variationId;

        public Integer getProductId() {
            return productId;
        }

        public void setProductId(Integer productId) {
            this.productId = productId;
        }

        public Integer getQuantity() {
            return quantity;
        }

        public void setQuantity(Integer quantity) {
            this.quantity = quantity;
        }

        public Integer getVariationId() {
            return variationId;
        }

        public void setVariationId(Integer variationId) {
            this.variationId = variationId;
        }

    }
    public class Order implements Serializable{

        private String paymentMethod;
        private String paymentMethodTitle;
        private Boolean setPaid;
        private Billing billing;
        private Shipping shipping;
        private List<LineItem> lineItems = null;
        private List<ShippingLine> shippingLines = null;

        public String getPaymentMethod() {
            return paymentMethod;
        }

        public void setPaymentMethod(String paymentMethod) {
            this.paymentMethod = paymentMethod;
        }

        public String getPaymentMethodTitle() {
            return paymentMethodTitle;
        }

        public void setPaymentMethodTitle(String paymentMethodTitle) {
            this.paymentMethodTitle = paymentMethodTitle;
        }

        public Boolean getSetPaid() {
            return setPaid;
        }

        public void setSetPaid(Boolean setPaid) {
            this.setPaid = setPaid;
        }

        public Billing getBilling() {
            return billing;
        }

        public void setBilling(Billing billing) {
            this.billing = billing;
        }

        public Shipping getShipping() {
            return shipping;
        }

        public void setShipping(Shipping shipping) {
            this.shipping = shipping;
        }

        public List<LineItem> getLineItems() {
            return lineItems;
        }

        public void setLineItems(List<LineItem> lineItems) {
            this.lineItems = lineItems;
        }

        public List<ShippingLine> getShippingLines() {
            return shippingLines;
        }

        public void setShippingLines(List<ShippingLine> shippingLines) {
            this.shippingLines = shippingLines;
        }

    }


    public class Shipping implements Serializable {

        private String firstName;
        private String lastName;
        private String address1;
        private String address2;
        private String city;
        private String state;
        private String postcode;
        private String country;

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

        public String getAddress1() {
            return address1;
        }

        public void setAddress1(String address1) {
            this.address1 = address1;
        }

        public String getAddress2() {
            return address2;
        }

        public void setAddress2(String address2) {
            this.address2 = address2;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public String getPostcode() {
            return postcode;
        }

        public void setPostcode(String postcode) {
            this.postcode = postcode;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

    }
    public class ShippingLine implements Serializable {

        private String methodId;
        private String methodTitle;
        private Integer total;

        public String getMethodId() {
            return methodId;
        }

        public void setMethodId(String methodId) {
            this.methodId = methodId;
        }

        public String getMethodTitle() {
            return methodTitle;
        }

        public void setMethodTitle(String methodTitle) {
            this.methodTitle = methodTitle;
        }

        public Integer getTotal() {
            return total;
        }

        public void setTotal(Integer total) {
            this.total = total;
        }

    }
}





