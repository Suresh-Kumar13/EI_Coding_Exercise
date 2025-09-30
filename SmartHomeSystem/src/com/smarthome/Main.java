package com.smarthome;

import com.smarthome.devices.SmartDevice;
import com.smarthome.exception.*;
import com.smarthome.factory.DeviceFactory;
import com.smarthome.hub.*;
import com.smarthome.proxy.DeviceProxy;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SmartHomeHub hub = new SmartHomeHub();
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("\n--- Smart Home Menu ---");
                System.out.println("1. Add Device");
                System.out.println("2. Remove Device");
                System.out.println("3. Turn Device On/Off");
                System.out.println("4. Schedule Device Action");
                System.out.println("5. Add Automation Trigger");
                System.out.println("6. Show Device Status");
                System.out.println("7. Show Scheduled Tasks");
                System.out.println("8. Show Automation Triggers");
                System.out.println("9. Exit");
                System.out.print("Enter choice: ");

                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter device type (light/thermostat/door): ");
                        String type = sc.next();
                        System.out.print("Enter device ID: ");
                        int id = sc.nextInt();
                        SmartDevice device = DeviceFactory.createDevice(type, id);
                        hub.addDevice(new DeviceProxy(device));
                        break;

                    case 2:
                        System.out.print("Enter device ID to remove: ");
                        int removeId = sc.nextInt();
                        hub.removeDevice(removeId);
                        break;

                    case 3:
                        System.out.print("Enter device ID: ");
                        int devId = sc.nextInt();
                        System.out.print("Enter action (on/off): ");
                        String action = sc.next();
                        hub.controlDevice(devId, action);
                        break;

                    case 4:
                        System.out.print("Enter device ID: ");
                        int sid = sc.nextInt();
                        System.out.print("Enter time (HH:MM): ");
                        String time = sc.next();
                        System.out.print("Enter action (on/off): ");
                        String sAction = sc.next();
                        hub.scheduleDeviceAction(sid, time, sAction);
                        break;

                    case 5:
                        System.out.print("Enter thermostat threshold: ");
                        int threshold = sc.nextInt();
                        System.out.print("Enter target device ID: ");
                        int tid = sc.nextInt();
                        System.out.print("Enter action (on/off): ");
                        String tAction = sc.next();
                        Trigger trigger = new Trigger("If temp > " + threshold + " then " + tAction + " device " + tid,
                                threshold, tid, tAction);
                        hub.addTrigger(trigger);
                        break;

                    case 6:
                        hub.showStatus();
                        break;

                    case 7:
                        hub.showScheduledTasks();
                        break;

                    case 8:
                        hub.showTriggers();
                        break;

                    case 9:
                        System.out.println("Exiting...");
                        sc.close();
                        return;

                    default:
                        throw new InvalidInputException("Invalid menu choice: " + choice);
                }
            } catch (InvalidInputException | DeviceNotFoundException | InvalidActionException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (InputMismatchException e) {
                System.out.println("Error: Please enter numbers where required.");
                sc.nextLine(); // clear buffer
            } catch (Exception e) {
                System.out.println("Unexpected Error: " + e.getMessage());
            }
        }
    }
}
