package ua.intita.qa.homework10;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class deleteWordsTest {


    @Test
    public void replaceAll(){
        String str = "If you are still willing to set up your environment for Java programming language, then this section guides \\n\" +\n" +
                "            \"you on how to download and set up Java on your machine. Please follow the steps mentioned below to set up the environment.\\n\" +\n" +
                "            \"Java SE is freely available from the link Download Java. So you download a version based on your operating system.\\n\" +\n" +
                "            \"Follow the instructions to download Java and run the exe to install Java on your machine. \\n\" +\n" +
                "            \"Once you have installed Java on your machine, you would need to set environment variables to point to correct \\n\" +\n" +
                "            \"installation directories.";
        String res = str.replaceAll("\\b\\w{5,5}\\b", "");
        System.out.println(res);

        assertThat(res, is("If you are willing to set up your environment for Java programming language, then this section guides \n" +
                "you on how to download and set up Java on your machine. Please follow the mentioned to set up the environment.\n" +
                "Java SE is freely available from the link Download Java. So you download a version on your operating system.\n" +
                "Follow the instructions to download Java and run the exe to install Java on your machine. \n" +
                "Once you have installed Java on your machine, you would need to set environment variables to point to correct \n" +
                "installation directories."));


    }
}
