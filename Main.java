class Main {
	public static void main (String[] args)throws Exception {
		if(args.length==0) { 
			System.out.println("run java Main nameFile.");
			return;
		}
		MyFileReader mfr = new MyFileReader(args[0]);
		mfr.fillArrayFromFile();
		String[] temp = mfr.getStringArray();
		for(String x: temp) {
			System.out.println(x);
		}
	}
}