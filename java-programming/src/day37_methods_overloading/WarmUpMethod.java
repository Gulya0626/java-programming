package day37_methods_overloading;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class WarmUpMethod {
    public static void main(String[] args) {
        loginVoid("Cybertekstudent", "abc123"); //POSITIVE TEST /SUNNY DAY
        loginVoid("Cybertek", "answer"); //NEGATIVE DAY /RAINY DAY SCENARIO
        loginVoid("", "");
        //System.out.println(loginVoid("cybertekStudent", "abc123")); ERROR NO RETURN VALUE
        System.out.println(login("cybertekStudent", "abc123"));

        if(login("cybertekStudent", "abc123") == true) {
            System.out.println("Login successful, welcome to canvas");
            System.out.println("Select the course to continue");
        }else{
            System.out.println("Login failed");
        }

        boolean isLoginSuccess = login("nadir", "mountain");
        System.out.println("isLoginSuccess = " + isLoginSuccess);
        if(login("nadir", "mountain")) {
            System.out.println("Welcome to Canvas, select course");
        }else{
            System.out.println("Something wrong with your credentials");
        }

    }

    public static void loginVoid(String userName, String password) {
        String secretUserName = "cybertekStudent";
        String secretPassword = "abc123";

        if (userName.equalsIgnoreCase(secretUserName) && password.equals(secretPassword)) {
            System.out.println("Loggin successful, welcome Cybertek Student!");
        } else {
            System.out.println("Incorrect username or password");
          }

        }

    public static boolean login(String userName, String password) {
        String secretUserName = "cybertekStudent";
        String secretPassword = "abc123";
        // return userName.equalsIgnoreCase(secretUserName) && password.equals(secretPassword);
        if(userName.equalsIgnoreCase(secretUserName) && password.equals(secretPassword)) {
            return true; //return true, and exit method here. return false will not run
        }else{
            return false;
        }


       }
      }

