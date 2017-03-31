import java.util.Collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;


public class IcanGuessTheDataStructure{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext())
		{
			
			int queue=1,pqueue=1, stack=1;
			Queue<Integer> q = new LinkedList<Integer>();
			PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
			Stack<Integer> s = new Stack<>();
			int x= sc.nextInt();
			//int temp = sc.nextInt();
			for (int i=0;i<x;i++)
			{
				int temp = sc.nextInt();
				
				int check = sc.nextInt();
				if (temp==1){
					
					q.add(check);
					pq.add(check);
					s.push(check);
					
				}
				else if (temp==2)
				{
					if(q.isEmpty())
					{
						queue=0;
						pqueue=0;
						stack=0;
					}else{
					int temp2= q.remove();
					
					if (check!=temp2){
						queue=0;
					}
					temp2=pq.remove();
					
					if (check!=temp2)
					{
						pqueue=0;
					}
					temp2=s.pop();
					
					if (check!=temp2)
					{
						stack=0;
					}
					}
				}
			}
			if (stack==1 &&pqueue==0 &&queue==0)
			{
				System.out.println("stack");
			}
			else if(stack==0 &&pqueue==1 &&queue==0)
			{
				System.out.println("priority queue");
			}
			else if(stack==0 &&pqueue==0 &&queue==1)
			{
				System.out.println("queue");
			}
			else if(stack==0 &&pqueue==0 &&queue==0)
			{
				System.out.println("impossible");
			}
			else{System.out.println("not sure");}
		
		}
		sc.close();
    }
}

