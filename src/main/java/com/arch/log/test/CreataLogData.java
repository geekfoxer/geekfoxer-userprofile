package com.arch.log.test;

import com.arch.log.client.AnalyticsEngineSDK;
import com.arch.log.util.DataUtil;
import com.arch.log.util.MD5;
import org.joda.time.DateTime;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class CreataLogData {

	private static DataUtil data = new DataUtil();

	public static void main(String[] args) {
	// System.out.println(uuid);
/*		Map<String, String> data2 = getData();
		for (Entry<String, String> entry : data2.entrySet()) {
			String key = String.valueOf(entry.getKey());
			String value = String.valueOf(entry.getValue());
			System.out.println(key + "==" + value);
		}*/

		while (true) {
			try {
				String uuidSuccess = UUID.randomUUID().toString()
						.replace("-", "").toLowerCase();
				String uuidRefund = UUID.randomUUID().toString()
						.replace("-", "").toLowerCase();
				Map<String, String> dataSuccess = getData();
				Map<String, String> dataRefund = getData();
				//发送数据01  --成功购买的数据上报
				AnalyticsEngineSDK.onChargeSuccess(uuidSuccess, dataSuccess);
				//发送数据02  --退款的数据上报
				AnalyticsEngineSDK.onChargeRefund(uuidRefund, dataRefund);

				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static Map<String, String> getData() {
		Integer id = null;
		Integer idsite = null;
		String idvisitor;
		long server_time;
		Integer time_spent_ref_action;
		String url;
		Integer visitReturning;
		String os;
		String browser;
		String browserVersion;
		String resolution;
		String ip;
		String lang;
		String country;
		String region;
		String city = null;
		Integer visit_total_time;
		long local_time;
		// long ts = DataUtil.timestamp - data.random(0, 86400*30);
		long ts = DateTime.now().getMillis() / 1000
				- data.random(0, 86400 * 30);
		//new DateTime(ts * 1000);
		server_time = new DateTime(ts * 1000).getMillis();
		local_time = new DateTime((ts - data.random(0, 100)) * 1000).getMillis();
		url = DataUtil.urls.get(data.random(0, DataUtil.urls.size() - 1));
		// idvisitor = ""+data.random(10000000, 20000000);
		idvisitor = MD5.getMD5(
				"" + data.random(10000, data.random(10001, 20000))).substring(
				0, 15);

		if (url.indexOf("baidu") > 0) {
			idsite = 1;
		} else if (url.indexOf("10086") > 0) {
			idsite = 2;
		} else if (url.indexOf("163") > 0 || url.indexOf("126") > 0) {
			idsite = 3;
		} else if (url.indexOf("qq") > 0) {
			idsite = 4;
		}
		time_spent_ref_action = data.random(0, 3600);
		visitReturning = DataUtil.visitReturning.get(data.random(0,
				DataUtil.visitReturning.size() - 1));
		os = DataUtil.os.get(data.random(0, DataUtil.os.size() - 1));
		browser = DataUtil.browser.get(data.random(0,
				DataUtil.browser.size() - 1));
		if ("IE".equalsIgnoreCase(browser)) {
			browserVersion = DataUtil.browserVersion.get(data.random(0,
					DataUtil.browserVersion.size() - 1));
		} else {
			browserVersion = "27";
		}
		resolution = DataUtil.resulation.get(data.random(0,
				DataUtil.resulation.size() - 1));
		ip = DataUtil.ip.get(data.random(0, DataUtil.ip.size() - 1));
		lang = DataUtil.lang.get(data.random(0, DataUtil.lang.size() - 1));
		country = DataUtil.country.get(data.random(0,
				DataUtil.country.size() - 1));
		if ("china".equalsIgnoreCase(country)) {
			region = DataUtil.region.get(data.random(0,
					DataUtil.region.size() - 1));
			lang = "ch";
			if ("jiangxi".equals(region)) {
				city = DataUtil.city1.get(data.random(0,
						DataUtil.city1.size() - 1));
			} else if ("guangdong".equals(region)) {
				city = DataUtil.city2.get(data.random(0,
						DataUtil.city2.size() - 1));
			} else if ("sichuan".equals(region)) {
				city = DataUtil.city3.get(data.random(0,
						DataUtil.city3.size() - 1));
			}
		} else {
			region = country;
			city = country;
		}
		visit_total_time = time_spent_ref_action + data.random(60, 1000);
		String userName = DataUtil.userName.get(data.random(0,
				DataUtil.userName.size() - 1));
		
		String storeName = DataUtil.storeName.get(data.random(0,
				DataUtil.storeName.size() - 1));
		String channel = DataUtil.channel.get(data.random(0,
				DataUtil.channel.size() - 1));
		
		Map<String, String> datas = new HashMap<String, String>();
		
		
		datas.put("userName", userName);
		datas.put("storeName", storeName);
		datas.put("channel", channel);
		datas.put("money", String.valueOf(data.random(10, 10000)));
		datas.put("idsite", idsite + "");
		datas.put("server_time", server_time+"");
		datas.put("idvisitor", idvisitor);
		datas.put("server_time", server_time+"");
		datas.put("time_spent_ref_action", time_spent_ref_action + "");
		datas.put("local_time", local_time+"");
		datas.put("visitReturning", visitReturning + "");
		datas.put("visit_total_time", visit_total_time + "");

		datas.put("os", os);
		datas.put("browser", browser);
		datas.put("browserVersion", browserVersion);
		datas.put("resolution", resolution);
		datas.put("ip", ip);
		datas.put("lang", lang);
		datas.put("country", country);
		datas.put("region", region);
		datas.put("city", city);
		datas.put("url", url);
		return datas;
	}
}
