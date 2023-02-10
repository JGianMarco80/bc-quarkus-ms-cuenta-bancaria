package com.nttd.ms.cuenta.bancaria.service;

import com.nttd.ms.cuenta.bancaria.entity.CuentaBancaria;

import java.util.List;

public interface CuentaBancariaService {

    List<CuentaBancaria> findAll();

    CuentaBancaria findById(Long id);

    void save(CuentaBancaria cuentaBancaria);

    void update(Long id, CuentaBancaria cuentaBancaria);

    void delete(Long id);

}
