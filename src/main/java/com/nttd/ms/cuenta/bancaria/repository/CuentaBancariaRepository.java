package com.nttd.ms.cuenta.bancaria.repository;

import com.nttd.ms.cuenta.bancaria.entity.CuentaBancaria;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CuentaBancariaRepository implements PanacheRepository<CuentaBancaria> {
}
