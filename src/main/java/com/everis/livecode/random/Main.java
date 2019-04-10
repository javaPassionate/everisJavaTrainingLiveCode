package com.everis.livecode.random;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();

		list.add("ElbohdidiSokaina@gmail.com");
		list.add("saabohatem@gmail.com");
		list.add("mamsin28@gmail.com");
		list.add("soufiane.odf@gmail.com");
		list.add("aitelasri.smail.1991@gmail.com");
		list.add("elimranisafae@gmail.com");
		list.add("zix.php@gmail.com");
		list.add("imane.elkouch19@gmail.com");
		list.add("younesazouzi5@gmail.com");
		list.add("red.hammouti7@gmail.com");
		list.add("muhsiine@gmail.com");
		list.add("naoufal.afa@gmail.com");
		list.add("moualikarima@gmail.com");
		list.add("ismailrzouki7@gmail.com");
		list.add("maryamsellam3@gmail.com");
		list.add("walid.arj@gmail.com");
		list.add("aelflihi@gmail.com");
		list.add("Niarbentamim@gmail.com");
		list.add("aitzerrad.mohamed@gmail.com");
		list.add("haniny.hamza@gmail.com");
		list.add("souhaib.ahar@gmail.com");
		list.add("messari.ch1@gmail.com");
		list.add("majdefati21@gmail.com");
		list.add("wiam.aznag@everis.com");
		list.add("Mziregjalila38@gmail.com");
		list.add("Aweryagel@gmail.com");
		list.add("wail.ouaissa@gmail.com");
		list.add("Hnadamohamed18@gmail.com");
		list.add("benazouzabdelghani@gmail.com");
		list.add("Nafieboudakkou@gmail.com");

		System.out.println(getTopic(list, 0));
		// for (int i = 0; i < 30; i++) {
		// System.out.println(i + " : " + getName(list, i));
		// }
//		List<String> topicsList = new ArrayList<String>();
//
//		topicsList.add("Angular");
//		topicsList.add("servlet + jsp + tomcat");
//		topicsList.add("JSF");
//		topicsList.add("Struts 1.3");
//		topicsList.add("EJB + Spring");
//		topicsList.add("JPA + hibernate");
//		Scanner sc = new Scanner(System.in);
//
//		for (int i = 0; i < 6; i++) {
//			System.out.println(i + " : " + getTopic(topicsList, i));
//		}
	}

	private static String getTopic(List<String> list, int size) {
		int index = (int) (Math.random() * (30 - size));
		String mail = list.get(index);
		list.remove(index);
		return mail;
	}
}
