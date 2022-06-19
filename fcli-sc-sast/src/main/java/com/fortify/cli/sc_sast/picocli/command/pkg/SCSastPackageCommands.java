package com.fortify.cli.sc_sast.picocli.command.pkg;

import com.fortify.cli.common.picocli.command.DummyCommand;
import picocli.CommandLine.Command;

@Command(
        name = "package",
        subcommands = {
                DummyCommand.class
        }
)
public class SCSastPackageCommands {
}
