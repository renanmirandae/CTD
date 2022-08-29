package com.example.Veiculos.controller;

import com.example.Veiculos.model.Veiculo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.Veiculos.service.VeiculoService;

@RestController
public class VeiculoController {
    private VeiculoService veiculoService = new VeiculoService();

    @GetMapping("/")
    public Veiculo criarVeiculo()
    {
        return veiculoService.criarVeiculo("Onix", "Prata");
    }
}
