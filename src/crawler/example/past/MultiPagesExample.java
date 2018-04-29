package crawler.example.past;

import com.github.abola.crawler.CrawlerPack;
import org.apache.commons.logging.impl.SimpleLog;

/**
 * 爬蟲包程式的全貌，就只有這固定的模式
 * 
 * @author Abola Lee
 *
 */
public class MultiPagesExample {
	// commit test test
	public static void main(String[] args) {

		// set to debug level
		//CrawlerPack.setLoggerLevel(SimpleLog.LOG_LEVEL_DEBUG);

		// turn off logging
		CrawlerPack.setLoggerLevel(SimpleLog.LOG_LEVEL_OFF);

		// 遠端資料路徑
		String uri = "https://business.591.com.tw/home/search/rsList?is_new_list=1&storeType=1&type=1&kind=5&searchtype=1&region=1&firstRow=30&totalRows=2572";
        //網址中有個firstRow=30 此為每頁的筆數，更改後可以在多抓到其他頁的網頁
		System.out.println(
				CrawlerPack.start()
				
				// 參數設定
			    //.addCookie("key","value")	// 設定cookie
				//.setRemoteEncoding("big5")// 設定遠端資料文件編碼
				
				// 選擇資料格式 (三選一)
				.getFromJson(uri)
			    //.getFromHtml(uri)
			    //.getFromXml(uri)
			    
			    // 這兒開始是 Jsoup Document 物件操作
			    //.select("body > table:nth-child(3) > tbody > tr > td:nth-child(3) > table:nth-child(5) > tbody > tr > td > table:nth-child(2) > tbody > tr > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(2)")
			    
		);
	}
}
