package com.zensar.webservice.download;

import java.io.File;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

@Path("/download")
public class FileDownloadService 
{
	private static final String textFile="D:\\SAVE_PROCEDURE.txt";
	private static final String imageFile="D:\\img1.jpg";
	private static final String pdfFile="D:\\pdf11.pdf";
	@GET
	@Path("/text")
	@Produces("text/plain")
	public Response getTextFile()
	{
		File file = new File(textFile);
		ResponseBuilder builder = Response.ok(file);
		builder.header("Content-Disposition","attachment;filename=SAVE_PROCEDURE.txt");
		return builder.build();
		
	}
	
	@GET
	@Path("/image")
	@Produces("image/jpg")
	public Response getImageFile()
	{
		
		File file = new File(imageFile);
		ResponseBuilder builder = Response.ok(file);
		builder.header("Content-Disposition","attachment;filename=img1.jpg");
		return builder.build();
		
	}
	@GET
	@Path("/pdf")
	@Produces("application/pdf")
	public Response getPdfFile()
	{
		
		File file = new File(pdfFile);
		ResponseBuilder builder = Response.ok(file);
		builder.header("Content-Disposition","attachment;filename=pdf11.pdf");
		return builder.build();
		
	}
}
