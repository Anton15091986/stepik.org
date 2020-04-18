class Revizor {
	public static String getBigString(String[] roles, String[] textLines){
		String[] newRoles = roles.clone();
		for(int i=0; i<newRoles.length; i++) newRoles[i]=newRoles[i]+":";
		String role;
		String text;
		String out="";
		int numString = 0;
		for(String str: textLines) {
			numString++;
			int index = str.indexOf(':');
			role=str.substring(0, index);
			text = str.substring(index+2);
			for(int i=0; i<roles.length; i++) {
				if(roles[i].equals(role)) {
					newRoles[i] += "\n" + numString + ") " + text;
					break;
				}
			}
		}
		for(int i=0; i<newRoles.length; i++) {
			newRoles[i]+="\n\n";
			out+=newRoles[i];
		}
	return out;
	}
	public static void main (String[] args)throws Exception {
		if(args.length<2) { 
			System.out.println("run java Revizor roles.txt TextLines.txt.");
			return;
		}
		MyFileReader mfr = new MyFileReader(args[0]);
		mfr.fillArrayFromFile();
		String[] rol = mfr.getStringArray();
		mfr.closeFile();
		mfr = new MyFileReader(args[1]);
		mfr.fillArrayFromFile();
		String[] textLin = mfr.getStringArray();
		mfr.closeFile();
		System.out.println(getBigString(rol, textLin));
	}
}