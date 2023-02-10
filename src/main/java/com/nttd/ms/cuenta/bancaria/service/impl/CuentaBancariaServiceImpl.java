package com.nttd.ms.cuenta.bancaria.service.impl;

import com.nttd.ms.cuenta.bancaria.entity.CuentaBancaria;
import com.nttd.ms.cuenta.bancaria.repository.CuentaBancariaRepository;
import com.nttd.ms.cuenta.bancaria.service.CuentaBancariaService;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class CuentaBancariaServiceImpl implements CuentaBancariaService {

    @Inject
    CuentaBancariaRepository cuentaBancariaRepository;

    @Override
    public List<CuentaBancaria> findAll() {
        List<CuentaBancaria> cuentaBancarias = cuentaBancariaRepository.listAll();
        List<CuentaBancaria> cuentaBancariasActivas = new ArrayList<>();

        for (CuentaBancaria cuentaBancaria : cuentaBancarias) {
            if(cuentaBancaria.getEstado().equals("1")){
                cuentaBancariasActivas.add(cuentaBancaria);
            }
        }

        return cuentaBancariasActivas;
    }

    @Override
    public CuentaBancaria findById(Long id) {
        return cuentaBancariaRepository.findById(id);
    }

    @Override
    public void save(CuentaBancaria cuentaBancaria) {
        cuentaBancariaRepository.persist(cuentaBancaria);
    }

    @Override
    public void update(Long id, CuentaBancaria cuentaBancaria) {
        CuentaBancaria cbObtenido = cuentaBancariaRepository.findById(id);
        cbObtenido.setNumeroCuenta(cuentaBancaria.getNumeroCuenta());
        cbObtenido.setCci(cuentaBancaria.getCci());
        cbObtenido.setTipoCuenta(cuentaBancaria.getTipoCuenta());
        cbObtenido.setTipoMoneda(cuentaBancaria.getTipoMoneda());
        cbObtenido.setSaldo(cuentaBancaria.getSaldo());
        cuentaBancariaRepository.persist(cbObtenido);
    }

    @Override
    public void delete(Long id) {
        CuentaBancaria cbObtenido = cuentaBancariaRepository.findById(id);
        cbObtenido.setEstado("0");
        cuentaBancariaRepository.persist(cbObtenido);
    }
}
