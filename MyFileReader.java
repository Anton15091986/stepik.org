import java.io.*;
class MyFileReader {
	String[] strArr;
	BufferedReader bf;
	MyFileReader(String str)throws Exception {
		bf = new BufferedReader (new FileReader(str));
	}
	void fillArrayFromFile() throws Exception	{
		int count=0;
		String tempStr;
		String[] tempArr = new String[100];
		do {
			tempStr=bf.readLine();
			tempArr[count]=tempStr;
			count++;
		} while(tempStr!=null);
		strArr = new String[count-1];
		for (int i=0; i<strArr.length; i++) {
			strArr[i]=tempArr[i];
		}
	}
	String[] getStringArray() {
		return strArr;
	}
	void closeFile() throws Exception {
		bf.close();
	}
}