package entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class FinancingTest {

    @Test
    @DisplayName("Deve criar o objeto com os dados corretos quando os dados forem válidos")
    public void deveCriarOObjetoComDadosCorretosQuandoForemValidos() {
        Financing f1 = new Financing(100000.0, 2000.0, 80);
        assertNotNull(f1);
    }

    @Test
    @DisplayName("Deve lançar IllegalArgumentException quando os dados não forem válidos")
    public void deveLancarIllegalArgumentExceptionQuandoDadosInvalidos() {
        Assertions.assertThrows(IllegalArgumentException.class, () ->
            new Financing(100000.0, 2000.0, 20)
        );
    }

    @Test
    @DisplayName("Deve atualizar o valor quando os dados forem válidos")
    public void setTotalAmountDeveAtualizarOValorQuandoOsDadosForemValidos() {
        Financing f1 = new Financing(100000.0, 2210.0, 80);
        f1.setTotalAmount(110000.0);

    }

    @Test
    @DisplayName("Deve lançar IllegalArgumentException quando os dados não forem válidos")
    public void setTotalAmountDeveLancarIllegalArgumentExceptionQuandoOValorQuandoOsDadosForemInValidos() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Financing f1 = new Financing(100000.0, 2210.0, 80);
            f1.setTotalAmount(120000.0);
        });
    }

    @Test
    @DisplayName("Deve atualizar o valor quando os dados forem válidos")
    public void setIncomeDeveAtualizarOValorQuandoOsDadosForemValidos() {
        Financing f1 = new Financing(100000.0, 2210.0, 80);
        f1.setIncome(2220.0);
    }

    @Test
    @DisplayName("Deve lançar IllegalArgumentException quando os dados não forem válidos")
    public void setIncomeAmountDeveLancarIllegalArgumentExceptionQuandoOValorQuandoOsDadosForemInValidos() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Financing f1 = new Financing(100000.0, 2210.0, 80);
            f1.setIncome(1110.0);
        });
    }

    @Test
    @DisplayName("Deve atualizar o valor quando os dados forem válidos")
    public void setMonthsDeveAtualizarOValorQuandoOsDadosForemValidos() {
        Financing f1 = new Financing(100000.0, 2210.0, 80);
        f1.setMonths(90);

    }

    @Test
    @DisplayName("Deve lançar IllegalArgumentException quando os dados não forem válidos")
    public void setMonthsDeveLancarIllegalArgumentExceptionQuandoOValorQuandoOsDadosForemInValidos() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Financing f1 = new Financing(100000.0, 2210.0, 80);
            f1.setIncome(1110.0);
        });
    }
    @Test
    @DisplayName("Deve calcular corretamente o valor da entrada")
    public void entryDeveCalcularCorretamenteOValorDaEntrada() {
        double expectedValue = 20000.0;
        Financing f1 = new Financing(100000.0, 2000.0, 80);
        assertEquals(expectedValue, f1.entry());
    }
    @Test
    @DisplayName("Deve calcular corretamente o valor da prestação")
    public void entryDeveCalcularCorretamenteOValorDaPrestacao() {
        double expectedValue = 1000.0;
        Financing f1 = new Financing(100000.0, 2000.0, 80);
        assertEquals(expectedValue, f1.quota());
    }
}