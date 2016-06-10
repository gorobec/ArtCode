package controler;
import model.IHelp;

public interface ICommandLine extends IHelp {
    String showStartLine();
    String execute(String command);
}
