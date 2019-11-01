package com.arch.log.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test01 {

	public static void main(String[] args) {
		String pre = "server_time=([0-9]{0,})&";
		String str = "http://192.168.1.13/log.gif?region=guangdong&idsite=4&os=Linux&idvisitor=d1aaa6c4806c92a&browserVersion=27&storeName=xiaomi009&visit_total_time=2068&visitReturning=1&server_time=1540161732000&resolution=1440x900&type=1&lang=ch&url=mail.qq.cn%2Fmysqqq&city=Shenzhen&country=China&ip=191.62.2.44&local_time=1540161646000&time_spent_ref_action=1797&oid=fa6725f13e1a4f8e99b4536acf531bec&browser=Chrome&money=5246&userName=100812&channel=others";
		//System.out.println(str.matches(pre));

		Pattern p = Pattern.compile(pre);
		Matcher matcher = p.matcher(str);

		matcher.find();
		int count = matcher.groupCount();
		System.out.println(count);
		for(int i = 0;i<=count;i++){
			String s = matcher.group(i);
			System.out.println(s);
		}

	}

}
