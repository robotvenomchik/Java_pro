package Homeworks.Homework12;

import java.util.concurrent.atomic.AtomicInteger;

public class DataHandler {

    String[] fruits = new DataRepository().getData();

    public void getOutput() {
        synchronized (this) { // критичний блок коду
            StringBuilder sb = new StringBuilder();
            AtomicInteger count = new AtomicInteger(1);
            for (String fruit : fruits) {
                sb.append(String.format("(%d) %s ", count.getAndIncrement(), fruit));
            }
            System.out.println(Thread.currentThread().getName() + ": " + sb);
        }
    }
}