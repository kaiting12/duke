package exceptions;

public class InputNumberFormatException extends DukeException {
    public InputNumberFormatException(String inputCommand) {
        super(" ☹ OOPS!!! The index after " + inputCommand.split(" ")[0] + " is not numeric, please enter an numeric number.");
    }
}
