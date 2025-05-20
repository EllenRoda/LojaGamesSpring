package org.example.entities;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
public class Produto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PRO_ID")
    private Long proId;

    @NotBlank(message = "Nome é obrigatório")
    @Size(max = 100, message = "Nome deve ter no máximo 100 caracteres")
    @Column(name = "PRO_NOME", nullable = false, length = 100)
    private String proNome;

    @NotNull(message = "Preço de Custo é obrigatório")
    @DecimalMin(value = "0.0", inclusive = false, message = "Preço de Custo deve ser maior que zero")
    @Column(name = "PRO_PRECO_CUSTO", precision = 10, scale = 2, nullable = false)
    private Double proPrecoCusto;

    @NotNull(message = "Preço de Venda é obrigatório")
    @DecimalMin(value = "0.0", inclusive = false, message = "Preço de Venda deve ser maior que zero")
    @Column(name = "PRO_PRECO_VENDA", precision = 10, scale = 2, nullable = false)
    private Double proPrecoVenda;

    @Size(max = 50, message = "Marca deve ter no máximo 50 caracteres")
    @Column(name = "PRO_MARCA", length = 50)
    private String proMarca;

    @Size(max = 50, message = "Modelo deve ter no máximo 50 caracteres")
    @Column(name = "PRO_MODELO", length = 50)
    private String proModelo;

    @Min(value = 0, message = "Estoque não pode ser negativo")
    @Column(name = "PRO_ESTOQUE", nullable = false)
    private int proEstoque;

    @Size(max = 30, message = "Cor deve ter no máximo 30 caracteres")
    @Column(name = "PRO_COR", length = 30)
    private String proCor;

    @Size(max = 50, message = "Material deve ter no máximo 50 caracteres")
    @Column(name = "PRO_MATERIAL", length = 50)
    private String proMaterial;

    @Size(max = 100, message = "Fabricante deve ter no máximo 100 caracteres")
    @Column(name = "PRO_FABRICANTE", length = 100)
    private String proFabricante;

    @Size(max = 255, message = "Descrição deve ter no máximo 255 caracteres")
    @Column(name = "PRO_DESCRICAO", length = 255)
    private String proDescricao;

    @Size(max = 50, message = "Categoria deve ter no máximo 50 caracteres")
    @Column(name = "PRO_CATEGORIA", length = 50)
    private String proCategoria;

    @Size(max = 30, message = "Código de Barras deve ter no máximo 30 caracteres")
    @Column(name = "PRO_CODIGO_BARRAS", length = 30)
    private String proCodigoBarras;

    @Column(name = "PRO_DATA_CADASTRO")
    private LocalDateTime proDataCadastro;

    @Column(name = "PRO_DATA_ATUALIZACAO")
    private LocalDateTime proDataAtualizacao;

    @NotBlank(message = "Status Ativo é obrigatório")
    @Size(max = 10, message = "Status Ativo deve ter no máximo 10 caracteres")
    @Column(name = "PRO_ATIVO", nullable = false, length = 10)
    private String proAtivo;


    public Produto() {
    }

    public Produto(Long proId, String proNome, Double proPrecoCusto, Double proPrecoVenda, String proMarca, String proModelo, int proEstoque, String proCor, String proMaterial, String proFabricante, String proDescricao, String proCategoria, String procodigoBarras, LocalDateTime proDataCadastro, LocalDateTime proDataAtualizacao, String proAtivo) {
        this.proId = proId;
        this.proNome = proNome;
        this.proPrecoCusto = proPrecoCusto;
        this.proPrecoVenda = proPrecoVenda;
        this.proMarca = proMarca;
        this.proModelo = proModelo;
        this.proEstoque = proEstoque;
        this.proCor = proCor;
        this.proMaterial = proMaterial;
        this.proFabricante = proFabricante;
        this.proDescricao = proDescricao;
        this.proCategoria = proCategoria;
        this.proCodigoBarras = procodigoBarras;
        this.proDataCadastro = proDataCadastro;
        this.proDataAtualizacao = proDataAtualizacao;
        this.proAtivo = proAtivo;
    }

    public Long getProId() {
        return proId;
    }

    public void setProId(Long proId) {
        this.proId = proId;
    }

    public String getProNome() {
        return proNome;
    }

    public void setProNome(String proNome) {
        this.proNome = proNome;
    }

    public Double getProPrecoCusto() {
        return proPrecoCusto;
    }

    public void setProPrecoCusto(Double proPrecoCusto) {
        this.proPrecoCusto = proPrecoCusto;
    }

    public Double getProPrecoVenda() {
        return proPrecoVenda;
    }

    public void setProPrecoVenda(Double proPrecoVenda) {
        this.proPrecoVenda = proPrecoVenda;
    }

    public String getProMarca() {
        return proMarca;
    }

    public void setProMarca(String proMarca) {
        this.proMarca = proMarca;
    }

    public String getProModelo() {
        return proModelo;
    }

    public void setProModelo(String proModelo) {
        this.proModelo = proModelo;
    }

    public int getProEstoque() {
        return proEstoque;
    }

    public void setProEstoque(int proEstoque) {
        this.proEstoque = proEstoque;
    }

    public String getProCor() {
        return proCor;
    }

    public void setProCor(String proCor) {
        this.proCor = proCor;
    }

    public String getProMaterial() {
        return proMaterial;
    }

    public void setProMaterial(String proMaterial) {
        this.proMaterial = proMaterial;
    }

    public String getProFabricante() {
        return proFabricante;
    }

    public void setProFabricante(String proFabricante) {
        this.proFabricante = proFabricante;
    }

    public String getProDescricao() {
        return proDescricao;
    }

    public void setProDescricao(String proDescricao) {
        this.proDescricao = proDescricao;
    }

    public String getProCategoria() {
        return proCategoria;
    }

    public void setProCategoria(String proCategoria) {
        this.proCategoria = proCategoria;
    }

    public String getProCodigoBarras() {
        return proCodigoBarras;
    }

    public void setProCodigoBarras(String proCodigoBarras) {
        this.proCodigoBarras = proCodigoBarras;
    }

    public LocalDateTime getProDataCadastro() {
        return proDataCadastro;
    }

    public void setProDataCadastro(LocalDateTime proDataCadastro) {
        this.proDataCadastro = proDataCadastro;
    }

    public LocalDateTime getProDataAtualizacao() {
        return proDataAtualizacao;
    }

    public void setProDataAtualizacao(LocalDateTime proDataAtualizacao) {
        this.proDataAtualizacao = proDataAtualizacao;
    }

    public String getProAtivo() {
        return proAtivo;
    }

    public void setProAtivo(String proAtivo) {
        this.proAtivo = proAtivo;
    }
}