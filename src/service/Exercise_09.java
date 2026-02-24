package service;

public class Exercise_09 {

	public static void main(String[] args) {
		String virkne = "[1, 2, 3] + [3, 5, 7]";
		
		if(virkne.contains("+")) {
			String[] masivs = virkne.split("\\+");
			masivs[0] = masivs[0].replace('[', ' ');
			masivs[0] = masivs[0].replace(']', ' ');
			masivs[1] = masivs[1].replace('[', ' ');
			masivs[1] = masivs[1].replace(']', ' ');
			String[] virkne1 = masivs[0].split(", ");
			String[] virkne2 = masivs[1].split(", ");
			
			for (String s : virkne1) {
				  System.out.println(s);
				}
			for (String s : virkne2) {
				  System.out.println(s);
				}
			}
		
		
				

		
		
		
	}

}
