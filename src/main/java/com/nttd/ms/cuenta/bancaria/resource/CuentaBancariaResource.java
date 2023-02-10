package com.nttd.ms.cuenta.bancaria.resource;

import com.nttd.ms.cuenta.bancaria.entity.CuentaBancaria;
import com.nttd.ms.cuenta.bancaria.service.CuentaBancariaService;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/cuenta-bancaria")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CuentaBancariaResource {

    @Inject
    CuentaBancariaService cuentaBancariaService;

    @GET
    public List<CuentaBancaria> findAll() {
        return cuentaBancariaService.findAll();
    }

    @GET
    @Path("/{id}")
    public CuentaBancaria findAll(@PathParam("id") Long id) {
        return cuentaBancariaService.findById(id);
    }

    @POST
    @Transactional
    public void save(CuentaBancaria cuentaBancaria){
        cuentaBancariaService.save(cuentaBancaria);
    }

    @PUT
    @Path("/{id}")
    @Transactional
    public void update(@PathParam("id") Long id, CuentaBancaria cuentaBancaria){
        cuentaBancariaService.update(id, cuentaBancaria);
    }

    @DELETE
    @Path("/{id}")
    @Transactional
    public void delete(@PathParam("id") Long id){
        cuentaBancariaService.delete(id);
    }
}
