package com.github.natanlf.ifood.cadastro.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class AdicionarRestauranteDTO {

    @NotEmpty
    @NotNull
    public String proprietario;

    public String cnpj;

    @Size(min = 5, max = 50)
    public String nomeFantasia;

    @NotNull
    public LocalizacaoDTO localizacao;

}