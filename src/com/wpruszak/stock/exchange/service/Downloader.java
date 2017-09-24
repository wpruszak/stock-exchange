package com.wpruszak.stock.exchange.service;

import java.io.IOException;

import org.jsoup.Connection.Method;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import com.wpruszak.stock.exchange.config.ApplicationConfig;

public class Downloader {

	public Document getDocument(String url) throws IOException {
		return Jsoup.connect(url)
				.userAgent(ApplicationConfig.USER_AGENT)
				.method(Method.GET)
				.execute()
				.parse();
	}
}
