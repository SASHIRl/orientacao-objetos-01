package exercicios;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class FuncionarioTeste {

    @Test
    public void criarObjetoFuncionario() {
        Funcionario f1 = new Funcionario();
        assertNotNull(f1);
    }
    @Test
    public void presencaAtributoSalario () {
        Funcionario f1 = new Funcionario();
        f1.salario = 3000.0;
        assertNotNull(f1.salario);
    }
    @Test
    public void metodoPorcentagemAumento() {

        Funcionario f1 = new Funcionario();
        f1.salario = 3000.0;
        Double valorEsperado = 3300.0;
        Double valorObtido = f1.porcentagemAumento();
    }
}