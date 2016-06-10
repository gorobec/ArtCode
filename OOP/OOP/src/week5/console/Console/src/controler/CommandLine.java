package controler;


public class CommandLine implements ICommandLine {
    private static final String START_PATH = "D:\\Проги\\Java\\Projects\\java-oop\\src\\week5\\console\\Console";
    private String currentPath = START_PATH;
    private static String helpMenu = "ddd";

    @Override
    public String showStartLine() {
        return null;
    }

    @Override
    public String execute(String command) {
        return null;
    }

    @Override
    public void help() {
        System.out.println(helpMenu);
    }
}
