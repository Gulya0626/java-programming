package day45_oop;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class TrafficLightObjects {
    public static void main(String[] args) {
        //Create traffic light object
        TrafficLight trafficLight = new TrafficLight();
        //trafficLight.color = "red"; NOT THIS WAY TODAY
        //we will assign/update the value of color using a method of the class
        trafficLight.changeColor("red");
        //System.out.println("Current color = " + trafficLight.color);
                 //direct access to variable. Not recommended.
        //call method to access the variable:
        trafficLight.showColor();

        trafficLight.changeColor("green");
        trafficLight.showColor();

        TrafficLight trafficLight2 = new TrafficLight();
        trafficLight.color = "black";
        trafficLight2.showColor();

        
    }
}
