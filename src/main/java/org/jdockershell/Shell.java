package org.jdockershell;

import picocli.CommandLine;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;
import java.io.File;
import java.util.concurrent.Callable;

public class Shell implements Callable<Void> {
    @Option(names = { "-v", "--verbose" }, description = "Be verbose.")
    private boolean verbose = false;

    @Parameters(arity = "1..*", paramLabel = "FILE", description = "File(s) to process.")
    private File[] inputFiles;

    public Void call() throws Exception {
        return null;
    }

    public static void main(String[] args) {
        // CheckSum implements Callable, so parsing, error handling and handling user
        // requests for usage help or version help can be done with one line of code.
        CommandLine.call(new Shell(), args);
    }
}
