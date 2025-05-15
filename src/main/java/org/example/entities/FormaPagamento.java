package org.example.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
public class FormaPagamento  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "FPG_ID")
    private Long fpgId;

    @Column(name = "FPG_DESCRICAO")
    private String fpgDescricao;

    @Column(length = 30, name = "FPG_STATUS", nullable = false)
    private String fpgStatus;

    @Column(name = "FPG_PERMITE_PARCELAMENTO")
    private String fpgPermiteParcelamento;

    @Column(name = "FPG_NUMERO_MAXIMO_PARCELAS")
    private Integer fpgNumeroMaximoParcelas;

    @Column(name = "FPG_TIPO")
    private String fpgTipo;

    @Column(name = "FPG_QTD_PARCELA")
    private Integer fpgQtdParcela;

    @Column(name = "FPG_TAXA_ADICIONA")
    private BigDecimal fpgTaxaAdiciona;

    public FormaPagamento() {
    }

    public FormaPagamento(Long fpgId, String fpgDescricao, String fpgStatus, String fpgPermiteParcelamento, Integer fpgNumeroMaximoParcelas, String fpgTipo, Integer fpgQtdParcela, BigDecimal fpgTaxaAdiciona) {
        this.fpgId = fpgId;
        this.fpgDescricao = fpgDescricao;
        this.fpgStatus = fpgStatus;
        this.fpgPermiteParcelamento = fpgPermiteParcelamento;
        this.fpgNumeroMaximoParcelas = fpgNumeroMaximoParcelas;
        this.fpgTipo = fpgTipo;
        this.fpgQtdParcela = fpgQtdParcela;
        this.fpgTaxaAdiciona = fpgTaxaAdiciona;
    }

    public Long getFpgId() {
        return fpgId;
    }

    public void setFpgId(Long fpgId) {
        this.fpgId = fpgId;
    }

    public String getFpgDescricao() {
        return fpgDescricao;
    }

    public void setFpgDescricao(String fpgDescricao) {
        this.fpgDescricao = fpgDescricao;
    }

    public String getFpgStatus() { return fpgStatus; }
    public void setFpgStatus(String fpgStatus) { this.fpgStatus = fpgStatus; }

    public String getFpgPermiteParcelamento() {
        return fpgPermiteParcelamento;
    }

    public void setFpgPermiteParcelamento(String fpgPermiteParcelamento) {
        this.fpgPermiteParcelamento = fpgPermiteParcelamento;
    }

    public Integer getFpgNumeroMaximoParcelas() {
        return fpgNumeroMaximoParcelas;
    }

    public void setFpgNumeroMaximoParcelas(Integer fpgNumeroMaximoParcelas) {
        this.fpgNumeroMaximoParcelas = fpgNumeroMaximoParcelas;
    }

    public String getFpgTipo() {
        return fpgTipo;
    }

    public void setFpgTipo(String fpgTipo) {
        this.fpgTipo = fpgTipo;
    }

    public Integer getFpgQtdParcela() {
        return fpgQtdParcela;
    }

    public void setFpgQtdParcela(Integer fpgQtdParcela) {
        this.fpgQtdParcela = fpgQtdParcela;
    }

    public BigDecimal getFpgTaxaAdiciona() {
        return fpgTaxaAdiciona;
    }

    public void setFpgTaxaAdiciona(BigDecimal fpgTaxaAdiciona) {
        this.fpgTaxaAdiciona = fpgTaxaAdiciona;
    }
}