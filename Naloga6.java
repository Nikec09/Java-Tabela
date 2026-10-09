public class Naloga6{
	public static void main(String[] args){
		
		int[][] tab=new int[10][10];
		for(int i=0;i<tab.length;i++){
			for(int j=0;j<tab[i].length;j++){
				tab[i][j]=(int)(Math.random()*100);
			}
		}
		for(int i=0;i<tab.length;i++){
			for(int j=0;j<tab[i].length;j++){
				System.out.printf("%3d", tab[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		for(int i=0;i<tab.length;i++){
			for(int j=0;j<tab[i].length;j++){
				if(i==j || i+j==9)
					System.out.printf("%3d", tab[i][j]);
				else
					System.out.printf("%3c", '-');
			}
			System.out.println();
		}
		System.out.println();
		for(int i=0;i<tab.length;i++){
			for(int j=0;j<tab[i].length;j++){
				if(i<=j && i+j<=tab.length-1 || i>=j && i+j>=tab.length-1)
					System.out.printf("%3d", tab[i][j]);
				else
					System.out.printf("%3c", '-');
			}
			System.out.println();
		}
		System.out.println();
		for(int i=0;i<tab.length;i++){
			for(int j=0;j<tab[i].length;j++){
				if(i<j && i+j<tab.length-1 || i>j && i+j>tab.length-1)
					System.out.printf("%3c", '-');
				else
					System.out.printf("%3d", tab[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}
}