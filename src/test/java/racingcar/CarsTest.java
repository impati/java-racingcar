package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

public class CarsTest {

    @Test
    @DisplayName("한 턴에 대해 자동차들에게 게임 실행 메시지을 했는지 확인한다.")
    public void 한_턴에_대해_자동차들에게_게임_실행_메시지_전달한다() throws Exception {
        Car chanCar = Mockito.mock(Car.class);
        Car iptCar = Mockito.mock(Car.class);
        Cars cars = new Cars(List.of(chanCar, iptCar));

        cars.takeTurn();

        Mockito.verify(chanCar).progress();
        Mockito.verify(iptCar).progress();
    }

}
