public class wordFreq {
    String word;
    int frequency;
    // constructor function to initialize wordFreq objects
    public wordFreq(String word, int frequency){
        this.word = word;
        this.frequency = frequency;
    }
    // accessor functions to retrieve elements of class object
    public String getWord(){
        return this.word;
    }
    public int getFreq(){
        return this.frequency;
    }
    // comparator function to allow heapify to work properly
    public static boolean compare(wordFreq wf1, wordFreq wf2){
        return wf1.getFreq() > wf2.getFreq();
    }
    // recursive function that works bottom-up and checks until no swaps are made anymore
   public static void heapify(wordFreq[] wf, int n, int i){
        int high = i;
        int left = 2 * i + 1;
        int right = left + 1;
        if (left < n && compare(wf[left],wf[high])){
            high = left;
        }
        if (right < n && compare(wf[right],wf[high])){
            high = right;
        }
        if (high != i){
            wordFreq temp = wf[i];
            wf[i] = wf[high];
            wf[high] = temp;
            heapify(wf, n, high);
        }
   }

    public static void buildMaxHeap(wordFreq[] wf){
        int n = wf.length;
        int nonLeafLast = (n/2) - 1;
        for (int i = nonLeafLast; i >= 0; i--){
            heapify(wf,n,i);
        }
    }

    public static void main(String[] args) {
        // Binary Tree Representation
        // of input array (FROM https://www.geeksforgeeks.org/dsa/building-heap-from-array/)
        //             400
        //           /     \
        //         100      300
        //       /    \     /  \
        //     200    160  900 100
        //    /  \    / 
        //   140 800 700
        wordFreq[] wf = {
            new wordFreq("happy",400),
            new wordFreq("satisfied", 100),
            new wordFreq("neutral", 300),
            new wordFreq("would buy again", 200),
            new wordFreq("terrible",160),
            new wordFreq("inconvenient", 900),
            new wordFreq("difficult to use", 100),
            new wordFreq("easy to use", 140),
            new wordFreq("would recommend to friends", 800),
            new wordFreq("visit the store", 700),
        };
        buildMaxHeap(wf);
        for (wordFreq words : wf){
            System.out.println(words.getWord() + " - " + words.getFreq());
        }
        // Binary Tree Representation
        // of heap sorted array (FROM https://www.geeksforgeeks.org/dsa/building-heap-from-array/)
        //             900
        //           /     \
        //         800      400
        //       /    \     /  \
        //     200    700  300 100
        //    /  \    / 
        //   140 100 160
    }
}
