package tests;

import controler.CommandLine;

public class RunTests {
    public static void main(String[] args) {
        CommandLineTest commandLineTest = new CommandLineTest(new CommandLine());
        commandLineTest.runAllTests();
        System.out.println(commandLineTest.results);
    }
}
