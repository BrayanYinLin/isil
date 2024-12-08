package com.yinlin.isil.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_tienda")
public class ShopEntity {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @Column(name = "direccion")
    String address;
    @Column(name= "distrito")
    String distrit;
    @Column(name = "aforo")
    int capacity;
    @ManyToOne
    @JoinColumn(name = "codColaborador")
    PartnerEntity partner;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public PartnerEntity getPartner() {
        return partner;
    }

    public void setPartner(PartnerEntity partner) {
        this.partner = partner;
    }

    public String getDistrit() {
        return distrit;
    }

    public void setDistrit(String distrit) {
        this.distrit = distrit;
    }
}
