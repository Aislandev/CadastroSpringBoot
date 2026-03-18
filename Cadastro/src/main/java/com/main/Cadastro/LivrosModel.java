package com.main.Cadastro;
import jakarta.persistence.*;

// Entity -> Transforma Classe em Entidade do BD
@Entity
@Table(name = "tb_cadastro")
public class LivrosModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private int idade;

    public LivrosModel() {
    }


    public LivrosModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }
}
