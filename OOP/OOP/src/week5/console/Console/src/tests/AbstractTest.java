package tests;

import tests.Result;

import java.util.List;

public abstract class AbstractTest {
    protected List<Result> results;
    public abstract void runAllTests();
}
