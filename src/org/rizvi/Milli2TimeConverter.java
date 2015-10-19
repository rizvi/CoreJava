package org.rizvi;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class Milli2TimeConverter {

	public static void main(String[] args) {
		long millis = 3975553;
		String output = getDurationBreakdown(millis);
		System.out.println("Duration: "+output);
	}
	private static String getDurationBreakdown(long millis) {
		if (millis < 0) {
			throw new IllegalArgumentException(
					"Duration must be greater than zero!");
		}
		long hours = TimeUnit.MILLISECONDS.toHours(millis);
		millis -= TimeUnit.HOURS.toMillis(hours);
		long minutes = TimeUnit.MILLISECONDS.toMinutes(millis);
		millis -= TimeUnit.MINUTES.toMillis(minutes);
		long seconds = TimeUnit.MILLISECONDS.toSeconds(millis);
		millis -= TimeUnit.SECONDS.toMillis(seconds);

		StringBuilder sb = new StringBuilder(64);
		sb.append(formatTime((int) hours));
		sb.append(" : ");
		sb.append(formatTime((int) minutes));
		sb.append(" : ");
		sb.append(formatTime((int) seconds));
		sb.append(" : ");
		sb.append(millis);
		return (sb.toString());
	}
	private static String formatTime(int value) {
		System.out.println("1: "+String.format("%02d", value));
		return String.format("%02d", value);
	}
}
