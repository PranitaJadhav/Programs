
/**Print the calender of perticular day using queue
 * @author Pranita Ananada Jadhav
 *
 */
package com.bridgelabz.datastructure;
import java.util.Scanner;

public class CalenderUsingQueue {
	QueueLinkedListUtility<Week> qu = new QueueLinkedListUtility<Week>();
	Queue wq	=	new Queue();
	StackUsingLinkedList1<Week> stack = new StackUsingLinkedList1<Week>();
	QueueDequeueUtility<Week>q	=	new QueueDequeueUtility<Week>(0);

	/**
	 * 
	 * @param dd
	 * @param mm
	 * @param yy
	 */
	public void calendar(int dd, int mm, int yy) {
		
		String day[] = { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };
		int arr[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		
		int days = Utility1.dayOfWeek(dd, mm, yy);
		Week ww = new Week();
		int counter = 1;
		if (Utility1.isLeapYear(yy)) {
			arr[1] = 29;
		}
		String str;
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 7; j++) {
				if (i == 0) {
					ww.wq.enqueue(new WeekDay(day[j], ""));
				}

				else if (days > 0) {
					ww.wq.enqueue(new WeekDay(" ", "  "));
					days--;
				} else {
					if (counter < arr[mm - 1] + 1) {
						if (counter < 10) {
							str = "0" + String.valueOf(counter);
						} else {
							str = String.valueOf(counter);
						}
						ww.wq.enqueue(new WeekDay(" ", str));
						counter++;
					}

					else {
						ww.wq.enqueue(new WeekDay(" ", "  "));
					}

				}
			}

		}

		counter = 0;
		WeekDay weekd;
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 7; j++) {
				weekd = ww.st.popTop();
				
				if (i < 1) {
					System.out.print(weekd.day + "_|_");

				} else {
					System.out.print(weekd.date + " _|_");
				}
			}
			System.out.println();

		}
	}

	public static void main(String[] args) {
		Scanner sc	=	new Scanner(System.in);

		System.out.println("Enter a month ");
		int month = sc.nextInt();
		System.out.println("Enter a year ");
		int year = sc.nextInt();

		CalenderUsingQueue cq = new CalenderUsingQueue();
		cq.calendar(1, month, year);

	}
}