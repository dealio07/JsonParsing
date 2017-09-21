package ua.kiev.prog;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.lang.reflect.Modifier;

public class App 
{
    public static void main( String[] args ) throws FileNotFoundException {
        Gson gson = new GsonBuilder().excludeFieldsWithModifiers(Modifier.STATIC, Modifier.TRANSIENT, Modifier.VOLATILE).create();

        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("person.json")))) {

            JSON json = gson.fromJson(br, JSON.class);
            System.out.println(json.person);

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
