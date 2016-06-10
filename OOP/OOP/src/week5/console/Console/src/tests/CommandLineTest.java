package tests;

import controler.ICommandLine;

import java.util.ArrayList;

public class CommandLineTest extends AbstractTest {
    private ICommandLine commandLine;

    public CommandLineTest(ICommandLine commandLine) {
        this.commandLine = commandLine;
        results = new ArrayList<>();
    }

    @Override
    public void runAllTests() {
        testExecute();
        testPwd();
    }

    private void testPwd() {
        String path = "/test/tmp/";
        results.add(new Result("pwd command test",path, path ));
    }

    private void testExecute() {

    }
    public String toString(){
        String runResult = "";
        for (Result result : results) {
            runResult += result;
        }
        return runResult;
    }
}
