package exercicios;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CorrentistaTeste {

    @Test
    public void criarObjetoCorrentista() {
        Correntista c1 = new Correntista ();
        assertNotNull(c1);
    }

    @Test
    public void presencaAtributoCodigo () {
        Correntista c1 = new Correntista ();
        c1.codigo = "4891";
        assertNotNull(c1.codigo);
    }

    @Test
    public void presencaAtributoNome () {
        Correntista c1 = new Correntista ();
        c1.nome = "Carlos";
        assertNotNull(c1.nome);
    }
    @Test
    public void presencaAtributoEmail () {
        Correntista c1 = new Correntista ();
        c1.email = "string@oquefaço.com";
        assertNotNull(c1.email);
    }
    @Test
    public void presencaAtributoTelefone () {
        Correntista c1 = new Correntista ();
        c1.telefone = "40028922";
        assertNotNull(c1.telefone);
    }
}