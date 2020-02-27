package exercicios;

public class Funcionario {
    public String nome;
    public String sobrenome;
    public String email;
    public String idade;
    public Double salario;

    public String obterDados() { return nome + " " + sobrenome + idade + email; }
    public Double porcentagemAumento() { return salario + (salario * 0.10); }
}