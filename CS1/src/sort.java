
public class sort {

	static final int size = 8000000;
	static int[] randomList;
	static int maxlevel;

	public static void main(String[] args) {
		int[] list;
		long runTime;
		randomList = fillArray(size);
		list = copy(randomList);
/*
		runTime = System.currentTimeMillis();
		selectionSort(list);
		runTime = System.currentTimeMillis()-runTime;
		//printList(list,20);
		System.out.println("Selection Sort Run time: "+runTime);

		list = copy(randomList);
		runTime = System.currentTimeMillis();
		halfSelectionSort(list);
		runTime = System.currentTimeMillis()-runTime;
		//printList(list,20);
		System.out.println("Half Selection Sort Run time: "+runTime);

		list = copy(randomList);
		runTime = System.currentTimeMillis();
		bubbleSort(list);
		runTime = System.currentTimeMillis()-runTime;
		//printList(list,20);
		System.out.println("bubble Sort Run time: "+runTime);
*/
		list = copy(randomList);
		maxlevel=0;
		runTime = System.currentTimeMillis();
		bubbleSort(list);
		runTime = System.currentTimeMillis()-runTime;
		//printList(list,20);
		System.out.println("Merge Sort Run time: "+runTime+ " Max depth: "+maxlevel);

/*
		list = copy(randomList);
		runTime = System.currentTimeMillis();
		insertionSort(list);
		runTime = System.currentTimeMillis()-runTime;
		//printList(list,20);
		System.out.println("Insertion Sort Run time: "+runTime);
		*/
	}

	public static int[] fillArray(int size) {
		int[] list = new int[size];
		int i;
		for (i=0; i<size; i++)
			list[i] = (int)(Math.random()*10000)+1;
		return list;
	}

	public static int[] copy(int[] list) {
		int i;
		int[] list2 = new int[list.length];
		for (i=0; i<list.length; i++)
			list2[i] = list[i];
		return list2;
	}

	public static void printList(int[] list, int n) {
		int i;
		if (n<=0) n = list.length;
		if (n>list.length) n=list.length;
		for (i=0; i<n; i++)
			System.out.println(""+i+": "+list[i]);
	}

	public static void printList(int[] list) {
		printList(list, 0);
	}

	public static void selectionSort(int[] list) {
		int i,j,s,t;
		for (i=0; i<list.length-1; i++) {
			s = i;
			for (j=i+1; j<list.length; j++)
				if (list[j]<list[s]) s = j;
			t = list[i];
			list[i] = list[s];
			list[s] = t;
		}
	}

	public static void halfSelectionSort(int[] list) {
		int[] lista = new int[list.length/2];
		int[] listb = new int[list.length - lista.length];
		int a,b,c;
		for (a=0; a<lista.length; a++)
			lista[a] = list[a];
		for (b=0; b<listb.length; b++)
			listb[b] = list[lista.length+b];
		selectionSort(lista);
		selectionSort(listb);
		merge(lista, listb, list);
	}

	public static void mergeSort(int[] list, int level) {
		/*if (list.length<=20) {
			selectionSort(list);
			return;
		}
		*/
		if (level>maxlevel) maxlevel=level;
		if (list.length<=1) return;
		int[] lista = new int[list.length/2];
		int[] listb = new int[list.length-lista.length];
		int a,b;
		for (a=0; a<lista.length; a++)
			lista[a] = list[a];
		for (b=0; a<list.length; a++)
			listb[b++] = list[a];
		mergeSort(lista, level+1);
		mergeSort(listb, level+1);
		merge(lista,listb,list);
	}

	public static void merge(int[] lista, int[] listb, int[] listc) {
		int a=0,b=0,c=0;
		// combine two lists into one keeping it in order
		while (a<lista.length && b<listb.length) {
			if (lista[a]<=listb[b])
				listc[c++] = lista[a++];
			else
				listc[c++] = listb[b++];
		}
		
		while (b<listb.length)		// copy over remaining list b
			listc[c++] = listb[b++];
		while (a<lista.length)		// copy over remaining list a
			listc[c++] = lista[a++];

	}

	public static void bubbleSort(int[] list) {
		int i,j,pass=0;
		boolean inorder = false;
		int temp;
		while(!inorder) {
			inorder = true;
			pass++;
			for (i=0; i<list.length-pass; i++)
				if (list[i]>=list[i+1]) {
					temp = list[i];
					list[i] = list[i+1];
					list[i+1] = temp;
					inorder=false;
				}
		}
		System.out.println("Bubble sort took "+pass+" passes");
	}

	public static void insertionSort(int[] list) {
		int i,j,k,t;
		int[] orderedList = new int[list.length];
		for (i=0; i<list.length; i++) {
			// Insert list[i] into ordered list
			t = list[i];
			for (j=i-1; j>=0; j--) {
				if (t<orderedList[j]) {
					orderedList[j+1] = orderedList[j];
				}
				else break;
			}
			orderedList[j+1] = t;
		}
		for (i=0; i<list.length; i++)
			list[i] = orderedList[i];
	}
}

