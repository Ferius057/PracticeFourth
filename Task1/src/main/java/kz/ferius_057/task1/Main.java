package kz.ferius_057.task1;

import lombok.val;

/**
 * @author Ferius_057 (Charles_Grozny)
 * @date ⭐ 24.09.2023 | 22:10 ⭐
 */
public class Main {
    public static void main(String[] args) {
        val soda1 = new Soda("клубника");
        System.out.print("soda1: ");
        soda1.showMyDrink();

        val soda2 = new Soda("");
        System.out.print("soda2: ");
        soda2.showMyDrink();
    }
}