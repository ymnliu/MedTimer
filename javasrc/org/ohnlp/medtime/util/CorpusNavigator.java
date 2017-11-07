package org.ohnlp.medtime.util;

import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Sijia Liu
 * Navigate Ace2 corpus. Getting filtered file lists.
 * 
 */

public class CorpusNavigator {

	public static ArrayList<Path> getCorpusXmlFileList(Path corpusPath)  {
		
		return getCorpusFileList(corpusPath, "*.xml");
	}
	
	public static ArrayList<Path> getCorpusFileList(String corpusPathString, String filterString) {
		return getCorpusFileList(Paths.get(corpusPathString), filterString);
	}
	
	public static ArrayList<Path> getCorpusFileList(Path corpusPath, String filterString) {
		// e.g. for npaper directory, create npaperIdent as Ident file output dir
		ArrayList<Path> fileList = new ArrayList<Path>();
		
		// DirectoryStream and filter *.xml
		// parse xml and write the result idt files to outPath
		try (DirectoryStream<Path> ds = Files.newDirectoryStream(corpusPath, filterString)) {
			for (Path corpusFileEntry : ds) {
				fileList.add(corpusFileEntry);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		Collections.sort(fileList);
		return fileList;
	}
	
}
