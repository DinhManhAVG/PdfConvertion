package controller;

import model.BO.PdfConvertionHelper;

public class ConverterThread extends Thread {
	private String filePath;

	public ConverterThread(String filePath) {
		this.filePath = filePath;
	}

	@Override
	public void run() {
		PdfConvertionHelper.convertPdfToDoc(filePath);
	}
}
