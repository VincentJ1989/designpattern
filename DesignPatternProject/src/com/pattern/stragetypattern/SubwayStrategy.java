package com.pattern.stragetypattern;

/**
 * Created by Administrator on 2017/7/17.
 */
public class SubwayStrategy implements CalculateStragety {
    @Override
    public int caluculatePrice(int km) {
        if (km <= 6) {
            return 3;
        } else if (km > 6 && km < 12) {
            return 4;
        } else if (km > 12 && km < 22) {
            return 5;
        } else if (km > 22 && km < 32) {
            return 6;
        }
        return 7;
    }
}
