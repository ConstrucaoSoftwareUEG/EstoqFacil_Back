package br.ueg.cons.soft.estoqfacil.dto;

import jakarta.persistence.Lob;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.awt.*;
import java.io.File;
import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProdutoDTO {

    private Long codigo;

    private Long codigoBarras;

    private String nome;

    private String descricao;

    private String marca;

    private Long quantidade;

    private BigDecimal preco;

    private BigDecimal custo;

    private Long imagemId;

    private String imagem;

    private Long categoriaId;

    private String categoriaNome;

    private Long usuarioId;
}
