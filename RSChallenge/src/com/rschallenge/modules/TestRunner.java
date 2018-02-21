package com.rschallenge.modules;

import com.rschallenge.stepdefinition.TestSteps;
import org.openqa.selenium.WebDriver;

import java.io.*;
import java.lang.reflect.*;

public class TestRunner {

    public static void execute(WebDriver driver, String featureFileName) {

        File featureFile = new File(featureFileName);
        String line = null;

        // temp test
        File directory = new File("./");
        //System.out.println(directory.getAbsolutePath()); //Temp debug

        // Read in the feature file.
        try {

            FileReader fileReader =
                    new FileReader(featureFile);

            BufferedReader bufferedReader =
                    new BufferedReader(fileReader);

            String testStepName;
            TestSteps testStepsObj = new TestSteps();

            while((line = bufferedReader.readLine()) != null) {
                // Step through it and run each line as a test.
                System.out.println(line);
                testStepName=interpretBDDLine(line);
                if (!testStepName.equals("")) {
                    Method testStepsMethod = testStepsObj.getClass().getMethod(testStepName, WebDriver.class);
                    testStepsMethod.invoke(testStepsObj, driver);
                }
            }

            bufferedReader.close();
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                    "Unable to open file '" +
                            featureFile + "'");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }


    }


    private static String interpretBDDLine(String BDDLine) {
        if (BDDLine.startsWith("Given:")) {
            // Strip out the Given and replace spaces with underscores
            BDDLine = BDDLine.replace("Given: ", "");
            BDDLine = BDDLine.replace(" ", "_");
            BDDLine = BDDLine.replace("-", "_");
        } else if (BDDLine.startsWith("When:")) {
            BDDLine = BDDLine.replace("When: ", "");
            BDDLine = BDDLine.replace(" ", "_");
            BDDLine = BDDLine.replace("-", "_");
        } else if (BDDLine.startsWith("And:")) {
            BDDLine = BDDLine.replace("And: ", "");
            BDDLine = BDDLine.replace(" ", "_");
            BDDLine = BDDLine.replace("-", "_");
        } else if (BDDLine.startsWith("Then:")) {
            BDDLine = BDDLine.replace("Then: ", "");
            BDDLine = BDDLine.replace(" ", "_");
            BDDLine = BDDLine.replace("-", "_");
        } else {
            BDDLine = "";
        }
        return BDDLine;
    }

}
