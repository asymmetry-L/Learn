import java.util.Random;

public class Day05_lian2 {
	public static int[] getRandom() {
		int list[]=new int[6];
		int item=0;
		boolean bool = false;
		for(int i=0;i<list.length;i++) {
//			item=(int) (Math.random()*33+1);
			do {
				item=(int) (Math.random()*33+1);
				for(int j:list) {
					if(item==j) {
						bool=true;
						break;
					}
				}
			}while(bool);
			list[i]=item;
		}
		return list;
	}
	public static int[] loadList(int list[]) {
		int caNum=0;
		for(int i=1;i<list.length;i++) {
			for(int j=0;j<list.length-1;j++) {
				if(list[j]>list[j+1]) {
					caNum=list[j];
					list[j]=list[j+1];
					list[j+1]=caNum;
				}
			}
		}
		return list;
	}
	public static void main(String args[]) {
		//随机输出不重复的6个数（1-33）并排序
//		int randomList[]=getRandom();
//		for(int a:randomList){
//			System.out.println(a);
//		}
		int list[]=loadList(getRandom());
		for(int item:list) {
			System.out.print(item+",");
		}
		
	}
}
