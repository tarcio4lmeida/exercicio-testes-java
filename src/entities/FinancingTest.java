package entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FinancingTest {

    //Deve criar o objeto com os dados corretos quando os dados forem válidos
    @Test
    public void deveCriarOObjetoComDadosCorretosQuandoForemValidos(){
        Financing f1 = new Financing(100000.0, 2000.0, 80);
    }

    //Deve lançar IllegalArgumentException quando os dados não forem válidos
    @Test
    public void deveLancarIllegalArgumentExceptionQuandoDadosInvalidos(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Financing f1 = new Financing(100000.0, 2000.0, 20);

        });
    }
}