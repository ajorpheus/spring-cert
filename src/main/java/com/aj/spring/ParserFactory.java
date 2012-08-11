package com.aj.spring;

import java.util.HashMap;

/**
 * Ê* Ê
 */
public class ParserFactory {

	private HashMap<String, IParser> parsers = new HashMap<String, IParser>();

	private ParserFactory() {
		parsers.put("directory", new FileParser());
		parsers.put("file", new FileParser());
		parsers.put("table", new FileParser());
		parsers.put("view", new FileParser());
		parsers.put("source", new FileParser());
	}

	public static ParserFactory newInstance() {
		return new ParserFactory();
	}

	public IParser getParser(String key) {
		IParser parser = parsers.get(key);
		if (parser == null) {
			System.out.println("Nepodporovan objekt");

		}
		return parser;
	}
	
	public static void main(String[] args) {
		ParserFactory.newInstance();
	}
}
