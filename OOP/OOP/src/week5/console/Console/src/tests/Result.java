package tests;

public class Result {
    private static int id = 0;
    private String testName;
    private String expected;
    private String actual;
    private boolean passed;

    public Result(String testName, String expected, String actual) {
        this.testName = testName;
        this.expected = expected;
        this.actual = actual;
        this.passed = expected.equals(actual);
        this.id++;
    }

    @Override
    public String toString() {
        return "Run №" + id +
                " (name = " + testName + '\'' +
                ", expected = " + expected + '\'' +
                ", actual = " + actual + '\'' +
                ", passed = " + passed +
                ')';
    }
}
