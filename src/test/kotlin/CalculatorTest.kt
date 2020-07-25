import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertAll

class CalculatorTest{
    @Test
    @DisplayName("연산 체크")
    fun checkOperate(){
        assertThat(Operate.SUM.cal(3,4)).isEqualTo(7)
    }
}
