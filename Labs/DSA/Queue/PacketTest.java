package queue.examples;

import queue.myqueue.MyLinkedListQueue;
import queue.myqueue.MyQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class PacketTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MyQueue<Packet> p = new MyLinkedListQueue<Packet>();
        for (int i = 1; i < 21; i++) {
            System.out.println("Input the unique id and message of Packet #" +i + ":");
            p.enqueue(new Packet(input.next(),
                    input.nextInt()));
        }
        while (!p.isEmpty()) {
            if ((p.first().getUid()) % 2 == 0) {
                p.dequeue();
            }
                else{
                    System.out.println(p.dequeue().getMessage());
                }
            }
        }
    }