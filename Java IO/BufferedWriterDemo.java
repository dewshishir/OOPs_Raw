package lecture9;

import java.io.*;

class BufferedWriterDemo {
  public static void main(String args[]) throws Exception
  {
  	FileReader fr = new FileReader("C:\\Users\\user\\Desktop\\ConsoleDemo\\object - Copy - Copy.txt");
  	BufferedReader br=new BufferedReader(fr);
  	FileWriter fw = new FileWriter("C:\\Users\\user\\Desktop\\ConsoleDemo\\object - Copy.txt",true);
  	BufferedWriter bw=new BufferedWriter(fw);
  	while(true)
  	{
  		String s=br.readLine();
  		if(s==null) break;
  		s=s+"\n";
  		bw.write(s);  		
  	}
  	bw.close();
  	fw.close();
  	br.close();
  	fr.close();  	
   
  }
}