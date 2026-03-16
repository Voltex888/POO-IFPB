package aula04;

import org.junit.Test;
import testes.Pessoa;

public class PessoaTest {

    Pessoa pessoa;

    public void setUp() {
        pessoa = new Pessoa (10);
    }
    @Test(expected = IllegalArgumentException.class)
    public void setIdade_Negativa_retornaExercecao(){

    }
}
