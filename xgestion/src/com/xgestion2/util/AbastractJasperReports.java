package com.xgestion2.util;

import java.awt.print.PrinterJob;
import java.sql.Connection;
import java.util.Map;

import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintService;
import javax.print.ServiceUIFactory;
import javax.print.attribute.Attribute;
import javax.print.attribute.AttributeSet;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.PrintServiceAttribute;
import javax.print.attribute.PrintServiceAttributeSet;
import javax.print.attribute.standard.MediaSizeName;
import javax.print.event.PrintServiceAttributeListener;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRExporter;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.export.JRPrintServiceExporter;
import net.sf.jasperreports.engine.export.JRPrintServiceExporterParameter;
import net.sf.jasperreports.engine.export.JRXlsExporter;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.export.SimpleExporterInput;
import net.sf.jasperreports.export.SimpleOutputStreamExporterOutput;
import net.sf.jasperreports.export.SimpleXlsReportConfiguration;
import net.sf.jasperreports.view.JasperViewer;

@SuppressWarnings("deprecation")
public abstract class AbastractJasperReports {

	private static JasperReport report;
	private static JasperPrint reportFilled; 
	private static JasperViewer viewer;
	
	public static void createReport(Connection conn, String path ){
		try {
			report = (JasperReport) JRLoader.loadObjectFromFile(path);
			reportFilled = JasperFillManager.fillReport(report, null, conn);
		} catch (JRException e) {
			e.printStackTrace();
		}
	}
	
	public static void createReport(Connection conn, String path, Map<String, Object> parameters ){
		try {
                    
                    System.out.println(path);
			report = (JasperReport) JRLoader.loadObjectFromFile(path);
			reportFilled = JasperFillManager.fillReport(report, parameters, conn);
		} catch (JRException e) {
			e.printStackTrace();
		}
	}
	
	public static void showViewer(){
		viewer = new JasperViewer(reportFilled,false);
		viewer.setExtendedState(JasperViewer.MAXIMIZED_BOTH); 
		viewer.setDefaultCloseOperation(JasperViewer.DISPOSE_ON_CLOSE); 
		viewer.setVisible(true);
	}
	
	public static void exportToPdf(String destination){
		try {
			JasperExportManager.exportReportToPdfFile(reportFilled, destination);
		} catch (JRException ex) {
			ex.printStackTrace();
		}
	}
	
	public static void imprimir(){
		try {
			JasperPrintManager.printReport(reportFilled,false);
		} catch (JRException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void imprimirDialog(){
		try {
			PrintService service = new PrintService() {
				
				@Override
				public void removePrintServiceAttributeListener(PrintServiceAttributeListener arg0) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public boolean isDocFlavorSupported(DocFlavor arg0) {
					// TODO Auto-generated method stub
					return false;
				}
				
				@Override
				public boolean isAttributeValueSupported(Attribute arg0, DocFlavor arg1, AttributeSet arg2) {
					// TODO Auto-generated method stub
					return false;
				}
				
				@Override
				public boolean isAttributeCategorySupported(Class<? extends Attribute> arg0) {
					// TODO Auto-generated method stub
					return false;
				}
				
				@Override
				public AttributeSet getUnsupportedAttributes(DocFlavor arg0, AttributeSet arg1) {
					// TODO Auto-generated method stub
					return null;
				}
				
				@Override
				public DocFlavor[] getSupportedDocFlavors() {
					// TODO Auto-generated method stub
					return null;
				}
				
				@Override
				public Object getSupportedAttributeValues(Class<? extends Attribute> arg0, DocFlavor arg1, AttributeSet arg2) {
					// TODO Auto-generated method stub
					return null;
				}
				
				@Override
				public Class<?>[] getSupportedAttributeCategories() {
					// TODO Auto-generated method stub
					return null;
				}
				
				@Override
				public ServiceUIFactory getServiceUIFactory() {
					// TODO Auto-generated method stub
					return null;
				}
				
				@Override
				public String getName() {
					// TODO Auto-generated method stub
					return null;
				}
				
				@Override
				public Object getDefaultAttributeValue(Class<? extends Attribute> arg0) {
					// TODO Auto-generated method stub
					return null;
				}
				
				@Override
				public PrintServiceAttributeSet getAttributes() {
					// TODO Auto-generated method stub
					return null;
				}
				
				@Override
				public <T extends PrintServiceAttribute> T getAttribute(Class<T> arg0) {
					// TODO Auto-generated method stub
					return null;
				}
				
				@Override
				public DocPrintJob createPrintJob() {
					// TODO Auto-generated method stub
					return null;
				}
				
				@Override
				public void addPrintServiceAttributeListener(PrintServiceAttributeListener arg0) {
					// TODO Auto-generated method stub
					
				}
			};
			
			PrinterJob job = PrinterJob.getPrinterJob();
		    PrintRequestAttributeSet aset = new HashPrintRequestAttributeSet();
		    aset.add(MediaSizeName.ISO_A4);

		    if (job.printDialog(aset))
		    	service = job.getPrintService();
		     
		    @SuppressWarnings({ "rawtypes" })
			JRExporter exporter = new JRPrintServiceExporter();
		    exporter.setParameter(JRExporterParameter.JASPER_PRINT, reportFilled);
		    exporter.setParameter(JRPrintServiceExporterParameter.PRINT_SERVICE_ATTRIBUTE_SET, service.getAttributes());
		    exporter.setParameter(JRPrintServiceExporterParameter.DISPLAY_PAGE_DIALOG, Boolean.FALSE);
		    exporter.setParameter(JRPrintServiceExporterParameter.DISPLAY_PRINT_DIALOG, Boolean.FALSE);
		    exporter.exportReport();
		    
		} catch (JRException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void exportToXls(String destination){
		JRXlsExporter exporter = new JRXlsExporter();
		exporter.setExporterInput(new SimpleExporterInput(reportFilled));
		exporter.setExporterOutput(new SimpleOutputStreamExporterOutput(destination));
		SimpleXlsReportConfiguration configuration = new SimpleXlsReportConfiguration();
		configuration.setOnePagePerSheet(true);
		configuration.setDetectCellType(true);
		configuration.setCollapseRowSpan(false);
		exporter.setConfiguration(configuration);
		try {
			exporter.exportReport();
		} catch (JRException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
