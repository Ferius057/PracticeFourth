package kz.ferius_057.task1;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;

/**
 * @author Ferius_057 (Charles_Grozny)
 * @date ⭐ 24.09.2023 | 22:12 ⭐
 */
@AllArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class Soda {
    String supplement;

    public void showMyDrink() {
        System.out.println((supplement == null || supplement.isEmpty())
                ? "Обычная газировка"
                : "Газировка и " + supplement);
    }
}