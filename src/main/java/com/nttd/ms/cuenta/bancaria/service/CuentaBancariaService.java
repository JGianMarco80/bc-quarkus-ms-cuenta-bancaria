package com.nttd.ms.cuenta.bancaria.service;

import com.nttd.ms.cuenta.bancaria.entity.CuentaBancaria;

import java.util.List;

public interface CuentaBancariaService {

    List<CuentaBancaria> findAll();

    CuentaBancaria findById(Long id);

    void save(CuentaBancaria cuentaBancaria);

    void update(Long id, CuentaBancaria cuentaBancaria);

    void delete(Long id);

    //Operaciones a Cuentas Bancarias
    CuentaBancaria consultarCuenta(String numeroCuenta);

    void depositarSaldoCuenta(String numeroCuenta, Double saldo);

    void retirarSaldoCuenta(String numeroCuenta, Double saldo);

    //void transferenciaBancaria(String[] numeroCuenta, Double saldo);

}
