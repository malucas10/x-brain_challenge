package com.vendas.dtos.cliente;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClienteResponse {
    private Integer id;
    private String nome;
    private String cpf;
    private String rg;
}
