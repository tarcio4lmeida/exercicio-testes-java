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

    //Deve atualizar o valor quando os dados forem válidos
    @Test
    public void setTotalAmountDeveAtualizarOValorQuandoOsDadosForemValidos(){
        Financing f1 = new Financing(100000.0, 2210.0, 80);
        f1.setTotalAmount(110000.0);

    }
    //Deve lançar IllegalArgumentException quando os dados não forem válidos
    @Test
    public void setTotalAmountDeveLancarIllegalArgumentExceptionQuandoOValorQuandoOsDadosForemInValidos(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Financing f1 = new Financing(100000.0, 2210.0, 80);
            f1.setTotalAmount(120000.0);
        });
    }

    // Deve atualizar o valor quando os dados forem válidos
    @Test
    public void setIncomeDeveAtualizarOValorQuandoOsDadosForemValidos(){
        Financing f1 = new Financing(100000.0, 2210.0, 80);
        f1.setIncome(2220.0);

    }
    //Deve lançar IllegalArgumentException quando os dados não forem válidos
    @Test
    public void setIncomeAmountDeveLancarIllegalArgumentExceptionQuandoOValorQuandoOsDadosForemInValidos(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Financing f1 = new Financing(100000.0, 2210.0, 80);
            f1.setIncome(1110.0);
        });
    }





}