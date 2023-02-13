package com.nttd.ms.cuenta.bancaria.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "cuenta_bancaria")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CuentaBancaria {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "numero_cuenta")
    private String numeroCuenta;

    @Column(name = "cci")
    private String cci;

    //1: cuenta principal
    //2: cuenta secundaria
    @Column(name = "tipo_cuenta")
    private String tipoCuenta;

    //1: soles
    //2: dolares
    @Column(name = "tipo_moneda")
    private String tipoMoneda;

    @Column(name = "saldo")
    private Double saldo;

    @Column(name = "cliente_id")
    private Long clienteId;

    @Column(name = "tarjeta_id")
    private Long tarjetaId;

    @Column(name = "estado")
    private String estado = "1";
}
