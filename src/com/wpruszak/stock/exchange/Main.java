package com.wpruszak.stock.exchange;

import java.io.IOException;
import java.util.List;

import org.hibernate.Session;
import org.jsoup.nodes.Document;

import com.wpruszak.stock.exchange.config.ApplicationConfig;
import com.wpruszak.stock.exchange.db.SessionFactorySingleton;
import com.wpruszak.stock.exchange.entity.CompanyIndex;
import com.wpruszak.stock.exchange.entity.StockIndex;
import com.wpruszak.stock.exchange.service.Downloader;
import com.wpruszak.stock.exchange.service.Extractor;

public class Main {

	public static void main(String[] args) throws IOException {

		Downloader downloader = new Downloader();
		Document document = downloader.getDocument(ApplicationConfig.INDEX_URL);
		Extractor extractor = new Extractor(document);
		
		List<CompanyIndex> companyIndexes = extractor.extractCompanyIndexes();
		StockIndex index = extractor.extractWIG20Index();

		Session session = SessionFactorySingleton.getInstance().openSession();
		session.clear();
		session.beginTransaction();

		session.save(index);
		companyIndexes.forEach(session::save);

		session.getTransaction().commit();
		session.close();
		SessionFactorySingleton.getInstance().close();
		System.exit(0);
	}
}
