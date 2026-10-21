
package edu.monmouth.hw1;

import edu.monmouth.vehicle.Vehicle;

public class VehicleList {
    private VehicleNode head;

    public VehicleList() {
        head = null;
    }

    // Inserts a Vehicle at the beginning of the list.
    public void insert(Vehicle vehicle) {
        VehicleNode newNode = new VehicleNode(vehicle);
        newNode.setNext(head);
        head = newNode;
    }

    // Returns the first Vehicle, or null if the list is empty.
    public Vehicle first() {
        if (isEmpty()) {
            return null;
        }

        return head.getVehicle();
    }

    // Returns the last Vehicle, or null if the list is empty.
    public Vehicle last() {
        if (isEmpty()) {
            return null;
        }

        VehicleNode current = head;

        while (current.getNext() != null) {
            current = current.getNext();
        }

        return current.getVehicle();
    }

    // Removes and returns the first Vehicle.
    public Vehicle removeFirst() {
        if (isEmpty()) {
            return null;
        }

        Vehicle removedVehicle = head.getVehicle();
        head = head.getNext();

        return removedVehicle;
    }

    // Inserts a Vehicle at the end of the list.
    public void insertEnd(Vehicle vehicle) {
        VehicleNode newNode = new VehicleNode(vehicle);

        if (isEmpty()) {
            head = newNode;
            return;
        }

        VehicleNode current = head;

        while (current.getNext() != null) {
            current = current.getNext();
        }

        current.setNext(newNode);
    }

    // Returns true if the list contains no nodes.
    public boolean isEmpty() {
        return head == null;
    }

    // Returns the number of nodes in the list.
    public int size() {
        int count = 0;
        VehicleNode current = head;

        while (current != null) {
            count++;
            current = current.getNext();
        }

        return count;
    }

    // Returns a readable representation of the entire list.
    @Override
    public String toString() {
        if (isEmpty()) {
            return "VehicleList is empty.";
        }

        StringBuilder result = new StringBuilder();
        VehicleNode current = head;
        int position = 1;

        while (current != null) {
            result.append("Vehicle ")
                  .append(position)
                  .append(": ")
                  .append(current.getVehicle())
                  .append("\n");

            current = current.getNext();
            position++;
        }

        return result.toString();
    }
}
