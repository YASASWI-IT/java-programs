class MyDaemonThread extends Thread{
public void run(){
try{
while(true){
System.out.println(Thread.currentThread().getName()+":DaemonThread running....");
Thread.sleep(1000); // Sleep for 1 second
}
} catch (InterruptedException e) {
System.out.println(e);
} finally {
System.out.println("Daemon Thread exiting...");
}
}
}
class MyUserThread extends Thread {
public void run() {
try {
for (int i = 1; i <= 5; i++) {
System.out.println(Thread.currentThread().getName() + ": User Thread running" + i);

Thread.sleep(500); // Sleep for 500 milliseconds
}
} catch (InterruptedException e) {
System.out.println(e);
}
}

}
public class DaemonThreadExample {
public static void main(String[] args) {
MyDaemonThread daemonThread = new MyDaemonThread();
MyUserThread userThread = new MyUserThread();
// Set daemonThread as a daemon thread
daemonThread.setDaemon(true);
// Start both threads
daemonThread.setName("Daemon Thread");
userThread.setName("User Thread");
daemonThread.start();
userThread.start();
// Main thread waits for userThread to finish
try {
userThread.join();
} catch (InterruptedException e) {
System.out.println(e);
}
System.out.println("Main thread finished, program will exit once user threads are done.");
}
}

