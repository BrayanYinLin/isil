package com.yinlin.isil.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_colaborador")
public class PartnerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @Column(name = "nombres")
    String names;
    @Column(name = "apePaterno")
    String paternalSurname;
    @Column(name = "apeMaterno")
    String maternalSurname;
    @Column(name = "dni")
    String dni;
}
