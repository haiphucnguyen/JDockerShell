package org.jdockershell.commands;

import org.yaml.snakeyaml.Yaml;
import picocli.CommandLine;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Map;
import java.util.Scanner;

@CommandLine.Command(name = "profile", mixinStandardHelpOptions = true, version = "1.0",
        description = "Command with some options to demonstrate TAB-completion" +
                " (note that enum values also get completed)")
public class CreateProfilesCommand implements Runnable {
    public void run() {
        Scanner s = new Scanner(System.in);
        System.out.print("Profile name: ");
        String profileName = s.nextLine();

        System.out.print("Docker compose file: ");
        String dockerComposeFilePath = s.nextLine();
        System.out.println(profileName + " " + dockerComposeFilePath);
        analyzeYamlDocker(dockerComposeFilePath);
    }

    private void analyzeYamlDocker(String dockerFile) {
        try {
            Yaml yaml = new Yaml();
            InputStream inputStream = new FileInputStream(dockerFile);
            Map<String, Object> obj = yaml.load(inputStream);
            System.out.println(obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
