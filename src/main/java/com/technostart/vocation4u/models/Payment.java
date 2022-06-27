package com.technostart.vocation4u.models;

import javax.persistence.*;

@Entity
@Table(name = "payments")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;
    private String cardNumber;
    private String expirationDate;
    private String securityCode;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setCardNumber (String cardNumber){
        this.cardNumber = cardNumber;
    }

    public String getCardNumber(){
        return cardNumber;
    }

    public void setExpirationDate (String expirationDate){
        this.expirationDate = expirationDate;
    }

    public String getExpirationDate(){
        return expirationDate;
    }

    public void setSecurityCode (String securityCode){
        this.securityCode = securityCode;
    }

    public String getSecurityCode(){
        return securityCode;
    }
}
