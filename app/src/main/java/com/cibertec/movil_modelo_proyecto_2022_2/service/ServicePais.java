package com.cibertec.movil_modelo_proyecto_2022_2.service;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ServicePais {

    @GET("util/listaPais")
    public Call<List<ServicePais>> listaTodos();
}
