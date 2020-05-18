package me.caiyuan.javaagent;

import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.IllegalClassFormatException;
import java.lang.instrument.Instrumentation;
import java.security.ProtectionDomain;

/**
 * @author Ryan
 */
public class Agent {

    public static void premain(String args, Instrumentation instrumentation) {
        System.out.println("Agent.premain()");
        instrumentation.addTransformer(new ClassFileTransformer() {
            @Override
            public byte[] transform(ClassLoader loader, String className, Class<?> classBeingRedefined, ProtectionDomain protectionDomain, byte[] classfileBuffer) throws IllegalClassFormatException {
                System.out.println(loader.getClass() + " <- " + className);
                return classfileBuffer;
            }
        });
    }
}
