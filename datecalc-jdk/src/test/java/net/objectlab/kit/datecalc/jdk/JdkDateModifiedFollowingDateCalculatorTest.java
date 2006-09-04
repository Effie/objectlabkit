package net.objectlab.kit.datecalc.jdk;

import net.objectlab.kit.datecalc.common.AbstractModifiedFollowingDateCalculatorTest;
import net.objectlab.kit.datecalc.common.DateCalculatorFactory;

public class JdkDateModifiedFollowingDateCalculatorTest extends AbstractModifiedFollowingDateCalculatorTest {

    @Override
    protected Object newDate(String date) {
        return Utils.createDate(date);
    }

    @Override
    protected DateCalculatorFactory getDateCalculatorFactory() {
        return DefaultJdkDateCalculatorFactory.getDefaultInstance();
    }

}