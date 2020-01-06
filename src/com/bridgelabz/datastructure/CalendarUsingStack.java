/**Print the calender of perticular day
 * @author Pranita Ananada Jadhav
 *
 */

package com.bridgelabz.datastructure;

import java.util.Scanner;

public class CalendarUsingStack {
	StackUsingLinkedList1<Week> stack = new StackUsingLinkedList1<Week>();
	
	public void name(int date, int month, int year) {
		String days[] = { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };
		int arr[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		int day = Utility1.dayOfWeek(date, month, year);
		Week w = new Week();
		int counter = 1;
		if (Utility1.isLeapYear(year)) {
			arr[1] = 29;
		}
		String str;
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 7; j++) {
				if (i == 0) {
					w.st.pushTop(new WeekDay(days[j], " "));

				}

				else if (day > 0) {
					w.st.pushTop(new WeekDay(" ", "  "));
					day--;

				}

				else {
					if (counter < arr[month-1]+1) {
						if (counter < 10) {
							str = "0" + String.valueOf(counter);
						} else {
							str = String.valueOf(counter);
						}

						w.st.pushTop(new WeekDay(" ", str));
						counter++;
					}

					else {
						w.st.pushTop(new WeekDay(" ", "  "));
					}

				}

			}
		}

		counter = 0;
		WeekDay week;
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 7; j++) {
				week = w.st.popTop();
				if (i < 1) {
					System.out.print(week.day + " ");

				} else {
					System.out.print(week.date + "  ");
				}
			}
			System.out.println();

		}
	}

	public static void main(String[] args) {
		Scanner sc	=	new Scanner(System.in);
		CalendarUsingStack sq = new CalendarUsingStack();
		
		System.out.println("Enter a year ");
		int year = sc.nextInt();
		
		System.out.println("Enter a month ");
		int month = sc.nextInt();
		
		sq.name(1, month, year);
	}
}
