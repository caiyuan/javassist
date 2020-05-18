package me.caiyuan.javaagent;

import java.lang.instrument.Instrumentation;

/**
 * @author Ryan
 */
public class Agent {

    public static void premain(String args, Instrumentation instrumentation) {
        System.out.println("Agent.premain()");
    }

    public static void agentmain(String args, Instrumentation instrumentation) {
        System.out.println("Agent.agentmain()");
    }
}
