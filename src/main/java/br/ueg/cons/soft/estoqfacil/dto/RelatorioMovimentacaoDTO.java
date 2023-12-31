package br.ueg.cons.soft.estoqfacil.dto;

import br.ueg.cons.soft.estoqfacil.enums.TipoMovimentacao;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class RelatorioMovimentacaoDTO {

    private Long codigoProduto;
    private String nomeProduto;
    private Long quantidadeSaida;
    private Long quantidadeEntrada;
    private BigDecimal precoVenda;

}
