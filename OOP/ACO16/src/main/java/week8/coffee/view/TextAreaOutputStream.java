package week8.coffee.view;

import javax.swing.*;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Created by gorobec on 26.11.16.
 */
public class TextAreaOutputStream extends OutputStream {
    private JTextArea textControl;

    /**
     * Creates a new instance of TextAreaOutputStream which writes
     * to the specified instance of javax.swing.JTextArea control.
     *
     * @param control A reference to the javax.swing.JTextArea
     *                control to which the output must be redirected
     *                to.
     */
    public TextAreaOutputStream(JTextArea control) {
        textControl = control;
    }

    /**
     * Writes the specified byte as a character to the
     * javax.swing.JTextArea.
     *
     * @param b The byte to be written as character to the
     *          JTextArea.
     */
    public void write(int b) throws IOException {
        // append the data as characters to the JTextArea control
        textControl.append(String.valueOf((char) b));
    }
}
