/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HW1;

/**
 *
 * @author ryan_
 */
public class Clock {
    private int hour;
    private int  minute;
    private int second;
    
    public Clock(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public int getHour(){
        return hour;
    }
    public void setHour(int hour){
        if(hour > 23){
            this.hour = 0;
        }
        else{
            this.hour = hour;
        }
    }
    public int getMinute(){
        return minute;
    }
    public void setMinute(int minute){
        if(minute > 59){
            this.minute = 0;
        }
        else{
            this.minute = minute;
        }
    }
    public int getSecond(){
        return second;
    }
    public void setSecond(int second){
        if(second > 59){
            this.second = 0;
        }
        else{
            this.second = second;
        }
    }
    public String displayTime(){
        return String.format("%d:%d:%d", hour, minute, second);
    }
}
