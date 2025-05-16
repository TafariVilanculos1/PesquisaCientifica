/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author tafarivilanculos
 */
 public class PesquisaCientifica {
     
    private String titulo;
    private String autor;
    private String areaDeEstudo;
    private int anoPublicacao;
    private String instituicao; // este atributo será ignorado nos getters/setters
    private int numeroParticipantes;
    private double orcamento; // em dólares ou outra moeda
    private String metodologia;
    private String status; // Em Andamento, Concluída, Cancelada, etc.

    // Construtor
    public PesquisaCientifica(String titulo, String autor, String areaDeEstudo, int anoPublicacao,
                              int numeroParticipantes, double orcamento, String metodologia, String status) {
        this.titulo = titulo;
        this.autor = autor;
        this.areaDeEstudo = areaDeEstudo;
        this.anoPublicacao = anoPublicacao;
        this.numeroParticipantes = numeroParticipantes;
        this.orcamento = orcamento;
        this.metodologia = metodologia;
        this.status = status;
    }

    public PesquisaCientifica(String area, double orcamento)
    {
           this.areaDeEstudo=area;
           this.orcamento=orcamento;
    }
    // Getters e Setters (sem incluir "instituicao")
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAreaDeEstudo() {
        return areaDeEstudo;
    }

    public void setAreaDeEstudo(String areaDeEstudo) {
        this.areaDeEstudo = areaDeEstudo;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public int getNumeroParticipantes() {
        return numeroParticipantes;
    }

    public void setNumeroParticipantes(int numeroParticipantes) {
        this.numeroParticipantes = numeroParticipantes;
    }

    public double getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(double orcamento) {
        this.orcamento = orcamento;
    }

    public String getMetodologia() {
        return metodologia;
    }

    public void setMetodologia(String metodologia) {
        this.metodologia = metodologia;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

