package com.company.Classes;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Random;

public class PasswordMarker {

    static PasswordMarker object = null;  //singleton object

    static final int MAGIC_NUMBER = 5;
    static final String MAGIC_STRING = Random_string(20);
    String name;

    public static PasswordMarker get_object(String object_name)
    {
        if(object == null)
            object = new PasswordMarker(object_name);
        return object;
    }

    private static String Random_string(int saiz) {

        int FirstLetter = 97; // letter 'a'
        int LastLetter = 122; // letter 'z'
        int StringSize = saiz;
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(StringSize);
        for (int i = 0; i < StringSize; i++)
        {
            int randomLimitedInt = FirstLetter + (int) (random.nextFloat() * (LastLetter -FirstLetter + 1));
            buffer.append((char) randomLimitedInt);
        }
        String RandomString = buffer.toString();
        //System.out.println(RandomString);

        return RandomString;
    }

    PasswordMarker(String name)
    {
        this.name = name;
    }

    public String getPassword()
    {
        String random_string = Random_string(this.MAGIC_NUMBER);
        random_string = random_string + MAGIC_STRING;
        random_string = random_string + name.length();

        Random random = new Random();
        random_string = random_string + random.nextInt() % 100;
        return random_string;
    }

}
