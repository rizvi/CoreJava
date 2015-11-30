package org.rizvi;

public class Checker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String amachk = "";
		String yhochk = "";
		String regichk = "";
		String webchk = "";
		String event = "";
		String rakuchk = "";

		// TODO Auto-generated method stub
		if (((amachk == "-1" || yhochk == "-1" || regichk == "-1" || webchk == "-1") && $gv(
				event, "cellUribrui") != "1")
				|| (rakuchk == "-1" && $gv(event, "cellUribrui") == "1"))
		
//		if ((rakuchk == "-1" || amachk == "-1" || yhochk == "-1"
//				|| regichk == "-1" || webchk == "-1")
//				&& $gv(event, "cellUribrui") != "1") 
		{
			System.out.println("love you");
		} else {
			System.out.println("hate you");
		}
		System.out.println("hi");
	}
	private static String $gv(String event, String string) {
		// TODO Auto-generated method stub
		return null;
	}
}
