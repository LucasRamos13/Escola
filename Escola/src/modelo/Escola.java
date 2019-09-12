/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Administrador
 */
public class Escola {
  private Integer codigo;
  private String Nome;
  private String Endereco;
  private String Sigla;
  private Double area;
  private Integer nrdealunos;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public String getSigla() {
        return Sigla;
    }

    public void setSigla(String Sigla) {
        this.Sigla = Sigla;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Integer getNrdealunos() {
        return nrdealunos;
    }

    public void setNrdealunos(Integer nrdealunos) {
        this.nrdealunos = nrdealunos;
    }

    @Override
    public String toString() {
        return "Escola{" + "Nome=" + Nome + '}';
    }

    
}
