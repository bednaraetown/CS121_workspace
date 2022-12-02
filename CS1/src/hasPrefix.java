
public class hasPrefix {
	
	public static boolean hasPrefix(String prefix, String[] collection){
		  // TODO: get the length of the prefix string
		  int len = prefix.length();

		  // TODO: get the length of the collection array
		  int size = collection.length;


		  // TODO: loop through the collection array
		  for(int i = 0; i<size;i++) {
			  

		    // TODO: get current element
		    String str = collection[i];

		    // TODO: get the the current element's prefix
		    String substring = prefix;

		    // TODO: return true if the substring is equivalent with 
		    // the prefix you are looking for
		    if(prefix.equals(collection[i])) {
		      return true;

		    }

		  }
		  
		  // return false if the program reaches this line
		  return false;
		}
}
