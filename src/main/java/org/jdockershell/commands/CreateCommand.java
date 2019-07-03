package org.jdockershell.commands;

import picocli.CommandLine.Command;

@Command(name = "create", mixinStandardHelpOptions = true, version = "1.0",
        description = "Command with some options to demonstrate TAB-completion" +
                " (note that enum values also get completed)",
        subcommands = {CreateProfilesCommand.class})
public class CreateCommand implements Runnable {

    public void run() {
        System.out.println("Create profiles start");
    }
}
