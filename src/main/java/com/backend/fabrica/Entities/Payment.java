package com.backend.fabrica.Entities;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name = "PAYMENTS")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;// Many payments can belong to one user

    @Column(nullable = false)
    private double amount; // Amount paid

    @Column(nullable = false, length = 255)
    private String paymentMethod; // e.g., "Credit Card", "PayPal", etc.

    @Column(nullable = false)
    private LocalDateTime paymentDate; // Date of payment

    @Column(length = 255)
    private String transactionId; // Unique transaction identifier

    @Column(nullable = false)
    private boolean successful; // Indicates if the payment was successful

    // empty constructor
    public Payment() {
    }

    // parameterised constructor
    public Payment(Long id, User user, double amount, String paymentMethod, LocalDateTime paymentDate, String transactionId, boolean successful) {
        this.id = id;
        this.user = user;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
        this.paymentDate = paymentDate;
        this.transactionId = transactionId;
        this.successful = successful;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public double getAmount() {
        return this.amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getPaymentMethod() {
        return this.paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public LocalDateTime getPaymentDate() {
        return this.paymentDate;
    }

    public void setPaymentDate(LocalDateTime paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getTransactionId() {
        return this.transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public boolean isSuccessful() {
        return this.successful;
    }

    public boolean getSuccessful() {
        return this.successful;
    }

    public void setSuccessful(boolean successful) {
        this.successful = successful;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", user='" + getUser() + "'" +
            ", amount='" + getAmount() + "'" +
            ", paymentMethod='" + getPaymentMethod() + "'" +
            ", paymentDate='" + getPaymentDate() + "'" +
            ", transactionId='" + getTransactionId() + "'" +
            ", successful='" + isSuccessful() + "'" +
            "}";
    }

}
