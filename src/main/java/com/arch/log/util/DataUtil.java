package com.arch.log.util;



import java.util.ArrayList;
import java.util.List;

public class DataUtil {

	public final static long timestamp = 1387280029;
	
	public final static List<String> urls = new ArrayList<String>();
	public static List<Integer> visitReturning;
	public static List<String> os;
	public static List<String> browser;
	public static List<String> browserVersion;
	public static List<String> resulation;
	public static List<String> ip;
	public static List<String> lang;
	public static List<String> country;
	public static List<String> region;
	public static List<String> city2;
	public static List<String> city1;
	public static List<String> city3;
	
	public static DataUtil instance;
	
	public static List<String> userName;
	
	public static List<String> storeName;
	public static List<String> channel;

	public void setChannel() {
		channel=new ArrayList<>();
		channel.add("wechat");
		channel.add("zhifubao");
		channel.add("others");


	}
	public List<String> getChannel() {
		return channel;
	}
	public void setStoreName() {
		storeName=new ArrayList<>();
		storeName.add("clothes001");
		storeName.add("food003");
		storeName.add("clothes004");
		storeName.add("food005");
		storeName.add("book006");
		storeName.add("mobile007");
		storeName.add("mobile008");
		storeName.add("book009");
		storeName.add("mobile0010");
	}
	public List<String> getStoreName() {
		return storeName;
	}
	
	public void setUserName() {
		userName=new ArrayList<>();
		for(int i=1;i<1000;i++){
			userName.add("100"+i);
		}

		
	}
	public List<String> getUserName() {
		return userName;
	}
	public long getTimestamp() {
		return timestamp;
	}

	public List<String> getUrls() {
		return urls;
	}
	public void setUrls() {
		urls.add("mail.10086.cn");
		urls.add("www.baidu.com");
		urls.add("www.163.com");
		urls.add("tieba.baidu.com");
		urls.add("baike.baidu.com");
		urls.add("mail.qq.cn");
		urls.add("mail.qq.cn/mysqqq");
		urls.add("analytics.mail.10086.cn");
		urls.add("mail.163.cn");
		urls.add("mail.126.cn");
		
	}
	public List<Integer> getVisitReturning() {
		return visitReturning;
	}
	public void setVisitReturning() {
		visitReturning =  new ArrayList<Integer>();
		visitReturning.add(0);
		visitReturning.add(1);
	}
	public List<String> getOs() {
		return os;
	}
	public void setOs() {
		os =  new ArrayList<String>();
		os.add("Win7");
		os.add("WXP");
		os.add("Win8");
		os.add("Linux");
	}
	public List<String> getBrowser() {
		return browser;
	}
	public void setBrowser() {
		browser =  new ArrayList<String>();
		browser.add("Chrome");
		browser.add("FireFox");
		browser.add("IE");
	}
	public List<String> getBrowserVersion() {
		return browserVersion;
	}
	public void setBrowserVersion() {
		browserVersion =  new ArrayList<String>();
		browserVersion.add("6.0");
		browserVersion.add("7.0");
		browserVersion.add("8.0");
		browserVersion.add("9.0");
		browserVersion.add("10.0");
	}
	public List<String> getResulation() {
		return resulation;
	}
	public void setResulation() {
		resulation =  new ArrayList<String>();
		resulation.add("1440x900");
		resulation.add("1280x800");
		resulation.add("1366x768");	
	}
	public List<String> getIp() {
		return ip;
	}
	public void setIp() {
		ip =  new ArrayList<String>();
		ip.add("221.176.9.150");
		ip.add("116.22.3.85");
		ip.add("197.60.5.112");
		ip.add("15.33.165.77");
		ip.add("191.62.2.44");
		ip.add("212.9.132.22");
		ip.add("214.6.55.89");
		ip.add("9.73.55.4");
		ip.add("135.26.44.29");
		ip.add("233.6.58.199");
		ip.add("171.58.92.25");
		ip.add("221.12.5.71");
		ip.add("111.35.37.46");
		ip.add("55.72.4.9");
		ip.add("46.2.19.5");
	}
	public List<String> getLang() {
		return lang;
	}
	public void setLang() {
		lang =  new ArrayList<String>();
		lang.add("ch");
		lang.add("ja");
		lang.add("en");
		lang.add("sp");
	}
	public List<String> getCountry() {
		return country;
	}
	public void setCountry() {
		country =  new ArrayList<String>();
		country.add("China");
		country.add("China");
		country.add("China");
		country.add("China");
		country.add("China");
		country.add("China");
		country.add("China");
		country.add("China");
		country.add("China");
		country.add("China");
		country.add("China");
		country.add("China");
		country.add("China");
		country.add("China");
		country.add("China");
		country.add("USA");
		country.add("Japen");
		country.add("England");
		country.add("Spain");
		country.add("Russia");
	}
	public List<String> getRegion() {
		return region;
	}
	public void setRegion() {
		region =  new ArrayList<String>();
		region.add("jiangxi");
		region.add("guangdong");
		region.add("guangdong");
		region.add("guangdong");
		region.add("guangdong");
		region.add("sichuan");
	}
	public List<String> getCity1() {
		return city1;
	}
	public void setCity1() {
		city1 =  new ArrayList<String>();
		city1.add("Nanchang");
		city1.add("Jian");
		city1.add("Ganzhou");
		city1.add("Jiujiang");
	}
	public List<String> getCity2() {
		return city2;
	}
	public void setCity2() {
		city2 =  new ArrayList<String>();
		city2.add("Shenzhen");
		city2.add("Shenzhen");
		city2.add("Shenzhen");
		city2.add("Shenzhen");
		city2.add("Shenzhen");
		city2.add("Shenzhen");
		city2.add("Shenzhen");
		city2.add("Guangzhou");
		city2.add("Guangzhou");
		city2.add("Guangzhou");
		city2.add("Shantou");
		city2.add("Chaozhou");
		city2.add("Meizhou");
		city2.add("Zhuhai");
	}
	public List<String> getCity3() {
		return city3;
	}
	public void setCity3() {
		city3 =  new ArrayList<String>();
		city3.add("Chengdu");
		city3.add("Dazhou");
		city3.add("Suining");
		city3.add("Aba");
		city3.add("Yaan");
	}

	
	public static DataUtil getInstance(){
		if(instance == null){
			instance = new DataUtil();
		}
		return instance;
	}
	
	public DataUtil(){
		setBrowser();
		setBrowserVersion();
		setCity1();
		setCity2();
		setCity3();
		setCountry();
		setIp();
		setLang();
		setOs();
		setRegion();
		setResulation();
		setUrls();
		setVisitReturning();
		setUserName();
		setStoreName();
		setChannel();
	}
	
	public int random(int start, int end){
		int i = 0;
		int tmp = end-start;
		i = (int) Math.round(Math.random()*tmp+start);
		return i;
	}
	

}
