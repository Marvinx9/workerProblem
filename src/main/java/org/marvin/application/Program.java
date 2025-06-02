package org.marvin.application;

import org.marvin.entities.Worker;
import org.marvin.entities.enums.WorkerLevel;

import java.util.Date;

public class Program {
    public static void main(String[] args) {
        Worker order = new Worker(1080, new Date(), WorkerLevel.PENDING_PAYMENT);

        System.out.println(order);

        WorkerLevel os1 = WorkerLevel.DELIVERED;

        WorkerLevel os2 = WorkerLevel.valueOf("DELIVERED");

        System.out.println(os1);
        System.out.println(os2);
    }
}
