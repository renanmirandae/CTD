package com.example.Veiculos.service;

import com.example.Veiculos.model.Veiculo;

public class VeiculoService {
    public Veiculo criarVeiculo(String marca, String cor)
    {
        return new Veiculo(marca, cor);
    }
}
