package org.example;

import java.time.Duration;
import java.time.Instant;
import java.util.Optional;
import java.util.stream.Stream;

public class ProcessAPI {
    private void processInfo() {
        ProcessHandle self = ProcessHandle.current();
        long PID = self.pid();
        ProcessHandle.Info procInfo = self.info();

        Optional<String[]> args = procInfo.arguments();
        Optional<String> cmd =  procInfo.commandLine();
        Optional<Instant> startTime = procInfo.startInstant();
        Optional<Duration> cpuUsage = procInfo.totalCpuDuration();
    }

    private void destroyProcess() {
        Stream<ProcessHandle> childProc = ProcessHandle.current().children();
        childProc.forEach(procHandle -> {
            if (procHandle.destroy()) {
                System.out.println("Kill process: " + procHandle.pid());
            } else {
                System.out.println("Could not kill process: " + procHandle.pid());
            }
        });
    }
}
