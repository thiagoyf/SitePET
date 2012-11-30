/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.util.Calendar;

/**
 * Informações de pessoas que utilizam o sistema
 * @author Thiago
 * @since 2012112301
 * @version 2012112301
 */
public class Usuario {
    private Calendar dataDeNascimento;
    private String email;
    private String endereco;
    private Long id;
    private String nome;
    private String nomeDeUsuario;
    private String senha;

    /**
     * Método que retorna a data de nascimento do usuário
     * @return Date - Data de nascimento do usuário
     */
    public Calendar getDataDeNascimento() {
        return dataDeNascimento;
    }

    /**
     * Método que define a data de nascimento do funcionário
     * @param dataNasc - A data de nascimento a ser definido
     */
    public void setDataDeNascimento(Calendar dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }
    
    /**
     * Método que retorna o email do usuário
     * @return String - Email do usuário
     */
    public String getEmail() {
        return email;
    }

    /**
     * Método que define o email do usuário
     * @param email - O email a ser definido
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
    /**
     * Método que retorna o endereço do funcionário
     * @return String - Endereço do usuario
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * Método que define o endereço do funcionário
     * @param endereco - O endereço a ser definido
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * Método que retorna o número de identificação do usuário
     * @return Long - Número de identificação do usuário
     */
    public Long getId() {
        return id;
    }

    /**
     * Método que define o número de identificação do usuário
     * @param id - Número de identificação a ser definido
     */
    public void setId(Long id) {
        this.id = id;
    }
    
    /**
     * Método que retorna o nome do usuário
     * @return String - Nome do usuário
     */
    public String getNome() {
        return nome;
    }

    /**
     * Método que define o nome do usuário
     * @param nome - O nome a ser definido
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Método que retorna o nome de usuário
     * @return String - Nome de usuário do usuário
     */
    public String getNomeDeUsuario() {
        return nomeDeUsuario;
    }

    /**
     * Método que define o nome de usuário
     * @param nomeDeUsuario - O nome de usuário a ser definido
     */
    public void setNomeDeUsuario(String nomeDeUsuario) {
        this.nomeDeUsuario = nomeDeUsuario;
    }
    
    /**
     * Método que retorna a senha do usuário
     * @return String - Senha do usuário
     */
    public String getSenha() {
        return senha;
    }

    /**
     * Método que define a senha do usuário
     * @param senha - A senha a ser definida
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }
}
