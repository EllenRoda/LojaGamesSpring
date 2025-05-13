package org.example.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
public class Produto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PRO_ID")
    private Long proId;

    @Column(name = "PRO_NOME")
    private String proNome;

    @Column(name = "PRO_PRECO_CUSTO", precision = 10, scale = 2)
    private Double proPrecoCusto;

    @Column(name = "PRO_PRECO_VENDA", precision = 10, scale = 2)
    private Double proPrecoVenda;

    @Column(name = "PRO_MARCA")
    private String proMarca;

    @Column(name = "PRO_MODELO")
    private String proModelo;

    @Column(name = "PRO_ESTOQUE")
    private int proEstoque;

    @Column(name = "PRO_COR")
    private String proCor;

    @Column(name = "PRO_MATERIAL")
    private String proMaterial;

    @Column(name = "PRO_FABRICANTE")
    private String proFabricante;
    @Column(name = "PRO_DESCRICAO")
    private String proDescricao;
    @Column(name = "PRO_CATEGORIA")
    private String proCategoria;
    @Column(name = "PRO_CODIGO_BARRAS")
    private String proCodigoBarras;
    @Column(name = "PRO_DATA_CADASTRO")
    private LocalDateTime proDataCadastro;
    @Column(name = "PRO_DATA_ATUALIZACAO")
    private LocalDateTime proDataAtualizacao;

    @Column(name = "PRO_ATIVO")
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