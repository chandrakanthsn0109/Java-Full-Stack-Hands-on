package com.day6;

import java.util.LinkedList;

public class Queue {

	public static void main(String[] args) {
		java.util.Queue<Integer> queue = new LinkedList<>();
		queue.offer(10);
		queue.offer(20);
		queue.offer(30);
		queue.offer(40);
		queue.offer(50);
		System.out.println(queue);
		
		queue.poll();
		System.out.println(queue);
		
		java.util.Deque<Integer> dqueue = new LinkedList<>();
		dqueue.offer(10);
		dqueue.offer(20);
		dqueue.offer(30);
		System.out.println(dqueue);
		dqueue.offerFirst(40);
		dqueue.offerLast(50);
		System.out.println(dqueue);
		dqueue.pollFirst();
		dqueue.pollLast();
		System.out.println(dqueue);
	}

}
